package ReviewClass06;

public class StringMethod1 {
    public static void main(String[] args) {

        // replace method   replaces values btwn varialbles
        String myString="Today is September";

        myString=myString.replace("September", "October");
        System.out.println(myString);

        // to change a character
        myString=myString.replace('t', 's');
        System.out.println(myString); // Today is Ocsober,

        //split();
        String myStr="Today is a review class";
        String [] array=myStr.split(" "); // space btwn "" .
        System.out.println(array.length);
        System.out.println(array[3]); // review bcause index 3 is review


        System.out.println();
        // find all the elements in for Loop

        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("-------------");

        // find all elements in enhanced Leep.
        for (String arr:array) {
            System.out.println(arr);
        }



    }
}
