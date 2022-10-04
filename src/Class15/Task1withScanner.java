package Class15;

import java.util.Scanner;

public class Task1withScanner {
    //Create a method that will take 2 parameters as a numbers and prints which
    //number is larger.

    void printLarger (int num1,int num2){
        if (num1>num2){
            System.out.println("Number 1 is larger "+num1);
        } else if (num2>num1){
            System.out.println("Number 2 is larger "+num2);
        } else {
            System.out.println("Numbers are equal");
        }
    }
    //calling the method as bellow:
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first number");
       int num1= scan.nextInt();
        System.out.println("Please enter the second number");
        int num2= scan.nextInt();

        Task1 task1=new Task1();
        task1.printLarger(num1,num2);
        task1.printLarger(50,12);//num1 is larger


    }
}
