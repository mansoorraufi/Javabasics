package Class09;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] drinks= {"Fanta", "Milk", "Juice", "Lemonade"};
		
		System.out.println(drinks[2]); //juice
		
		// how many elements inside my array?
		
		//=drinks.lenght; // will give numbers of elements in the array.
		
		int size=drinks.length;
		System.out.println("Size of Array = "+size);
	
		for (int i=0; i<drinks.length; i++) {
			System.out.println(drinks[i]);
		}
		
		
		
		
		
	}

}
