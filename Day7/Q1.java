//Reverse natural order.
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
               List<Integer> list=List.of(1,23,4,5,33);
               
               List<Integer> result=list.stream()
               .sorted(Comparator.reverseOrder())
               .toList();
               System.out.println(result);
        
        
    }
}
