public class TestWhileLoop {
    public static void main(String[] args) {
        int num=1;
        int product=0;
        while (num<5){
            product=num*10;
            System.out.println("\n %d *10= %d are"+ num +" "+ product);
            num++;
        }
        System.out.println("Outside the loop");
    }
}
