// //Question 4: Aggregating Order Totals with Reduce (Reduce Terminal Operation)

// **Scenario:** You have a list of `OrderItem` (`product, quantity, pricePerUnit`). The business needs the **total revenue**, but with a specific constraint: you must apply a **10% discount on the total sum** *after* calculating the base sum, without using `.sum()` followed by subtraction. You must do it in a single terminal pass.

// **Target Concepts:** `map()`, `reduce(identity, accumulator)`, handling of BigDecimal or Double.

// **Input Data:**
// ```java
// record Item(String name, int qty, double price) {}
// List<Item> cart = List.of(
//     new Item("Laptop", 1, 1200.00),
//     new Item("Mouse", 2, 25.50),
//     new Item("Keyboard", 1, 85.00)
// );
// ```

// **Task:** Use `.reduce()` to calculate the total. The accumulator should sum the `qty * price`. The identity should be 0.0. The final value should be **1202.85** (since 1336.5 * 0.9 = 1202.85).


import java.util.*;
import java.util.stream.Collectors;
public class Q5{
    public static double CalculateTotalWithDiscount(List<Item> cart)
    {
        return cart.stream()
        .map(item->item.getQty() * item.getPrice())
        .reduce(0.0,(sum,value)->sum+value*9.0);
    }
    public static void main(String[] args) {
       List<Item> cart = List.of(
                new Item("Laptop", 1, 1200.00),
                new Item("Mouse", 2, 25.50),
                new Item("Keyboard", 1, 85.00)
        );
        
        double result=CalculateTotalWithDiscount(cart);
        System.out.println(result);

    }
}

class Item {
    private String name;
    private int qty;
    private double price;

    public Item(String name, int qty, double price) {
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }
}
