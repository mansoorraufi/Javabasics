package Class21;

public class Animal { String name;
    String color;
    String breed;
    void sleep(){
        System.out.println(" Animals usually sleep for 6 hours");
    }
    void eat(){
        System.out.println("Animals eat Grass and meat");
    }
}

class Cat extends Animal{

    void sleep(){
        System.out.println(" Cats like to sleep for 20 hours");
    }
    void eat(){
        System.out.println("Cats only like fish");
    }
}

class Dog extends Animal{

    void sleep() {
        System.out.println(" Dogs like to sleep for 10 hours");
    }
    void eat(){
        System.out.println("Dogs like meat");
    }
}
