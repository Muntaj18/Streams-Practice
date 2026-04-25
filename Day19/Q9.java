//Count the Occurrences of Each Element in a List
import java.util.*;
import java.util.stream.*;
class Q9{
    public static Map<String,Long> Occurance (List<String> words)
    {
        return words.stream()
        .collect(Collectors.groupingBy(n->n,Collectors.counting()));
    }
    public static void main(String[] args) {
      List<String> words = List.of("apple", "banana", "apple", "orange");
      
      Map<String,Long> result=Occurance(words);
      System.out.println(result);
    }
}
