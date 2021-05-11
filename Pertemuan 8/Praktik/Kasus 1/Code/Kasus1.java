import java.util.Scanner;
import java.util.ArrayList;
/*  Nama    : Brylian Fandhi Safsalta
    NIM     : A11.2019.12169
    Kelompok: A11.4418 */
    
class Kampus{
    public String matakuliah, mapel, setjdwl, namadosen, namamhs, nim, nip, matkulampu;
    public int nilaimatkulpokok;
    public int nilaimatkultambah;
    int nilaiakhir;
    ArrayList<String> dosen=new ArrayList<String>();
    public static ArrayList<ArrayList<String>> jadwal = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> mahasiswa = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> bina = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> ampu = new ArrayList<ArrayList<String>>();
    public static ArrayList<ArrayList<String>> mapelmhs = new ArrayList<ArrayList<String>>();

    public int set_nilaimatkulpokok(){
        Scanner inputnilai=new Scanner(System.in);
        System.out.print("Silahkan masukan nilai matakuliah pokok:");
        nilaimatkulpokok=inputnilai.nextInt();
        return nilaimatkulpokok;
    }

    public int set_nilaimatkultambah(){
        Scanner inputnilaitambah=new Scanner(System.in);
        System.out.print("\nSilahkan masukan nilai matakuliah pokok:");
        nilaimatkultambah=inputnilaitambah.nextInt();
        return nilaimatkultambah;
    }

    public int getnilaiakhir(){
        nilaiakhir=(((60/100)*nilaimatkulpokok)+((40/100)*nilaimatkultambah));
        return nilaiakhir;
    }

    public void  set_matakuliah(){
        this.matakuliah=matakuliah;
    }     
    public void set_namamhs(){
        Scanner inputmhs=new Scanner(System.in);
        System.out.print("\nSilahkan masukan nama Mahasiswa:");
        namamhs=inputmhs.nextLine();
        this.namamhs=namamhs;
    }

    public void set_nim(){
        Scanner inputmhs=new Scanner(System.in);
        System.out.print("\nSilahkan masukan nim anda:");
        nim=inputmhs.nextLine();
        this.nim=nim;
    }

    public void set_mapel(){
        Scanner inputmhs=new Scanner(System.in);
        System.out.print("\nSilahkan masukan Matakuliah yang ingin anda ambil:");
        mapel=inputmhs.nextLine();
        this.mapel=mapel;
    }


    public void set_namadosen(){
        Scanner inputdosen=new Scanner(System.in);
        System.out.print("\nSilahkan masukan Nama Dosen:");
        namadosen=inputdosen.nextLine();
        this.namadosen=namadosen;       
    }
    public void set_nip(){
        Scanner inputdosen=new Scanner(System.in);
        System.out.print("\nSilahkan masukan nip anda:");
        nip=inputdosen.nextLine();
        this.nip=nip;
    }

    public void set_matakuliahampu(){
        Scanner inputdata=new Scanner(System.in);
        System.out.print("\nSilahkan masukan Matakuliah yang anda ampu:");
        matkulampu=inputdata.nextLine();
        this.matkulampu=matkulampu;

    }

    public void get_datadosen(){
        System.out.println("_______________________________");
        System.out.println("Data Dosen:");
        for(int i=0; i < ampu.size(); i++){
                int x = i+1;
                System.out.println("Data ke-"+ x);
                System.out.println("Nama    : "+ampu.get(i).get(0));
                System.out.println("NIP     : "+ampu.get(i).get(1));
                System.out.println("Matkul yang di ampu: "+ampu.get(i).get(2));
                System.out.println("");
            }
        
    }

    public void set_dosenpengampu(){
        int p=ampu.size();
        
        set_namadosen();
        set_nip();
        set_matakuliahampu();
        ampu.add(new ArrayList<String>());
        ampu.get(p).add(0,namadosen);
        ampu.get(p).add(1,nip);
        ampu.get(p).add(2,matkulampu);
    }

    public void set_matakuliahmhs(){
        int p=mapelmhs.size();
        
        set_namamhs();
        set_nim();
        set_mapel();
        mapelmhs.add(new ArrayList<String>());
        mapelmhs.get(p).add(0,namamhs);
        mapelmhs.get(p).add(1,nim);
        mapelmhs.get(p).add(2,mapel);
    }

    public void get_listmhsampu(){
        for(int i=0; i < mapelmhs.size(); i++){
            for(int j=0; j < ampu.size(); j++){
                if(ampu.get(j).get(2).equals(mapelmhs.get(i).get(2))){
                    int p=bina.size();
                    bina.add(new ArrayList<String>());
                    bina.get(p).add(mapelmhs.get(i).get(0));
                } 
            }          
        }        
    }

    public void set_jadwal(){
        Scanner inputjadwal=new Scanner(System.in);
        System.out.print("Silahkan masukan Jadwal mengajar anda:");
        setjdwl=inputjadwal.nextLine();
        int p=jadwal.size();
            jadwal.add(new ArrayList<String>());
            jadwal.get(p).add(0,setjdwl);
    }  
}

class Mahasiswa extends Kampus{

    public void setmapelmhs(){
        super.set_matakuliahmhs();
    }

    public void getdatamhs(){
        System.out.println("Data Mahasiswa:"+super.mapelmhs);
    }

    public void get_jadwal(){
        if(super.mapelmhs.equals(super.matkulampu)){
            System.out.println("anda memiliki jadwal pada"+super.jadwal);
        }
    }    
}

class Matakuliah extends Kampus{
    String matakuliah;
    public void setmatkul(){
        super.set_matakuliah();
    }   
}

class Matakuliahpokok extends Matakuliah{
    ArrayList<String> matkulpokok=new ArrayList<String>();
    public void set_matakuliahpokok(String matakuliahpokok){
        matkulpokok.add(matakuliahpokok);
    }

    public void get_matkulpokok(){
        System.out.println("Matakuliah pokok:"+matkulpokok);
    }
}

class Matakuliahtambahan extends Matakuliah{
    ArrayList<String> matkultambahan=new ArrayList<String>();
    public void set_matkultambahan(String matkultambah){
        matkultambahan.add(matkultambah);
    }

    public void get_matkultambah(){
        System.out.println("Matakuliah Tambahan:"+matkultambahan);
    }
}

class Dosenpengampu extends Kampus{
    public void pengampu(){
        super.set_dosenpengampu();
    }
    
    public void get_mapelampu(){
        System.out.println("Daftar dosen dan matakuliah ampu:"+super.ampu);
    }
}

class Listmhsampu extends Kampus{
    public void setdsn(){
        super.set_dosenpengampu();
        super.set_jadwal();
        super.get_datadosen();
    }
    public void setmhs(){
        super.set_matakuliahmhs();
    }
    public void getmhsampu(){
        super.get_listmhsampu();
    }
    public void getlist(){
        if(super.bina.isEmpty()||super.mapel.equals(super.matkulampu)){
            for(int i=0; i < super.ampu.size(); i++){
                System.out.println("Mahasiswa Yang  diampu bapak/ibu "+super.ampu.get(i).get(0)+": ");
                System.out.println("_______________________________");
                for(int o=0; o < super.bina.size(); o++){
                    System.out.println("Nama: "+super.bina.get(o).get(0));
                    // System.out.println("NIM : "+super.bina.get(o).get(1)); // Masih Error
                }
                System.out.println("mahasiswa dapat mengikuti perkuliahan pada jam: "+super.jadwal.get(i).get(0));            
            }
        }
        else{  
            for(int i=0; i < super.jadwal.size(); i++){
         
                System.out.println("Mahasiswa Yang  diampu bapak/ibu "+super.ampu.get(i).get(0)+":"+super.bina.get(i).get(0));
                System.out.println("mahasiswa dapat mengikuti perkuliahan pada jam: "+super.jadwal.get(i).get(0));

            }
        }        
    }
}


public class Kasus1{
    public static void main(String args[]){
        Matakuliahpokok matakuliahpokok=new Matakuliahpokok();
        matakuliahpokok.set_matakuliahpokok("Basis Data");
        Matakuliahtambahan matakuliahtambah=new Matakuliahtambahan();
        matakuliahtambah.set_matkultambahan("PBO");
        Kampus campus=new Kampus();
        Listmhsampu cek=new Listmhsampu();
        cek.setdsn();
        // cek.setdsn();   
        matakuliahpokok.get_matkulpokok();
        matakuliahtambah.get_matkultambah();

        cek.setmhs();
        cek.setmhs();
        cek.getmhsampu();
        
        cek.getlist();
    }
} 