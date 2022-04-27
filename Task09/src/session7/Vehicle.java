package session7;

public class Vehicle {
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;

    public void accelerate(int speed){
        System.out.println("Acceleratint at: "+ speed+ "kmph");
    }
}
