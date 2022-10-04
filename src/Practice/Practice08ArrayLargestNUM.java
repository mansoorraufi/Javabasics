package Practice;

public class Practice08ArrayLargestNUM {
    public static void main(String[]args){
        //Write a program that prints the highest value in the array.
        int []arr = {5,4,8};

        int highestnum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>highestnum){
                highestnum=arr[i];
            }

        }
        System.out.println(highestnum);

    }

}
