//Concatenate list of strings using reduce.
import java.util.List;

public class Q6{
    public static void main(String[] args) {
        List<String> list = List.of("Java", "Stream", "API");

        String result = list.stream()
                .reduce("", String::concat);

        System.out.println(result);
    }
}
