package Class10;

public class TasksAndRecap {

	public static void main(String[] args) {
		// HW#3. Create an array on integers and calculate the sum of all elements in an
		// array

		int[] numbers = { 12, 56, 345, 1, 0, 9 };

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {

			sum += numbers[i];

		}
		System.out.println(sum);

	}

}
