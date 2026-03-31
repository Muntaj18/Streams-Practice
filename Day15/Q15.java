//sentences → unique words


import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static List<String>  unique(List<String> list)
    {
        
        
        return list.stream()
       .flatMap(s->Arrays.stream(s.split("\\s+")))
       .distinct()
       .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<String> list = List.of(
    "java is powerful",
    "java is fast",
    "streams are powerful"
);
        
        List<String> result=unique(list);
        
        System.out.println(result);
    }
}




        

