//Find length of each string
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static List<Integer> stringlength(List<String> list)
    {
        return list.stream()
        .map(String::length)
        .toList();
        
    }
    public static void main(String[] args)
    {
        List<String> list=List.of("muntaj","begum","shaik","gousiya");
        
        List<Integer> result=stringlength(list);
        System.out.println(result);
    }
}
