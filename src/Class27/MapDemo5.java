package Class27;

import java.util.HashMap;

public class MapDemo5 {
    public static void main(String[] args) {

        HashMap<String,Double> fruit = new HashMap<>();
        fruit.put("Apple",1.99); // .put ==> to store the Keys and Values in Map
        fruit.put("Mango",1.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

      /*  Collection<Double> values = fruit.values(); // Returns all the values from the Map
        Iterator<Double> folder = values.iterator(); // Getting iterator from the Set above.
        while (folder.hasNext()){
            Double value = folder.next();
            if (value>2){
                folder.remove();
            }
        }
        System.out.println(fruit);*/

        fruit.values().removeIf(x->x>2); // same output as code from line 14 to 22 just in one line code
        System.out.println(fruit);



    }
}
