package reviewclass1;

public class practiceHomWorkOnReplitArithmeticOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Home Work #14
		
		/*/
		 * ToDo
		 *  
		 * - Add the values of num1 and num2 and then subtract num3 from the result and store it in result1 variable
- Multiply num4 and num5 together and then divide num6 from the result and store it in result2 variable
- Print the following statement:

```
**_______ modded by _______ is ______**
result2           result1    blank3
```

where blank3 is the remainder of result1 into result2
		 */
		
		


		int num1 = 5;
	    int num2 = 4;
	    int num3 = 3;
	    
	    int num4 = 7; 
	    int num5 = 10;
	    int num6 = 5;
	    
	    //start coding here
	    int result1,result2,mod;
	      result1= num1+num2/num3; // Add the values of num1 and num2 and then subtract num3 from the result and store it in result1 variable
	    
	    result2= num4*num5/num6;   // Multiply num4 and num5 together and then divide num6 from the result and store it in result2 variable
	    
	    
	    // when to add another Arithmetic ops we need to add another integer (int) variable; 
	    
	    mod=result2%result1; //adding MOD Ops (Modulus or Remainder " % ") variable;

	   
       
	    /*/- Print the following statement:

```
**  _______ modded by _______ is ______**
    result2           result1    blank3
	     * 
	     */
	    
	    System.out.print(result2+" modded by "+result1+ " is "+mod );
	    
	                 
	    
	    
	    
		

	}

}
