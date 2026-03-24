//Flatten 3-level nested list.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
         List<List<List<String>>> nested = List.of(
                List.of(
                        List.of("A", "B"),
                        List.of("C")
                ),
                List.of(
                        List.of("D", "E")
                )
        );

        List<String> flattened = nested.stream()
                .flatMap(List::stream)
                .flatMap(List::stream)
                .toList();

        System.out.println(flattened);
    }
}
