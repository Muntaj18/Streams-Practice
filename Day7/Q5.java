//Case-insensitive sorting.
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
              List<String> names = Arrays.asList(
                "arun", "Bala", "chitra", "Divya", "ARJUN"
        );
        
        List<String> result=names.stream()
        .sorted(String.CASE_INSENSITIVE_ORDER)
        .toList();



               System.out.println(result);
        
        
    }
}
