//Validate numbers in range
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static boolean ValidateNumbers(List<Integer> list,int min,int max)
    {
        return list.stream()
        .allMatch(n->n>=min && n<=max);
      
    }
    public static void main(String[] args)
    {
       
        List<Integer> list=List.of(1,2,3,4,5,6,7);
        
        boolean result=validateNumbers(list,1,7);
        
        System.out.println(result);
    }
}
