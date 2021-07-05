/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
    
import View.Kalkulator;

/**
 *
 * @author bryli
 */
public class Control {
    Kalkulator Aframe;
    
    public Control(Kalkulator Aframe){
        this.Aframe = Aframe;
    }
    
    public void tambah(){
        double X,Y,Z;
        X = Integer.parseInt(Aframe.getTxtX().getText());
        Y = Integer.parseInt(Aframe.getTxtY().getText());
        Z = X+Y;
        Aframe.getHasil().setText(String.valueOf(Z));
    }
    
    public void kurang(){
        double X,Y,Z;
        X = Integer.parseInt(Aframe.getTxtX().getText());
        Y = Integer.parseInt(Aframe.getTxtY().getText());
        Z = X-Y;
        Aframe.getHasil().setText(String.valueOf(Z));
    }
    
    public void kali(){
        double X,Y,Z;
        X = Integer.parseInt(Aframe.getTxtX().getText());
        Y = Integer.parseInt(Aframe.getTxtY().getText());
        Z = X*Y;
        Aframe.getHasil().setText(String.valueOf(Z));
    }
    
    public void bagi(){
        double X,Y,Z;
        X = Integer.parseInt(Aframe.getTxtX().getText());
        Y = Integer.parseInt(Aframe.getTxtY().getText());
        Z = X/Y;
        Aframe.getHasil().setText(String.valueOf(Z));
    }
}
