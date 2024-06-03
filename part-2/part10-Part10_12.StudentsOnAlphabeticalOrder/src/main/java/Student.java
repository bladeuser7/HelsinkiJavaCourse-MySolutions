
import java.util.ArrayList;

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student student) {
//        if (this.name == student.getName()) {
//            return 0;
//        }
//        if (this.getName() < student.getName()) {
//            return 1;
//        } else {
//            return -1;
//            
           return this.getName().compareTo(student.getName());
        
    }

}
