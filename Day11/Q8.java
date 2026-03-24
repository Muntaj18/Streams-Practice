//Find shortest string.
import java.util.List;
import java.util.Optional;

public class Q8{
    public static void main(String[] args) {

        List<String> list = List.of("Java", "Microservices", "Spring", "JVM");

        Optional<String> shortest = list.stream()
                .reduce((s1, s2) ->
                        s1.length() <= s2.length() ? s1 : s2
                );

        shortest.ifPresent(System.out::println);
    }
}
