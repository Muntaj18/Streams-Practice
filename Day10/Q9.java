//Find palindrome strings.

import java.util.List;
import java.util.stream.Collectors;

public class Q9 {
    public static void main(String[] args) {

        List<String> list = List.of("madam", "java", "level", "spring");

        List<String> palindromes = list.stream()
                .filter(s -> new StringBuilder(s)
                        .reverse()
                        .toString()
                        .equals(s))
                .collect(Collectors.toList());

        System.out.println(palindromes);
    }
}
