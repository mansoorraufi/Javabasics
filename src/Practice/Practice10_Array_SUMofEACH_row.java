package Practice;

import java.util.Arrays;

public class Practice10_Array_SUMofEACH_row {
    public static void main(String[] args) {
        //Write a program that calculates the sum of elements from each row in a 2D
        // array and adds them into array of integers
        //For example, if we run rowSums for the following 2D array:

        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
         };

        // -- 1 Way ----------
        int[] sum=new int [a.length];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                sum[i]+=a[i][j];

            }
        }  System.out.println(Arrays.toString(sum));


        // ---- 2 Way but with grand total-------
        int total=0;
        for (int []arr:a){
           for (int num:arr){
               total+=num;
           }
        }
        System.out.println(total);



    }
}
