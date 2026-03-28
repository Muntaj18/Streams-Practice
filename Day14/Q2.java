//Detect duplicates
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main{
    public static List<Integer> detectDuplicates(List<Integer> list)
    {
        return list.stream()
        .collect(Collectors.groupingBy(n->n,Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e->e.getValue()>1)
        .map(Map.Entry::getKey)
        .toList();
        
    }
    public static void main(String[] args)
    {
        List<Integer> list=List.of(1,1,2,3,4,4,5,5,6,77,77);
        
        List<Integer> result=detectDuplicates(list);
        System.out.println(result);
    }
}
