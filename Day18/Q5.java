//Check if Any Element in a List Satisfies a Condition
import java.util.*;
import java.util.stream.*;
class Q5{
    public static boolean AnySatisfy(List<Integer> list)
    {
        return list.stream()
        .anyMatch(n->n%2==0);
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,4,5);
        
        boolean result=AnySatisfy(list);
        System.out.println(result);
        
        
    }
}
