package Class10;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * / Create a 2D array (longer way)where you will store the following values:
		 * Mr, Mrs, Ms, Miss and Smith, Jordan, Jackson, Obama. After storing values
		 * print following String: Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */

	
		String[][] array = new String[4][4];
	
		array[0][0] = "Mr";
		array[0][1] = "Mrs";
		array[0][2] = "Ms";
		array[0][3] = "Miss";
	
		array[1][0] = "Smith";
		array[1][1] = "Jordan";
		array[1][2] = "Jackson";
		array[1][3] = "Obama";
	
	System.out.println(array[0][0]+" "+ array[1][3]);
	
	
	
	
	
	}

}
