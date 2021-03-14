import java.io.*;
import java.util.Scanner;

class BukuDemo{
    public static void main(String[] args){
        
        System.out.println("Buku 1 ");
        Buku buku1 = new Buku("Pemrograman Berbasis Objek dengan Java","Indrajani","Elexmedia Komputindo",2007);
        // buku1.Judul();
        // buku1.Pengarang();
        // buku1.Penerbit();
        // buku1.Tahun();
        buku1.cetakBuku();

        System.out.println("\n______________________");
        System.out.println("Buku 2");
        Buku buku2 = new Buku("Dasar Pemrograman Java","Abdul Kadir","Andi Offset",2004);
        // buku2.Judul();
        // buku2.Pengarang();
        // buku2.Penerbit();
        // buku2.Tahun();
        buku2.cetakBuku();
    }
}
class Buku {
    String Judul, Pengarang, Penerbit;
    int Tahun;
    // Scanner Inp=new Scanner(System.in);
    Buku(String JudulBuku, String PengarangBuku, String PenerbitBuku, int TahunBuku){
        Judul = JudulBuku;
        Pengarang = PengarangBuku;
        Penerbit = PenerbitBuku;
        Tahun = TahunBuku;
        }

// Jika ingin input secara manual buka coment di bawah dan atas lalu Hapus atau coment yang tidak diperlukan

/*  
    Buku(){

    }

    void Judul(){
        System.out.print("Input judul: ");
        Judul = Inp.nextLine();
    }

    void Pengarang(){
        System.out.print("Input Pengarang: ");
        Pengarang = Inp.nextLine();
    }

    void Penerbit(){
        System.out.print("Input Penerbit: ");
        Penerbit = Inp.nextLine();
    }

    void Tahun(){
        System.out.print("Input Tahun: ");
        Tahun = Inp.nextInt();
    }
*/

    void cetakBuku(){
        System.out.println("---------------------");
        System.out.println("Judul       : "+Judul);
        System.out.println("Pengarang   : "+Pengarang);
        System.out.println("Penerbit    : "+Penerbit);
        System.out.println("Tahun       : "+Tahun);
    }
}