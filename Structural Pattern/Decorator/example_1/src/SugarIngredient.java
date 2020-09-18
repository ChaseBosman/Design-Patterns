public class SugarIngredient extends Ingredients
{
  Drink drink;

  public SugarIngredient(Drink drink){
    this.drink = drink;
  }

  public String getDescription(){
    return drink.getDescription() + ", Sugar";
  }

  public int cals(){
    return 300 + drink.cals();
  }
}