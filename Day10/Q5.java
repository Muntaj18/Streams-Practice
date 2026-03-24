//Find duplicate elements.
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 3, 6);

        Set<Integer> seen = new HashSet<>();

        Set<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        System.out.println(duplicates);
    }
}
