package Class11;

public class Phone {
	
	String make;
	String model;
	String color;
	int storage;
	double size;
	boolean cheap;
	
	void call() {
		
		System.out.println("Calling ......");
	}
	
	void takePictures() {
		
		System.out.println("Taking pictures");
	}
	
	public static void main(String[] args) {
		// Name of Class variable name = new Name of class();
		
		Phone iphone=new Phone();
		iphone.make="Apple";
		iphone.model="Iphone 14 Pro Max";
		iphone.color="Black";
		iphone.storage=128;
		iphone.size=6.8;
		iphone.cheap=false;
		System.out.println("Make: "+iphone.make+" Model "+iphone.model);
		iphone.call();
		
		System.out.println("*******************");
		
		
		Phone samsungphone=new Phone();
		samsungphone.make="Samsung";
		samsungphone.model="S22 Ultra";
		samsungphone.color="Gray";
		samsungphone.storage=256;
		samsungphone.size=6.7;
		samsungphone.cheap=false;
		
		System.out.println(iphone.make);
		System.out.println(samsungphone.make);
		
		
		
	}

}
