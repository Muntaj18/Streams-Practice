//Find the Second-Largest Element in a List

import java.util.*;
import java.util.stream.*;
class Q13{
    public static int Secondlargest(List<Integer> list)
    {
        return list.stream()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .orElse(0);
    }
    
    public static void main(String[] args) {
       List<Integer> list=List.of(1,2,3,4,5,8);
    int result=SecondLargest(list);
        System.out.println(result);
        
        
    }
}
