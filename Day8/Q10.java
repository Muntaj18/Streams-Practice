//Extract characters from words.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("Java", "Stream");

        List<Character> list=words.stream()
                .flatMap(s->s.chars().mapToObj(c->(char)c))
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
