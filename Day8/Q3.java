//Flatten List<String[]>.
import java.util.*;
import java.util.stream.Collectors;

public class P14 {

    public static void main(String[] args) {
         List<String[]> data = List.of(
                new String[]{"A", "B"},
                new String[]{"C", "D"},
                new String[]{"E"}
        );
             List<String> result = data.stream()
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
