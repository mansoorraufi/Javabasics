package ReviewClass04;

import ReviewClass03.Teacher;

public class TeacherTest {
    public static void main(String[] args) {

        Teacher t=new Teacher("John", "Smith");

        Teacher.work(); //public
        //protected is not visible in other packages UNLESS there is inheritance
        // default is not visible in other packages.
    }

}
