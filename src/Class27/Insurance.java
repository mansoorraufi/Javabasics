package Class27;

public abstract class Insurance {
    /* Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList.
    Using for loop/advanced for loop/ iterator access all methods of the class.
    */

    String insuranceName;

    Insurance(String insuranceName){
        this.insuranceName=insuranceName;
    }
    abstract void getQuote();
    abstract void cancelInsurance();

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceName='" + insuranceName + '\'' +
                '}';
    }
}
class Car extends Insurance{

    String carModel;
    Car(String insuranceName,String carModel) {

        super(insuranceName); //calls the parent class constructor
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+ "charges 3% of the car value for "+carModel);
    }

    @Override
    void cancelInsurance() {

        System.out.println(insuranceName+ " has been canceled");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}

class Pet extends Insurance{

    String petType;
    Pet(String insurance,String petType){
        super(insurance);
        this.petType=petType;
    }
    @Override
    void getQuote() {
        System.out.println(insuranceName+" charges 1500USD for "+petType);
    }

    @Override
    void cancelInsurance() {

        System.out.println(insuranceName+" has been canceled for "+petType);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petType='" + petType + '\'' +
                ", insuranceName='" + insuranceName + '\'' +
                '}';
    }
}

class Health extends Insurance{

    Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+ "charges 2000USD for health");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" has been canceled");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
