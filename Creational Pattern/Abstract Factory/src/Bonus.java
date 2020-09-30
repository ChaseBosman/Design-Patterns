public class Bonus extends Slot {
	SlotFactory slotFactory;
 
	public Bonus(SlotFactory slotFactory) {
		this.slotFactory = slotFactory;
	}
 
	void build() {
		cabinet = slotFactory.createCabinet("bonus");
		display = slotFactory.createDisplay("bonus");
		payment = slotFactory.createPayment("bonus");
    gpu = slotFactory.createGPU("bonus");
		os = slotFactory.createOS("bonus");
	}
}