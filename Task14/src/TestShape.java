public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 4, 5);
        System.out.println(s1.toString());
        Shape s2 = new Triangle("blue", 2, 10);
        System.out.println(s2.toString());

        Shape s3 = new Shape("pink");
        System.out.println(s3.getArea());
    }
}
