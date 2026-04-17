//write a method to find the first non-repeated character in a string using Java 8 streams
import java.util.*;
import java.util.stream.Collectors;
class Q9 {
    public static Character firstNonRepeating(String input)
    {
        return input.chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(
        ch->ch,
        LinkedHashMap::new,
        Collectors.counting())
        )
        
        .entrySet().stream()
        .filter(entry->entry.getValue()==1)
        .map(Map.Entry::getKey)
        .findFirst()
        .orElse(null);
    }

    public static void main(String[]  args)
    {
       String input="programming";
       
       Character result=firstNonRepeating(input);
       System.out.println(result);
        
    }
}
