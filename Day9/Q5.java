//Find word frequency.
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> sentences = List.of(
                "Java is powerful",
                "Java streams are powerful",
                "Streams make Java powerful"
        );
        Map<String, Long> frequency = sentences.stream()
                .filter(s -> s != null && !s.isBlank())
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .map(String::toLowerCase)
                .filter(w -> !w.isBlank())
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));

        System.out.println(frequency);
    }
}
