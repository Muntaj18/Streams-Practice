//int → String
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static List<String> intToString(List<Integer> list)
    {
        return list.stream()
        .map(n->String.valueOf(n))
        .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<Integer> list=List.of(1,2,3,4,5,6,7);
        
        List<String> result=intToString(list);
        
        System.out.println(result);
        result.forEach(s -> System.out.println(s.getClass())); //to check whether the list is string or not
    }
}
