//Find longest word.
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> sentences = List.of(

                "Java is powerful",
                "Java streams are powerful",
                "Streams make Java powerful"
        );

        Optional<String> longestWord = sentences.stream()
                .filter(s -> s != null && !s.isBlank())
                .flatMap(s -> Arrays.stream(s.split("\\s+")))
                .filter(w -> !w.isBlank())
                .max(Comparator.comparingInt(String::length));

        longestWord.ifPresent(System.out::println);
    }
}
