//Find the Shortest String in a List
import java.util.*;
import java.util.stream.*;
class Q1 {
    public static String smallestString(List<String> list)
    {
        return list.stream()
        .min(Comparator.comparingInt(String::length))
        .orElse("");
    }
    
    public static void main(String[] args) {
       List<String> list=List.of("muntaj","begum","shaik");
    String result=smallestString(list);
        System.out.println(result);
        
        
    }
}
