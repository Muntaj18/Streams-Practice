//Count elements in list
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static Long countElements(List<Integer> list)
    {
        return list.stream()
        .count();
    }
    public static void main(String[] args)
    {
        List<Integer> list=List.of(1,2,3,4,5,6,7,8);
        
        Long result=countElements(list);
        System.out.println(result);
    }
}
