package Class18;

public class Horse_With_Notes {
    String name;
    String breed;
    int age;
    double weight;

    // creating const:
    public Horse_With_Notes(String name, String breed, int age, double weight){



        // bellow we have same names for variables instance and constrctor var
        //but we need to link them to each other with keyword "this"
       this.name = name;
       this.breed = breed;
        this.age = age;
        this.weight = weight;

    }

           // creating method
    void printInfo(){
        System.out.println("name"+name+"Breed"+breed+"Weight"+weight);

    }

    //Creating Object.
    public static void main(String[] args) {
        Horse_With_Notes horseObj=new Horse_With_Notes("Sprit", "Stallion",20,400);
    }

}
