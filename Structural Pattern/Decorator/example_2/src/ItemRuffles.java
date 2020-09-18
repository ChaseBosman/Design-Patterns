
public class ItemRuffles extends ItemDecorator {
	ChristmasTree tree;
	
	public ItemRuffles(ChristmasTree tree){
	    this.tree = tree;
	  }

	  public String getDescription(){
	    return tree.getDescription() + ", Ruffles";
	  }

	  public double cost(){
	    return 1.00 + tree.cost();
	  }
}
