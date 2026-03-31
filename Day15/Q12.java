//convert to set


import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static Set<String> convertSet(List<String> list)
    {
        
        
        return list.stream()
       // .collect(Collectors.toSet()); -does not preserve insertion order
        .collect(Collectors.toCollection(LinkedHashSet::new));
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of("abc12","23bc","56r","abc12");
        
        Set<String> result=convertSet(list);
        
        System.out.println(result);
      
    }
}




        

