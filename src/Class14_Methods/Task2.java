package Class14_Methods;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a String that should be combination of letters, numbers and special characters.
         Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */

        String str="abcd ABCD 1234";
        str=str.replaceAll("[^a-zA-Z0-9]",""); // this sign ^ mean not or do not
        System.out.println("str = " + str);
        System.out.println( str.length());

    }
}
