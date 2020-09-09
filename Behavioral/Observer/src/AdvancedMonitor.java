public class AdvancedMonitor implements Observer
{
  private Baby baby1;
  private Baby baby2;

  public AdvancedMonitor(Baby b1, Baby b2)
  {
    this.baby1 = b1;
    this.baby2 = b2;
    b1.registerObserver(this);
    b2.registerObserver(this);

  }


  public void display()
  {
    if (baby1.getCrying())
    {
      System.out.println(baby1.getName() + " is crying at level " +baby1.getCryLevel());
    }
    else
    {
      System.out.println(baby1.getName() + " is not crying");
    }

    if (baby2.getCrying())
    {
      System.out.println(baby2.getName() + " is crying at level " +baby2.getCryLevel());
    }
    else
    {
      System.out.println(baby2.getName() + " is not crying");
    }
  }

  public void update(Baby new_baby_data)
  {
    if(baby1.getName() == new_baby_data.getName())
    {
        baby1 = new_baby_data;
    }
    else if(baby2.getName() == new_baby_data.getName())
    {
        baby2 = new_baby_data;
    }
    else
    {
      System.out.println("Baby name does not match!");
    }
    this.display();
  }
}