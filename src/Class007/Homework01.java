package Class007;

public class Homework01 {

	public static void main(String[] args) {
		
		//1. Print numbers from 1 to 100 in 1 line with space
		
		int a=1;
		while (a<=100) {
			System.out.print(a+" ");
			a++;
		}

	    
		System.out.println("==========================");
		
		//2. Print numbers from 100 to 1
		
		int b=100;
		while (b>=1) {
			System.out.print(b+" ");
			b--;
		}
	
	    System.out.println("==========================");
	
	   //3. Print even numbers from 20 to 1 (2 ways)
	    
	    int c=20;
	    while (c>=1) 
	    {
	    	if (c%2==0) {
	    		System.out.print(c+" ");
	    	
	    	}c--;		
	    }
	//second way
	    
	    for (int d=20; c>=1; c-=2) {
	    	System.out.print(c+" ");
	    	if (d%2==0) {
	    		
	    		System.out.print(d+" ");
	    	}
	    }
	
	
	
	
	}

}
