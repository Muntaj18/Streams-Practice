//Convert strings to uppercase
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static List<String> SquareNumbers(List<String> list)
    {
        return list.stream()
        .map(String::toUpperCase)
        .toList();
        
    }
    public static void main(String[] args)
    {
        List<String> list=List.of("muntaj","begum","shaik","gousiya");
        
        List<String> result=SquareNumbers(list);
        System.out.println(result);
    }
}
