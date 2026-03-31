//join strings
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static String joining(List<String> list)
    {
        
        
        return list.stream()
        .collect(Collectors.joining(","));
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of(
            "MUNTAJ begum",
            "SK",
            "BOO",
            "ground"
            );
        
        String result=joining(list);
        
        System.out.println(result);
      
    }
}
