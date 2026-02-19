public class CubeNumbers{
  public static void main(String[] args){
List<Integer> list=List.of(1,2,3,4);
List<Integer> result=
  list.stream()
  .map(n->n*n*n)
  .toList();
System.out.println(result);
  }
}

