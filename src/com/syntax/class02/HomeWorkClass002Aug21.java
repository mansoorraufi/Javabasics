package com.syntax.class02;

public class HomeWorkClass002Aug21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double num1, num2, add, sub, mult, div;

		num1 = 20.5;
		num2 = 10.2;
		add = num1 + num2;
		sub = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;

		System.out.println("The sum of 2 numbers " + num1 + " and " + num2 + " is " + add);
		System.out.println("The subtract of 2 numbers " + num1 + " and " + num2 + " is " + sub);
		System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is " + mult);
		System.out.println("The division of 2 numbers " + num1 + " and " + num2 + " is " + div);

		double num3, square;
		num3 = 3.9;
		square = num3 * num3;

		System.out.println("The square of " + num3 + " is " + square);

		float width, height, perimeter;
		width = 5;
		height = 8;

		perimeter = 2 * (5 + 8);

		System.out.println(
				"The perimeter of rectungle with width " + width + " and height " + height + " is " + perimeter);

	}

}
