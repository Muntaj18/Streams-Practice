//Find the Sum of All Elements in a List
import java.util.*;
import java.util.stream.*;
class Q6 {
    public static int Sum(List<Integer> list)
    {
        return list.stream()
        .mapToInt(Integer::intValue)
        .sum();
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4);
        
        int result=Sum(list);
        System.out.println(result);
        
        
    }
}
