
public class ItemBlueBall extends ItemDecorator{
	ChristmasTree tree;
	
	public ItemBlueBall(ChristmasTree tree){
	    this.tree = tree;
	  }

	  public String getDescription(){
	    return tree.getDescription() + ", Blue Balls";
	  }

	  public double cost(){
	    return 2.00 + tree.cost();
	  }
}
