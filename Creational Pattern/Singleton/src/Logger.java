import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger{
  private static Logger uniqueInstance;
  private Date lastTime;
  int datesLogged = 0;

  private Logger(){

  }  

  public static synchronized Logger getInstance()
  {
    if(uniqueInstance == null){
      System.out.println("Created first instance.");
      uniqueInstance = new Logger();
    }else{
      System.out.println("Instance already created, set to the previously created instance!");
    }
    return uniqueInstance;
  }

  public synchronized void log(Date curr){
    datesLogged++;
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
    lastTime = curr;

    System.out.println("We have logged: " + datesLogged + " number of dates");
    System.out.println(dateFormat.format(lastTime));
  }
  
}