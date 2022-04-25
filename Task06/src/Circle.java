public class Circle {
    double radius;
    String color;
    //set default value
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    public Circle(double r){
        radius = r;
        color = "red";
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double newradius){
        radius = newradius;
    }
    public void setColor(String newcolor){
        color = newcolor;
    }
    /* toString()*/
    public String toString(){
        return "Circle[radius =" + radius + ", color =" + color + "]";
    }

    public double getArea(){
        return Math.pow(radius, 2) * Math.PI;
    }
}
