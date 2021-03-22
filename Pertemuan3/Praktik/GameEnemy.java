/* Nama	: Brylian Fandhi safsalta
	NIM	: A11.2019.12169
	Kelompok : A11.4418 */

public class GameEnemy{
    private double width,height;
    private int positionX, positionY;

    public GameEnemy(){}

    public GameEnemy(double width, double height){
        this.width=width;
        this.height=height;
    }

    public GameEnemy(double width,double height,int positionX,int positionY){
        this.width=width;
        this.height=height;
        this.positionY=positionY;
        this.positionX=positionX;
    }

    //Method setDimension merupakan setter untuk property width dan height.
    public void setDimension(double width,double height){
        this.width=width;
        this.height=height;
    }

    //Method setPosition merupakan setter untuk property positionX dan positionY.
    public void setPosition(int positionX,int positionY){
        this.positionY=positionY;
        this.positionX=positionX;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public int getX(){
        return positionX;
    }

    public int getY(){
        return positionY;
    }

    public void Run(){
        System.out.println("Enemy is running");
    }

}
