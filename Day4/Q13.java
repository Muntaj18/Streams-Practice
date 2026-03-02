//Count total elements.

import java.util.stream.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        List<Integer> list= List.of(1,2,4,56,78,23,4,1,2,3,0,88,553,45);
        Long c=
        list.stream()
        .count();
        Long c1=
        list.stream()
        .collect(Collectors.reducing(0L,a->1L,Long::sum));
        
        System.out.println(c);
        System.out.println(c1);
        
         
    }
}
