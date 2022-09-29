package Class10;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 10, 20, 30, 40, 50 };
		int largestnum = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] > largestnum) {
				largestnum = num[i];
			}

		}
		System.out.println(largestnum);

	}

}
