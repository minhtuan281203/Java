package session7;

public class FourWheel extends Vehicle{
    private boolean powerSteer;

    public FourWheel(String vID, String vName, int numWheel, boolean pSteer){
        super();
        powerSteer=pSteer;
    }
    public void showDetails(){
        System.out.println("\nVehicle no:"+ vehicleNo);
        System.out.println("Vehicle name:"+vehicleName);
        System.out.println("Number wheel:"+ wheels);
        if (powerSteer==true){
            System.out.println("Power Steer:Yes");
        }else {
            System.out.println("Power Steer:No");
        }
    }
    public void accelerate(int speed){
        super.accelerate(speed);
        System.out.println("Acceleratint at: "+ speed+ "kmph");
    }
}
