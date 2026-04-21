// Question 1: Partitioning Employees by Salary & Counting (Partitioning By, Counting Frequency)

// **Scenario:** You have a list of `Employee` objects (`id, name, department, salary`). You need to split the workforce into two groups: those earning **>= 70,000** and those earning **< 70,000**. Furthermore, the business wants to know **how many employees are in each department** *within those two separate groups*.

// **Target Concepts:** `Collectors.partitioningBy`, nested `Collectors.groupingBy`, `Collectors.counting`.

// **Input Data:**
// ```java
// List<Employee> employees = List.of(
//     new Employee(1, "Alice", "Engineering", 85000),
//     new Employee(2, "Bob", "Engineering", 65000),
//     new Employee(3, "Charlie", "HR", 72000),
//     new Employee(4, "Diana", "HR", 58000),
//     new Employee(5, "Eve", "Engineering", 95000),
//     new Employee(6, "Frank", "Marketing", 45000)
// );

import java.util.*;
import java.util.stream.Collectors;
public class Q2 {
    public static Map<Boolean,Map<String,Long>> QuestionOne(List<Employee> employees)
    {
        return employees.stream()
        .collect(Collectors.partitioningBy(e->e.getSalary() >=70000, Collectors.groupingBy(Employee::getDepartment,Collectors.counting())));
    }
    public static void main(String[] args) {
       List<Employee> employees = List.of(
    new Employee(1, "Alice", "Engineering", 85000),
    new Employee(2, "Bob", "Engineering", 65000),
    new Employee(3, "Charlie", "HR", 72000),
    new Employee(4, "Diana", "HR", 58000),
    new Employee(5, "Eve", "Engineering", 95000),
    new Employee(6, "Frank", "Marketing", 45000)
);

Map<Boolean,Map<String,Long>> result=QuestionOne(employees);
System.out.println(result);

    }
}

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
