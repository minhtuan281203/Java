public class TestClassRoom {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(1, "L1");
        System.out.println(classRoom);

        classRoom.setClassid(2);
        classRoom.setClassName("L2");
        System.out.println(classRoom);
    }
}
