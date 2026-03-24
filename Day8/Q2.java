//Count unique characters.
import java.util.List;

public class P14 {

    public static void main(String[] args) {
         String input = "programming";
        Long result=input.chars()
         .mapToObj(c->(char)c)
         .distinct()
         .count();

        System.out.println(result);
    }
}
