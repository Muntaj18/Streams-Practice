//Given a word, find the occurrence of Each Character
import java.util.*;
import java.util.stream.Collectors;
class Main {
    
    public static Map<Character,Long> findNumberOfCharacter(String input)
    {
        return input.chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(
            ch->ch,
            LinkedHashMap::new,
            Collectors.counting()
            ));
    }
    public static void main(String[] args)
    {
        String input="muntaj";
        
        Map<Character,Long> result=findNumberOfCharacter(input);
        
        System.out.println(result);
    }
}
