//Count vowels in all strings.
import java.util.List;

public class Q7 {
    public static void main(String[] args) {

        List<String> list = List.of("Java", "Stream", "API");

        long count = list.stream()
                .flatMapToInt(String::chars)
                .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
                .count();

        System.out.println(count);
    }
}
