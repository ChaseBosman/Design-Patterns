public class SchedulerController{
  private SchedulerView view;
  private SchedulerModel model;

  SchedulerController(SchedulerModel model, SchedulerView view){
    this.view = view;
    this.model = model;
  }

  public void setName(String name) {
   model.setName(name); 
  }

  public String getName(){
    return model.getName();
  }

  public void setNumber(int number){
    model.setNumber(number);
  }

  public int getNumber(){
    return model.getNumber();
  }

  public void setDescription(String description){
    model.setDescription(description);
  }

  public String getDescription(){
    return model.getDescription();
  }

  public void update(){
    view.displayView(model.getName(), model.getNumber(), model.getDescription());
  }
}