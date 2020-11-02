
public class Sandwich implements OrderSlip{
	ShortOrderCook cook;
	
	public Sandwich(ShortOrderCook cook){
		this.cook = cook;
	}
	
	public void orderUp() {
		cook.makeSandwich();
	}
}
