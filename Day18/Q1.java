//Convert a List of Integers to Their Squares
import java.util.*;
import java.util.stream.*;
class Q1 {
    public static List<Integer> square(List<Integer> list)
    {
        return list.stream()
        .map(n->n*n)
        .collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,4,5);
        
        List<Integer> result=square(list);
        System.out.println(result);
        
        
    }
}
