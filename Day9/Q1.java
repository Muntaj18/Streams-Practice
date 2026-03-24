//Split sentences into words.
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Java is   powerful",
                "Streams are functional"
        );

        List<String> words=sentences.stream()
                .flatMap(s-> Arrays.stream(s.split("\\s+")))
                .collect(Collectors.toList());

        System.out.println(words);
    }
}
