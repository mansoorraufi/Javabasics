package Class14;

public class MethodDemo1 {

    // a method that does not take any parameters and prints some lines on the console

    void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Aladin");
    }

    // a method that takes a single parameter of type String and prints it
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
