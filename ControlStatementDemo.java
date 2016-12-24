public class ControlStatementDemo{
	public static void main(String args[]){
		/* java support control statement:
		   1: if
	           2: if..else
		   3: if..else if..else
		   4: nested if else
		   5:switch
		*/
	
		/* Rules of If :
		   -> if always evaluate boolean value
		   -> assignment in if statement always evaluate true
		   -> we can write if elseif without else part
		*/
		if(true)
			System.out.println("Only If statement");
		if(false)
			System.out.println("IF else Statement");
		else
			System.out.println("If else statement");
		if(false)
			System.out.println("if else if statement ");
		else if(true)
			System.out.println("if else if statement elseif part");
		else
			System.out.println(" if else if statement else part ");

		int x = 3;
		switch(x){
			case 1:
				System.out.println("case 1 :");break;
			case 2: System.out.println("case 2 :");break;
			case 3: System.out.println("case 3 :");break;
			default: System.out.println("default :");break;
		}
		
	}
}
