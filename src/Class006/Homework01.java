package Class006;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		/*
		 * / 1. Ask user to enter their country and capture it. Once values are captured
		 * print which language user speaks.
		 */

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter your country");

		String country = in.nextLine();
		String Language;

		switch (country) {
		
		case "Afghanistan":
			Language = "Pashto & Dari";
			break;

		case "Turkey":
			   Language = "Turkish";
			   break;
			   
		case "India": 
		       Language = "Hindi & English";
		   break;
		   
	    default: 
			   Language ="Unkown";
		} 
		
		   System.out.println("you speak "+Language+" language!");

	}

}
