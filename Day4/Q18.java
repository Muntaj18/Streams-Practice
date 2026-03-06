//Find first element greater than 100.

import java.util.*;
class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(100);
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(200);
        list.add(120);
        
        Integer result=list.stream()
        .filter(n->n>100)
        .findFirst()
        .get();
        
        System.out.println(result);
    }
}
