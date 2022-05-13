import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");
        System.out.println("Name array contain: "+ names.contains("Alice")); // tim kiem ptu co trong mang hay k

        System.out.println("indexOf steve: "+ names.indexOf("Steve"));
        System.out.println("indexOf Mark: "+ names.indexOf("Mark"));

        System.out.println("lastIndexOf john: " + names.lastIndexOf("John"));
        System.out.println("lastIndexOf bill: " + names.lastIndexOf("Bill"));


    }
}
