//Sum of squares.
import java.util.List;

public class Q1 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .map(n -> n * n)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
