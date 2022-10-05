package Class14_Methods;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {

        String str="kjfkaasszzsASDF1230!@#$%";

        //replaceAll(); replace or remove all elements exept everything is in [].
        //then "". mean we change the rest char with empty space
        str=str.replaceAll("[^a-z]","");// print only lower case values.
        //str=str.replaceAll("[^a-zA-Z]","") Prints lower and Upper Case values.
        System.out.println(str);

        //split();
        String sentence="Batch 14 is Great. Batch 14 is excellent? Batch 14 is just amazing";
        String[] split = sentence.split("[.?!]");
        System.out.println("split = " + Arrays.toString(split));

        //replaceFirst(); replace first Great of the sentence.
        String str2="Batch 14 is Great. Batch 14 is Great";
        String replace=str2.replaceFirst("Great","Good");
        System.out.println(replace);



    }
}

