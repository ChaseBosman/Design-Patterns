
public class Burger implements OrderSlip{
	ShortOrderCook cook;
	
	public Burger(ShortOrderCook cook){
		this.cook = cook;
	}
	
	public void orderUp() {
		cook.makeBurger();
	}
}
