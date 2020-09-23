public class NVFactory extends SlotFactory
{
  protected SlotMachine createSlot(String type)
  {
    if(type.equals("straight")) {
      return new NVStraightSlot();
    }
    else if(type.equals("bonus")) {
      return new NVBonusSlot();
    }
    else if(type.equals("progressive")) {
      return new NVProgressiveSlot();
    }
    else return null;
  }
}