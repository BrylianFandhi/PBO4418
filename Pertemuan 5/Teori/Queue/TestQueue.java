import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Data{
    Queue<String> queue= new LinkedList<>();
    String buah;
    public static Scanner input = new Scanner(System.in);
    
    Data(){
    }

    public Data(String buah){
        this.buah = buah;
    }

    public void Buah(){
        System.out.print("Input buah: ");
        buah = input.nextLine();
    }

    public void cetak(){
        System.out.println("Output Queue: "+queue);
    }
}

class ToQueue extends Data{
    Scanner cari = new Scanner(System.in);

    public void TambahQueue(){
        super.Buah();
        queue.add(buah);
    }

    public void KurangQueue(){
        String s = queue.poll();
        System.out.println("Data yang dihapus: "+s);
    }

    public void EditQueue(){
        String qq = queue.peek();
        queue.remove(qq);
        System.out.println("Edit data paling depan");
        super.Buah();
        queue.add(buah);
    }

    public void Elementbawah(){
        String p = queue.peek();
        System.out.println("Head queue adalah "+p);
    }

    public void ukuran(){
        int o = queue.size();
        System.out.print("Ukuran data: "+o);
    }
}

public class TestQueue{
    public static void main(String args[]){
        ToQueue ne = new ToQueue();
        ne.TambahQueue();
        ne.TambahQueue();
        ne.TambahQueue();
        ne.cetak();
        ne.Elementbawah();
        ne.KurangQueue();
        ne.cetak();
        ne.EditQueue();
        ne.cetak();
        ne.ukuran();
    }
}