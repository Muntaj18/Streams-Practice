//Remove duplicates from list.

import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        List<Integer> list= List.of(12,23,34,12,23,47,88);
        
        Set<Integer> seen=new HashSet();
        
       Set<Integer> result=
       list.stream()
       .filter(n->seen.add(n))
       .collect(Collectors.toSet());
       
       
       System.out.println(result);
        
        
    }
}
