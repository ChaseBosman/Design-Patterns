public class Pizza{
  State Uncooked;
  State Baked;
  State Delivered;
  State EatenByKitchen;
  State state;
  
  public Pizza(){
    System.out.println("Creating a Pizza");
    Uncooked = new Uncooked(this);
    Baked = new Baked(this);
    Delivered = new Delivered(this);
    EatenByKitchen = new EatenByKitchen(this);
    state = Uncooked;
  }

  public void bake(){
    state.bake();
  }

  public void deliver(){
    state.deliver();
  }

  public void dontDeliver(){
    state.dontDeliver();
  }

  public void setState(State t){
    this.state = t;
  }

  public State getUncooked(){
    return Uncooked;
  }

  public State getBaked(){
    return Baked;
  }

  public State getDelivered(){
    return Delivered;
  }

  public State getEatenByKitchen(){
    return EatenByKitchen;
  }
}