class Main {
  public static void main(String[] args) {
    //Lines 4-7 below can be looked at as the initial data that the model is be loaded with
    SchedulerModel model = new SchedulerModel();
    model.setName("Design Patterns");
    model.setNumber(330);
    model.setDescription("This class teaches proper design related to OOP.");

    SchedulerView view = new SchedulerView();

    SchedulerController controller = new SchedulerController(model, view);

    controller.update();

    System.out.println();
    System.out.println("Updating the model to reflect CS 425");

    //The below 3 lines are updating the model to reflect a new course loaded
    controller.setName("Senior Projects");
    controller.setNumber(425);
    controller.setDescription("This course examines the software process from start to finish.");

    controller.update();
    }
}