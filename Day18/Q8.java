//Sort a List of Integers in Descending Order

import java.util.*;
import java.util.stream.*;
class Q8{
    public static List<Integer> sortInDescendingOrder(List<Integer> list)
    {
        return list.stream()
        .sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());
        
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,4,5,1,2,3);
        
        List<Integer> result=sortInDescendingOrder(list);
        System.out.println(result);
        
        
    }
}
