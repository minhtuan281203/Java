package session7;

public class MethodRectangle extends Shape{
    float perimeter;
    float length=10;

    void calculate(float width) {
        perimeter = 2 * (length + width);
        System.out.println("Perimeter is:"+ perimeter);
    }
}
