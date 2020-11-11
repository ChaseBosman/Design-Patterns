public class Cylinder  implements Component{

    Double r, h;

    Cylinder(Double h, Double r){
        this.r = r;
        this.h = h;
    }

    @Override
    public void Render() {
        System.out.println("Rendering a Cylinder");
    }

    @Override
    public Double Volume() {
        return 3.14 * r * r * h;
    }

}
