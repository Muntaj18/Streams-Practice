//Check both positive & negative
import java.util.*;
import java.util.stream.Stream;
public class Main{
    public static boolean positive&Negative(List<Integer> list,int x)
    {
        return list.stream()
        .anyMatch(n->n>x) && 
        list.stream()
        .anyMatch(n->n<x);
      
    }
    public static void main(String[] args)
    {
       
        List<Integer> list=List.of(1,2,3,4,5,6,-1,-2,0);
        
        boolean result=positive&Negative(list,0);
        
        System.out.println(result);
    }
}
