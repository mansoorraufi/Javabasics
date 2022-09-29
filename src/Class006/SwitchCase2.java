package Class006;

public class SwitchCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	char choice= 'Y';
	String answer;
	
	switch (choice) {
		
	case 'Y':
	answer = "Yes";
	break;
	
	case 'N':
		answer = "No";
		break;
		
	case 'M':
		answer = "Maybe";
		break;
		
		default:
			answer="Unkown";
	
	}
	
	System.out.println(answer);
	
	
	
	}

}
