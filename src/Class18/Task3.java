package Class18;

public class Task3 {
    /*Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this
    class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    and observe result.
     */

    private Task3(){
        System.out.println("private");
    }

     Task3(String name){
        System.out.println("Default");
    }
   protected Task3(int name){
        System.out.println("Protected");
    }

    public Task3(boolean name){
        System.out.println("Public");
    }

    public static void main(String[] args) {
        new Task3();
        new Task3("thank you Jigar");
        new Task3(10);
        new Task3(true);

    }
}
