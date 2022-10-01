package ReviewClass06;

public class StringMethod {

	public static void main(String[] args) {
		// Notes: we can assign the same folder only for the same data type
		// Ex: str=str.toUpperCase.
		//We can't use the varialbe -srt- in a -Char data type-, because -srt-  is initialized for -String data time-


		String str="hello";

		// otUpporCase or toLowerCase (its a Method)
		str=str.toUpperCase(); // this is an object of the Class
		System.out.println(str); //HELLO.


		//length(); -> (its a Method) gives size
		int size=str.length();
		System.out.println(size); // 5

		//charAt(); -> (its a Method) finds only one character or letter of the word.
		char letter=str.charAt(0);// enter the index number inside ()
		System.out.print(letter);


		// finds last character
		char lastCharacter=str.charAt(str.length()-1);
		System.out.println(lastCharacter);

		//indexOf(); gives the value of the index we type.

		int index=str.indexOf(lastCharacter);
		System.out.println(index);//#4
		//or
		System.out.println(str.indexOf('L')); // #2


		//trim

		 str = "    Java     "; // string with leading and trailing whiltespaces

		System.out.println(str);
		//output: "    Java     "

		System.out.println(str.trim());
		//output: "Java" ; leading and trailing whitespaces removed



	}

}
