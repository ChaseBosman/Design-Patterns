
public class ItemSilverBall extends ItemDecorator{
	ChristmasTree tree;
	
	public ItemSilverBall(ChristmasTree tree){
	    this.tree = tree;
	  }

	  public String getDescription(){
	    return tree.getDescription() + ", Silver Balls";
	  }

	  public double cost(){
	    return 3.00 + tree.cost();
	  }
}
