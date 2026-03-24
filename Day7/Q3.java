//Sort map by value.
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
              Map<String,Integer> map=Map.of(
                  "banana",2,
                  "Apple",4,
                  "grapes",3
                  );
                Map<String,Integer> result=map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (v1,v2)->v1,
                    LinkedHashMap::new
                    
                    ));
               System.out.println(result);
        
        
    }
}
