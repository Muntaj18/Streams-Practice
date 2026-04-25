// Find the Difference Between Two Lists
import java.util.*;
import java.util.stream.*;
class Q8{
    public static List<Integer>extraElements(List<Integer> list1,List<Integer> list2)
    {
        return list1.stream()
        .filter(n->!list2.contains(n))
        .collect(Collectors.toList());
    }
    public static void main(String[] args) {
      List<Integer> list1=List.of(1,2,3,4,5);
      List<Integer> list2=List.of(5,6,7);
      
      List<Integer> result=extraElements(list1,list2);
      System.out.println(result);
    }
}
