//Find product of only even numbers.
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 3, 4, 5, 6);

        int product = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(1, (a, b) -> a * b);

        System.out.println(product);
    }
}
