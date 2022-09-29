package Class10;

public class Task8Project {

	public static void main(String[] args) {
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		 

		int previews=0;
		int currentnumber=1;
		int nextnumber=0;
		System.out.println(previews);
		System.out.println(currentnumber);
		
		for (int i=0; i<8; i++) {
			
			nextnumber=previews+currentnumber;
			System.out.println(nextnumber);
			previews=currentnumber;
			currentnumber=nextnumber;
		}
		
	}

}
