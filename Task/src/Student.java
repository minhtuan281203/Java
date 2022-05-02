public class Student extends Person{
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int Max_courses = 30;

    public Student(String name,String address){
        super(name,address);
        numCourses=0;
        courses = new String[Max_courses];
        grades = new int[Max_courses];
    }
    public void addCoursesGrade(String course,int grade){
        courses[numCourses]= course;
        grades[numCourses]= grade;
        ++numCourses;
    }
    public void printGrade(){
        System.out.println(this);
        for (int i = 0; i < numCourses; i++) {
            System.out.println(" "+ courses[i]+ ":"+ grades[i]);
        }
        System.out.println();
    }
    public double getAverageGrade(){
        int sum = 0;
        for (int i = 0; i<numCourses; i++){
            sum+= grades[i];
        }
        return (double) sum/numCourses;
    }
    public String toString(){
        return "Student: "+ super.toString();
    }
}
