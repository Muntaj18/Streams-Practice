//Convert a List of Strings to Uppercase
import java.util.*;
import java.util.stream.*;
class Q15 {
    public static List<String> uppercase(List<String> list)
    {
        return list.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        List<String> list=List.of("muntaj","begum","shaik");
        
        List<String> result=uppercase(list);
        System.out.println(result);
        
        
    }
}
