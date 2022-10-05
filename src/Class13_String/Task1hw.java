package Class13_String;

public class Task1hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    String str="hello";
	    int length=str.length();
	    if(!str.isEmpty()&&length%2!=0&&length>=3) {

	        int middleIndex=length/2;
	        System.out.println(str.charAt(middleIndex));
	    }
	
	
	}

}
