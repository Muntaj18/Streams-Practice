//First repeating element
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static Optional<Integer> firstRepeating(List<Integer> list)
    {
        return list.stream()
        .collect(Collectors.groupingBy(n->n,LinkedHashMap::new,Collectors.counting()))
        .entrySet()
        .stream()
        .filter(n->n.getValue()>1)
        .map(Map.Entry::getKey)
        .findFirst();
      
    }
    public static void main(String[] args)
    {
       
        List<Integer> list=List.of(1,2,3,4,4,5,6,6,-1,-2,0,0);
        
        Optional<Integer> result=firstRepeating(list);
        
        System.out.println(result);
    }
}
