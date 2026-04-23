//Sort a List of Strings in Alphabetical Order

import java.util.*;
import java.util.stream.*;
class Q9{
    public static List<String> AlphabeticalOrder(List<String> words)
    {
        return words.stream()
        .sorted()
        .collect(Collectors.toList());
        
    }
    
    public static void main(String[] args) {
        List<String> words = List.of("banana", "apple", "cherry");
        
        List<String> result=AlphabeticalOrder(words);
        System.out.println(result);
        
        
    }
}
