//Extract length of each string.


import java.util.stream.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("banana","apple","grapes","pineapple");
        
        List<Integer> result=
        list.stream()
        .map(String::length)
        .toList();
        System.out.println(result);
        
         System.out.println(list.stream().collect(Collectors.toMap(s->s,String::length)));
    }
}
