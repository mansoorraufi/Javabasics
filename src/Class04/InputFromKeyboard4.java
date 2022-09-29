package Class04;

import java.util.Scanner;

public class InputFromKeyboard4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please eneter your name");
		// takes a String type input from the keyboard and 
		//and store it in name varialbe
		
		int name=scanner.nextInt();
		System.out.println("Please enter your age");
		
		String age=scanner.nextLine(); //error
		
		
		
		
	}

}
