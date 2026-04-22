//Find the Maximum Element in a List
import java.util.*;
import java.util.stream.*;
class Q9{
    public static int MaxEle(List<Integer> list)
    {
        return list.stream()
        .max(Integer::compare)
        .orElse(0);
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5);
        
        int result=MaxEle(list);
        System.out.println(result);
        
        
    }
}
