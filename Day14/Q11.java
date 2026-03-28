//All strings palindrome
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static boolean Palindrome(List<String> list)
    {
        return list.stream()
        .allMatch(n->
            n.equals(new StringBuilder(n).reverse().toString())
        );
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of("madam","level","radar");
        
        boolean result=Palindrome(list);
        
        System.out.println(result);
    }
}
