import java.util.*;
import java.util.stream.Stream;


public class Main{
    public static List<Integer> EvenNumbers(List<Integer> list)
    {
        return list.stream()
        .filter(n->n%2==0)
        .toList();
    }
    public static void main(String[] args)
    {
        List<Integer> list=List.of(1,3,2,4,6,8,22,34,66);
        
        List<Integer> result=EvenNumbers(list);
        System.out.println(result);
    }
}
