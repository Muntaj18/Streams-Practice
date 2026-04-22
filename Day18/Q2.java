// Find the First Element in a List
import java.util.*;
import java.util.stream.*;
class Q2 {
    public static int firstele(List<Integer> list)
    {
        return list.stream()
        .findFirst()
        .orElse(0);
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,4,5);
        
        int result=firstele(list);
        System.out.println(result);
        
        
    }
}
