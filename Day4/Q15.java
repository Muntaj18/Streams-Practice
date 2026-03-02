//minimum number

import java.util.stream.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
       List<Integer> list=new ArrayList();
       list.add(90);
       list.add(100);
       list.add(3);
       list.add(4);
       
      Integer a=list.stream()
      .mapToInt(Integer::intValue)
      .min()
      .getAsInt();
      
      System.out.println(a);
        
         
    }
}
