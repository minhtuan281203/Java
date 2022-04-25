public class DayOfweek {
    public static void main(String[] args) {
        String day="Monday";
        switch (day){
            case "Sunday":
                System.out.println("First day of week");
                break;
            case "Monday":
                System.out.println("Second day of week");
                break;
            case "Tuesday":
                System.out.println("Third day of week");
                break;
            case "Friday":
                System.out.println("Fifth day of week");
                break;
            case "Saturday":
                System.out.println("Last day of week");
                break;
            default:
                System.out.println("InvalidDay");
        }
    }
}
