//Convert List<Integer> to List<String>.


import java.util.stream.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,6,7);
        
        List<String> result=
        list.stream()
        .map(n->String.valueOf(n))
        .toList();
        
        System.out.println(result);
    }
}
