//Sum of squares of odd numbers
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static int sumOfSquaresOfOdd(List<Integer> list)
    {
        return list.stream()
        .filter(n->n%2!=0)
        .mapToInt(n->n*n)
        .sum();
    }
    public static void main(String[] args)
    {
        
        List<Integer> list=List.of(44,33,2,6,71,9,4,1);
        
        int result = sumOfSquaresOfOdd(list);
        System.out.println(result);
    }
}
