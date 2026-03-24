//Flatten map values.
import java.util.List;
import java.util.Map;

public class P16 {
    public static void main(String[] args) {
        Map<String, List<String>> map = Map.of(
                "A", List.of("Java", "Spring"),
                "B", List.of("Docker", "Kubernetes")
        );
        List<String> allValues = map.values().stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(allValues);
    }
}
