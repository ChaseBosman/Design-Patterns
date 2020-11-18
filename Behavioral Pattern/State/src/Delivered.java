public class Delivered implements State{
  Pizza pizza;

  public Delivered(Pizza pizza){
    this.pizza = pizza;
  }

  public void bake(){
    System.out.println("This pizza was already delivered!");
  }

  public void deliver(){
    System.out.println("This pizza was already delivered!");
  }

  public void dontDeliver(){
    System.out.println("This pizza will no longer be delivered, and thus eaten by the employees!");
    pizza.setState(pizza.getEatenByKitchen());
  }
}