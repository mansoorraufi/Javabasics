package ReviewClass06;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="hello";

		// finds only one character of the word.
		char letter=str.charAt(0);
		System.out.print(letter);

		System.out.println();

		// finds last character
		char lastCharacter=str.charAt(str.length()-1);
		System.out.println(lastCharacter);


		//trim

		 str = "    Java     "; // string with leading and trailing whiltespaces

		System.out.println(str);
		//output: "    Java     "

		System.out.println(str.trim());
		//output: "Java" ; leading and trailing whitespaces removed



	}

}
