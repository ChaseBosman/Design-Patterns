
public abstract class shaved_ice_shop 
{
	place_order order_type;
	payment payment_type;
	
	public void order()
	{
		order_type.order();
	}
	
	public void pay()
	{
		payment_type.pay();
	}
	
	public void order(int order_number)
	{
		order_type.order();
	}
	
	public void change_payment_type(payment type) 
	{
		payment_type = type;
		System.out.println("A store's payment type changed!");
	}
}
