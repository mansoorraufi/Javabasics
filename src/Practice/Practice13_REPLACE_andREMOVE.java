package Practice;

public class Practice13_REPLACE_andREMOVE {
    public static void main(String[] args) {

        String str="HELLO how ARE you? 1234567890@#$%&*";

        // Replace all numbers from 0 to 9 with @

        System.out.println(str.replaceAll("[0-9]","@"));

        // Remove all numbers from 0 to 9

        System.out.println(str.replaceAll("[0-9]",""));

        // Remove all letters  from a to z refer the asci table for range info

        System.out.println(str.replaceAll("[a-z]",""));

        // Remove all letters  from A to Z refer the asci table for range info

        System.out.println(str.replaceAll("[A-Z]",""));

        // Remove all letters  other than A to Z refer the asci table for range info

        System.out.println(str.replaceAll("[^A-Z]","")); // this sign ^ mean do Not replace
             // means do not replace A-Z but replace {everything else with ("")}
            // print out will be only Caps letters

        // Remove all letters  other than A to Z and a to z refer
        // the asci table for range info

        System.out.println(str.replaceAll("[^a-zA-Z]",""));

        //Remove all letters  other than A to Z and a to z and 0 to 9
        // refer the asci table for range info

        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));


        //Remove Spaces between the words

        String str5="we love Java";
        str5=str5.replaceAll(" ",""); // we can us ("\s") also instead of (" ")
        // we can replace anything like replace Java to Sunday: str5=str5.replaceAll("Java","Sunday");
        System.out.println("str5 = " + str5);



    }

}
