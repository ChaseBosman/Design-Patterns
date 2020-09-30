public abstract class Store{
  protected abstract Slot createSlot(String item);
    public Slot orderSlot(String type){
      Slot slot = createSlot(type);
      slot.build();
      return slot;
    }
}