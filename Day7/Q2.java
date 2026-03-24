//Sort strings by length.
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
               List<String> list=List.of("Muntaj","begum","shaik","sana");
               
               
               List<String> result=list.stream()
               .sorted(Comparator.comparingInt(String::length))
               .toList();
               System.out.println(result);
        
        
    }
}
