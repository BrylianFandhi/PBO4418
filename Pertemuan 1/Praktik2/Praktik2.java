import java.io.*;
import java.io.BufferedReader;
import java.util.Scanner;

/* Nama	: Brylian Fandhi safsalta
	NIM	: A11.2019.12169
	Kelompok : A11.4418 */

public class Praktik2 {
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setchannel();
        tv1.setvolume();

        System.out.println('\n');
        TV tv2 = new TV();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        TV tv3 = new TV();
        tv3.channelUp();
        tv3.channelUp();
        tv3.channelUp();
        tv3.channelUp();
        tv3.channelDown();
        tv3.channelUp();
        tv3.volumeUp();
        tv3.volumeUp();
        tv3.volumeUp();
        tv3.volumeDown();

        System.out.println("Tv1 is on channel:"+tv1.channel+" and volume level is: "+tv1.volumeLevel);
        System.out.println('\n');
        System.out.println("Tv2 is on channel:"+tv2.channel+" and volume level is:"+tv2.volumeLevel);
        System.out.println('\n');
        System.out.println("Tv3 is on channel:"+tv3.channel+" and volume level is:"+tv3.volumeLevel);
        tv3.turnOff();
    }
}

class TV {
    int channel,volumeLevel = 1;
    
    boolean TurnOn; 


    public TV(){
    }

    void turnOn(){
        TurnOn=true;
        System.out.println("Televisi On");
    }

    void turnOff(){
        System.out.println("Televisi Off");
    }

    void setchannel(){
        //to set the channel programm number
        Scanner setchan=new Scanner(System.in);
        System.out.print("Input the number of channel:");
        int c = setchan.nextInt();
        if (c<120){
            channel = c;
        } else if (c<1){
           c = 1;
           channel = c;
        } else {
           c = 120;
           channel = c;
        }
    }
    void setvolume(){
        //to set the channel programm number
        Scanner setvol=new Scanner(System.in);
        System.out.print("Input level of volume:");
        int v = setvol.nextInt();
        if (v<8){
            volumeLevel = v;
        } else if (v<1){
           v = 1;
           volumeLevel = v;
        } else {
           v = 8;
           volumeLevel = v;
        }
    }

    void channelUp(){
        channel++;
    }

    void channelDown(){
        channel--;
    }

    void volumeUp(){
        volumeLevel++;
    }

    void volumeDown(){
        volumeLevel--;
    }
}
