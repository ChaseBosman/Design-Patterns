public class Driver {

    static public void main(String[] args){
        System.out.println("Starting program.");
        Object myModel = new Object();
        myModel.AddComponent(new Cylinder((double) 2, (double)5));
        myModel.AddComponent(new Box((double) 2, (double) 2, (double) 5));
        myModel.AddComponent(new Sphere((double) 2));

        Object model2 = new Object();
        model2.AddComponent(new Box((double) 5, (double) 9,(double) 8));
        model2.AddComponent(new Box((double) 5, (double) 90,(double) 8));
        myModel.AddComponent(model2);

        myModel.Render();
        System.out.println("Volume: " + myModel.Volume());
    }

}
