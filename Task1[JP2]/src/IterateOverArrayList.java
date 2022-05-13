import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayList {
    public static void main(String[] args) {
        List<String> tvShow = new ArrayList<>();
        tvShow.add("Cooking");
        tvShow.add("Game");
        tvShow.add("Friend");
        tvShow.add("Prison");
        System.out.println("=== Using forEach===");  //lap tuan tu
        tvShow.forEach(tvlocal -> {
            System.out.println(tvlocal);
        });

        System.out.println("=== Using iterator===");
        Iterator<String> tvShowIterator = tvShow.iterator();
        while (tvShowIterator.hasNext()) {
            String tv = tvShowIterator.next();  // lay ptu dau tien
            System.out.println(tv);
        }

        System.out.println("=== Using listIterator ===");
        ListIterator<String> tvShowListIterator = tvShow.listIterator(tvShow.size());
        while (tvShowListIterator.hasPrevious()){
            String tv = tvShowListIterator.previous();  // lay ptu cuoi cung
            System.out.println(tv);
        }

        System.out.println("=== Using forEach loop===");
        for (String tv: tvShow){
            System.out.println(tv);
        }

        System.out.println("=== Using loop with index==="); //lap nhay coc
        for (int i=0; i<tvShow.size(); i++){
            System.out.println(tvShow.get(i));
        }
    }
}
