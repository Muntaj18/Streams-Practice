//Find max using reduce.
import java.util.List;
import java.util.Optional;
public class Q4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 45, 32, 89, 21);

        Optional<Integer> max = numbers.stream()
                .reduce(Integer::max);

        max.ifPresent(value ->
                System.out.println("Max: " + value)
        );
    }
}
