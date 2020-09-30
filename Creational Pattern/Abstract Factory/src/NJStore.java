public class NJStore extends Store{
  protected Slot createSlot(String item){
    Slot slot = null;
    SlotFactory slotFactory = new NJSlotFactory();
    if(item == "straight"){
      slot = new Straight(slotFactory);
      slot.setName("New Jersey Style Straight Slot Machine");
    } else if (item == "bonus"){
      slot = new  Bonus(slotFactory);
      slot.setName("New Jersey Style Bonus Slot Machine");
    } else {
      slot = new  Progressive(slotFactory);
      slot.setName("New Jersey Style Progressive Slot Machine");
    }
    return slot;
  }
}