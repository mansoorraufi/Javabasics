package Class10;

public class Task4Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a 2D array or integer type where you will store odd and even numbers. 
		 * Develop a program which will identify/print the even numbers only.
		 */

		int[][] arr = {

				{ 10, 10, 10, 20 }, { 25, 30, 54 }, { 20, 30 } };

		int sum = 0;

		for (int[] ar : arr) {

			for (int num : ar) {
				if (num % 2 == 0) {

					System.out.println(num);
				}

			}

		}

	}

}
