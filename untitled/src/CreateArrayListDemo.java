import java.util.ArrayList;
import java.util.List;

public class CreateArrayListDemo {
    public static void main(String[] args) {
        List<String> vehicle = new ArrayList<>();
        vehicle.add("Car");
        vehicle.add("Motorbike");
        vehicle.add("Planes");
        vehicle.add("Bicycle");
        System.out.println(vehicle);
        vehicle.add(3, "Container");
        System.out.println(vehicle);
    }
}
