
public class Shake implements OrderSlip{
	ShortOrderCook cook;
	
	public Shake(ShortOrderCook cook){
		this.cook = cook;
	}
	
	public void orderUp() {
		cook.makeShake();
	}
}
