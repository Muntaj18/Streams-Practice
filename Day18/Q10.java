//Sort a List of Strings by Their Length
import java.util.*;
import java.util.stream.*;
class Q10 {
    public static List<String> LengthSort(List<String> words)
    {
        return words.stream()
        .sorted(Comparator.comparingInt(String::length))
        .collect(Collectors.toList());
        
    }
    
    public static void main(String[] args) {
        List<String> words = List.of("banana", "apple", "cherry");
        
        List<String> result=LengthSort(words);
        System.out.println(result);
        
        
    }
}
