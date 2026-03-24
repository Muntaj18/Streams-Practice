//Partition EVEN AND ODD numbers.

import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
               List<Integer> list=List.of(1,20,3,40,44,6,5);
               
               Map<Boolean, List<Integer>> result=list.stream()
               .collect(Collectors.partitioningBy(n->n%2==0));
               
        System.out.println("Even Numbers:"+ result.get(true));
                System.out.println("Even Numbers:"+ result.get(false));

        
    }
}

