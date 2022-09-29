package com.syntax.class02;

public class NonprimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String is just one example of non primitive data type

		String name = "Asma"; // we use the value in double quote ""!
		String address = "123 address street";
		String phone = "123 456 3456";

		// int age="17"; // it shows an error bcs the value is in ""
		int age = 17;
		// it should be changed to String or we should remove the ""

		String character = "A";

		// ctr+space= auto complete the statement.
		System.out.println(name);

		// "My name is" + Asma
		System.out.println("My name is " + name);

		// Asma is 17
		System.out.println(name + " is " + age);

		String fruit = "apple";
		double price = 1.99;

		System.out.println("the price of the " + fruit + " is " + price);

		// to attach any value (int, double, boolean, char; we use plus + sign
		// the + to the string acts as Concatenation(attaching).

		// to change the fruit and its price do the following
		fruit = "mango";
		price = 5.99;

		System.out.println("the price of the " + fruit + " is " + price);

	}

}
