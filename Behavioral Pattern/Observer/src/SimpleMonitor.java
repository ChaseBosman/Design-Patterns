public class SimpleMonitor implements Observer
{
  private Baby baby1;
  private boolean is_crying;
  private int cry_level;

  public SimpleMonitor(Baby new_baby)
  {
    this.baby1 = new_baby;
    baby1.registerObserver(this);
  }

  public void display()
  {
    if (is_crying)
    {
      System.out.println(baby1.getName() + " is crying at level " + cry_level);
    }
    else
    {
      System.out.println("Baby is not crying");
    }
  }

  public void update(Baby new_baby_data)
  {
    this.is_crying = new_baby_data.getCrying();
    this.cry_level =  new_baby_data.getCryLevel();
    this.display();
  }
}