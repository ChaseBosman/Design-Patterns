class Main {
  public static void main(String[] args) {
    Drink oldfashioned = new Bourbon();
    oldfashioned = new BittersIngredient(oldfashioned);
    oldfashioned = new BittersIngredient(oldfashioned);
    oldfashioned = new CherryIngredient(oldfashioned);
    oldfashioned = new LimeIngredient(oldfashioned);

    System.out.println(oldfashioned.getDescription());
    System.out.println(oldfashioned.cals());

    Drink vodka_gimlet = new Vodka();
    vodka_gimlet = new LimeJuiceIngredient(vodka_gimlet);
    vodka_gimlet = new LimeIngredient(vodka_gimlet);
    System.out.println(vodka_gimlet.getDescription());
    System.out.println(vodka_gimlet.cals());

    Drink manhattan = new Bourbon();
    manhattan = new VermouthIngredient(manhattan);
    manhattan = new VermouthIngredient(manhattan);
    manhattan = new CherryIngredient(manhattan);
    manhattan = new BittersIngredient(manhattan);
    System.out.println(manhattan.getDescription());
    System.out.println(manhattan.cals());

    Drink tom_collins = new Gin();
    tom_collins = new LimeJuiceIngredient(tom_collins);
    tom_collins = new LimeJuiceIngredient(tom_collins);
    tom_collins = new SugarIngredient(tom_collins);
    tom_collins = new SugarIngredient(tom_collins);
    tom_collins = new LimeIngredient(tom_collins);
    System.out.println(tom_collins.getDescription());
    System.out.println(tom_collins.cals());
  }
}