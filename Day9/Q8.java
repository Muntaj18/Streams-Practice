//Find second lowest number.
import java.util.List;
import java.util.Optional;

public class P10 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 45, 32, 89, 21);

        Optional<Integer> secondLowest = numbers.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();

        secondLowest.ifPresent(System.out::println);
    }
}
