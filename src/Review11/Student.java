package Review11;

public class Student {
    private String firstname;
    private String lastname;
    private String rollnumber;

    public Student(String firstname, String lastname, String rollnumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.rollnumber = rollnumber;
    }
        void printName(){
            System.out.println(firstname+" "+lastname);
        }


    @Override   // we should overtide it to "toString" otherwise it will not print the elements in class ListDemWithCustomClass
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", rollnumber='" + rollnumber + '\'' +
                '}';
    }

}
