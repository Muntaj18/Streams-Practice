// reverse each string
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;
public class Main{
    public static List<String> reverseEachString(List<String> list)
    {
        
        
        return list.stream()
        .map(n->
            new StringBuilder(n).reverse().toString()
        )
        .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of(
            "MUNTAJ  begum",
            "SK",
            "  BOO",
            "ground"
            );
        
        List<String> result=reverseEachString(list);
        
        System.out.println(result);
      
    }
}
