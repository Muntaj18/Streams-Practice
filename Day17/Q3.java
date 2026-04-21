Question 2: Custom Sorting of Top N Performers (Sorting - Custom Comparator)

**Scenario:** You have a list of `Student` records (`name, grade, attendancePercentage`). The principal wants a list of the **top 3 students** ready for a scholarship. The sorting criteria is complex:
1.  **Primary:** Sort by Grade descending (higher grade first).
// 2.  **Secondary (Tie-Breaker):** Sort by Attendance Percentage descending (higher attendance first).

// **Target Concepts:** `Stream.sorted(Comparator.comparing().thenComparing().reversed())`, `limit()`.

// **Input Data:**
// ```java
// record Student(String name, int grade, double attendance) {}
// List<Student> students = List.of(
//     new Student("Alex", 95, 98.5),
//     new Student("Blake", 95, 92.0),
//     new Student("Casey", 88, 99.0),
//     new Student("Drew", 95, 95.0),
//     new Student("Ellis", 91, 80.0)
// );
// ```

// **Task:** Generate a list of the top 3 student names in correct scholarship order.

// **Expected Output:**
// ```text
// [Alex, Drew, Blake]
// ```
// *(Explanation: All grade 95 students come first. Among them, Alex (98.5) beats Drew (95.0) beats Blake (92.0).)*

import java.util.*;
import java.util.stream.Collectors;
public class Q3{
    public static List<String> TopStudents(List<Student> students)
    {
        return students.stream()
        .sorted(Comparator.comparing(Student::getGrade).reversed().thenComparing(Comparator.comparing(Student::getAttendance).reversed()))
        .limit(3)
        .map(Student::getName)
        .toList();
    }
    public static void main(String[] args) {
       List<Student> students = List.of(
                new Student("Alex", 95, 98.5),
                new Student("Blake", 95, 92.0),
                new Student("Casey", 88, 99.0),
                new Student("Drew", 95, 95.0),
                new Student("Ellis", 91, 80.0)
        );
        
        List<String> result=TopStudents(students);
        System.out.println(result);

    }
}

class Student {
    private String name;
    private int grade;
    private double attendance;

    public Student(String name, int grade, double attendance) {
        this.name = name;
        this.grade = grade;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getAttendance() {
        return attendance;
    }
}
