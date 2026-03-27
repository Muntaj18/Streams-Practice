//find minimum element
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static int productElements(List<Integer> list)
    {
        return list.stream()
        .min(Integer::compareTo)
        .orElseThrow();
    }
    public static void main(String[] args)
    {
        List<Integer> list=List.of(1,2,3,4,5,6,7,8);
        
        int result=productElements(list);
        System.out.println(result);
    }
}
