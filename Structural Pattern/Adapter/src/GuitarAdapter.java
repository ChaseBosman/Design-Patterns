public class GuitarAdapter implements DanceController{
	GuitarController guitar;
	
	public GuitarAdapter(GuitarController guitar) {
		this.guitar = guitar;
	}
	
	public void Step(direction dir) {
		//Green = Forward, Red = Back, Blue = Left, Yellow = Right, Orange = Middle
		if(dir.name() == "FORWARD")
		{
			guitar.PressFretButton(GuitarController.colors.GREEN);
			guitar.PressPick();
		}
		else if(dir.name() == "BACK")
		{
			guitar.PressFretButton(GuitarController.colors.RED);
			guitar.PressPick();
		}
		else if(dir.name() == "LEFT")
		{
			guitar.PressFretButton(GuitarController.colors.BLUE);
			guitar.PressPick();
		}
		else if(dir.name() == "RIGHT")
		{
			guitar.PressFretButton(GuitarController.colors.YELLOW);
			guitar.PressPick();
		}
		else if(dir.name() == "MIDDLE")
		{
			guitar.PressFretButton(GuitarController.colors.ORANGE);
			guitar.PressPick();
		}
	}
}
