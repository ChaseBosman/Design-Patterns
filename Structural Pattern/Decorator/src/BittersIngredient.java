public class BittersIngredient extends Ingredients{
  Drink drink;

  public BittersIngredient(Drink drink){
    this.drink = drink;
  }

  public String getDescription(){
    return drink.getDescription() + ", Bitters";
  }

  public int cals(){
    return 20 + drink.cals();
  }
}