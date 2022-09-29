package Class006;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		/*/
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation: 
		 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was entered by a user with explanation.
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your grade");
		

		char Grade=scan.next().charAt(0);
		
		String answer;
		
		switch (Grade) {
			
		case 'A':
		answer = "Excellent";
		break;
		
		case 'B':
			answer = "Good";
			break;
			
		case 'C':
			answer = "Average";
			break;
			
		case 'D':
			answer = "Bad";
			break;
			
			default:
				answer="Fail";
		
		}
		
		System.out.println("Your grade is "+Grade+" and it is "+answer);
	
	
	
	
	
	}

}
