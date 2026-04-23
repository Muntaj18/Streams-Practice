//Sort a List of Integers in Ascending Order

import java.util.*;
import java.util.stream.*;
class Q7 {
    public static List<Integer> sortInAscendingOrder(List<Integer> list)
    {
        return list.stream()
        .sorted()
        .collect(Collectors.toList());
        
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,4,5,1,2,3);
        
        List<Integer> result=sortInAscendingOrder(list);
        System.out.println(result);
        
        
    }
}
