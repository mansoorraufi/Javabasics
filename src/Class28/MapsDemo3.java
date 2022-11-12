package Class28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapsDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> items=new HashMap<>();
        items.put("Iphone 14",1000.0);
        items.put("Eggs",2.40);
        items.put("Apples",5.0);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);

        System.out.println();

                                        //values() method returns a Set that contains all values of a map
        Collection<Double> value = items.values(); // print values (Price) without []
        
        //for values we use Collection instead of Set.
        for (Double val:value
             ) {
            System.out.println(val);
        }
                                //keySet() method returns a Set that contains all keys (item names) of a map
        Set<String> keys = items.keySet(); // print keys (name) without [].
        for (String key:keys
        ) {
            System.out.println(key);

        }


    }
}
