package Class5;

import java.util.Scanner;

public class classAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * / 3. Ask user to enter a number and then define if number is small, medium or
		 * large Small number is value between 1 and 10 Medium number is value between
		 * 11 and 100 Large number is value between 101 and 1000
		 */

	Scanner scan=new Scanner(System.in);
	
	
	System.out.println("Enter a number");
	int num1=scan.nextInt();
	
	if (num1>=1 && num1<=10 ) {
		System.out.println("Small number");
		
	} if (num1>=11 && num1<=100) {
		System.out.println("Medium Number");
	} if (num1>=101 && num1<=1000)
	{
		System.out.println("Large number");
	}
	
	
	
	}

}
