// Find the Factorial of a Number

import java.util.*;
import java.util.stream.*;
class Q12 {
    public static int factorial(int num)
    {
        return IntStream.rangeClosed(1,num)
        .reduce(1,(a,b)->a*b);
    }
    
    public static void main(String[] args) {
       int num=5;
    int result=factorial(num);
        System.out.println(result);
        
        
    }
}
