package Class007;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*/
  * 6. Declare a variable to store a price for a coffee. Ask the user to pay for a coffee. 
  * Keep asking to pay for coffee until the user enters the EXACT amount . If the user gives 
  * more than coffee price --> ask them to give less, if the user gives less money then ask to 
  * give more. Once user give EXACT amount print “Please enjoy your coffee
  */
		
		
		double coffee = 4.65;
        double pay;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Please pay your order: ");
            pay = sc.nextDouble();

            if (pay > coffee) {
                System.out.print("Please give less. ");

                System.out.println();
            }

            else if (pay < coffee) {
                System.out.println("Please give more. ");

                System.out.println();

            } else
                System.out.println("Enjoy your coffee.");

            System.out.println();

        } while (coffee != pay);
	
	}

}
