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
public class TextField2 extends Frame implements ActionListener{  
    private Label headerLabel, x, y, z;
    TextField tf1,tf2,tf3;  
    Button b1,b2;  
    TextField2(){
        headerLabel = new Label("Kalkulator Sederhana");
        headerLabel.setBounds(75,60,150,20);
        x = new Label("X");
        x.setBounds(50,100,10,20);
        tf1 = new TextField();  
        tf1.setBounds(75,100,150,20);  
        y = new Label("Y");
        y.setBounds(50,150,10,20);
        tf2 = new TextField();  
        tf2.setBounds(75,150,150,20);  
        z = new Label("Hasil");
        z.setBounds(30,200,40,20);
        tf3 = new TextField();  
        tf3.setBounds(75,200,150,20);  
        tf3.setEditable(false);   
        b1 = new Button("+");  
        b1.setBounds(50,250,50,50);  
        b2 = new Button("-");  
        b2.setBounds(120,250,50,50);  
        b1.addActionListener(this);  
        b2.addActionListener(this);
        add(headerLabel);
        add(x);
        add(tf1);
        add(y);
        add(tf2);
        add(z);
        add(tf3);
        add(b1);
        add(b2);  
        setSize(300,350);  
         
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        setLayout(null);  
        setVisible(true);  
    }         
    public void actionPerformed(ActionEvent e) { 
        String s1 = tf1.getText();  
        String s2 = tf2.getText();  
        int a = Integer.parseInt(s1);  
        int b = Integer.parseInt(s2);  
        int c = 0;  
        if(e.getSource()== b1){  
            c = a+b;  
        }else if(e.getSource()== b2){  
            c = a-b;  
        }  
        String result = String.valueOf(c);  
        
        tf3.setText(result);  
    }  
public static void main(String[] args) {  
    new TextField2();  
}  
}  
