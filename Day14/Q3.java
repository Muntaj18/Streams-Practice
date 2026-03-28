//detect Duplicates-second way of doing
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main{
    public static List<Integer> detectDuplicates(List<Integer> list)
    {
        Set<Integer> seen=new HashSet<>();
        
        return list.stream()
        .filter(n->!seen.add(n))
        .toList();
        
    }
    public static void main(String[] args)
    {
       
        List<Integer> list=List.of(1,1,2,3,4,4,5,5,6,77,77);
        
        List<Integer> result=detectDuplicates(list);
        
        System.out.println(result);
    }
}
