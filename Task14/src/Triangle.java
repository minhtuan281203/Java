public class Triangle extends Shape{
    private int base, height;
    public Triangle(String color,int base,int height){
        super(color);
        this.base=base;
        this.height=height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }
    public double getArea(){
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", Area=" + getArea() +
                "," + super.toString() +
                '}';
    }
}
