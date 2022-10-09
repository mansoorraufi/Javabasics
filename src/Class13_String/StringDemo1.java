package Class13_String;

import java.util.Arrays;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str="Today is sunday";
	String day=str.substring(9);
	System.out.println(day);
	
	//second way
	System.out.println(str.substring(6,8));
	
	//char method
	char c=str.charAt(4);
	System.out.println(c);
	
	// convert String to Char
	char [] charArr=str.toCharArray(); // toCharArray method converts the string
	System.out.println(Arrays.toString(charArr));
	
	//convert to String
	System.out.println(charArr);
	
	// to find the index number of a character
	int index=str.indexOf("a");
	System.out.println(index);
	System.out.println(str.indexOf("a",6));
	
	
	
	
	
	
	}

}
