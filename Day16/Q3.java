//Given a sentence find the word that has the highest length.
import java.util.*;
import java.util.stream.Collectors;
class Q3 {
    public static String LongestWord(String input)
    {
        return Arrays.stream(input.split(" "))
        .max(Comparator.comparingInt(String::length))
        .orElse(" ");
    }
    
    
    public static void main(String[] args) {
        String input="Java streams are very powerful";
        
        String result=LongestWord(input);
        
        System.out.println(result);
    }
}
