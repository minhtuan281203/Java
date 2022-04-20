public class TestCircle2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        System.out.println("1.the circle has radius of " + c1.getRadius()+ " and area of " + c1.getArea());

        Circle2 c2 = new Circle2(2.5);
        System.out.println("2.the circle has radius of " + c2.getRadius() + " and perimeter of " + c2.getCircumference());

        // toString()
        Circle2 c3 = new Circle2(4.0);
        System.out.println(c3.toString());
    }
}
