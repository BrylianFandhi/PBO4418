import praktik.*;

public class UjiKendaraan {
    public static void kendaraanMelaju(Vehicle vehicle){
        vehicle.goStraight();
    }

    public static void main(String[] args) {
        Vehicle vihacle1 = new Vehicle();
        vihacle1.goStraight();
        vihacle1.turnLeft();
        vihacle1.turnLeft();

        System.out.println();
        
        Bicycle bicycle1 = new Bicycle();
        bicycle1.goStraight();
        bicycle1.ringBell();
        
        System.out.println();
        
        MotorVehicle motor1 = new MotorVehicle();
        motor1.goStraight();
        System.out.println("Size of engine: " + motor1.getSizeOfEngine());
        System.out.println("Licence plate: " + motor1.getLicencePlate());
        
        System.out.println();

        // MotorVehicle motor2 = new MotorVehicle(7,"S 484 R");
        // motor2.goStraight();
        // System.out.println("Size of engine: " + motor2.getSizeOfEngine());
        // System.out.println("Licence plate: " + motor2.getLicencePlate());

        MotorCycle motor3 = new MotorCycle();
        motor3.setGearFoot(7);
        System.out.println("Gear of motor3: " + motor3.getGearFoot());
        
        System.out.println();

        Car motor4 = new Car();
        motor4.setSeatBelt(0);
        System.out.println("Use sealbelt: " + motor4.getSeatBelt());
        motor4.setSeatBelt(1);
        System.out.println("Use sealbelt: " + motor4.getSeatBelt());
        
        System.out.println();
        kendaraanMelaju(new Vehicle());
        kendaraanMelaju(new Bicycle());
        kendaraanMelaju(new MotorVehicle());
    }

    // public static KendaraanMelaju(){
    //     vihacle1.goStraight();
    // }
}