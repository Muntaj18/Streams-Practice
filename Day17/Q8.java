//Find the Average of All Elements in a List
import java.util.*;
import java.util.stream.*;
class Q8 {
    public static double Average(List<Integer> list)
    {
        return list.stream()
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0);
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5);
        
        double result=Average(list);
        System.out.println(result);
        
        
    }
}
