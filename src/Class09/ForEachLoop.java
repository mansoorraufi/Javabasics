package Class09;

public class ForEachLoop {

	public static void main(String[] args) {
		// only when we deal with Arrays or collections
		//we can use for each loop, enhance for loop, advanced for loop.
		
		String[] icecream= {"Vanilla","Chocolate","Pistachio","Kulfi","Mango"};
		
		for (String flavor:icecream) {
			System.out.println(flavor);
		}

	
	System.out.println("--------------------");
	
	
	
	char [] grade1= {'A','B','C','D','E','F'};
	for (char alpha:grade1) {
		System.out.print(alpha+" ");
	}
	System.out.println("--------------------");
	
	
	
	int [] numbers = {12,56,345,1,0,9};
	for (int i=0; i<numbers.length; i++) {
		System.out.print(numbers[i]+" ");
	} System.out.println("----------");
	
	
	
	//get all the value using enhanced for loop;
	
	for (int num:numbers) {
		System.out.print(num+" ");
	}
	
	}

}
