public class TestAccount {
    public static void main(String[] args) {
        Account acc= new Account("acc1", "chicken solo", 500);
        System.out.println(acc.toString());
        System.out.println(acc.debit(5000));
    }
}
