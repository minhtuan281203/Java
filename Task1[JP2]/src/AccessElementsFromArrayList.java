import java.util.ArrayList;
import java.util.List;

public class AccessElementsFromArrayList {
    public static void main(String[] args) {
        List<String> topCompanies = new ArrayList<>();
        System.out.println("Is this ArrayList list empty? " + topCompanies.isEmpty() );

        topCompanies.add("Google");
        topCompanies.add("Facebook");
        topCompanies.add("Tiktok");
        topCompanies.add("Instagram");
        topCompanies.add("Zalo");
        System.out.println(topCompanies);
        System.out.println("The size of this ArrayList: "+ topCompanies.size());
        System.out.println("First element :"+ topCompanies.get(0));
        System.out.println("Second element :"+ topCompanies.get(1));
        System.out.println("Last element :"+ topCompanies.get(topCompanies.size()-1));

        topCompanies.set(4, "my dog");
        System.out.println("Modified ArrayList: "+ topCompanies);

    }
}
