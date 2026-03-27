//First element > X
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static int firstElement(List<Integer> list,int x)
    {
        return list.stream()
        .filter(n->n>x)
        .findFirst()
        .orElse(-1);
    }
    public static void main(String[] args)
    {
        
        List<Integer> list=List.of(44,33,2,6,71,9,4,1);
        
       int result = firstElement(list,33);
        System.out.println(result);
    }
}
