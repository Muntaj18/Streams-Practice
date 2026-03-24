//Calculate total word count in sentences list.
import java.util.List;

public class Q3 {
    public static void main(String[] args) {

        List<String> sentences = List.of(
                "Java streams are powerful",
                "Spring Boot is popular",
                "Clean code matters"
        );

        long totalWords = sentences.stream()
                .flatMap(s -> List.of(s.split("\\s+")).stream())
                .count();

        System.out.println(totalWords);
    }
}
