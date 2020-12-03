public class SchedulerModel{
  private String name;
  private int number;
  private String description;

  public void setName(String name) {
   this.name = name; 
  }

  public String getName(){
    return this.name;
  }

  public void setNumber(int number){
    this.number = number;
  }

  public int getNumber(){
    return this.number;
  }

  public void setDescription(String description){
    this.description = description;
  }

  public String getDescription(){
    return this.description;
  }
}