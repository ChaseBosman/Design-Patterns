
public class ItemRibbons extends ItemDecorator{
	ChristmasTree tree;
	
	public ItemRibbons(ChristmasTree tree){
	    this.tree = tree;
	  }

	  public String getDescription(){
	    return tree.getDescription() + ", Ribbons";
	  }

	  public double cost(){
	    return 2.00 + tree.cost();
	  }

}
