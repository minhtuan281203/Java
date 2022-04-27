package session6;

public class finalDemo {
    float PI=3.14F;

    public void display(float pi){
        PI=pi;
        System.out.println("Value of PI is:" +PI);
    }

    public static void main(String[] args) {
        final finalDemo objFinalDemo = new finalDemo();
        objFinalDemo.display(22.7F);
    }
}
