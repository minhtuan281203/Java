public class TestRectangle {
    public static void main(String[] args) {
        Rectangle ra = new Rectangle();
        System.out.println("Rectangle has length and width are: "+ ra.getLength() +" "+ ra.getWidth());
        System.out.println(ra.toString());
        Rectangle ra2 = new Rectangle(3.0f, 2.0f);
        System.out.println("Area and Perimeter of Rectangle:" + ra2.getArea()+" and "+ ra2.getPerimeter());
    }
}
