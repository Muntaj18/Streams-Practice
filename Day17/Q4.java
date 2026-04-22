//uestion 3: Finding the First Available Resource (Short-Circuit Operators)

// **Scenario:** You are writing a service locator. You have a list of `DataConnection` objects that have a `boolean testConnection()` method (which is expensive to call). You need to find the **first** connection that is both **active** and has a **ping latency under 10ms**.

// **Target Concepts:** `filter()`, `findFirst()`, **Short-circuiting behavior** (crucial point: you must explain *why* order of operations matters here to avoid calling `testConnection()` on every single element).

// **Input Setup:**
// ```java
// List<DataConnection> connections = // ... list of 100 connections ...
// ```
// *Assume `DataConnection` has methods `isActive()` and `getLatency()`.*

// **Task:** Write a pipeline that returns an `Optional<DataConnection>` representing the first valid connection. **Bonus points in interview:** Explain why you put `filter(DataConnection::isActive)` **before** `filter(c -> c.getLatency() < 10)`.


import java.util.*;
import java.util.stream.Collectors;
public class Q4 {
    public static Optional<DataConnection> Data(List<DataConnection> connections)
    {
        return connections.stream()
        .filter(DataConnection::isActive)
        .filter(e->e.getLatency() < 10)
        .filter(DataConnection::testConnection)
        .findFirst();
    }
    public static void main(String[] args) {
       List<DataConnection> connections = List.of(
            new DataConnection("Conn1", false, 5),
            new DataConnection("Conn2", true, 15),
            new DataConnection("Conn3", true, 8),
            new DataConnection("Conn4", true, 3),
            new DataConnection("Conn5", false, 1)
        );
        
        Optional<DataConnection> result=Data(connections);
        System.out.println(result);

    }
}

class DataConnection {
    private String name;
    private boolean active;
    private int latency;

    public DataConnection(String name, boolean active, int latency) {
        this.name = name;
        this.active = active;
        this.latency = latency;
    }

    public boolean isActive() {
        System.out.println(name + " -> Checking active");
        return active;
    }

    public int getLatency() {
        System.out.println(name + " -> Checking latency");
        return latency;
    }
    public boolean testConnection() {
        System.out.println(name + " -> Testing connection (EXPENSIVE)");
        try { Thread.sleep(100); } catch (InterruptedException e) {}
        return true;
    }

    @Override
    public String toString() {
        return name + " (latency=" + latency + ")";
    }
}
