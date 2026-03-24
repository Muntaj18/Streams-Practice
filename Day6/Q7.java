//Collect a list of integers into an immutable list
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
               List<Integer> list=Arrays.asList(1,2,45,23,6);
               List<Integer> result=list.stream()
               .collect(Collectors.toUnmodifiableList());
        System.out.println(result);
    }
}

