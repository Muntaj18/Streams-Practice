//Reverse each word.
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
         List<String> words = List.of("Java", "Stream", "API");

        List<String> reversed = words.stream()
        .map(word->new StringBuilder(word).reverse().toString())
        .toList();
        System.out.println(reversed);
    }
}
