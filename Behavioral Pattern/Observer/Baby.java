import java.util.ArrayList;

public class Baby implements Subject
{
  private ArrayList observers;
  private String name;
  private int cry_level;
  private boolean is_crying;

  public Baby(String n)
  {
    this.name = n;
    this.observers = new ArrayList();
  }

  public void registerObserver(Observer o)
  {
    observers.add(o);
  }
  
  public void removeObserver(Observer o)
  {
    int i = observers.indexOf(o);
    if (i>=0)
    {
      observers.remove(o);
    }
  }

  public void notifyObserver()
  {
    for (int i = 0; i < observers.size(); i++) 
    {
      Observer observer = (Observer)observers.get(i);
      observer.update(this);
    }
  }

  public int getCryLevel()
  {
    return this.cry_level;
  }

  public boolean getCrying()
  {
    return this.is_crying;
  }

  public String getName()
  {
    return this.name;
  }

  public void set_cry_level(int level)
  {
    if(level >= 0)
    {
      is_crying = true;
      cry_level = level;
    }
    else
    {
      is_crying = false;
    }
    this.notifyObserver();
  }

  public void set_crying(boolean c)
  {
    is_crying = c; 
    this.notifyObserver();
  }
  
}