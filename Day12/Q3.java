//Filter odd numbers
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static List<Integer> OddNumbers(List<Integer> list)
    {
        return list.stream()
        .filter(n->n%2!=0)
        .toList();
    }
    public static void main(String[] args)
    {
        List<Integer> list=List.of(1,4,22,3,4,5,67,88);
        
        List<Integer> result=OddNumbers(list);
        System.out.println(result);
    }
}
