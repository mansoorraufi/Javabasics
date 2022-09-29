package Class007;

public class Classwork02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	//Print numbers from 100 to 1
		
		int num=100;
		
		while (num>=1) {
			System.out.print(num+" ");
			num--;
		} 
		
		
		System.out.println("=========================");
		
		//Print even numbers from 20 to 100 
		
		int num2=20;
		while (num2<=100) {
			
			if (num2%2==0) {
				System.out.print(num2+" ");
			} num2++;
		}
		System.out.println("==========================");
		
		
		//Print only odd numbers from 100 to 1
	
		int num3=100;
		while (num3<=100) {
			
			if (num3%2==1) {
				System.out.print(num3+" ");
			} num3--;
		}
	
	
	
	
	
	}

}
