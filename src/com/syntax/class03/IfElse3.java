package com.syntax.class03;

public class IfElse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		if (3>5) 
			{System.out.println("Yes its bigger number");}
		else {System.out.println("No this is lower number");}
		
		//========================
		
		double myBankBalance = 2000;
		double theAmountIwantToTransfer=250;
		
		if (myBankBalance>theAmountIwantToTransfer)
			
			System.out.println("Funds transfered successfully");
		
		else 
			System.out.println("Please try again balance is not enough");
		
	}

}
