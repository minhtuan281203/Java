import java.util.ArrayList;
import java.util.List;

public class CreateALFromCollection {
    public static void main(String[] args) {
        List<Integer> firstThreeEvenNumbers = new ArrayList<>();
        firstThreeEvenNumbers.add(2);
        firstThreeEvenNumbers.add(4);
        firstThreeEvenNumbers.add(6);

        List<Integer> firstSixEvenNumbers = new ArrayList<>(firstThreeEvenNumbers);
        System.out.println(firstSixEvenNumbers);

        List<Integer> nextThreeEvenNumbers = new ArrayList<>();
        nextThreeEvenNumbers.add(8);
        nextThreeEvenNumbers.add(10);
        nextThreeEvenNumbers.add(12);
        System.out.println(nextThreeEvenNumbers);

        firstSixEvenNumbers.addAll(nextThreeEvenNumbers);
        System.out.println(firstSixEvenNumbers);
    }
}
