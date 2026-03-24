//Find min using reduce.
import java.util.List;
import java.util.Optional;
public class Q5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 45, 32, 89, 21);

        Optional<Integer> min = numbers.stream()
                .reduce(Integer::min);

        min.ifPresent(value ->
                System.out.println("Min: " + value)
        );
    }
}
