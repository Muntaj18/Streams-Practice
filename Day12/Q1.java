//codility-3 question
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;
import java.util.stream.Stream;


public class Main{
    public static List<String> topkStudents(List<Student> students,int k)
    {
        return students.stream()
        .sorted(Comparator.comparingInt(Student::getScore).reversed().thenComparing(Student::getName))
        .limit(k)
        .map(Student::getName)
        .toList();
    }
    public static void main(String[] args)
    {
        List<Student> students=List.of(
            new Student(1,"Bob",99),
            new Student(2,"Alice",99),
            new Student(3,"Charlie",34)
            );
            
        int k=2;
        
        List<String> result=topkStudents(students,k);
        System.out.println(result);
    }
}


class Student
{
    int id;
    String name;
    int score;
    
    Student(int id,String name,int score)
    {
        this.id=id;
        this.name=name;
        this.score=score;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getScore()
    {
        return score;
    }
}



        

