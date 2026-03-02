//Filter strings starting with 'A'.
import java.util.stream.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("banana","apple","grapes","pineapple");
        
        List<String> result=
        list.stream()
        .filter(n->n.startsWith("a"))
        .toList();
        System.out.println(result);
        
         
    }
}
