public class NJFactory extends SlotFactory{
  protected SlotMachine createSlot(String type){
    if(type.equals("straight")) {
      return new NJStraightSlot();
    }
    else if(type.equals("bonus")) {
      return new NJBonusSlot();
    }
    else if(type.equals("progressive")) {
      return new NJProgressiveSlot();
    }
    else return null;
  }
}