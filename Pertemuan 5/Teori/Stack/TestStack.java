import java.util.Stack;
import java.util.Scanner;

class Data{
    Stack<Integer> stk= new Stack<>();
    int tahun;
    public static Scanner input = new Scanner(System.in);
    
    Data(){
    }

    public Data(int tahun){
        this.tahun = tahun;
    }

    public void Tahun(){
        System.out.print("Input tahun: ");
        tahun = input.nextInt();
    }

    public void cetak(){
        System.out.println("Output stack: "+stk);
    }
}

class ToStack extends Data{
    Scanner cari = new Scanner(System.in);

    public void TambahStack(){
        super.Tahun();
        stk.push(tahun);
    }

    public void KurangStack(){
        int s = stk.pop();
        System.out.println("Data yang dihapus: "+s);
    }

    public void EditStack(){
        stk.pop();
        System.out.println("Edit tumpukan paling atas");
        super.Tahun();
        stk.push(tahun);
    }

    public void ElementTeratas(){
        int p = stk.peek();
        System.out.println("Tumpukan teratas adalah "+p);
    }

    public void isEmpty(){
        boolean result = stk.empty();
        System.out.println("Is the stack empty? " + result);
    }

    public void posisi(){
        System.out.print("Search posisi data: ");
        int o = cari.nextInt();
        int position = stk.search(o);
        System.out.println("Position of "+o+" : " + position);
    }
}

public class TestStack{
    public static void main(String args[]){
        ToStack ne = new ToStack();
        ne.TambahStack();
        ne.TambahStack();
        ne.TambahStack();
        ne.ElementTeratas();
        ne.cetak();
        ne.KurangStack();
        ne.cetak();
        ne.EditStack();
        ne.cetak();
        ne.posisi();
    }
}