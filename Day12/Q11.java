//Product of numbers using reduce
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static Integer productElements(List<Integer> list)
    {
        return list.stream()
        .reduce(1,(a,b)->a*b);
    }
    public static void main(String[] args)
    {
        List<Integer> list=List.of(1,2,3,4,5,6,7,8);
        
        Integer result=productElements(list);
        System.out.println(result);
    }
}
