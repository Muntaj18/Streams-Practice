//Combine multiple streams.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
         Stream<String> s1 = Stream.of("Java", "Spring");
        Stream<String> s2 = Stream.of("Docker", "Kubernetes");
        List<String> combined = Stream.concat(s1, s2)
                .toList();

        System.out.println(combined);
        
    }
}
