//First non-null element
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static Integer firstNonNullElement(List<Integer> list,int x)
    {
        return list.stream()
        .filter(n->n!=null)
        .findFirst()
        .orElse(null);
    }
    public static void main(String[] args)
    {
        
        List<Integer> list=List.of(25,10,23,4,56);
        
        Integer result =firstNonNullElement(list,5);
        System.out.println(result);
    }
}
