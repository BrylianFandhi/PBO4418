import java.io.*;
import java.io.BufferedReader;
import java.util.Scanner;

/* Nama	: Brylian Fandhi safsalta
	NIM	: A11.2019.12169
	Kelompok : A11.4418 */
    
public class TestTV {
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
        //Sebagai tanda
        System.out.println("Televisi On");
    }

    void turnOff(){
        //Sebagai tanda
        System.out.println("Televisi Off");
    }

    void setchannel(){
        //to set the channel programm number
        Scanner setchan=new Scanner(System.in);
        System.out.print("Input the number of channel:");
        int c = setchan.nextInt();
        //Saya memberikan kondisi agar sesuai dengan ketentuan
        if (c<120){
            //Kondisi batas atas
            channel = c;
        } else if (c<1){
            //Kondisi batas bawah, yang dimana jika kurang dari 1 makan output berniai 1 (minimum)
           c = 1;
           channel = c;
        } else {
            //Kondisi melebihi batas, yang dimana jika lebih dari 120 makan output berniai 120 (maksimum)
           c = 120;
           channel = c;
        }
    }
    void setvolume(){
        //to set the Volume programm number
        Scanner setvol=new Scanner(System.in);
        System.out.print("Input level of volume:");
        int v = setvol.nextInt();
        //Saya memberikan kondisi agar sesuai dengan ketentuan
        if (v<8){
            //Kondisi batas atas
            volumeLevel = v;
        } else if (v<1){
            //Kondisi batas bawah, yang dimana jika kurang dari 1 makan output berniai 1 (minimum)
           v = 1;
           volumeLevel = v;
        } else {
            //Kondisi melebihi batas, yang dimana jika lebih dari 8 makan output berniai 8 (maksimum)
           v = 8;
           volumeLevel = v;
        }
    }

    void channelUp(){
        // Tambah channel 1 per 1
        channel++;
    }

    void channelDown(){
        // Kurang channel 1 per 1
        channel--;
    }

    void volumeUp(){
        // Tambah Volume 1 per 1
        volumeLevel++;
    }

    void volumeDown(){
        // Kurang Volume 1 per 1
        volumeLevel--;
    }
}