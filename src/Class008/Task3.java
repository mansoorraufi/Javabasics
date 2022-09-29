package Class008;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// 1. Print numbers from 1 to 50 except those that are divisible by 3

		for (int i = 1; i <= 50; i++) {

			if (i % 3 == 0)
				continue;
			System.out.print(i + " ");
		}

		/*
		 * 2: Write a program to ask a user to enter item they want to buy and the price
		 * of that item. Every time user enters money, accumulate the amount and tell
		 * the user how much is left to pay off. If user give more money program should
		 * return a change. Whenever user done with payments program should say
		 * "Thank you for shopping!"
		 */

	
	Scanner scan=new Scanner (System.in);
	
	System.out.println("Enter the principal amount");
	double principal = scan.nextDouble();
	
	
	
	
	
	
	}

}
