package praktik;

public class MotorCycle extends MotorVehicle{
    private int numGear = 0;

    public MotorCycle(){
    }

    public void setGearFoot(int numGear){
        this.numGear = numGear;
    }

    public int getGearFoot(){
        return numGear;
    }
}