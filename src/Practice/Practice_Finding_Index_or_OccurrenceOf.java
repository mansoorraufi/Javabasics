package Practice;

public class Practice_Finding_Index_or_OccurrenceOf {
    public static void main(String[] args) {

        // to find the index number of a character
        String str1="Today is sunday";
        int index=str1.indexOf("a");
        System.out.println(index);
        System.out.println(str1.indexOf("a",6));


        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";

        //- Print out the position of the first occurrence of "c".
        int index0=str.indexOf("c");
        System.out.println(index);

        //Print out the position of the first occurrence of " ".
        int index1=str.indexOf(" ");
        System.out.println(index1);

        // Print out the position of the first occurrence of the variable target1.
        int index2=str.indexOf(target1);
        System.out.println(index2);


        //Print out the position of the first occurrence of the variable target2.
        int index3=str.indexOf(target2);
        System.out.println(index3);


        //find middle index:

        String st="hello";

        int length=st.length();
        if(!st.isEmpty()&&length%2!=0&&length>=3) {

            int middleIndex=length/2;
            System.out.println(st.charAt(middleIndex));
        }
    }
}
