package Class15;

public class HondaBike {
     static int topSpeed=200; // when the value of a var is stays same and not changing its can be a static var
     static int noOfTyres=2;
     String model;
     int year;


       void printTotalDistance(int noOfGallons, int avg){
           double distance=noOfGallons/10;
           System.out.println("your bike can go max "+distance
                   +" with this much "+noOfGallons);
    }

    public static void main(String[] args) {
        System.out.println(HondaBike.noOfTyres);
        HondaBike ybr=new HondaBike();
        ybr.model="ybr100";
        ybr.printTotalDistance(10,20);
    }


}
