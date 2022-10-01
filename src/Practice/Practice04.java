package Practice;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {

        // Using Scanner in loop
        Scanner input=new Scanner(System.in);
        int userinput=input.nextInt();

        for (int i=0; i<=userinput*2;i++){
            System.out.println(i);
        }





        // Using Scanner in Array

        int [] arr=new int[5];

        for (int i=0; i< arr.length; i++) {
            arr[i] = input.nextInt();
        } for (int i = 0; i< arr.length; i++){

                System.out.println(arr[i]+"0");
            }





    }
}
