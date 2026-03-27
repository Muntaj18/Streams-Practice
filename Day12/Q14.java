//Find any multiple of 5
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static Optional<Integer> findMultipleOf5(List<Integer> list,int x)
    {
        return list.stream()
        .filter(n->n%x==0)
        .findAny();
    }
    public static void main(String[] args)
    {
        
        List<Integer> list=List.of(25,10,23,4,56);
        
      Optional<Integer> result =findMultipleOf5(list,5);
        System.out.println(result);
    }
}
