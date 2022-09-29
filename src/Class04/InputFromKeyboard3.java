package Class04;

import java.util.Scanner;

public class InputFromKeyboard3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scanner=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=Scanner.nextInt();
		if (age>19) {
			System.out.println("Go to work");
			
		} else {
			System.out.println("Study");
		}
        
		
	}

}
