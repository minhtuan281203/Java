public class TestSwichCase {
    public static void main(String[] args) {
        int choice=3;
        switch (choice){
            case 1:
                System.out.println("Addition");
                break;
            case 2:
                System.out.println("Sub");
                break;
            case 3:
                System.out.println("Mutiplication");
                break;
            case 4:
                System.out.println("Divition");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
