//Top 3 frequent words.
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class P9 {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Java is powerful",
                "Java streams are powerful",
                "Streams make Java powerful"
        );

        List<Map.Entry<String, Long>> top3 = sentences.stream()
                .filter(s -> s != null && !s.isBlank())
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .map(String::toLowerCase)
                .filter(w -> !w.isBlank())
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .toList();

        top3.forEach(System.out::println);
    }
}
