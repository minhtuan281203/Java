import java.util.Scanner;

public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount=0;
    public void input(){
        Scanner Input = new Scanner(System.in);
        do{
            System.out.println("Enter your code: ");
            customerCode = Input.nextLine();
            System.out.println("Enter your name: ");
            customerName = Input.nextLine();
            System.out.println("Enter your account number: ");
            accNumber = Input.nextInt();
            System.out.println("Enter your amount: ");
            amount = Input.nextLong();
        }while (accNumber<100000 || accNumber>101000 || customerCode.length()<5);
    }
    public void depositAndWithdraw(){
        long money;
        int type;
        Scanner Input = new Scanner(System.in);
        System.out.println("Choose the service you want: ");
        System.out.println("0.Deposit\t\t\t 1.Withdraw");
        type = Input.nextInt();
        System.out.println("Enter money: ");
        money = Input.nextLong();
        if (type==0){
            System.out.println("You choose deposit "+ money);
            amount +=  money;
            System.out.println("Your amount" + amount);
        }
        if (type==1){
            if (money>amount){
                System.out.println("non-sufficient money");
            }else if(money<=amount){
                System.out.println("You choose withdraw "+ money);
                amount -=  money;
                System.out.println("Your amount" + amount);
            }
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", accNumber=" + accNumber +
                ", amount=" + amount +
                '}';
    }
}
