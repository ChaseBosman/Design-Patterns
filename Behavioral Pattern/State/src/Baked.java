public class Baked implements State{
  Pizza pizza;

  public Baked(Pizza pizza){
    this.pizza = pizza;
  }

  public void bake(){
    System.out.println("Why would you want to cook this pizza twice?");
  }

  public void deliver(){
    System.out.println("Now delivering this pizza!");
    pizza.setState(pizza.getDelivered());
  }

  public void dontDeliver(){
    System.out.println("No longer delivering this pizza! Employees are eating it!");
    pizza.setState(pizza.getEatenByKitchen());
  }
}