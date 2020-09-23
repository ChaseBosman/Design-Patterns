public abstract class SlotMachine{
  String cabinet;
  String display;
  String payment;
  String cpu;
  String os;
  String state;
  String type;

  void prepare(){
    System.out.println("preparing machine");
  }

  public String getCabinet()
  {
    return cabinet;
  }

  public String getDisplay()
  {
    return display;
  }

  public String getPayment()
  {
    return payment;
  }

  public String getCPU()
  {
    return cpu;
  }

  public String getOs()
  {
    return os;
  }

  public String getState()
  {
    return state;
  }

  public String getType()
  {
    return type;
  }

}