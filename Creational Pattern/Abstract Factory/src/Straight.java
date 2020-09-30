public class Straight extends Slot {
	SlotFactory slotFactory;
 
	public Straight(SlotFactory slotFactory) {
		this.slotFactory = slotFactory;
	}
 
	void build() {
		cabinet = slotFactory.createCabinet("straight");
		display = slotFactory.createDisplay("straight");
		payment = slotFactory.createPayment("straight");
    gpu = slotFactory.createGPU("straight");
		os = slotFactory.createOS("straight");
	}
}