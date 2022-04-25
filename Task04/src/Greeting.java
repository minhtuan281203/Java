public class Greeting {
    public static void main(String[] args) {
        String day="Monday";
        String hour ="am";
        switch (day){
            case "Sunday":
                System.out.println("This is a holiday...");
                switch (hour){
                    case "am":
                        System.out.println("GoodMorning");
                        break;
                    case "pm":
                        System.out.println("GoodEvening");
                        break;
                }
                break;
            case "Monday":
                System.out.println("This is workingDay");
                switch (hour){
                    case "am":
                        System.out.println("GoodMorning");
                        break;
                    case "pm":
                        System.out.println("GoodEvening");
                        break;
                }
                break;
            default:
                System.out.println("InvalidDay");
        }
    }
}
