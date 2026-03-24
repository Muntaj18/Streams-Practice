//Given a list of integers,
// retrieve the first even number using streams. If none exist, return -1.

import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Integer> list=List.of(10,12,34,4,5,6);
        
        int result=list.stream()
        .filter(n->n%2==0)
        .findFirst()
        .orElse(-1);
        System.out.println(result);
    }
}
