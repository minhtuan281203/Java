package session6;

public class UserLogin {
    public  int userNo=0;
    public void displayUserCount(){
        userNo++;
        System.out.println("User number is:"+ userNo);
    }

    public static void main(String[] args) {
        UserLogin objUser1 = new UserLogin();
        objUser1.displayUserCount();
        UserLogin objUser2 =new UserLogin();
        objUser2.displayUserCount();
    }
}
