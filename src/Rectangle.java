public class Rectangle {
    float length, width;
    public Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }
    public Rectangle(float l, float w) {
        length = l;
        width = w;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float newLength) {
        length = newLength;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float newWidth) {
        width = newWidth;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (length+width) * 2;
    }
    public String toString(){
        return "Rectangle[length = " + length + ", width = " + width + "]";
    }
}
