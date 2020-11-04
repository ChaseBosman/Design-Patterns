
public class Guitar implements GuitarController{
	
	public void PressFretButton(colors button) {
		System.out.println("Holding down the " +button+ " fret!");
	}
	
	public void PressPick() {
		System.out.println("Pressed the pick!");
	}
	
	public void PressTremelo() {
		System.out.println("Pressed the tremelo!");
	}
}
