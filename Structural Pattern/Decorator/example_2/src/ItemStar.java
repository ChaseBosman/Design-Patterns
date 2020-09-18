public class ItemStar extends ItemDecorator{
	ChristmasTree tree;
	
	public ItemStar(ChristmasTree tree){
		this.tree = tree;
	}

	public String getDescription(){
		if(tree.getDescription().contains("Star")) {
			System.out.println("Tree already has a star!");
			return tree.getDescription();
		}
		else
		{
			return tree.getDescription() + ", Star";
		}
	}

	public double cost(){
		if(tree.getDescription().contains("Star")) {
			return tree.cost();
		}
		else
		{
			return 4.00 + tree.cost();
		}
	}
}
