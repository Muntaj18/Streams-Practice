//Group a List of Objects by a Specific Attribute
import java.util.*;
import java.util.stream.*;
class Q3{
    public static Map<Integer,List<Person>> groupByAge(List<Person> list)
    {
        return list.stream()
        .collect(Collectors.groupingBy(Person::getAge));
    }
    
    public static void main(String[] args) {
      List<Person> list=List.of(
          new Person("Muntaj",22),
          new Person("shrejal",23),
          new Person("shwetha",23),
          new Person("sana",22)
          );
    Map<Integer,List<Person>> result=groupByAge(list);
    System.out.println(result);
    }
}
class Person{
    String name;
    int age;
    
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String getName()
    {
       return name; 
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public String toString()
    {
        return name;
    }

}
