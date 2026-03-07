//second highest number in the list

import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        List<Integer> list= List.of(12,23,34,47,88);
        
       Optional<Integer> result=
       list.stream()
       .sorted(Comparator.reverseOrder())
       .skip(1)
       .limit(1)
       .findFirst();
       
       System.out.println(result.get());
        
        
    }
}
