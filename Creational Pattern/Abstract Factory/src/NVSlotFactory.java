public class NVSlotFactory implements SlotFactory{
  public Cabinet createCabinet(String type)
  {
    if (type == "straight")
    {
      return new Large();
    }
    else if (type == "bonus")
    {
      return new Small();
    }
    else
    {
      return new Medium();
    }
  } 

  public Display createDisplay(String type)
  {
    if (type == "straight")
    {
      return new Reels();
    }
    else if (type == "bonus")
    {
      return new CRT();
    }
    else
    {
      return new LCD();
    }
  } 

  public Payment createPayment(String type)
  {
      return new TicketInTicketOut();
  } 

  public GPU createGPU(String type)
  {
    if (type == "straight")
    {
      return new ARM();
    }
    else if (type == "bonus")
    {
      return new x86();
    }
    else
    {
      return new x77();
    }
  } 

  public OS createOS(String type)
  {
    if (type == "straight")
    {
      return new Linux();
    }
    else if (type == "bonus")
    {
      return new Linux();
    }
    else
    {
      return new Android();
    }
  } 
}
