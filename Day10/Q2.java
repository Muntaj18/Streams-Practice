//sum only odd numbers
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(2, 3, 4, 5, 6, 7);

        int sum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
