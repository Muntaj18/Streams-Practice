//String ends with a and e

import java.util.stream.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("banana","apple","grapes","pineapple");
        
        List<String> result=
        list.stream()
        .filter(n->n.endsWith("a") || n.endsWith("e"))
        .toList();
        System.out.println(result);
        
         
    }
}
