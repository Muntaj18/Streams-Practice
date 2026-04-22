//Find the Last Element in a List
import java.util.*;
import java.util.stream.*;
class Main {
    public static int lastele(List<Integer> list)
    {
        return list.stream()
        .reduce((a,b)->b)
        .orElse(0);
    }
    
    public static void main(String[] args) {
        List<Integer> list=List.of(1,3,4,5);
        
        int result=lastele(list);
        System.out.println(result);
        
        
    }
}
