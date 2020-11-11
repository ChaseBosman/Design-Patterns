public class Box implements Component{

    Double w, h, l;

    Box(Double w, Double h, Double l){
        this.w = w;
        this.h = h;
        this.l = l;
    }

    @Override
    public void Render() {
        System.out.println("Rendering a Box");
    }

    @Override
    public Double Volume() {
        return w * l * h;
    }

}
