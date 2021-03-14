/* Nama	: Brylian Fandhi safsalta
	NIM	: A11.2019.12169
	Kelompok : A11.4418 */

public class TestTV {
    public static void main(String[] args){
        Manusia man1 = new Manusia("Brylian Fandhi Safsalta");
        System.out.println(man1.namaSaya());

        TV TVKU = new TV();
        System.out.println(man1.cekTV());
        man1.beliTV(TVKU);
        System.out.println(man1.cekTV());
        man1.jualsemuaTV();
        System.out.println(man1.cekTV());
    }
}

class TV {
    public TV(){
    }
}