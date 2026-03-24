//Flatten stream of optionals.
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
         List<Optional<String>> list=List.of(
             Optional.of("java"),
             Optional.empty(),
             Optional.of("streams")
             );
             
        List<String> result=list.stream()
        .flatMap(Optional::stream)
        .toList();
        System.out.println(result);
    }
}
