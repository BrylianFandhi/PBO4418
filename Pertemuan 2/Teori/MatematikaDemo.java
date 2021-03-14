import java.io.*;
import java.io.BufferedReader;
import java.util.Scanner;

public class MatematikaDemo{
    public static void main(String[] args){
        Matematika s1 = new Matematika(); 
        s1.pertambahan();
        s1.pengurangan();
        s1.perkalian();
        s1.pembagian();
    }
}

class Matematika{
    double x,y;
    double h;
    Scanner setangka=new Scanner(System.in);
    Matematika(){
    }
    void pertambahan(){
        System.out.println("Pertambahan");
        System.out.print("Angka ke-1: ");
        x = setangka.nextInt();
        System.out.print("Angka ke-2: ");
        y = setangka.nextInt();
        h = x + y;
        System.out.println("Pertambahan: "+x+" + "+y+" = "+h);
    }
    
    void pengurangan(){
        System.out.println("Pengurangan");
        System.out.print("Angka ke-1: ");
        x = setangka.nextInt();
        System.out.print("Angka ke-2: ");
        y = setangka.nextInt();
        h = x-y;
        System.out.println("Pengurangan: "+x+" - "+y+" = "+h);
    }

    void perkalian(){
        System.out.println("Perkalian");
        System.out.print("Angka ke-1: ");
        x = setangka.nextInt();
        System.out.print("Angka ke-2: ");
        y = setangka.nextInt();
        h = x*y;
        System.out.println("Perkalian: "+x+" x "+y+" = "+h);
    }

    void pembagian(){
        System.out.println("Pembagian");
        System.out.print("Angka ke-1: ");
        x = setangka.nextInt();
        System.out.print("Angka ke-2: ");
        y = setangka.nextInt();
        h = x/y;
        System.out.println("Pembagian: "+x+" / "+y+" = "+h);
    }
}