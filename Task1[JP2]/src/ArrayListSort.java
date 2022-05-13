import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListSort { // not understand
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jenifer");
        names.add("Mark");
        names.add("David");
        System.out.println("Name: "+ names);

        names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        names.sort((o1, o2) -> o1.compareTo(o2));
        names.sort(Comparator.naturalOrder());
        System.out.println("Sort names: "+ names);
    }
}
