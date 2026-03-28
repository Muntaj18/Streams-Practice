//First string containing 'x'
import java.util.*;
import java.util.stream.Stream;
public class Main{
    public static Optional<String> firstX(List<String> list)
    {
        return list.stream()
        .filter(n->
        {
            char ch=Character.toLowerCase(n.charAt(0));
            return ch=='x';
        })
        .findFirst();
    }
    public static void main(String[] args)
    {
       
        List<String> list=List.of("box","xtra","umberella","xample");
        
        Optional<String> result=firstX(list);
        
        System.out.println(result);
    }
}
