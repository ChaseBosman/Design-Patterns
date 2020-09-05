import java.util.Scanner;

public class card implements payment
{
	private static final Scanner SCANNER = new Scanner(System.in);

	public void pay()
	{
		System.out.println( "Enter a total:"); 
		float total = SCANNER.nextFloat();
		System.out.println( "Enter a card number:"); 
		String card_num = SCANNER.next();
		System.out.println("Payment of $" +total+ " on card number: " +card_num);
	}
}
