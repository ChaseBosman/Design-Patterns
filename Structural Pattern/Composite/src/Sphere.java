public class Sphere  implements Component{

    Double r;

    Sphere(Double r){
        this.r = r;
    }

    @Override
    public void Render() {
        System.out.println("Rendering a Sphere");
    }

    @Override
    public Double Volume() {
        return 4 * 3.14 * r * r * r / 3;
    }

}
