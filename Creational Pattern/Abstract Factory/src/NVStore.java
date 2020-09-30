public class NVStore extends Store{
  protected Slot createSlot(String item){
    Slot slot = null;
    SlotFactory slotFactory = new NVSlotFactory();
    if(item == "straight"){
      slot = new Straight(slotFactory);
      slot.setName("Nevada Style Straight Slot Machine");
    } else if (item =="bonus"){
      slot = new  Bonus(slotFactory);
      slot.setName("Nevada Style Bonus Slot Machine");
    } else {
      slot = new  Progressive(slotFactory);
      slot.setName("Nevada Style Progressive Slot Machine");
    }
    return slot;
  }
}