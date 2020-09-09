
public class driver {

	public static void main(String[] args) 
	{
	    shaved_ice_shop store1 = new store();
	    shaved_ice_shop store2 = new store();
	    shaved_ice_shop kiosk1 = new kiosk();
	    store1.order();
	    store2.order();
	    kiosk1.order();
	    store2.pay();
	    store2.change_payment_type(new cash());
	    kiosk1.pay();
	  }

}
