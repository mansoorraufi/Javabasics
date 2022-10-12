package Class20_Method_Overloading;

public class MethodOverLoadDemo2 {
    static void F1(String name, int number){
        System.out.println("1");
    }

    // By changing the number of parameters
    void F1(String name, int number, int number2){
        System.out.println("2");
    }

    //By changing the dataType
    void F1 (int number, int number2){
        System.out.println("3");
    }

    public static void main(String[] args) {
        MethodOverLoadDemo2 md =new MethodOverLoadDemo2();
        md.F1(30,20);
    }
}
