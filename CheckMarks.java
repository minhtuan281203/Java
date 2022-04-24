public class CheckMarks {
    public static void main(String[] args) {
        int totalMarks = 59;
        if(totalMarks>=90){
            System.out.println("Grade = A");
        }else if(totalMarks>=60){
            System.out.println("Grade =B");
        }else if (totalMarks>=40){
            System.out.println("Grade=C");
        }else {
            System.out.println("Failed");
        }
    }
}
