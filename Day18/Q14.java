//Find the Second-Smallest Element in a List
import java.util.*;
import java.util.stream.*;
class Q14{
    public static int SecondSmallest(List<Integer> list)
    {
        return list.stream()
        .sorted()
        .skip(1)
        .findFirst()
        .orElse(0);
    }
    
    public static void main(String[] args) {
       List<Integer> list=List.of(1,2,3,4,5,8);
    int result=SecondSmallest(list);
        System.out.println(result);
        
        
    }
}
