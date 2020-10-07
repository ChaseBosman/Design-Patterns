import java.util.Date;

class Main {
  public static void main(String[] args) {
    Logger object1 = Logger.getInstance();
    Logger object2 = Logger.getInstance();
    Logger object3 = Logger.getInstance();
    Logger object4 = Logger.getInstance();

    Date current = new Date();
    object1.log(current);

    Date current2 = new Date();      
    object2.log(current2);
  }
}