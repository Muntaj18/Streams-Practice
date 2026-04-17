//Reverse String
import java.util.*;
import java.util.stream.Collectors;
class Q10 {
    public static String firstNonRepeating(String input)
    {
        return new StringBuilder(input)
        .reverse()
        .toString();
    }

    public static void main(String[]  args)
    {
       String input="programming";
       
       String result=firstNonRepeating(input);
       System.out.println(result);
        
    }
}
