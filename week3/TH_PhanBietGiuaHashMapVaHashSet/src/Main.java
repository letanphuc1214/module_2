import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Phuc", 25, "Hue");
        Student student1 = new Student("Hiep", 26, "HaNoi");
        Student student2 = new Student("Nguyen", 24, "DaNang");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student);
        studentMap.put(2, student1);
        studentMap.put(3, student2);

        for(Map.Entry<Integer, Student> studentEntry : studentMap.entrySet()){
            System.out.println(studentEntry.toString());
        }

        System.out.println(".........Set");

        Set<Student> students = new HashSet<Student>();
        students.add(student);
        students.add(student1);
        students.add(student2);

        for (Student std : students){
            System.out.println(std.toString());
        }


    }
}
