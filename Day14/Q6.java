//Count divisible by 3
import java.util.*;
import java.util.stream.Stream;
public class Main{
    public static List<Integer> divisibleByThree(List<Integer> list,int x)
    {
        return list.stream()
        .filter(n->n%x==0)
        .toList();
    }
    public static void main(String[] args)
    {
       
        List<Integer> list=List.of(1,2,3,4,5,6,77);
        
        List<Integer> result=divisibleByThree(list,3);
        
        System.out.println(result);
    }
}
