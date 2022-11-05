package Class19;

public class Animal {
    String name;
    String breed;
    String color;

    public Animal(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" Color "+color);
    }
}
    class AnimalTest{
    public static void main(String[] args) {
        Animal cat = new Animal("Cat", "Wild", "Black");
        cat.printInfo();
        Animal dog=new Animal("Dog","Fighter", "White");
        dog.printInfo();
    }
}


