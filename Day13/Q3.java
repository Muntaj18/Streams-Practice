//Sort ascending
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static List<Integer> sort(List<Integer> list)
    {
        return list.stream()
        .sorted(Comparator.naturalOrder())
        .toList();
    }
    public static void main(String[] args)
    {
        
        List<Integer> list=List.of(44,33,2,6,71,9,4,1);
        
        List<Integer>result = sort(list);
        System.out.println(result);
    }
}
