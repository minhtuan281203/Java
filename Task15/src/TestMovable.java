public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(3,4);    //upcast
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);

        MovablePoint p1 = (MovablePoint) m1;    //downcast
        System.out.println(p1);
    }

}
