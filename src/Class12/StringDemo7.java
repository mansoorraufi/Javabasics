package Class12;

public class StringDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String str="I am always confused I was kidding";
	
	System.out.println(str.indexOf("a"));
	System.out.println(str.indexOf("s"));
	System.out.println(str.indexOf(" "));
	//substring() it gives us a smaller string from a string we can start the starting 
	// part to this method and it will return us the substring form that index
	
	System.out.println(str.substring(5)); // we need to specify the index from which it start
	
	System.out.println(str.substring(5,11));
	
	
	
	
	
	}

}
