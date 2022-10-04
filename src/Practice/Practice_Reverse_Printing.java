package Practice;

public class Practice_Reverse_Printing {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * Create a String and print it in reverse order (Sunday → yadnuS).
         */
        String str1="Sunday";

        for(int i=str1.length()-1;i>=0;i--) {
            System.out.print(str1.charAt(i));
        }

        System.out.println("");

        char [] charArr=str1.toCharArray();
        for (int i=charArr.length-1; i>0;i--) {
            System.out.print(charArr[i]);
        }

        /*
        How would you reverse a String word by word? for example
        input=>This is sentence i want to reverse
        output=>sihT si ecnetnes i tnaw ot esrever
         */

            //step1 first split
            String str="This is sentence i want to reverse";
            String[] arr=str.split(" ");
            StringBuilder st=new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                String word= arr[i];
                StringBuilder stringBuilder=new StringBuilder(word);
                stringBuilder.reverse();
                arr[i]=stringBuilder.toString();
                st.append(arr[i]).append(" ");

            }
            System.out.println(st);


        }


}
