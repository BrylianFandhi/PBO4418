import java.util.*; 
import java.util.Scanner;

class Data{
    public static ArrayList<ArrayList<String>> addData = new ArrayList<ArrayList<String>>();
    Scanner input = new Scanner(System.in);
    public String nim, nama, umur, kelompok;
    
    Data(){
    }
    public Data(String nama, String nim, String umur, String kelompok){
        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.kelompok = kelompok;
    }

    public String Nim(){
        System.out.print("Input NIM: ");
        nim = input.nextLine();
        return nim;
    }

    public String Nama(){
        System.out.print("Input Nama: ");
        nama = input.nextLine();
        return nama;
    }

    public String Umur(){
        System.out.print("Input Umur: ");
        umur = input.nextLine();
        return umur;
    }

    public String Kelompok(){
        System.out.print("Input Kelompok: ");
        kelompok = input.nextLine();
        System.out.println("");
        return kelompok;
    }

    void setALL(){
        Nim();
        Nama();
        Umur();
        Kelompok();
    }
    
    public void cetak(){
        // for (String i : addData) {
        //     System.out.println(i);
        // }
        System.out.println(addData);
            System.out.println("\nCetak semua data");
            System.out.println("_____________________________");
            
        for(int i=0; i < addData.size(); i++){
            int x = i+1;

            System.out.println("Data ke-"+ x);
            System.out.println("NIM     : "+addData.get(i).get(0));
            System.out.println("Nama    : "+addData.get(i).get(1));
            System.out.println("Umur    : "+addData.get(i).get(2));
            System.out.println("Kelompok: "+addData.get(i).get(3));
            System.out.println("");
            
        }
    }
}

class Bio extends Data{
    public Bio(){

    }

    public void set2D(int z){
    //     addData.add(setaja());
        // addData.add(new ArrayList<String>(Arrays.asList(nim, nama, umur, kelompok)));
        // int z;
        System.out.println("Input ke-"+ z);
        super.Nim();
        super.Nama();
        super.Umur();
        super.Kelompok();

        int p = addData.size();
        addData.add(new ArrayList<String>());
        addData.get(p).add(0, nim);
        addData.get(p).add(1, nama);
        addData.get(p).add(2, umur);
        addData.get(p).add(3, kelompok);
    
    }

    public void hapus(){
        System.out.println("Hapus pada data ke-1");
        addData.remove(0);
    }

    public void editNIM(){
        System.out.print("Edit NIM pada data ke-1 = ");
        String newNIM = input.nextLine();
        addData.get(0).set(0, newNIM);
        System.out.println("_____________________________-");
    }
}

public class TestArrayList{
    public static void main(String args[]){
        Bio ne = new Bio();
        ne.set2D(1);
        ne.set2D(2);
        ne.cetak();
        ne.hapus();
        ne.cetak();
        ne.editNIM();
        ne.cetak();
	}
}