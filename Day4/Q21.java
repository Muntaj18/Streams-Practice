//Check if some numbers are positive AND some numbers are negative

import java.util.*;
class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(-100);
        list.add(-10);
        list.add(-20);
        list.add(10);
        list.add(-200);
        list.add(120);
        
       boolean res=list.stream()
       .anyMatch(n->n<0);
        boolean res1=list.stream()
       .anyMatch(n->n>0);
       
       if(res && res1)
       {
           System.out.println("some positive and some negative");
       }else if(res1)
       {
           System.out.println("positive");
       }else
       {
           System.out.println("negative");
       }
        
        
    }
}
