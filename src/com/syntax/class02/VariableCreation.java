package com.syntax.class02;

public class VariableCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ways to create a variables
		// 1. Way;

		byte b = 10; // create a variable and assigned value

		// 2.way

		int i; // create a variable
		i = 100; // assign the value

		// we need to create a variable only once
		// then we can use as many times we want/need

		// 3rd Way
		// creating variable = declare a variable (same meaning).
		int num1, num2, num3;

		num1 = 100; // assign a number or initialize variable
		num2 = 200;
		num3 = 300;

		// int num1=100; error -> dublicate variable
		// can I change a variable??
		System.out.println(num2); // 200

		num2 = 2000; // reassign the value

		System.out.println(num2); // 2000

		num1 = 333;
		num2 = 444;
		num3 = 555;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		boolean hot;
		hot = true;
		hot = false;
		System.out.println(hot);

	}

}
