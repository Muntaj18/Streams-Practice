//Sum of digits using streams
import java.util.*;
class Q1 {
    public static int sumofdigits(int num)
    {
        return String.valueOf(num)
        .chars()
        .map(c->c-'0')
        .sum();
    }
    public static void main(String[] args) {
        int num=1234;
        
        int result=sumofdigits(num);
        
        System.out.println(result);
    }
}
