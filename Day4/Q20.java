//Check if all numbers are NEGATIVE.

import java.util.*;
class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(-100);
        list.add(-10);
        list.add(-20);
        list.add(-10);
        list.add(-200);
        list.add(-120);
        
       boolean res=list.stream()
       .allMatch(n->n<0);
       
       if(res)
       {
           System.out.println("All are negative");
       }else
       {
           System.out.println("positive");
       }
        
        
    }
}
