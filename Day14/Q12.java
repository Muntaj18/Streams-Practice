//Count palindromes
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class Main{
    public static Long countPalindrome(List<String> list)
    {
        return list.stream()
        .filter(n->
            n.equals(new StringBuilder(n).reverse().toString())
        )
        .count();
      
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of("madam","level","radar");
        
        Long result=countPalindrome(list);
        
        System.out.println(result);
    }
}




        

