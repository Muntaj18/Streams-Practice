//Create stream from characters of string.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
         String input = "Java";
        List<Character> chars = input.chars()
                .mapToObj(c -> (char) c)
                .toList();

        System.out.println(chars);
    }
}
