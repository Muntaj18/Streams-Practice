// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.IntStream;
public class Main{
    public static List<String> trim(List<String> list)
    {
        
        
        return list.stream()
        .map(n->n.trim().replaceAll("\\s+"," "))
        .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of(
            "MUNTAJ  begum",
            "SK",
            "  BOO",
            "ground"
            );
        
        List<String> result=trim(list);
        
        System.out.println(result);
      
    }
}




        

