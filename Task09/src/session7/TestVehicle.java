package session7;

public class TestVehicle{
    public static void main(String[] args) {
        FourWheeler objFour = new FourWheeler("Med-09", "Medseded", 4, true);
        objFour.showDetails();
        objFour.accelerate(200);

        FourWheel objFour2 = new FourWheel("La-00 Cs-123", "Toyoko", 4, true);
        objFour2.showDetails();
        objFour2.accelerate(250);
    }
}
