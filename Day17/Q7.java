// Find the Product of All Elements in a List
import java.util.*;
import java.util.stream.*;
class Q7 {
    public static int Product(List<Integer> list)
    {
        return list.stream()
        .reduce(1,(a,b)->a*b);
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4);
        
        int result=Product(list);
        System.out.println(result);
        
        
    }
}
