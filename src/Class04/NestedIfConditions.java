package Class04;

public class NestedIfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Nested IF Conditions;
		
		
		int time=5;
		String day="Monday"; // as String is non primitive we can't use == sign. we have to use .equals method;
		/*/
		 * It is called outer IF Condition. If it is true then only inner IF Condition will be checked.
		 * And if it is falls then nothing from inner IF Condition will be executed.
		 * it is like a main door. If main door is closed we cannot enter the building.
		 */
		if (day.equals("Monday")) //Non Primitive formula. Therefore we use this code. if (valr.equals("Monday"))
		
		{if (time>7)            // Primitive formula.
		//========== more sign >.
		
		{System.out.println("Lets go to the Office");}
			
		if (time<6) 
		 //========= Less sign <.	
			{System.out.println("Lets sleep more");}
				
		}
		
	}

}
