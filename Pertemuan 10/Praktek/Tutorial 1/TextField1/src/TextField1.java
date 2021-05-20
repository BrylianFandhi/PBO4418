/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryli
 */

/*  Nama    : Brylian Fandhi Safsalta
    NIM     : A11.2019.12169
    Kelompok: A11.4418
 */

import java.awt.*; 
import java.awt.event.*;
public class TextField1{  
public static void main(String args[]){  
    Frame f= new Frame("My Java AWT _BFS_");  
    f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    TextField t1,t2;  
    t1=new TextField("Welcome to My Java AWT");  
    t1.setBounds(50,150, 200,30);  
    t2=new TextField("AWT Tutorial 1");  
    t2.setBounds(50,250, 200,30);  
    f.add(t1); 
    f.add(t2);  
    f.setSize(400,450);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
}  
