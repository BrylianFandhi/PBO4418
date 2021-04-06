package transportasi;

public class MotorVehicle extends Vehicle {
    int sizeOfEngine = 1;
    String licencePlate = "F 4 ND";

    // public void MotorVehicle(){}
    
    public void MotorVehicle(int sizeEng, String lcPlate){
        this.sizeOfEngine = sizeEng;
        this.licencePlate = lcPlate;
    }

    public int getSizeOfEngine(){
        return this.sizeOfEngine;
    }

    public String getLicencePlate(){
        return this.licencePlate;
    }

}