package Class007;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		
		//5. Prompt the user to ask the name 3 times and print "Good afternoon +name...

	
		
		
		for (int c = 2; c<=3; c ++) {
			System.out.println("Hi");
		}
	
	
		
		 // 5. Prompt the user to ask the name 3 times and print "Good afternoon +name...
		 

		Scanner scan = new Scanner(System.in);
		String name="";
		
		for (int a=1; a<=3; a++)  
		{ System.out.println("What's your name?");
		 name=scan.nextLine();
			
		}System.out.println("Hello "+name);
	
	
	}

}
