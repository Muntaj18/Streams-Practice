//Remove duplicates using reduce.
import java.util.ArrayList;
import java.util.List;

public class Q6 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 3, 6);

        List<Integer> unique = numbers.stream()
                .reduce(new ArrayList<>(),
                        (acc, n) -> {
                            if (!acc.contains(n)) {
                                acc.add(n);
                            }
                            return acc;
                        },
                        (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        });

        System.out.println(unique);
    }
}
