package Class18;

public class Dog_With_Notes {
    String name;
    String breed;
    String color;
    int age;
    double weight;
    double height;

    public Dog_With_Notes(String name, String breed, String color, int age, double weight) {

        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;

    }
    public Dog_With_Notes(String name, String breed, String color, int age, double weight, double height) {

        /*/this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;

         */
        // in here we don't use the full code, by the help of this keyword we initialize like this
        this (name, breed, color, age, weight);
        this.height = height;

    }

}
