//trim strings
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;
public class Main{
    public static List<String> trim(List<String> list)
    {
        
         List<String> prefix=List.of("pre-","pre1-","pre2-","pre3-");
        return list.stream()
        .map(n->n.trim())
        .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of("MUNTAJ  ","SK","  BOO","ground");
        
        List<String> result=trim(list);
        
        System.out.println(result);
      
    }
}
