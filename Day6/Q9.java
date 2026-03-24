//find the maximum number in a list
// without causing NoSuchElementException if the list is empty.

import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
               List<Integer> list=List.of(1,20,3,40,44,6,5);
             
             int result=list.stream()
             .mapToInt(Integer::intValue)
             .max()
             .orElse(-1);
             System.out.println(result);
             

        
    }
}
