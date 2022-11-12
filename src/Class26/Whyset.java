package Class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Whyset {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);


        // set does not run the dublicate values
        LinkedHashSet<Integer> setNumbers=new LinkedHashSet<>();
        setNumbers.add(10);
        setNumbers.add(20);
        setNumbers.add(10);
        System.out.println(setNumbers); //result [10,20] one 10 is removed.

    }
}
