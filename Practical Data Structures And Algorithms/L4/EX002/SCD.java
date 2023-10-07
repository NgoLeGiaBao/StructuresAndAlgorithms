import java.util.Comparator;
public class SCD implements Comparator<Student> {
    public int compare (Student s1, Student s2) {
        if (s1.getAverage() < s2.getAverage())
            return 1;
        if (s1.getAverage() > s2.getAverage())
            return -1;
        return 0;
    }
}