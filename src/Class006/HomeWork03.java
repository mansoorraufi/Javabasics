package Class006;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {

		/*
		 * / 3. : Using scanner class create calculator. Allow user to enter 2 numbers
		 * and operator(+,-,*,/). Based on operator provide the result to user. Please
		 * complete this assignment in 2 ways: using if statement and switch case.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first number:");
		double num1 = scan.nextDouble();
		System.out.println("Please enter your second number:");
		double num2 = scan.nextDouble();
		System.out.println("Please enter the operator you want to use:");
		char operator = scan.next().charAt(0);

		double result = 0;

		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			result = num1 / num2;
		} else {
			System.out.println("Please enter a valid operator or number");
		}

		System.out.println(result);

		switch (operator) {
		case '+':
			result = num1 + num2;
			break;

		case '-':
			result = num1 - num2;
			break;

		case '*':
			result = num1 * num2;
			break;

		case '/':
			result = num1 / num2;
			break;
			
		

		}
		System.out.println(result);

	}

}
