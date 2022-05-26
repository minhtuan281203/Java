import java.util.ArrayList;
import java.util.List;

public class AccessElementsDemo {
    public static void main(String[] args) {
        List<String> drink = new ArrayList<>();
        drink.add("lemon Tea");
        drink.add("Milktea");
        drink.add("faint silver");
        drink.add("Cappuccino");
        drink.add("Cafe");
        System.out.println("Length of AL is: "+drink.size());

//        for (String water: drink){
//            System.out.println(water);
//        };
        System.out.println("First drink: " + drink.get(0));
        System.out.println("Last drink: " + drink.get(drink.size()-1));

        drink.set(3, "Sugar water");
        System.out.println(drink);
    }
}
