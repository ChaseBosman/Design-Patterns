public class Progressive extends Slot {
	SlotFactory slotFactory;
 
	public Progressive(SlotFactory slotFactory) {
		this.slotFactory = slotFactory;
	}
 
	void build() {
		cabinet = slotFactory.createCabinet("progressive");
		display = slotFactory.createDisplay("progressive");
		payment = slotFactory.createPayment("progressive");
    gpu = slotFactory.createGPU("progressive");
		os = slotFactory.createOS("progressive");
	}
}