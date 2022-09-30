package ReviewClass06;

public class StringMethods1trim {
    public static void main(String[] args) {


               /*/Suppose we are given the string: " Java " with whitespaces present at the beginning and at the end.
       To remove spaces, we can use the trim() method; the code given below illustrates this.*/


        String str = "    Java     "; // string with leading and trailing whiltespaces

        System.out.println(str);
        //output: "    Java     "

        System.out.println(str.trim());
        //output: "Java" ; leading and trailing whitespaces removed
        System.out.println("-----------------");

        String str1 = " This is an example    "; // string with whitespaces present at start and end

        System.out.println(str1);
        String newStr = str1.trim();// method chops leading and trailing whitespaces

        System.out.println(newStr);
        // output: This is an example

        System.out.println("-----------------------");

        String newStr1=str1.replaceAll("\\s", "");
        /* method will replace/remove all the whitespaces as per passed parameters */

        System.out.println(newStr1);
        //output: "Thisisanexample"
    }
}




