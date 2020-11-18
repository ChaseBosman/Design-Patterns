public class Uncooked implements State{
  Pizza pizza;

  public Uncooked(Pizza pizza){
    this.pizza = pizza;
  }

  public void bake(){
    System.out.println("Baking the pizza!");
    pizza.setState(pizza.getBaked());
  }

  public void deliver(){
    System.out.println("Cant deliver an uncooked pizza!");
  }

  public void dontDeliver(){
    System.out.println("This uncooked pizza is garbage! Not to be eaten by the employees since its still uncooked!");
  }
}