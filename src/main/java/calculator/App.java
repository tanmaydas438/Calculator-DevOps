// package calculator;
import java.util.*; 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App {
	private static final Logger loggen = LogManager.getLogger(App.class);
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int ch;
		int number;
		double number1;
		double exp;
		
		System.out.println("!!!!!!!!!!!------------Calculator--------------!!!!!!!!!!!!");
		do{
			System.out.println("Enter you choice as per bellow options");
            System.out.println("");
            System.out.println("1. ----Square Root----");
            System.out.println("2. ----Factorial----");
            System.out.println("3. ----Natural Log(Base e)----");
            System.out.println("4. ----Power----");
            System.out.println("5. Exit !!!!!!!!!!!!");
			System.out.println("");
            System.out.print("Enter your choice(number): ");
			System.out.println("");
			ch = sc.nextInt();
			
			switch(ch){
					
					case 1:  
						System.out.println("----Square Root---");
						System.out.println("");
						System.out.print("Please enter the number:");
						number1 = sc.nextDouble();
						getRoot(number1);
					break;

					case 2: 
						System.out.println("----Factorial----");
						System.out.println("");
						System.out.print("Please enter the number:");
						number = sc.nextInt();
						getFactorial(number);
					break;

					case 3: 
						System.out.println("----Natural Log----");				
						System.out.println("");
						System.out.print("Please enter the number:");
						number1 = sc.nextDouble();
						getNaturalLog(number1);
					break;

					case 4: 
						System.out.println("----Power----");
						System.out.println("");
						System.out.print("Please enter the number:");
						number1 = sc.nextDouble();
						System.out.print("Please enter the exponent:");
						exp = sc.nextDouble();
						getPower(number1,exp);
					case 5:
						exit(0);	
					break;

					default: 
						System.out.println("Please enter a valid choice");
						
					}
						
		    }while(1);
		}

	public static void getRoot(double number){
		double result = Math.sqrt(number);
		System.out.println("");
		System.out.println("Square Root of "+number+" is:"+result);
		System.out.println("");
		loggen.info("Executing squareRoot function........");
		
	}

	public static void getFactorial(int number){
		if(number<0)
			{
			 System.out.println("oops!! you enter a negative number");
			 return;
			}
		
	    	int result = number ;
		for(int i=num-1; i>=1; i--) 
			result= result*i;
		if(result==0)
			result=1;
		System.out.println("");
		System.out.println("Factorial of "+number+" is:"+result);
		System.out.println("");
		loggen.info("Executing Factorial function........");
		
	}
	public static void getNaturalLog(double number){
		double result = Math.log(number);	
		System.out.println("");
		System.out.println("Log of "+number+" is:"+result);
		System.out.println("");
		loggen.info("Executing naturalLog function........");
		
	}
	  public static void getPower(double number, double exponent){
		double result = Math.pow(number,exponent);
		System.out.println("");
		System.out.println(number+" to the power "+exponent+" :"+result);
		System.out.println("");
		loggen.info("Executing Power function........");
		
	}

}
