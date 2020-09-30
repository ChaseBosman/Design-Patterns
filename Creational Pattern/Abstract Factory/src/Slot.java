public abstract class Slot {
	String name;
	Cabinet cabinet;
  Display display;
	Payment payment;
	GPU gpu;
	OS os;

	abstract void build();

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}
}
