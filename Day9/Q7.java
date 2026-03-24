//Sum using reduce.

import java.util.*;
public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 30, 40);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);

    }
}
