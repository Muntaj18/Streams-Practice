//Count total characters in all strings.
import java.util.List;

public class Q9
{
    public static void main(String[] args) {

        List<String> list = List.of("Java", "Stream", "API");

        int total = list.stream()
                .map(String::length)
                .reduce(0, Integer::sum);

        System.out.println(total);
    }
}
