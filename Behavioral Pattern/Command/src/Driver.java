
public class Driver {

	public static void main(String[] args) {
		ShortOrderCook cook = new ShortOrderCook();
		Waitress waitress = new Waitress();
		Customer customer = new Customer(waitress);
		Burger burger1 = new Burger(cook);
		Shake shake1 = new Shake(cook);
		customer.placeOrder(burger1);
		customer.placeOrder(shake1);
	}

}
