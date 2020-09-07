package Entity;

import java.util.Comparator;

public class SortStudentByPoint implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getAverage() > student2.getAverage()){
            return 1;
        }
        return -1;
    }
}
