
public class ItemRedBall extends ItemDecorator{
	ChristmasTree tree;
	
	public ItemRedBall(ChristmasTree tree){
	    this.tree = tree;
	  }

	  public String getDescription(){
	    return tree.getDescription() + ", Red Balls";
	  }

	  public double cost(){
	    return 1.00 + tree.cost();
	  }
}
