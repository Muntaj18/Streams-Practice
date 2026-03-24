//Group words by length.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
         List<String> words = List.of("Java", "Spring", "API", "Docker");
        Map<Integer, List<String>> grouped = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(grouped);
    }
}
    
