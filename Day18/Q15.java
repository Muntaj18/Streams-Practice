//Find the Longest String in a List
import java.util.*;
import java.util.stream.*;
class Q15 {
    public static String longestString(List<String> list)
    {
        return list.stream()
        .max(Comparator.comparingInt(String::length))
        .orElse("");
    }
    
    public static void main(String[] args) {
       List<String> list=List.of("muntaj","begum","shaik");
    String result=longestString(list);
        System.out.println(result);
        
        
    }
}
