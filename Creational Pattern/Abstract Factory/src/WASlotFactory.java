public class WASlotFactory implements SlotFactory{
  public Cabinet createCabinet(String type)
  {
    if (type == "straight")
    {
      return new Large();
    }
    else if (type == "bonus")
    {
      return new Medium();
    }
    else
    {
      return new Large();
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
      return new VGA();
    }
    else
    {
      return new Reels();
    }
  } 

  public Payment createPayment(String type)
  {
      if (type == "straight")
    {
      return new Bills();
    }
    else if (type == "bonus")
    {
      return new TicketInTicketOut();
    }
    else
    {
      return new Coins();
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
      return new ARM();
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
      return new Symbian();
    }
    else
    {
      return new Android();
    }
  } 
}