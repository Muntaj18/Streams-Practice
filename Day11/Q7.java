//Find longest string.

import java.util.List;
import java.util.Optional;

public class Q7 {
    public static void main(String[] args) {
        List<String> list = List.of("Java", "Microservices", "Spring", "JVM");

        Optional<String> longest = list.stream()
                .reduce((s1, s2) ->
                        s1.length() >= s2.length() ? s1 : s2
                );

        longest.ifPresent(System.out::println);
    }
}
