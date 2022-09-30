import java.util.Arrays;

public class practice01 {
	public static void main(String[] args) {

       

		int[] a = {12, 15, 11, 13, 9, 25};
		int[] a2 = {12, 15, 11, 13, 9, 25};
		int sum = 0;
		for (int i = 0; i <a.length; i++) {
		         if (a[i] % 2== a2[i ] % 5)  {
		                  sum += i * i;
		         }
		}
		System.out.println("sum = " + sum);	
		
		int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

		for ( int index= 0 ; index < 5 ; index++ ) {
		       System.out.print( egArray[ index ] + " " );
		}

		char array_variable [] = new char[10];
		for (int i = 0; i < 10; ++i) {
		         array_variable[i] = 'i';
		         System.out.print(array_variable[i] + " ");
		}
		
		System.out.println();
		
		
		int[] array = { 1, 4, 3, 6, 8, 2, 5 };

		int what = array[0];

		for (int index = 0; index < array.length; index++) {

		       if (array[index] > what) {

		                  what = array[index];

		        }

		}

		System.out.println(what);
		
		
		int[] zip = new int[5];

		zip[0] = 7;
		zip[1] = 3;
		zip[2] = 4;
		zip[3] = 1;
		zip[4] = 9;

		System.out.println( zip[ 2 + 1 ] );
		
		for(int i=1; i<15; i=i+3) {

		    System.out.print(i);

		} System.out.println();
		
		int x=1;

		while(x<5) {   

		   x++;   

		   System.out.print(x);

		}
		
		System.out.println();
		
		int count = 0;
		while (count++ < 10) {
		System.out.println("Welcome to Java");
		}
		int y = 0;
		for (int i = 0; i < 10; ++i) {
		y += 1;
		}
		
		

	            


 }
 }