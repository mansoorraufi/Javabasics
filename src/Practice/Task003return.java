package Practice;

abstract class Car2 {
    double carPrice;
    String color;
   abstract double calculateSalePrice();
    Car2(double carPrice, String color){
        this.carPrice=carPrice;
        this.color=color;

    }
}


class Truck2 extends Car2 {
    double weight;
    Truck2(double carPrice, String color, double weight){
        super(carPrice,color);
        this.weight=weight;}
   double calculateSalePrice(){

        if (weight>2000){
           return carPrice-(10*carPrice/100);
        }
else{
    return carPrice-(20*carPrice/100);

        }

    }
}


class Sedan2 extends Car2{
    double legnth;
    Sedan2(double carPrice, String color, double legnth){
        super(carPrice,color);
        this.legnth=legnth;
    }
    double calculateSalePrice(){

        if (legnth>20) {
            return carPrice - (5* carPrice / 100);
        }
        else {
         return  carPrice-(10*carPrice/100);


    }
    }
}
