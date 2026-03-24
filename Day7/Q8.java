//Convert nested list to set.
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class P15 {
    public static void main(String[] args) {

        List<List<String>> nestedList = List.of(
                List.of("Java", "Spring"),
                List.of("Docker", "Kubernetes","Java"),
                List.of("AWS")
        );

        Set<String> flattened = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toSet());

        System.out.println(flattened);
    }
}
  
