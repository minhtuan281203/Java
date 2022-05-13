import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollection {
    public static void main(String[] args) {
        List<Integer> firstFiveNtNumber = new ArrayList<>();
        firstFiveNtNumber.add(2);
        firstFiveNtNumber.add(3);
        firstFiveNtNumber.add(5);
        firstFiveNtNumber.add(7);
        firstFiveNtNumber.add(11);
        System.out.println(firstFiveNtNumber);

        List<Integer> firstTenNtNumber = new ArrayList<>(firstFiveNtNumber);
        List<Integer> nextFiveNtNumber = new ArrayList<>();
        nextFiveNtNumber.add(13);
        nextFiveNtNumber.add(17);
        nextFiveNtNumber.add(19);
        nextFiveNtNumber.add(23);
        nextFiveNtNumber.add(29);
        System.out.println(nextFiveNtNumber);
        firstTenNtNumber.addAll(nextFiveNtNumber);
        System.out.println(firstTenNtNumber);
    }
}
