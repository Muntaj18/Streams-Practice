//Compute factorial of 10.
import java.util.stream.LongStream;
public class P12 {
    public static void main(String[] args) {
        long factorial = LongStream.rangeClosed(1, 10)
                .reduce(1, (a, b) -> a * b);

        System.out.println(factorial);
    }
}
