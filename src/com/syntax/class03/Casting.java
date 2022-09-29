package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// type casting = type = data type casting = converting;
		// converting a data type to another..
		
		// int number = 15.2; // cannot convert from double to int;
		                  // we cant store the decimal number into the int type box;
		
		
		
		// int number = (int) 15.2; there for we add DECIMAL to confirm;
		
		byte box1 = 127; // smallest box
		short box2 = 3333; // smaller box
		int box3 = 454545; // small
		long box4= 45454545; // large
		float box5= 45454545; // larger
		double box6 = 454545454; // bigger
		
		int number = (int)15.2;
		System.out.println(number);
		
		byte smallerbox=(byte) box2;
		System.out.println(smallerbox);
		
		
		//Write a program to convert double 500.4444 into long.
		
		long numb=(long)500.4444;
	    System.out.println(numb);
	    //===================================
		
		byte newone=(byte)box2;
		System.out.println(newone);
		
		// convert long into float
		
		float newone2=(float)box4;
		System.out.println(newone2);
		//==================================
		
		// change a number into char (Character)
		
		char truefalls=(char)65;
		System.out.println(truefalls);
		

		
	}
	
	
	
	

}
