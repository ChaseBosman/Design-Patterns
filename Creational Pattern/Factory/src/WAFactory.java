public class WAFactory extends SlotFactory
{
  protected SlotMachine createSlot(String type)
  {
    if(type.equals("straight"))
    {
      return new WAStraightSlot();
    }
    else if(type.equals("bonus"))
    {
      return new WABonusSlot();
    }
    else if(type.equals("progressive"))
    {
      return new WAProgressiveSlot();
    }
    else return null;
  }
}