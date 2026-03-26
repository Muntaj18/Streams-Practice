//Square all numbers
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static List<Integer> SquareNumbers(List<Integer> list)
    {
        return list.stream()
        .map(n->n*n)
        .toList();
        
    }
    public static void main(String[] args)
    {
        List<Integer> list=List.of(2,3,4,5,6,7);
        
        List<Integer> result=SquareNumbers(list);
        System.out.println(result);
    }
}
