public abstract class SlotFactory
{

  public SlotMachine orderSlot(String type){

    SlotMachine machine = createSlot(type);

    System.out.println("--Making a " +machine.getState()+ " " +machine.getType()+ " slot machine--");
    System.out.println("Fetching components: " +machine.getCabinet()+ ", " +machine.getPayment()+ ", " +machine.getDisplay()+ ", "+machine.getCPU());
    System.out.println("Assembling components");
    System.out.println("Testing hardware");
    System.out.println("uploading software: " +machine.getOs());
    System.out.println("Testing software");



    return machine;
  }

  protected abstract SlotMachine createSlot(String type);
}