//multiply by 2
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static List<Integer> multiplybyTwo(List<Integer> list,int x)
    {
        return list.stream()
        .filter(n->n%x==0)
        .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<Integer> list=List.of(2,4,6,7,8,9,4);
        
        List<Integer> result=multiplybyTwo(list,2);
        
        System.out.println(result);
      
    }
}
