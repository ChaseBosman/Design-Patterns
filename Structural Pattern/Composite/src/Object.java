import java.util.ArrayList;

public class Object implements Component {

    ArrayList<Component> children = new ArrayList<Component>();

    @Override
    public void Render() {
        System.out.println("Rendering an OBJECT");
        for(Component c: children){
            c.Render();
        }
    }

    @Override
    public Double Volume() {
        System.out.println("getting volume of OBJECT");
        Double v = (double) 0;
        for(Component c: children){
            v += c.Volume();
        }
        System.out.println("object volume is " + v);
        return v;
    }

    void AddComponent(Component comp)
    {
        children.add(comp);
    }

    void RemoveComponent(Component comp){
        children.remove(comp);
    }

    Component GetChild(int index){
        return children.get(index);
    }

}
