
public class ItemLights extends ItemDecorator{
	ChristmasTree tree;
	
	public ItemLights(ChristmasTree tree){
	    this.tree = tree;
	  }

	  public String getDescription(){
	    return tree.getDescription() + ", Lights";
	  }

	  public double cost(){
	    return 5.00 + tree.cost();
	  }

}
