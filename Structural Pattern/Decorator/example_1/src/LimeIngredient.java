public class LimeIngredient extends Ingredients{
  Drink drink;

  public LimeIngredient(Drink drink){
    this.drink = drink;
  }

  public String getDescription(){
    return drink.getDescription() + ", Lime";
  }

  public int cals(){
    return 2 + drink.cals();
  }
}