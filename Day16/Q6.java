//Given a sentence, find the number of occurrence of each word.
import java.util.*;
import java.util.stream.Collectors;
class Main {
    
    public static Map<String,Long> findNumberOfOccurance(String input)
    {
        return Arrays.stream(input.split(" "))
        .collect(Collectors.groupingBy(
            word->word,
            Collectors.counting()
            ));
    }
    public static void main(String[] args)
    {
        String input=" java is powerful and java is fast";
        
        Map<String,Long> result=findNumberOfOccurance(input);
        
        System.out.println(result);
    }
}
