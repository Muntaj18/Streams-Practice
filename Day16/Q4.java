//Given a sentence find the word that has the 2nd (Nth) highest length.
import java.util.*;
import java.util.stream.Collectors;
class Q4 {
    public static String LongestSecondword(String input)
    {
        return Arrays.stream(input.split(" "))
        .sorted(Comparator.comparingInt(String::length).reversed())
        .skip(1)
        .findFirst()
        .orElse(" ");
    }
    
    
    public static void main(String[] args) {
        String input="Java streams are very powerful";
        
        String result=LongestSecondWord(input);
        
        System.out.println(result);
    }
}
