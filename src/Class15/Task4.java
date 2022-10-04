package Class15;

public class Task4 {
    //Create a method that will say Hello in different language based on the country that will passed when method is executed

    void sayHello(String country){

        if ("USA".equals(country)) {
            System.out.println("Hello");
        } else {
            if ("India".equals(country)) {
                System.out.println("Namaste");
            } else if ("Turkiye".equals(country)) {
                System.out.println("Merhaba");
            } else if ("Pakistan".equals(country)) {
                System.out.println("AOA");
            } else if ("Japan".equals(country)) {
                System.out.println("Nihau");
            } else {
                System.out.println("Country not supported");}
        }
    }

    public static void main(String[] args) {
        Task4 task=new Task4();
        task.sayHello("USA");
        task.sayHello("India");
    }
}
