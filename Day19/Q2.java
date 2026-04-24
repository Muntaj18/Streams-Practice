//Group a List of Strings by Their Length
import java.util.*;
import java.util.stream.*;
class Q2{
    public static Map<Integer,List<String>> stringByLength(List<String> list)
    {
        return list.stream()
        .collect(Collectors.groupingBy(String::length));
    }
    
    public static void main(String[] args) {
       List<String> list=List.of("muntaj","begum","shaik");
    Map<Integer,List<String>> result=stringByLength(list);
        System.out.println(result);
        
        
    }
}
