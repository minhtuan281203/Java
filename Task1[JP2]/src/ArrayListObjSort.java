import java.util.*;

public class ArrayListObjSort {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("December",22));
        people.add(new Person("September",30));
        people.add(new Person("October",24));
        people.add(new Person("August",27));
        System.out.println("Person list: "+ people);
        //C1: sort people by their age
        people.sort((people1, people2) -> {
            return people1.getAge() - people2.getAge();
        });
        //C2:
        people.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Sort people by age: "+ people);

        //Sort by name = Collections.sort()
        Collections.sort(people, Comparator.comparing(Person::getName));
        System.out.println("Sort people bt name: "+ people);
    }
}
