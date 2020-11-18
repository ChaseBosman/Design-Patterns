class Main {
  public static void main(String[] args) {
    Pizza pizza1 = new Pizza();
    pizza1.bake();
    pizza1.bake();
    pizza1.deliver();
    System.out.println();

    Pizza pizza2 = new Pizza();
    pizza2.deliver();
    pizza2.bake();
    pizza2.deliver();
    System.out.println();

    Pizza pizza3 = new Pizza();
    pizza3.bake();
    System.out.println("Oops! The pizza was dropped in its box!");
    pizza3.dontDeliver();
  }
}