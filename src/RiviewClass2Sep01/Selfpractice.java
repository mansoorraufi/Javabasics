package RiviewClass2Sep01;

import java.util.Scanner;

public class Selfpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		   System.out.println("Do you need a loan?");
		     boolean needloand=scan.nextBoolean();
		     boolean unknown=!true;
		   
		   System.out.println("What is your credit score?");
		   int creditscore=scan.nextInt();
		   String eligibility="Unknown";
		   
		   if (creditscore<=600) {
		     System.out.println("Not eligible");
		   }else if (creditscore>600 && creditscore<=700) {
		   System.out.println("Maybe eligible");
		   }else if (creditscore>=701 && creditscore<=800){
		      System.out.println("Eligible");
		    }else if (creditscore>800){
		      System.out.println("Definitely Eligible");
		     System.out.println("The eligibility is "+eligibility);
		   
		   } else {
		     System.out.println( "Unknown");
	
		   }
	}

}
