package Class27;

import java.util.Collection;
import java.util.HashMap;

public class MapDemo4 {
    public static void main(String[] args) {

        HashMap<String,Double> fruit = new HashMap<>();
        fruit.put("Apple",1.99); // .put to store the Keys and Values in Map
        fruit.put("Mango",1.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);

        Collection<String> allKeys = fruit.keySet(); // Getting all the Keys in form of a Set.
        System.out.println(allKeys);

     /*   Iterator<String> folder = allKeys.iterator(); // Getting iterator from the Set above.
        while (folder.hasNext()){
            String item = folder.next();
            if (item.contains("n")){
                folder.remove();
            }
        }
        System.out.println(fruit);*/

        fruit.keySet().removeIf(x -> x.contains("n"));  // this is the easiest way of the above operation.
        System.out.println(fruit); // same output as above ops.

    }
}
