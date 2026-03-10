//Convert list of strings to lowercase.
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        List<String> list=List.of("EPAM","Java","MUNTAJ","BEGUM");
        
        List<String> result=
        list.stream()
        .map(String::toLowerCase)
        .collect(Collectors.toList());
        
        System.out.println(result);
        
    }
}
