public class Account {
    String id, name;
    int balance=0;
    public Account(String id, String name){
        this.id=id;
        this.name=name;
    }
    public Account(String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        return balance + amount;
    }
    public int debit(int amount){
        if(amount <= balance){
            balance -= amount;
        }else {
            System.out.println("amount exceeded");
        }
        return balance;
    }
    public String toString(){
        return "Account[id= "+ id+ ", name= "+ name+ ", balance= "+ balance+ "]";
    }
}
