
public class Driver {

	public static void main(String[] args) {
		ChristmasTree mytree = new ColaradoBlueSpruce();
		mytree = new ItemStar(mytree);
		mytree = new ItemStar(mytree);
		mytree = new ItemRuffles(mytree);
		mytree = new ItemRuffles(mytree);
		System.out.println(mytree.getDescription() + " costs $" + mytree.cost() );
		
		ChristmasTree fraser1 = new FraserFer();
		fraser1 = new ItemStar(fraser1);
		System.out.println(fraser1.getDescription() + " costs $" + fraser1.cost() );
	}

}
