//Multiply all numbers.
public class Q8 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4, 5);

        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product: " + product);
    }
}
