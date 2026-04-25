//Count the Occurrences of Each Character in a String

import java.util.*;
import java.util.stream.*;
class Q10{
    public static Map<Character,Long> OccuranceOfEachCharacter (String words)
    {
        return words.chars()
        .mapToObj(n->(char)n)
        .collect(Collectors.groupingBy(n->n,Collectors.counting()));
    }
    public static void main(String[] args) {
      String words = "muntaj";
      
      Map<Character,Long> result=OccuranceOfEachCharacter(words);
      System.out.println(result);
    }
}
