//sort descending
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static List<Integer> descending(List<Integer> list)
    {
        return list.stream()
        .sorted(Comparator.reverseOrder())
        .toList();
    }
    public static void main(String[] args)
    {
        
        List<Integer> list=List.of(44,33,2,6,71,9,4,1);
        
        List<Integer>result = descending(list);
        System.out.println(result);
    }
}
