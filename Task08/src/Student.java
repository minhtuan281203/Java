public class Student {
    private int RollNo;
    private String name;
    private ClassRoom myclass;

    public Student(int RollNo, String name){
        this.RollNo =RollNo;
        this.name= name;
    }
    public Student(int RollNo, String name, ClassRoom myclass){
        this.RollNo =RollNo;
        this.name= name;
        this.myclass = myclass;
    }

    public String toString() {
        return "Student{" + "RollNo=" + RollNo + ", name='" + name + '\'' + ", myclass={classid and className:" + myclass + "}" + '}';
    }
}
