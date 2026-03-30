//add prefix
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static List<String> prefix(List<String> list)
    {
        
        String prefix="pre-";
        return list.stream()
        .map(s->prefix+s)
        .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of("MUNTAJ","SK","BOO","ground");
        
        List<String> result=prefix(list);
        
        System.out.println(result);
      
    }
}
