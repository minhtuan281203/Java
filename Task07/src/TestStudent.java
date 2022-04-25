public class TestStudent {
    public static void main(String[] args) {
        ClassRoom clRoom = new ClassRoom(1, "L20");
        System.out.println(clRoom);

        Student hs = new Student(1, "December", clRoom);
        System.out.println(hs);

        Student hs2 = new Student(2, "Eighteen", new ClassRoom(1, "L5"));
        System.out.println(hs2);
    }
}
