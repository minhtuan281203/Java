package session6;

public class staticMember {
    public static int staticCounter = 0;
    int instanceCounter = 0;
    static {
        System.out.println("I'm static block");
    }

    public static void staticMethod() {
        System.out.println("I'm static method");
    }

    public void displayCount(){
        staticCounter++;
        instanceCounter++;
        System.out.println("\nstatic counter: "+staticCounter);
        System.out.println("instance counter: "+instanceCounter);
    }
}
