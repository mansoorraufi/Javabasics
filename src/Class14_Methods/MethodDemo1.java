package Class14_Methods;

public class MethodDemo1 {

    // a method that does not take any parameters and prints some lines on the console

    void printHello(){ // empty brackets no parameters or data type inside it(no parameters){}
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Aladin");
    }

    // a method that takes a single parameter (String word) of type String and prints it
    void printWord(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethodDemo1 obj=new MethodDemo1();
        obj.printHello();
        obj.printWord("Cool");
        obj.printWord("All right");
    }
}
