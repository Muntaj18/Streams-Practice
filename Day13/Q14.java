//Strings starting with vowel
import java.util.*;
import java.util.stream.Stream;

public class Main{
    public static List<String> Vowels(List<String> list)
    {
        return list.stream()
        .filter(n->{
        char ch=Character.toLowerCase(n.charAt(0));
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
        })
        .toList();
    }
    public static void main(String[] args)
    {
        
        List<String> list=List.of("muntaj","Ammi","Elephant","shaik","umberella");
        
       List<String> result =Vowels(list);
        System.out.println(result);
    }
}
