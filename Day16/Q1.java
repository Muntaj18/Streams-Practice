//flatten + remove duplicates


import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static List<Integer>  falttenRemoveDuplicates(List<List<Integer>> list)
    {
        
        
        return list.stream()
       .flatMap(n->n.stream())
       .distinct()
       .toList();
      
    }
    public static void main(String[] args)
    {
       
       List< List<Integer>> list = List.of(
            List.of(1,2,4),
            List.of(1,3,4),
            List.of(4,5,6)
);
        
        List<Integer> result=falttenRemoveDuplicates(list);
        
        System.out.println(result);
    }
}




        

