//Check if all positive
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static boolean allPositive(List<Integer> list,int x)
    {
        return list.stream()
        .allMatch(n->n>x);
    }
    public static void main(String[] args)
    {
        
        List<Integer> list=List.of(44,33,2,6,71,9,4,1);
        
       boolean result = allPositive(list,0);
        System.out.println(result);
    }
}
