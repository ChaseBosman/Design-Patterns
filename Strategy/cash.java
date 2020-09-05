import java.util.Scanner;

public class cash implements payment
{
	private static final Scanner SCANNER = new Scanner(System.in);
	public void pay()
	{
		System.out.println( "Enter a total:"); 
		float total = SCANNER.nextFloat();
		System.out.println( "Enter amount recieved:"); 
		float provided = SCANNER.nextFloat();
		float change = provided - total;
		if(change >= 0) 
		{
			System.out.println("Your change is $" +change);
		}
		else
		{
			System.out.println("Dont leave, you still owe!");
		}
	}
}
