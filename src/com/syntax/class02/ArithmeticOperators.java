package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// same as math we have +,-,*,/,%;
		int a = 900;
		int b = 100;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		int         c = 10;
		int         d = 3;
		int remainder = c % d; // 10/5

		System.out.println(c % d); // 0

		System.out.println(c / d); // 2

		int div = c / d;
		System.out.println("div is = " + div);
		double num1 = 10.0;
		double num2 = 3.0;
		System.out.println(num1 / num2);

		System.out.println(num1 % num2);
		System.out.println("   using float data type  ----");

		float number1 = 10.0f;
		float number2 = 3.0f;
		System.out.println("Division of float = " + number1 / number2);

		// remainder - % - mod operator

		System.out.println(10 + 10 / 10); // 11
		System.out.println((10 + 10) / 10); // 2

	}

}
