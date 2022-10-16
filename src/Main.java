import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Khaled",18,99));
        students.add(new Student("Ahmed",18,100));
        students.add(new Student("Omar",18,98));
        students.add(new Student("Saif",18,90));
        students.add(new Student("Youssef",18,96));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getFinalGrade() - student2.getFinalGrade();
            }
        });
        System.out.println(students);
    }
}