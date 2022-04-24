public class TestDoWhileLoop {
    public static void main(String[] args) {
        int sum=0, num=1;
        do{
            sum+=num;
            num++;
        }while (num<=10);
        System.out.println("Sum 10 of number " + sum);
    }
}
