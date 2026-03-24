//	Remove special characters.
import java.util.List;

public class P14 {

    public static void main(String[] args) {
         List<String> data = List.of("Ja@va!", "Str#eam$", "Do^cker%");
         List<String> result=data.stream()
         .map(s->s.replaceAll("[^a-zA-Z0-9]",""))
         .toList();

        System.out.println(result);
    }
}
