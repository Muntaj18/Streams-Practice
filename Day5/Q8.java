//Convert list of strings to uppercase?
import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        List<String> list=List.of("epam","java","muntaj","begum");
        
        List<String> result=
        list.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
        
        System.out.println(result);
        
    }
}
