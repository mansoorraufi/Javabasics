package Class28;

import java.util.HashMap;

public class MapsDemo5 {
    public static void main(String[] args) {

        // using var instead of data type and creating new variable to print the whole Map contains

        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14",100.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

       // Set<Map .Entry<String,Double>> entrySet = items.entrySet();

        var entrySet = items.entrySet(); // this is the best way to do so instead of the above codding.

        System.out.println(entrySet); // print outs all the contains of the Map

        // bellow operation will print whole contians seperatly, not in [ ].
        for (var item:entrySet){
            System.out.println(item);
        }




    }
}
