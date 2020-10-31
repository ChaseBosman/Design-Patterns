
public class Customer {
	OrderSlip order;
	Waitress waitress;
	
	public Customer(Waitress waitress) {
		this.waitress = waitress;
	}
	
	public void placeOrder(OrderSlip order) {
		this.order = order;
		waitress.takeOrder(this.order);
	}
}
