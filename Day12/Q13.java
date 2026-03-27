//Count words starting with 'a'
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static Long countWordsStartingA(List<String> list)
    {
        return list.stream()
        .filter(n->
        {
            char ch=Character.toLowerCase(n.charAt(0));
            return ch=='a';
        })
        .count();   
        
    }
    public static void main(String[] args)
    {
        
        List<String> list=List.of("muntaj","Ammi","Elephant","shaik","umberella");
        
       Long result =countWordsStartingA(list);
        System.out.println(result);
    }
}
