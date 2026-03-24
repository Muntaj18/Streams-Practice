//Extract digits from strings.
import java.util.List;

public class P14 {

    public static void main(String[] args) {
         List<String> data = List.of("abc123", "45xyz", "9test");
         List<String> result=data.stream()
         .map(s->s.replaceAll("\\D",""))
         .toList();

        System.out.println(result);
    }
}
