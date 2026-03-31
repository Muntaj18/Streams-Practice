//flatten list of lists


import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static List<String> flatten(List<List<String>> list)
    {
        
        
        return list.stream()
        .flatMap(n->n.stream())
        .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<List<String>> list=List.of(
            List.of("apple","banana"),
            List.of("pineapple","guvava"),
            List.of("grapes"),
            List.of("papaya")
            );
        
        List<String> result=flatten(list);
        
        System.out.println(result);
      
    }
}




        

