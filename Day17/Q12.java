//Check if a List Contains a Specific Element
import java.util.*;
import java.util.stream.*;
class Q12{
    public static boolean containsSpecificEle(List<Integer> list)
    {
        return list.stream()
        .anyMatch(n->n==3);
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5);
        
        boolean result=containsSpecificEle(list);
        System.out.println(result);
        
        
    }
}
