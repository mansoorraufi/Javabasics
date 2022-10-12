package Class19;

public class Dog extends Animal {
    // No need to reuse instance var, as we have them in parrent class (Animal)
   // String name;
   // String breed;
   // String color;

    //creating const
    public Dog(String name, String breed, String color){
       // this.name=name;
       // this.breed=breed;
        //this.color=color;

       // instead we use supper keyword
        super(name,breed,color);
    }
    public void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" color "+color);
    }
}
//Creating another Class
class Cat extends Animal {
    // String name;
    //String breed;
    //String color;


    // creating constractor for class Cat
    Cat(String name, String breed, String color) {
        // no need to retype the same code, we use the const detials from parrent class (Anilam)
        //this.name=name;
        //this.breed=breed;
        //this.color=color;

        // instead we use supper keyword
        super(name, breed, color);


    }

}



