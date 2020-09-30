public class WAStore extends Store{
  protected Slot createSlot(String item){
    Slot slot = null;
    SlotFactory slotFactory = new WASlotFactory();
    if(item == "straight"){
      slot = new Straight(slotFactory);
      slot.setName("Washington Style Straight Slot Machine");
    } else if (item == "bonus"){
      slot = new Bonus(slotFactory);
      slot.setName("Washington Style Bonus Slot Machine");
    } else 
    {
      slot = new Progressive(slotFactory);
      slot.setName("Washington Style Progressive Slot Machine");
    }
    return slot;
  }
}