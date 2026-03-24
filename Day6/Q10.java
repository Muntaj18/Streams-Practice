//Given Optional<String>,
// convert it into a stream and process it using stream pipeline operations.
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
               List<String> list=List.of("muntaj","begum","shaik");
               
               String result=list.stream()
               .map(n->n.toUpperCase())
               .findAny()
               .orElse("none");
               System.out.println(result);
        
        
    }
}
