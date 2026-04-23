//Remove Duplicate Elements from a List

import java.util.*;
import java.util.stream.*;
class Q6{
    public static List<Integer> removeDuplicates(List<Integer> list)
    {
        return list.stream()
        .distinct()
        .collect(Collectors.toList());
        
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,4,5,1,2,3);
        
        List<Integer> result=removeDuplicates(list);
        System.out.println(result);
        
        
    }
}
