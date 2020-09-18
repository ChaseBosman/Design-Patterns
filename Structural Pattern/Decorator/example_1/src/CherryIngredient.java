public class CherryIngredient extends Ingredients
{
  Drink drink;

  public CherryIngredient(Drink drink){
    this.drink = drink;
  }

  public String getDescription(){
    return drink.getDescription() + ", Cherry";
  }

  public int cals(){
    return 40 + drink.cals();
  }
}