//lowercase conversion
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static List<String> lowerCase(List<String> list)
    {
        return list.stream()
        .map(String::toLowerCase)
        .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of("MUNTAJ","SK","BOO","ground");
        
        List<String> result=lowerCase(list);
        
        System.out.println(result);
      
    }
}
