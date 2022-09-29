package Class006;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner input =new Scanner(System.in);
		
	
	
		System.out.println("Input the current time in 24hrs format");
		
		int hour=input.nextInt();
		
		String timeOftheDay;
		
		if (hour>=1 && hour<=11) {
			timeOftheDay= "Morning";
		} else if (hour>=12 && hour<=15) {
			timeOftheDay="Afternoon";
		} else if (hour>=16 && hour<=20) {
			timeOftheDay="Evening";
		} else if (hour>=21 && hour<=24) {
			timeOftheDay="Night";
		}
	
		else {System.out.println("Wrong number");
		     timeOftheDay="Invalid";
		} System.out.println(timeOftheDay);
	}

}
