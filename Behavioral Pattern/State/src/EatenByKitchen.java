public class EatenByKitchen implements State{
  Pizza pizza;

  public EatenByKitchen(Pizza pizza){
    this.pizza = pizza;
  }

  public void bake(){
    System.out.println("Error: This pizza was eaten by your coworkers!");
  }

  public void deliver(){
    System.out.println("Error: This pizza was eaten by your coworkers!");
  }

  public void dontDeliver(){
    System.out.println("Error: This pizza was eaten by your coworkers!");
  }
}