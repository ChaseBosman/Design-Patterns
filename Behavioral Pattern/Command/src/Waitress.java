
public class Waitress {
	OrderSlip order;
	
	public Waitress() {}
	
	public void takeOrder(OrderSlip order) {
		this.order = order; 
		order.orderUp();
	}
}
