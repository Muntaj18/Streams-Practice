//Average of all numbers.

import java.util.*;
class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList();
        list.add(100);
        list.add(10);
        list.add(20);
        list.add(10);
        
        double result= list.stream()
        .filter(Objects::nonNull)
        .mapToInt(Integer::intValue)
        .average().getAsDouble();
        
        System.out.println(result);
    }
}
