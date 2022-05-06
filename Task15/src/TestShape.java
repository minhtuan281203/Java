public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("red", 1, 2);
        System.out.println(s1 + " area: "+s1.getArea());
        Shape s2 = new Triangle("blue", 3 ,4);
        System.out.println(s2 + " area: "+s2.getArea());
        Shape s3 = new Shape("red") {
            @Override
            public double getArea() {
                return 0;
            }
        };
    }
}
