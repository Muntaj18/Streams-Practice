//First even number
import java.util.*;
import java.util.stream.Stream;
public class Main{
    public static int firstEvenNumber(List<Integer> list)
    {
        return list.stream()
        .filter(n->n%2==0)
        .findFirst()
        .orElseThrow();
    }
    public static void main(String[] args)
    {
       
        List<Integer> list=List.of(1,1,2,3,4,4,5,5,6,77,77);
        
        int result=firstEvenNumber(list);
        
        System.out.println(result);
    }
}
