//Any even number
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static boolean anyEvenNumber(List<Integer> list,int x)
    {
        return list.stream()
        .anyMatch(n->n%2==0);
    }
    public static void main(String[] args)
    {
        
        List<Integer> list=List.of(44,33,2,6,71,9,4,1);
        
       boolean result =anyEvenNumber(list,0);
        System.out.println(result);
    }
}
