/* Nama	: Brylian Fandhi safsalta
	NIM	: A11.2019.12169
	Kelompok : A11.4418 */

class TestSimpleCircle{
    public static void main(String[] args){
        SimpleCircle circle1=new SimpleCircle();
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
        // Mengubah radius awal
        radius = newRad;
    }

    double getArea() {
        // Perhitungan area
        return radius*radius*Math.PI;
    }
}

