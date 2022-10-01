package Class11;

public class Car {

    //Without void or Behavior
    ///
    /////

    String carColor;
    int carYear;
    String carMake;

    public static void main(String[] args){

        Car car1=new Car();
        car1.carMake="BMW";
        car1.carColor="Black";
        car1.carYear=2019;

        Car car2=new Car();
        car2.carMake="Toyota";
        car2.carColor="White";
        car2.carYear=2018;


        System.out.println("Car color is "+car1.carColor+" and car year is "+car1.carYear+" and car model is "+car1.carMake);

        System.out.println("Car color is "+car2.carColor+" and car year is "+car2.carYear+" and car model is "+car2.carMake);


    }

}
