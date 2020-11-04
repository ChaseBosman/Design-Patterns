
public class Driver {

	public static void main(String[] args) {
		
		GuitarController guitar = new Guitar();
		DanceController board = new DanceBoard();
		
		
		//Guitar to Dance Board adapter
		GuitarController DanceAdapter = new DanceAdapter(board);
		DanceAdapter.PressFretButton(GuitarController.colors.GREEN);
		DanceAdapter.PressFretButton(GuitarController.colors.RED);
		DanceAdapter.PressFretButton(GuitarController.colors.BLUE);
		DanceAdapter.PressFretButton(GuitarController.colors.YELLOW);
		DanceAdapter.PressFretButton(GuitarController.colors.ORANGE);
		System.out.println("");
		
		//Dance board to Guitar Adapter
		DanceController GuitarAdapter = new GuitarAdapter(guitar);
		GuitarAdapter.Step(DanceController.direction.FORWARD);
		GuitarAdapter.Step(DanceController.direction.BACK);
		GuitarAdapter.Step(DanceController.direction.LEFT);
		GuitarAdapter.Step(DanceController.direction.RIGHT);
		GuitarAdapter.Step(DanceController.direction.MIDDLE);
		System.out.println("");

		//Only the fret buttons are utilized when using a guitar in the place of a dance board...
		//Test that PressPick() and PressTremelo() behave to reflect this
		DanceAdapter.PressPick();
		DanceAdapter.PressTremelo();
	}
	
		
}
