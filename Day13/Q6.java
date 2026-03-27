//Second smallest element

import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static int secondSmallest(List<Integer> list)
    {
        return list.stream()
        .sorted(Comparator.naturalOrder())
        .skip(1)
        .findFirst()
        .orElseThrow();
    }
    public static void main(String[] args)
    {
        
        List<Integer> list=List.of(44,33,2,6,71,9,4,1);
        
        int result = secondSmallest(list);
        System.out.println(result);
    }
}
