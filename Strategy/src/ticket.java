import java.util.Scanner;

public class ticket implements place_order 
{
	private static final Scanner SCANNER = new Scanner(System.in);
	public void order() 
	{
		System.out.println("Enter an order number: ");
		int order_num = SCANNER.nextInt(); // Scans the next token of the input as an int.
		System.out.println("Ticket for order " +order_num+ " created at a kiosk!");
	}
}
