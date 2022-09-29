package Class008;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		// multiplication table
		for(int i=1; i<=9; i++) {
		for(int j=1; j<=9; j++)  {
		System.out.println(i+" x "+j+" = "+i*j);
		}
		System.out.println(" ---------------  ");
		}

		// multiplication of only 3
		
		 for (int i=3; i<=3; i++){
		      for (int a=1; a<=10; a++){

		        System.out.println(i+"*"+a+"="+i*a);
		      }
		 }
	
	
	}

}
