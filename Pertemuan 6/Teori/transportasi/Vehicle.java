package transportasi;

public class Vehicle {
    double speed = 0;
    String color = "Orange";

    public void Vehicle(){}

    public void goStraight(){
        System.out.println("Maju..");
    }

    public void turnLeft() {
        System.out.println("Belok kiri");
    }

    public void turnRight() {
        System.out.println("Belok kanan");
    }
}