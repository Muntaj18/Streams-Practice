//Find second highest number.
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Q10 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 45, 32, 89, 21);

        Optional<Integer> secondHighest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        secondHighest.ifPresent(System.out::println);
    }
}
