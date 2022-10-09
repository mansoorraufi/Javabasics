package Practice;

import java.util.Scanner;

public class ghgjh {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below

        String str=givenString;
        StringBuilder stringBuilder=new StringBuilder(givenString);
        stringBuilder.reverse();
        if (stringBuilder.toString().equalsIgnoreCase(givenString)){
            System.out.println("The String is Palindrome");
            boolean istrue=true;
        } else {
            System.out.println("This String is not Palindrome");
            boolean isFalse=false;
        }




    }
}
