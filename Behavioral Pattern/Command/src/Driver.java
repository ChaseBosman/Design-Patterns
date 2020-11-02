
public class Driver {

	public static void main(String[] args) {
		ShortOrderCook cook = new ShortOrderCook();
		Waitress waitress = new Waitress();
		Customer customer1 = new Customer(waitress);
		Burger burger1 = new Burger(cook);
		Shake shake1 = new Shake(cook);
		Sandwich sandwich1 = new Sandwich(cook);
		customer1.createOrder(burger1);
		customer1.createOrder(shake1);
		customer1.createOrder(sandwich1);
	}

}
