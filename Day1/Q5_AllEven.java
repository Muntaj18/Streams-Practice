import java.util.List;
class AllEven {
    public static void main(String[] args) {
   List<Integer> list=List.of(2,4,6,8);
boolean alleven=
list.stream()
.allMatch(n->n%2==0);

System.out.println(alleven);

    }
}
