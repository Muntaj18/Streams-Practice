//Flatten nested object list.
import java.util.List;

public class P14 {

    public static void main(String[] args) {
        List<List<String>> nestedList = List.of(
                List.of("Java", "Spring"),
                List.of("Docker", "Kubernetes"),
                List.of("AWS")
        );
        List<String> flattened = nestedList.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(flattened);
    }
}
