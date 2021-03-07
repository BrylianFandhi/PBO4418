class TestSimpleCircle{
    public static void main(String[] args){
        SimpleCircle circle1=new SimpleCircle();
        // circel1.radius=1;
        // tes.changeradius(25);
        System.out.println("Area dengan radius:"+circle1.radius+" adalah: "+circle1.getArea());
        
        SimpleCircle circle2 = new SimpleCircle(20);
        System.out.println("Area dengan radius:"+circle2.radius+" adalah: "+circle2.getArea());

        SimpleCircle circle3 = new SimpleCircle(35);
        System.out.println("Area dengan radius:"+circle3.radius+" adalah: "+circle3.getArea());

        SimpleCircle circle4 = new SimpleCircle(225);
        System.out.println("Area dengan radius:"+circle4.radius+" adalah: "+circle4.getArea());

    }
}

class SimpleCircle {
    
    double radius = 1;
    SimpleCircle(){
    }

    SimpleCircle(double newRad){
        radius = newRad;
    }

    // double setRad(double newRad) {
    //     radius = newRad;
    // }
    double getArea() {
        return radius*radius*Math.PI;
    }
}

