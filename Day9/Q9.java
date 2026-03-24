//Reverse a list.
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        List<Integer> reversed = IntStream.rangeClosed(1, numbers.size())
                .mapToObj(i -> numbers.get(numbers.size() - i))
                .collect(Collectors.toList());

        System.out.println(reversed);
    }
}
