package Class16_Static_Access_Modifiers;

public class Task1Tester {
    /*
Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */

    public static void main(String[] args) {
        SyntaxEmployee asgharEmp =new SyntaxEmployee();
        asgharEmp.empId="123";
        asgharEmp.salary=100000;


        System.out.println(SyntaxEmployee.CEO);
        SyntaxEmployee moazzamEmp= new SyntaxEmployee();
        moazzamEmp.empId="123";
        moazzamEmp.salary=100000;

        System.out.println(SyntaxEmployee.CEO);


    }


}
