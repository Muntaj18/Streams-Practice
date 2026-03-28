//String length>5
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static List<String> stringLengthMoreThanFive(List<String> list,int x)
    {
        return list.stream()
        .filter(n->n.length()>x)
        .toList();
        
    }
    public static void main(String[] args)
    {
        List<String> list=List.of("Muntaj","begum","sk");
        
        List<String> result=stringLengthMoreThanFive(list,5);
        System.out.println(result);
    }
}
