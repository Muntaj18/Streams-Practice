//Remove duplicates
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static List<Integer> duplicatesRemove(List<Integer> list)
    {
        return list.stream()
        .distinct()
        .toList();
    }
    public static void main(String[] args)
    {
        
        List<Integer> list=List.of(1,2,3,3,2,3,1,4,5,6,9,9);
        
        List<Integer>result = duplicatesRemove(list);
        System.out.println(result);
    }
}
