//Remove duplicates from string and return in same order
import java.util.stream.Collectors;
class Q2 {
    public static String removeDuplicates(String input)
    {
        return input.chars()
        .mapToObj(c->(char)c)
        .distinct()
        .map(String::valueOf)
        .collect(Collectors.joining());
    }
    
    
    public static void main(String[] args) {
        String input="programming";
        
        String result=removeDuplicates(input);
        
        System.out.println(result);
    }
}
