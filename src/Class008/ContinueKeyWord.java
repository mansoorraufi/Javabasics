package Class008;

public class ContinueKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// this will print all numbers except #3 and #6
        for(int i=1; i<10; i++) {

            if (i==3 || i==6) {
                continue;
            }

            System.out.println("Hello");
            System.out.println("How are you");
            System.out.println(i);
        }

        // I want to print numbers from 1 to 20 except number 3, 7 and 11

        for (int i=1; i<=20; i++) {

            if(i==3 || i==7 || i==11) {
                continue;
            }

            System.out.print(i+" ");
        }

        //continue - continues to the next iteration/cycle
        // moment Java sees continue -> it goes back to the beginning of the loop
        //it usually used inside some type of conditions
	
	
	}

}
