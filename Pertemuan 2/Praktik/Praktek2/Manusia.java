/* Nama	: Brylian Fandhi safsalta
	NIM	: A11.2019.12169
	Kelompok : A11.4418 */

class Manusia{
    private String nama = "noname";
    private boolean punyaTV = false;

    Manusia(){}

    Manusia(String nama){
        this.nama = nama;
    }

    public String namaSaya(){
        return nama;
    }

    public void beliTV(TV tiviku){
        punyaTV = true;
    }

    public void jualsemuaTV(){
        punyaTV=false;
    }

    public boolean cekTV(){
        return punyaTV;
    }
}
