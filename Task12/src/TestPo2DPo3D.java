public class TestPo2DPo3D {
    public static void main(String[] args) {
        Point2D p2a = new Point2D(1, 2);
        System.out.println("p2:"+p2a);
        Point2D p2b = new Point2D();
        System.out.println(p2b);

        p2a.setX(3);
        p2a.setY(4);
        System.out.println("set p2:"+p2a);
        System.out.println("x is:" + p2a.getX());
        System.out.println("y is:" + p2a.getY());

        Point3D p3a = new Point3D();
        System.out.println("p3:"+p3a);
        Point3D p3b = new Point3D(18,28,12);
        System.out.println(p3b);
        p3b.setX(21);
        p3b.setY(22);
        p3b.setZ(23);
        System.out.println("set p3"+p3b);
        System.out.println("x is:" + p3b.getX()+
                "\ny is:" + p3b.getY()+
                "\nz is:" + p3b.getZ()
        );
    }
}
