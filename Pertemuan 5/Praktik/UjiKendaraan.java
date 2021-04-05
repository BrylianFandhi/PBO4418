package Praktik;

public class UjiKendaraan {
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

        MotorVehicle motor2 = new MotorVehicle(7,"S 484 R");
        motor2.goStraight();
        System.out.println("Size of engine: " + motor2.getSizeOfEngine());
        System.out.println("Licence plate: " + motor2.getLicencePlate());


    }
}