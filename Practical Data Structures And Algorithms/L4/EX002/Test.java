import java.util.Arrays;
public class Test {
    public static void main (String [] args) {
        Student s1 = new Student("Tom Dean", 8, 6, 7.6);
        Student s2 = new Student("Kinesty",10,9,10);
        Student s3 = new Student("Kick Jone",3,10,3);
        Student s4 = new Student("Smith",5,9,7);
        Student s5 = new Student("Koldepe",1,2,4);

        Student [] arrStudent = {s1,s2,s3,s4,s5};
        // System.out.println (Arrays.toString(arrStudent));
        // Arrays.sort(arrStudent, new SCA());
        Arrays.sort(arrStudent, new SCD());
        System.out.println (Arrays.toString(arrStudent));
    }
}