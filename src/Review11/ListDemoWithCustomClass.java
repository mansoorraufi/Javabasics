package Review11;

import java.util.ArrayList;

public class ListDemoWithCustomClass {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Josh","Plantin","123"));
        students.add(new Student("Mansoor","Raufi","001"));
        students.add(new Student("Fraidoon","Rasuli","002"));
        students.add(new Student("Shahram","Kakar","003"));

        System.out.println(students);

        for (Student student:students

             ) { student.printName();

        }
    }
}
