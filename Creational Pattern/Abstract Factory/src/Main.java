class Main {
  public static void main(String[] args) {
    Store nvStore = new NVStore();
    Store njStore = new NJStore();
    Store waStore = new WAStore();
		Slot slot1 = nvStore.orderSlot("straight");
		System.out.print("Casino 1 orders a " + slot1.getName() + " with components: ");
    System.out.println(slot1.cabinet.toString() + " cabinet, " + slot1.display.toString() + " display, " + slot1.payment.toString() + " payment, " + slot1.gpu.toString()+ " GPU, and a " + slot1.os.toString()+" OS");
  

  Slot slot2 = nvStore.orderSlot("bonus");
		System.out.print("Casino 2 orders a " + slot2.getName() + " with components: ");
    System.out.println(slot2.cabinet.toString() + " cabinet, " + slot2.display.toString() + " display, " + slot2.payment.toString() + " payment, " + slot2.gpu.toString()+ " GPU, and a " + slot2.os.toString()+" OS");
  

  Slot slot3 = nvStore.orderSlot("progressive");
		System.out.print("Casino 3 orders a " + slot3.getName() + " with components: ");
    System.out.println(slot3.cabinet.toString() + " cabinet, " + slot3.display.toString() + " display, " + slot3.payment.toString() + " payment, " + slot3.gpu.toString()+ " GPU, and a " + slot3.os.toString()+" OS");
  

  Slot slot4 = njStore.orderSlot("straight");
		System.out.print("Casino 4 orders a " + slot4.getName() + " with components: ");
    System.out.println(slot4.cabinet.toString() + " cabinet, " + slot4.display.toString() + " display, " + slot4.payment.toString() + " payment, " + slot4.gpu.toString()+ " GPU, and a " + slot4.os.toString()+" OS");
  
  
  Slot slot5 = njStore.orderSlot("bonus");
		System.out.print("Casino 5 orders a " + slot5.getName() + " with components: ");
    System.out.println(slot5.cabinet.toString() + " cabinet, " + slot5.display.toString() + " display, " + slot5.payment.toString() + " payment, " + slot5.gpu.toString()+ " GPU, and a " + slot5.os.toString()+" OS");
  

  Slot slot6 = njStore.orderSlot("progressive");
		System.out.print("Casino 6 orders a " + slot6.getName() + " with components: ");
    System.out.println(slot6.cabinet.toString() + " cabinet, " + slot6.display.toString() + " display, " + slot6.payment.toString() + " payment, " + slot6.gpu.toString()+ " GPU, and a " + slot6.os.toString()+" OS");
  

  Slot slot7 = waStore.orderSlot("straight");
		System.out.print("Casino 7 orders a " + slot7.getName() + " with components: ");
    System.out.println(slot7.cabinet.toString() + " cabinet, " + slot7.display.toString() + " display, " + slot7.payment.toString() + " payment, " + slot7.gpu.toString()+ " GPU, and a " + slot7.os.toString()+" OS");
  

  Slot slot8 = waStore.orderSlot("bonus");
		System.out.print("Casino 8 orders a " + slot8.getName() + " with components: ");
    System.out.println(slot8.cabinet.toString() + " cabinet, " + slot8.display.toString() + " display, " + slot8.payment.toString() + " payment, " + slot8.gpu.toString()+ " GPU, and a " + slot8.os.toString()+" OS");
  
  
  Slot slot9 = waStore.orderSlot("progressive");
		System.out.print("Casino 9 orders a " + slot9.getName() + " with components: ");
    System.out.println(slot9.cabinet.toString() + " cabinet, " + slot9.display.toString() + " display, " + slot9.payment.toString() + " payment, " + slot9.gpu.toString()+ " GPU, and a " + slot9.os.toString()+" OS");
  }
}