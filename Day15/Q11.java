//extract digits from strings


import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static List<String> extractDigits(List<String> list)
    {
        
        
        return list.stream()
        .map(n->n.replaceAll("\\D"," "))
        .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of("abc12","23bc","56r");
        
        List<String> result=extractDigits(list);
        
        System.out.println(result);
      
    }
}




        

