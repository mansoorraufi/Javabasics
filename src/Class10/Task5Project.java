package Class10;

public class Task5Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of even and odd numbers for that array.
		 */

		int[][] arr = {

				{ 10, 10, 10, 20 }, { 25, 30, 54 }, { 20, 30 } };

		int even=0;
		int odd=0;

		for (int[] ar : arr) {

			for (int num : ar) {
				if (num % 2 == 0) {
					even+=num;
        } else {
        	         odd+=num;
    			
      }

			}

		}System.out.println(even);
		System.out.println(odd);

	}

}
