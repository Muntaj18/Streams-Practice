//Filter Out Even Numbers from a List
import java.util.*;
import java.util.stream.*;
class Q13 {
    public static List<Integer> containsSpecificEle(List<Integer> list)
    {
        return list.stream()
        .filter(n->n%2==0)
        .toList();
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5);
        
        List<Integer> result=containsSpecificEle(list);
        System.out.println(result);
        
        
    }
}
