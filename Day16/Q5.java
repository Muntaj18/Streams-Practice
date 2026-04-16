//Find the length of the longest word
import java.util.*;
import java.util.stream.Collectors;
class Q5 {
    public static int LongestLength(String input)
    {
        return Arrays.stream(input.split(" "))
        .mapToInt(String::length)
        .max()
        .orElse(0);
    }
    
    
    public static void main(String[] args) {
        String input="Java streams are very powerful";
        
        int result=LongestLength(input);
        
        System.out.println(result);
    }
}
