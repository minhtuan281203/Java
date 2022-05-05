public class Cylinder extends Circle{
    private double height;
    public Cylinder(double height, double radius){
        super(radius);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * super.getRadius() * height;
    }
    public String toString(){
        return "Cylinder{height= "+height +","+ super.toString() + "}";
    }
}
