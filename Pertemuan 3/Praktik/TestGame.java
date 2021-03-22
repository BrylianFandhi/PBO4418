/* Nama	: Brylian Fandhi safsalta
	NIM	: A11.2019.12169
	Kelompok : A11.4418 */

public class TestGame{
    public static void main(String[] args){
        GamePlayer test=new GamePlayer();
        test.setPosition(60,30);
        System.out.println("position X= "+test.getX());
        test.Run();
        test.Run(30);

        System.out.println("\n");
        GameEnemy test1=new GameEnemy();
        test1.setPosition(60,30);
        System.out.println("position X= "+test1.getX());
        test1.Run();
        
    }
}