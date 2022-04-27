package session6;

public class TestStaticMb {
    public static void main(String[] args) {
        System.out.println("iam the main method");
        staticMember.staticMethod();

        staticMember objStatic1 = new staticMember();
        objStatic1.displayCount();

        staticMember objStatic2 = new staticMember();
        objStatic2.displayCount();

        staticMember objStatic3 = new staticMember();
        objStatic3.displayCount();
    }
}
