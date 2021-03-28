/* Nama	: Brylian Fandhi safsalta
	NIM	: A11.2019.12169
	Kelompok : A11.4418 */

public class TestGame{
    public static void main(String[] args){
        GamePlayer test=new GamePlayer();
        test.setDimension(10, 10);
        test.setPosition(24, 32);
        System.out.println("position Player= "+test.getX()+","+test.getY());
        test.Run(30);
        GamePlayer test1=new GamePlayer();
        test1.setDimension(10, 32);
        test1.setPosition(10, 10);

        System.out.println("\n");
        GameEnemy monster=new GameEnemy();
        monster.setDimension(10, 32);
        monster.setPosition(10, 10);
        System.out.println("position Enemy= "+monster.getX()+","+monster.getY());
        monster.Run();
        
        System.out.println("_______________________________________________________________\n");
        GameEnvironment scane = new GameEnvironment();
        scane.addPlayer(test);
        scane.addPlayer(test);
        scane.addPlayer(test1);
        scane.getAllPlayer();
        scane.removePlayer(test);
        scane.getAllPlayer();
        scane.addEnemy(monster);
        scane.getAllEnemy();
        scane.Intraction();

    }
}