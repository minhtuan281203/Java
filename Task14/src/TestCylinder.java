public class TestCylinder {
    public static void main(String[] args) {
        Circle c1 = new Cylinder(1.0, 2.0);
        System.out.println(c1.getRadius());
        System.out.println(c1.toString());
        System.out.println(c1.getClass());
        System.out.println("Area: "+ c1.getArea());
    }
}
