class Sum{
    public static void main(String[] args) {
 class Main {
    public static void main(String[] args) {
        List<Integer> list=List.of(5,10,15);
        int sum=list.stream()
                     .reduce(0,Integer::sum);
System.out.println(sum);

    }
}

