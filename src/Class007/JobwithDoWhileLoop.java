package Class007;

import java.util.Scanner;

public class JobwithDoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String answer;
		do {
			System.out.println("Did you get a job?");
			answer = scan.nextLine();

		} while (!answer.equals("yes"));

		System.out.println("Congrats");

	}

}
