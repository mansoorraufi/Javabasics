package Class13_String;

import java.util.Arrays;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Batch 14 is really good";
        String[] arr = str.split(" ");//splited by space; [Batch, 14, is, really, good]
        System.out.println(Arrays.toString(arr)); //[Batch, 14, is, really, good]
        System.out.println(arr[4]);// prints forth index of Array element's "good"

        String str2 = "Today is Sunday. Sunday is good. Java is also good.";

        String[] arr2=str2.split("[.]");
        System.out.println(Arrays.toString(arr2));
    
	
	}

}
