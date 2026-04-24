//Partition a List of Integers into Even and Odd Numbers
import java.util.*;
import java.util.stream.*;
class Q4{
    public static Map<Boolean,List<Integer>> PartitionEvenAndOdd(List<Integer> list)
    {
        return list.stream()
        .collect(Collectors.partitioningBy(n->n%2==0));
    }
    
    public static void main(String[] args) {
      List<Integer> list=List.of(1,2,3,4,5);
    Map<Boolean,List<Integer>> result=PartitionEvenAndOdd(list);
    System.out.println(result);
        
        
    }
}
