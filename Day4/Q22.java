//Check if none are zero.

import java.util.*;
class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(-100);
        list.add(0);
        list.add(-20);
        list.add(10);
        list.add(-200);
        list.add(120);
        
       boolean res=list.stream()
       .noneMatch(n->n<0);
        
       
       if(res)
       {
           System.out.println("none are zero");
       }else
       {
           System.out.println("Some number is zero");
       }
        
        
    }
}
