package Class14_Methods;

public class MethodsDemo2 {
    void printManyTimes(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Hello Java");

        }
    }
    void printCustomerWordManyTimes(String word,int times){
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethodsDemo2 md = new MethodsDemo2();
        md.printManyTimes(3);
        md.printCustomerWordManyTimes("Syntax Easy",4);
    }
}
