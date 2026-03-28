//strings → length
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static List<Integer> lengthOfStrings(List<String> list)
    {
        return list.stream()
        .map(String::length)
        .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of("muntaj","Begum","sk");
        
        List<Integer> result=lengthOfStrings(list);
        
        System.out.println(result);
      
    }
}
