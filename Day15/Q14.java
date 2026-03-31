//average of numbers
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static double  average(List<Integer> list)
    {
        
        
        return list.stream()
       .mapToInt(Integer::intValue)
       .average()
       .orElse(0.0);
      
    }
    public static void main(String[] args)
    {
       
        List<Integer> list=List.of(20,34,5,6,7,8,89);
        
        double result=average(list);
        
        System.out.println(result);
      
    }
}
