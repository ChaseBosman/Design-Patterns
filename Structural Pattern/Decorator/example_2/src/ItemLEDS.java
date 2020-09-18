
public class ItemLEDS extends ItemDecorator{
	ChristmasTree tree;
	
	public ItemLEDS(ChristmasTree tree){
	    this.tree = tree;
	  }

	  public String getDescription(){
	    return tree.getDescription() + ", LEDS";
	  }

	  public double cost(){
	    return 10.00 + tree.cost();
	  }

}
