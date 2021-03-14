import java.io.*;
import java.io.BufferedReader;
import java.util.Scanner;

public class MobilDemo2{
    public static void main(String[] args) {
        Mobil2 mobil1 = new Mobil2();
        mobil1.hidupkanMobil();
        mobil1.ubahGigi();
        mobil1.matikanMobil();
    }
}

class Mobil2{
    boolean hidupkan;
    int Gigi;
    InputStreamReader cin = null;

    public Mobil2(){
    }

    void hidupkanMobil(){
        hidupkan = true;
        System.out.println("Mobil menyala");
    }
    
    void matikanMobil(){
        System.out.println("Mobil mati, silahkan keluar");
    }

    void ubahGigi() {
        Gigi = 0;
        int co = 0;
        System.out.println("1. Ready to move (N)\n2. Gigi UP\n3. Gigi Down\n4. Mundur\n5. Engine off");
        do {
            Scanner ce=new Scanner(System.in);
            System.out.print("Input sesuai nomor: ");
            int c = ce.nextInt();
            if (c==1){
                Gigi = 0;
                System.out.println("Gigi = N");
            }else if (c==2){
                Gigi++;
                System.out.println("Gigi = "+Gigi);
            }else if (c==3){
                
                if (Gigi <= 1){
                    System.out.println("Gigi = N");
                }else{
                    Gigi--;
                    System.out.println("Gigi = "+Gigi);
                }
                
            }else if (c==4){
                Gigi=0;
                System.out.println("Mundur");
            }else{
                Gigi=0;
                co++;
            }
        } while(co < 1); //Looping
    }
}