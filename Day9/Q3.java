//Remove duplicate words
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Java is powerful",
                "Java streams are powerful",
                "Streams make Java powerful"
        );

        List<String> uniqueWords = sentences.stream()
                .filter(s -> s != null && !s.isBlank())
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .map(String::toLowerCase)
                .filter(w -> !w.isBlank())
                .distinct()
                .toList();

        System.out.println(uniqueWords);
    }
}
