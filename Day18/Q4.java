//Check if All Elements in a List Satisfy a Condition
import java.util.*;
import java.util.stream.*;
class Q4 {
    public static boolean AllSatisfy(List<Integer> list)
    {
        return list.stream()
        .allMatch(n->n%2==0);
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,4,5);
        
        boolean result=AllSatisfy(list);
        System.out.println(result);
        
        
    }
}
