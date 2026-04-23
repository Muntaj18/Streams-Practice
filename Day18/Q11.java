//Find the Sum of Digits of a Number
import java.util.*;
import java.util.stream.*;
class Q11 {
    public static int sumOfDigits(int num)
    {
        return String.valueOf(num)
        .chars()
        .map(c->c-'0')
        .sum();
        
    }
    
    public static void main(String[] args) {
       int num=123;
    int result=sumOfDigits(num);
        System.out.println(result);
        
        
    }
}
