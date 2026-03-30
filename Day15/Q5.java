
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;
public class Main{
    public static List<String> differenetprefix(List<String> list)
    {
        
         List<String> prefix=List.of("pre-","pre1-","pre2-","pre3-");
        return IntStream.range(0,list.size())
        .mapToObj(i->prefix.get(i)+list.get(i))
        .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of("MUNTAJ","SK","BOO","ground");
        
        List<String> result=differenetprefix(list);
        
        System.out.println(result);
      
    }
}
