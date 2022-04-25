public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("1.the circle has radius of " + c1.getRadius()+ " and area of " + c1.getArea());

        Circle c2 = new Circle(3.0);
        System.out.println("2.the circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());

        // toString()
        Circle c3 = new Circle(5.0);
        System.out.println(c3.toString());
    }
}
