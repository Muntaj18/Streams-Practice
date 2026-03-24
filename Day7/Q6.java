//Flatten List<List<Integer>>.
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
              List<List<Integer>> list=List.of(
              List.of(1,2,3),
              List.of(2,3,4,5),
              List.of(3,4,5,67,6)
              );
            List<Integer> result=
            list.stream()
            .flatMap(n->n.stream())
            .collect(Collectors.toList());



             System.out.println(result);
        
        
    }
}
