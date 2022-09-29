package Class008;

public class Task2 {
public static void main(String[] args) {

	int sumOdd = 0;
    int sumEven = 0;

   for (int a =1; a<=50; a++){
	   if (a%2==0) {
		  sumEven+=a; 
		   
	   }else {
		   sumOdd+=a;
	   }
	   
   }System.out.println("Odd numbers "+sumOdd);
   System.out.println("Even numbers "+sumEven);
		



}
	
	
}


