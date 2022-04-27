package session7;

public class FourWheeler extends Vehicle{
    private boolean powerSteer;

    public FourWheeler(String vID, String vName, int numWheel, boolean pSteer){
        vehicleNo=vID;
        vehicleName=vName;
        wheels=numWheel;
        powerSteer=pSteer;
    }

    public void showDetails(){
        System.out.println("Vehicle no:"+vehicleNo);
        System.out.println("Vehicle name:"+vehicleName);
        System.out.println("Number wheel:"+ wheels);
        if (powerSteer==true){
            System.out.println("Power Steer:Yes");
        }else {
            System.out.println("Power Steer:No");
        }
    }
}

