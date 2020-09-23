class Main {
  public static void main(String[] args) {
    SlotFactory tajmahal1 = new NJFactory();
    SlotFactory peppermill = new NVFactory();

    System.out.println("The Taj Mahal orders a:");
    tajmahal1.orderSlot("bonus");

    System.out.println();

    System.out.println("The Peppermill orders a:");
    peppermill.orderSlot("progressive");

  }
}