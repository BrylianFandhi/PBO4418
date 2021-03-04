class TestSampleCircle{
    public static void main(String[] args){
        SapleCircle circle1=new SapleCircle();
        // circel1.radius=1;
        // tes.changeradius(25);
        System.out.println("area dengan radius:"+circle1.radius+" adalah: "+circle1.getArea());
        
        SapleCircle circle2 = new SapleCircle(20);
        System.out.println("area dengan radius:"+circle2.radius+" adalah: "+circle2.getArea());

    }
}

class SapleCircle {
    
    double radius = 1;
    SapleCircle(){
    }

    SapleCircle(double newRad){
        radius = newRad;
    }

    // double setRad(double newRad) {
    //     radius = newRad;
    // }
    double getArea() {
        return radius*radius*Math.PI;
    }
}

