//Merge Two Lists into a Single List
import java.util.*;
import java.util.stream.*;
class Q5{
    public static List<Integer>TwoListsIntoSIngle (List<Integer> list1,List<Integer> list2)
    {
        return Stream.concat(list1.stream(),list2.stream())
        .collect(Collectors.toList());
    }
    public static void main(String[] args) {
      List<Integer> list1=List.of(1,2,3,4,5);
      List<Integer> list2=List.of(5,6,7);
      
      List<Integer> result=TwoListsIntoSIngle(list1,list2);
      System.out.println(result);
    }
}
