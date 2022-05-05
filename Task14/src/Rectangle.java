public class Rectangle extends Shape{
    private int length, width;
    public Rectangle(String color,int length,int width){
        super(color);
        this.length=length;
        this.width=width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    public double getArea(){
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", Area=" + getArea() +
                "," + super.toString() +
                '}';
    }
}
