//Given a string, find the words with the maximum number of vowels.
import java.util.*;
import java.util.stream.Collectors;
class Q8 {
    public static List<String> maxVowels(String input)
    {
        return Arrays.stream(input.split(" "))
        .collect(Collectors.groupingBy(
            word->word.toLowerCase().chars()
            .filter(c->"aeiou".indexOf(c)!= -1)
            .count()
            ))
        
        .entrySet().stream()
        .max(Map.Entry.comparingByKey())
        .map(Map.Entry::getValue)
        .orElse(Collections.emptyList());
    }
    public static void main(String[]  args)
    {
        String input=" my name is shaik muntaj begum";
        
        List<String> result=maxVowels(input);
        
        System.out.println(result);
        
    }
}
