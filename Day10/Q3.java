//Count frequency of a number.
import java.util.List;

public class Q3 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 2, 5);

        int target = 2;

        long frequency = numbers.stream()
                .filter(n -> n == target)
                .count();

        System.out.println("Frequency: " + frequency);
    }
}
