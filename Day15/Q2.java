//first character of each string
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static List<Character> firstCharacterOfEachString(List<String> list)
    {
        return list.stream()
        .map(n->n.charAt(0))
        .toList();
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of("muntaj","sk","both","in","ground");
        
        List<Character> result=firstCharacterOfEachString(list);
        
        System.out.println(result);
      
    }
}
