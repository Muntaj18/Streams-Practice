//Find common elements between two lists.
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(3, 4, 5, 6, 7);

        List<Integer> common = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());

        System.out.println(common);
    }
}
