//Count the Number of Elements in a List
import java.util.*;
import java.util.stream.*;
class Q11 {
    public static long MaxEle(List<Integer> list)
    {
        return list.stream()
        .count();
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5);
        
        long result=MaxEle(list);
        System.out.println(result);
        
        
    }
}
