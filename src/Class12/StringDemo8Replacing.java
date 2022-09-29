package Class12;

public class StringDemo8Replacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str = "Batch 14 is good";
	
	// replace method replaces one string with another in a string
	// replaceAll it takes a patter and replace all the characters that follow that patterns
	System.out.println(str.replace("good","Excellent"));
	System.out.println(str);
	System.out.println(str.replaceAll("[a-z]", ""));
	System.out.println(str.replaceAll("[a-z]", "#"));
	
	
	
	}

}
