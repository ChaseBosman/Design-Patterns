public class VermouthIngredient extends Ingredients{
  Drink drink;

  public VermouthIngredient(Drink drink){
    this.drink = drink;
  }

  public String getDescription(){
    return drink.getDescription() + ", Vermouth";
  }

  public int cals(){
    return 40 + drink.cals();
  }
}