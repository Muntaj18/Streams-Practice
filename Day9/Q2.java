//Count total words.
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Java is powerful",
                "Streams are functional"
        );

        long totalWords = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split("\\s+")))
                .filter(word -> !word.isBlank())
                .count();

        System.out.println("Total words: " + totalWords);
    }
}
