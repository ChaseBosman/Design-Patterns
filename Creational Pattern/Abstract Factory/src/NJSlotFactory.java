public class NJSlotFactory implements SlotFactory{
  public Cabinet createCabinet(String type)
  {
    if (type == "straight")
    {
      return new Small();
    }
    else if (type == "bonus")
    {
      return new Large();
    }
    else
    {
      return new Small();
    }
  } 

  public Display createDisplay(String type)
  {
    if (type == "straight")
    {
      return new LCD();
    }
    else if (type == "bonus")
    {
      return new Reels();
    }
    else
    {
      return new CRT();
    }
  } 

  public Payment createPayment(String type)
  {
      if (type == "straight")
    {
      return new Coins();
    }
    else if (type == "bonus")
    {
      return new Coins();
    }
    else
    {
      return new Bills();
    }
  } 

  public GPU createGPU(String type)
  {
    if (type == "straight")
    {
      return new ARM();
    }
    else if (type == "bonus")
    {
      return new ARM();
    }
    else
    {
      return new x86();
    }
  }

  public OS createOS(String type)
  {
    if (type == "straight")
    {
      return new WindowsME();
    }
    else if (type == "bonus")
    {
      return new WindowsME();
    }
    else
    {
      return new WindowsXP();
    }
  } 
}