public class Teacher extends Person{
    private int numCourses;
    private String[] courses;
    private static final int max_courses = 5;

    public Teacher(String name, String address){
        super(name,address);
        numCourses=0;
        courses = new String[max_courses];
    }

    public boolean addCourses(String course){
        for (int i = 0; i < numCourses; i++) {
            if (courses[i].equals(course))
                return false;
        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }
    public boolean removeCourses(String course){
        boolean fo = false;
        int coursesIndex = -1;
        for (int i=0 ;i<numCourses; i++){
            if (courses[i].equals(course)){
                coursesIndex = i;
                fo = true;
                break;
            }
        }
        if (fo){
            for (int i=coursesIndex ;i<numCourses; i++){
                courses[i]=courses[i+1];
            }
            numCourses--;
            return true;
        }else {
            return false;
        }
    }
    public String toString(){
        return "Teacher: "+ super.toString();
    }
}
