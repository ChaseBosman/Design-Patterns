
public class computer implements place_order 
{
	static int order_count = 0;
	
	public void order() 
	{
		System.out.println("Computer created order number "+order_count+"!");
		order_count += 1;
	}
}
