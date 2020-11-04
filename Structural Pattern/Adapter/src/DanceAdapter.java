public class DanceAdapter implements GuitarController{
	DanceController board;
	
	DanceAdapter(DanceController board){
		this.board = board;
	}
	
	public void PressFretButton(colors button) {
		if(button.name() == "GREEN")
		{
			board.Step(DanceBoard.direction.FORWARD);
		}
		else if(button.name() == "RED")
		{
			board.Step(DanceBoard.direction.BACK);
		}
		else if(button.name() == "BLUE")
		{
			board.Step(DanceBoard.direction.LEFT);
		}
		else if(button.name() == "YELLOW")
		{
			board.Step(DanceBoard.direction.RIGHT);
		}
		else if(button.name() == "ORANGE")
		{
			board.Step(DanceBoard.direction.MIDDLE);
		}
	}
	
	public void PressPick() {
		System.out.println("Only the frets are used! Green = Forward, Red = Back, Blue = Left, Yellow = Right, Orange = Middle");
	}
	
	public void PressTremelo() {
		System.out.println("Only the frets are used! Green = Forward, Red = Back, Blue = Left, Yellow = Right, Orange = Middle");
	}
}
