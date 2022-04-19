public class Circle2 {
    double radius;
    public Circle2(){
        radius = 1.0;
    }
    public Circle2(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
    public void setRadius(double newradius){
        radius = newradius;
    }
    public double getCircumference(){
        return radius * 2 * Math.PI;
    }
    public String toString(){
        return "Circle[radius = " + radius + "]";
    }
}
