public class LimeJuiceIngredient extends Ingredients
{
  Drink drink;

  public LimeJuiceIngredient(Drink drink){
    this.drink = drink;
  }

  public String getDescription(){
    return drink.getDescription() + ", LimeJuice";
  }

  public int cals(){
    return 8 + drink.cals();
  }
}