//Find the Intersection of Two Lists
import java.util.*;
import java.util.stream.*;
class Q6{
    public static List<Integer>intersection(List<Integer> list1,List<Integer> list2)
    {
        return list1.stream()
        .filter(list2::contains)
        .collect(Collectors.toList());
    }
    public static void main(String[] args) {
      List<Integer> list1=List.of(1,2,3,4,5);
      List<Integer> list2=List.of(5,6,7);
      
      List<Integer> result=intersection(list1,list2);
      System.out.println(result);
    }
}
