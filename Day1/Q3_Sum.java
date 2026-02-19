class Sum{
    public static void main(String[] args) {
 List<String> list=List.of("Sam","john","Sara","Alex");
List<String> result=
list.stream()
    .filter(n->n.startsWith("S"))
    .toList();
System.out.println(result);

    }
}
