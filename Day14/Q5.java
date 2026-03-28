//Last element using reduce
import java.util.*;
import java.util.stream.Stream;
public class Main{
    public static int lastElement(List<Integer> list)
    {
        return list.stream()
        .reduce((a,b)->b)
        .orElse(-1);
    }
    public static void main(String[] args)
    {
       
        List<Integer> list=List.of(1,2,3,4,5,6,77);
        
        int result=lastElement(list);
        
        System.out.println(result);
    }
}
