package ReviewClass02Sep01;

import java.util.Scanner;

public class Selfpractice02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
		   
		   int creditscore=scan.nextInt();
		   String eligibility="Unknown";
		   
		   if (creditscore<=600) {
		     eligibility = "Not eligible";
       System.out.println("The eligibility is "+eligibility);
		   }else if (creditscore>600 && creditscore<=700) {
		   eligibility = "Maybe eligible";
       System.out.println("The eligibility is "+eligibility);
		   }else if (creditscore>=701 && creditscore<=800){
		      eligibility= "Eligible";
       System.out.println("The eligibility is "+eligibility);
		    }else if (creditscore>800){
		      eligibility= "Definitely Eligible";
		     System.out.println("The eligibility is "+eligibility);
		   
		   } else {
		     System.out.println( "Unknown");
		   eligibility= "Unknown";
		   } System.out.println("The eligibility is "+eligibility);  
	
	
	
	
	
	
	
	
	
	
	}

}
