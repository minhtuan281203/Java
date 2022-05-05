public class Circle {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public String toString() {
        return "Circle{radius= "+ radius+"}";
    }
    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }
}
