//distinct lengths
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static List<Integer> distinctLengths(List<String> list)
    {
        
        
        return list.stream()
       .map(String::length)
       .distinct()
       .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of("abc12","23bc","56r","abc12");
        
        List<Integer> result=distinctLengths(list);
        
        System.out.println(result);
      
    }
}
