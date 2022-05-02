public class TestPerson {
    public static void main(String[] args) {
        Student s1 = new Student("December", "123 tran phu");
        s1.addCoursesGrade("cl01", 99);
        s1.addCoursesGrade("cl02", 67);
        System.out.println(s1);
        s1.printGrade();

        Teacher t1 = new Teacher("Pauth", "ho guom");
        System.out.println(t1);
    }
}
