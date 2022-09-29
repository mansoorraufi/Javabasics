package Class04;

import java.util.Scanner;

public class InputFromKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		// scanner is a class that help us to take the input from the keyboard
		//it contains many different smaller modules called method, that can help us 
		//take String boolean basically all type of data from the keyboard.
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter your Name:");
        
		String name=input.next();
		System.out.println("Hello "+name);
		
		/*/
		 * 
● To read strings, we use next()
● To read sentences, we use nextLine()
● To read number values, we use nextInt()
● To read decimal values, we use nextDouble()
● To read a single character, we use next().charAt(0)
		 */
		
		
		
	}

}
