package Class12;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = " i love java ";
		System.out.println(str);
		/*
		 * Remove the spaces before and after the String but not the ones which are
		 * present in between
		 */
		System.out.println(str.trim());

		
		//starting of the sentence with a specific word
		String str2="Java is Very easy";
		System.out.println(str2.startsWith("Java"));
		
		// Ending of the sentence with a specific word
		System.out.println(str2.endsWith("y"));
		
		//shows the word contains in the sentence.
		System.out.println(str2.contains("very"));
		
		// Method chaining helps us call multiple methods on a single line one method after an other
		System.out.println(str2.toLowerCase().contains("very"));
		
		
	}

}
