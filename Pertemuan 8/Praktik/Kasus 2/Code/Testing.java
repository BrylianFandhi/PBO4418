import java.util.*;
import java.io.*;
import java.lang.*;

/*  Nama    : Brylian Fandhi Safsalta
    NIM     : A11.2019.12169
    Kelompok: A11.4418 */

class Harpindo{
    public static ArrayList<ArrayList<String>> Pelanggan = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> Sedan = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> Minibus = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> Bus = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> Urus = new ArrayList<ArrayList<String>>();
    public static ArrayList<String> JmlHrg = new ArrayList<String>();
    Scanner input = new Scanner(System.in);
    static String umur, nama, harga, noID, warna, typecar;

    public void IDKonsumen(){
        this.umur=umur;
        this.nama=nama;
        this.noID=noID;
    } 

    public void IDkaryawan(){
        this.umur=umur;
        this.nama=nama;
        this.noID=noID;
    }
}

class IDConsumen extends Harpindo{
    public String Umur(){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Input umur: ");
        umur = input1.nextLine();
        return umur;
    }

    public String Identitas(){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Input Nomor Idensitas (KTP): ");
        noID = input1.nextLine();
        return noID;
    }

    public String Nama(){
        Scanner input1 = new Scanner(System.in);
        System.out.print("Input Nama: ");
        nama = input1.nextLine();
        return nama;
    }    
}

class InCus extends IDConsumen{
    InCus(){
    }

    public void Pembelian(){
        int z = Pelanggan.size();
        z+=1;
        System.out.println("\nInput ke-"+ z);
        super.Nama();
        super.Umur();
        super.Identitas();

        int p = Pelanggan.size();
        Pelanggan.add(new ArrayList<String>());
        Pelanggan.get(p).add(0, umur);
        Pelanggan.get(p).add(1, nama);
        Pelanggan.get(p).add(2, noID);
        System.out.print("Pilihan:\n 1. Sedan, 2. Minibus, 3. Bus\nPilih: ");
        int jns = input.nextInt();
        if (jns==1){
            System.out.println("\nCetak data Kendaraan sedan");
            System.out.println("_____________________________");
                
            for(int i=0; i < Sedan.size(); i++){
                int x = i+1;
                System.out.println("Data ke-"+ x);
                System.out.println("Type Kendaraan: "+Sedan.get(i).get(0));
                System.out.println("Warna     : "+Sedan.get(i).get(1));
                System.out.println("Harga     : "+Sedan.get(i).get(2));
                System.out.println("");
            }
            int i=0;
            while(i < 1){
                System.out.println("Pilih:\n 1. Tambah, 2. Stop");
                int ingin = input.nextInt();
                if(ingin==1){
                    System.out.print("Pilih sesuai angka kode urutan data\nPilih: ");
                    int pil = input.nextInt();
                    for(int k=0; k<Sedan.get(pil-1).size(); k++){
                    Pelanggan.get(p).add(3, Sedan.get(pil-1).get(k));    
                    }
                    JmlHrg.add(Sedan.get(pil-1).get(2));
                }else{
                    i = 10;
                }
            }
        }else if (jns==2){
            System.out.println("\nCetak data Kendaraan MiniBus");
            System.out.println("_____________________________");
                
            for(int i=0; i < Minibus.size(); i++){
                int x = i+1;
                System.out.println("Data ke-"+ x);
                System.out.println("Type Kendaraan: "+Minibus.get(i).get(0));
                System.out.println("Warna     : "+Minibus.get(i).get(1));
                System.out.println("Harga     : "+Minibus.get(i).get(2));
                System.out.println("");
            }
            int i=0;
            while(i < 1){
                System.out.println("Pilih:\n 1. Tambah, 2. Stop");
                int ingin = input.nextInt();
                if(ingin==1){
                    System.out.print("Pilih sesuai angka kode urutan data\nPilih: ");
                    int pil = input.nextInt();
                    for(int k=0; k<Minibus.get(pil-1).size(); k++){
                    Pelanggan.get(p).add(3, Minibus.get(pil-1).get(k));    
                    }
                    JmlHrg.add(Minibus.get(pil-1).get(2));
                }else{
                    i = 10;
                }
            }
        }else if (jns==3){
            System.out.println("\nCetak data Kendaraan Bus");
            System.out.println("_____________________________");
                
            for(int i=0; i < Bus.size(); i++){
                int x = i+1;
                System.out.println("Data ke-"+ x);
                System.out.println("Type Kendaraan: "+Bus.get(i).get(0));
                System.out.println("Warna     : "+Bus.get(i).get(1));
                System.out.println("Harga     : "+Bus.get(i).get(2));
                System.out.println("");
            }
            int i=0;
            while(i < 1){
                System.out.print("\nPilih:\n 1. Beli, 2. Selesai\n Pilih sesuai angka: ");
                int ingin = input.nextInt();
                if(ingin==1){
                    System.out.print("Pilih sesuai angka kode urutan data\nInput data ke: ");
                    int pil = input.nextInt();
                    for(int k=0; k<Bus.get(pil-1).size(); k++){
                    Pelanggan.get(p).add(3, Bus.get(pil-1).get(k));    
                    }
                    JmlHrg.add(Bus.get(pil-1).get(2));
                }else{
                    i = 10;
                }
            }
        }
    }
}

class Cetak extends IDConsumen{
    public void cetak(){
            System.out.println("\nCetak semua data");
            System.out.println("_____________________________");
            
        for(int i=0; i < Pelanggan.size(); i++){
            int x = i+1;
            System.out.println("Data ke-"+ x);
            System.out.println("Nama     : "+Pelanggan.get(i).get(0));
            System.out.println("Umur     : "+Pelanggan.get(i).get(1));
            System.out.println("ID       : "+Pelanggan.get(i).get(2));
            System.out.println("");           
        }
    }
}

class IDKaryawan extends Harpindo{
    IDKaryawan(){}

    public String Umur(){
        System.out.print("Input umur: ");
        umur = input.nextLine();
        return umur;
    }

    public String Identitas(){
        System.out.print("Input Nomor Idensitas Kerja: ");
        noID = input.nextLine();
        return noID;
    }

    public String Nama(){
        System.out.print("Input Nama: ");
        nama = input.nextLine();
        return nama;
    }

    public void set2D(){   
        int z = Urus.size();
        z+=1;
        System.out.println("\nInput ke-"+ z);
        Nama();
        Umur();
        Identitas();
        // super.Beli(int n);

        int p = Urus.size();
        Urus.add(new ArrayList<String>());
        Urus.get(p).add(0, nama);
        Urus.get(p).add(1, umur);
        Urus.get(p).add(2, noID);
    }

    public void untung(){
        int z0 = 0;
        for(int i = 0; i<JmlHrg.size(); i++){
            String z2 = JmlHrg.get(i);
            int z1 = Integer.parseInt(z2);
            z0 = z0 + z1;
        }
        System.out.println("Untung 10% untuk karyawan sebesar:"+(z0*0.1));
    }
}

class Car extends IDKaryawan{
    Car (){
    }

    public void inSedan(int b){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("\nMasukkan Kendaraan sedan yang akan di jual");
        for(int i=0; i<b; i++){
            int z = Sedan.size();
            z+=1;
            System.out.println("Input ke-"+ z);
            System.out.print("Input Type Kendaraan: ");
            typecar = input1.nextLine();
            System.out.print("Input warna Kendaraan: ");
            warna = input2.nextLine();
            System.out.print("Input harga Kendaraan: ");
            harga = input.nextLine();
            int p = Sedan.size();
            Sedan.add(new ArrayList<String>());
            Sedan.get(p).add(0, typecar);
            Sedan.get(p).add(1, warna);
            Sedan.get(p).add(2, harga);
        }
    }

    public void inMinibus(int b){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("\nMasukkan minibus yang akan di jual");
        for(int i=0; i<b; i++){
            int z = Minibus.size();
            z+=1;
            System.out.println("Input ke-"+ z);
            System.out.print("Input Type Kendaraan: ");
            typecar = input1.nextLine();
            System.out.print("Input warna Kendaraan: ");
            warna = input2.nextLine();
            System.out.print("Input harga Kendaraan: ");
            harga = input.nextLine();
            int p = Minibus.size();
            Minibus.add(new ArrayList<String>());
            Minibus.get(p).add(0, typecar);
            Minibus.get(p).add(1, warna);
            Minibus.get(p).add(2, harga);
        }
    }

   public void inBus(int b){
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
       System.out.println("\nMasukkan Bus yang akan di jual");
        for(int i=0; i<b; i++){
            int z = Bus.size();
            z+=1;
            System.out.println("Input ke-"+ z);
            System.out.print("Input Type Kendaraan: ");
            typecar = input1.nextLine();
            System.out.print("Input warna Kendaraan: ");
            warna = input2.nextLine();
            System.out.print("Input harga Kendaraan: ");
            harga = input.nextLine();
            int p = Bus.size();
            Bus.add(new ArrayList<String>());
            Bus.get(p).add(0, typecar);
            Bus.get(p).add(1, warna);
            Bus.get(p).add(2, harga);
        }
    } 

    
}

class Cetak3 extends Car{
    public void cetakSDN(){
        System.out.println("\nCetak data Kendaraan sedan");
        System.out.println("_____________________________");
            
        for(int i=0; i < Sedan.size(); i++){
            int x = i+1;

            System.out.println("Data ke-"+ x);
            System.out.println("Type Kendaraan: "+Sedan.get(i).get(0));
            System.out.println("Warna     : "+Sedan.get(i).get(1));
            System.out.println("Harga     : "+Sedan.get(i).get(2));
            System.out.println("");
        }
    }    

    public void cetakMB(){
        System.out.println("\nCetak data Kendaraan Minibus");
        System.out.println("_____________________________");
            
        for(int i=0; i < Minibus.size(); i++){
            int x = i+1;

            System.out.println("Data ke-"+ x);
            System.out.println("Type Kendaraan: "+Minibus.get(i).get(0));
            System.out.println("Warna     : "+Minibus.get(i).get(1));
            System.out.println("Harga     : "+Minibus.get(i).get(2));
            System.out.println("");
        }
    }  

    public void cetakB(){
        System.out.println("\nCetak data Kendaraan Bus");
        System.out.println("_____________________________");
            
        for(int i=0; i < Bus.size(); i++){
            int x = i+1;

            System.out.println("Data ke-"+ x);
            System.out.println("Type Kendaraan: "+Bus.get(i).get(0));
            System.out.println("Warna     : "+Bus.get(i).get(1));
            System.out.println("Harga     : "+Bus.get(i).get(2));
            System.out.println("");
        }
    }

    public void cetaksemua(){
        cetakSDN();
        cetakMB();
        cetakB();
    }        
}

class Edithrg extends Cetak3{
    Scanner input1 = new Scanner(System.in);
    public void ubah(){
        System.out.println("Semua karyawan=");
        for(int i=0; i < Urus.size(); i++){
            int x = i+1;
            System.out.println(x+". "+Urus.get(i).get(0));
        }
        System.out.print("\nPilih siapa yang ingin mengubah harga dengan menyantumkan angka: ");
        int plh = input.nextInt();
        System.out.print("\n1. Sedan, 2.MiniBus, 3.Bus\nPilih: ");
        int plh2 = input.nextInt();
        if (plh2==1){
            super.cetakSDN();
            System.out.println(Urus.get(plh-1).get(0)+" Ingin mengubah harga sedan");
            System.out.print("\nMasukkan nomor data (angka) untuk mengubah harga: ");
            int plh3 = input.nextInt();
            System.out.println("Type Kendaraan: "+Sedan.get(plh3-1).get(0));
            System.out.println("Warna     : "+Sedan.get(plh3-1).get(1));
            System.out.println("Harga awal    : "+Sedan.get(plh3-1).get(2));
            System.out.print("\nMenjadi: ");
            harga = input1.nextLine();
            Sedan.get(plh3-1).set(2, harga);
            System.out.println("Harga akhir    : "+Sedan.get(plh3-1).get(2));
        }else if (plh2==2){
            super.cetakMB();
            System.out.println(Urus.get(plh-1).get(0)+" Ingin mengubah harga Minibus");
            System.out.print("\nMasukkan nomor data (angka) untuk mengubah harga: ");
            int plh3 = input.nextInt();
            System.out.println("Type Kendaraan: "+Minibus.get(plh3-1).get(0));
            System.out.println("Warna     : "+Minibus.get(plh3-1).get(1));
            System.out.println("Harga awal    : "+Minibus.get(plh3-1).get(2));
            System.out.print("\nMenjadi: ");
            harga = input1.nextLine();
            Minibus.get(plh3-1).set(2, harga);
            System.out.println("Harga akhir    : "+Minibus.get(plh3-1).get(2));
        }else if (plh2==3){
            super.cetakB();
            System.out.println(Urus.get(plh-1).get(0)+" Ingin mengubah harga Bus");
            System.out.print("\nMasukkan nomor data (angka) untuk mengubah harga: ");
            int plh3 = input.nextInt();
            System.out.println("Type Kendaraan: "+Bus.get(plh3-1).get(0));
            System.out.println("Warna     : "+Bus.get(plh3-1).get(1));
            System.out.println("Harga awal    : "+Bus.get(plh3-1).get(2));
            System.out.print("\nMenjadi: ");
            harga = input1.nextLine();
            Bus.get(plh3-1).set(2, harga);
            System.out.println("Harga akhir    : "+Bus.get(plh3-1).get(2));
        }               
    }
}

class Cetak2 extends IDKaryawan{
    public void cetak(){
        System.out.println(Urus);
        System.out.println("\nCetak semua data");
          
        for(int i=0; i < Urus.size(); i++){
            int x = i+1;
            System.out.println("_____________________________");
            System.out.println("Data ke-"+ x);
            System.out.println("Nama     : "+Urus.get(i).get(0));
            System.out.println("Umur     : "+Urus.get(i).get(1));
            System.out.println("ID Karyawan: "+Urus.get(i).get(2));
            System.out.println("");
            
        }
    }
}

class CetakS extends Harpindo{
    public void cetak(){
        System.out.println("\nCetak semua data");
        
            
        for(int i=0; i < Pelanggan.size(); i++){
            System.out.println("_____________________________");
            if(Pelanggan.get(i).size()>5){
                System.out.println("Data borong");
                System.out.println("Nama     : "+Pelanggan.get(i).get(0));
                System.out.println("Umur     : "+Pelanggan.get(i).get(1));
                System.out.println("ID       : "+Pelanggan.get(i).get(2));
                int x=3;
                System.out.println("Kendaraan yang dibeli:");
                int z9=0;
                while( x < Pelanggan.get(i).size()){
                    int y = x;
                    System.out.println("\nType Kendaraan: "+Pelanggan.get(i).get(y+2));
                    System.out.println("Warna     : "+Pelanggan.get(i).get(y+1));
                    System.out.println("Harga     : "+Pelanggan.get(i).get(y));
                    String z2 = Pelanggan.get(i).get(y);
                    int z1 = Integer.parseInt(z2);
                    z9 = z9 + z1;
                    x=x+3;
                }
                System.out.println("\nTotal harga: "+z9);
            }else{
                System.out.println("Data satuan");
                System.out.println("Nama     : "+Pelanggan.get(i).get(0));
                System.out.println("Umur     : "+Pelanggan.get(i).get(1));
                System.out.println("ID       : "+Pelanggan.get(i).get(2));
                System.out.println("Kendaraan yang dibeli:");
                System.out.println("Type Kendaraan: "+Pelanggan.get(i).get(3));
                System.out.println("Warna     : "+Pelanggan.get(i).get(4));
                System.out.println("Harga     : "+Pelanggan.get(i).get(5));
            }
            System.out.println("");           
        }
    }
}

public class Testing{
    public static void main(String args[]){
        IDKaryawan n1 = new IDKaryawan();
        System.out.println("Input Data karyawan");
        n1.set2D();
        n1.set2D();
        Cetak2 s1 = new Cetak2();
        s1.cetak();

        Car n2 = new Car();
        n2.inSedan(1);
        n2.inMinibus(1);
        n2.inBus(1);
        Cetak3 s2 = new Cetak3();
        s2.cetaksemua();

        Edithrg n3 = new Edithrg();
        n3.ubah();

        InCus n = new InCus();
        System.out.println("\nInput Data Pelanggan");
        n.Pembelian();
        n.Pembelian();
        Cetak s = new Cetak();
        s.cetak();

        CetakS s0 = new CetakS();
        s0.cetak();
        n1.untung();
	}
}