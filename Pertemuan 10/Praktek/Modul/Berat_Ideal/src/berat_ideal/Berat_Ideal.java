/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package berat_ideal;

import java.awt.*;
import java.awt.event.*;
/*  Nama    : Brylian Fandhi Safsalta
    NIM     : A11.2019.12169
    Kelompok: A11.4418
 */

/* Sumber referensi code dari tugas code dari PPT pertemuan 9 dan link tutorialnya*/
public class Berat_Ideal implements ActionListener{
    private Frame mainFrame;
    private Label headerLabel, Ni, Na, Be, Ti, cm, kg, ID, brt, ket;
    TextField tNIM,tNAMA,tBERAT,tTINGGI;  
    Button Cek1, Cek2;
    /**
     * @param args the command line arguments
     */
    
    void tamplate(){
        mainFrame = new Frame("Cek Ideal Berat Badan");
        mainFrame.setSize(500,400);
        mainFrame.setBackground(Color.LIGHT_GRAY);
        mainFrame.setLayout(new GridLayout(3,1));
        mainFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        
        headerLabel = new Label("Cek Ideal Berat");
        headerLabel.setBounds(170,60,150,20);
        headerLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
        /* Untuk set besar font dari:
        https://www.tutorialspoint.com/how-to-change-jlabel-size-in-java*/
        
        Ni = new Label("NIM");
        Ni.setBounds(70,120,50,20);
        tNIM = new TextField();
        tNIM.setBounds(150,120,250,20);
        
        Na = new Label("NAMA");
        Na.setBounds(70,150,50,20);
        tNAMA = new TextField();
        tNAMA.setBounds(150,150,250,20);
        
        Be = new Label("BERAT");
        Be.setBounds(70,180,50,20);
        tBERAT = new TextField();
        tBERAT.setBounds(150,180,150,20);
        kg = new Label("KG");
        kg.setBounds(305,180,150,20);
        
        Ti = new Label("TINGGI");
        Ti.setBounds(70,210,50,20);
        tTINGGI = new TextField();
        tTINGGI.setBounds(150,210,150,20);
        cm = new Label("CM");
        cm.setBounds(305,210,150,20);
        
        ket = new Label("Berdasarkan: ");
        ket.setBounds(70,250,90, 30);
        
        Cek1 = new Button("WHO (BMI)");
        Cek1.setBounds(170, 250, 100, 30);
        Cek1.addActionListener(this);
        
        Cek2 = new Button("Asia-Pacific (BMI)");
        Cek2.setBounds(280, 250, 120, 30);
        Cek2.addActionListener(this);
        
        ID = new Label("Isi Identitas");
        ID.setBounds(70, 300, 300, 30);
        ID.setFont(new Font("Verdana", Font.PLAIN, 14));
        brt = new Label("Isi Berat dan Tinggi");
        brt.setBounds(70, 320, 300, 30);
        brt.setFont(new Font("Verdana", Font.PLAIN, 14));
        
        
        mainFrame.add(headerLabel);
        mainFrame.add(Ni);
        mainFrame.add(tNIM);
        mainFrame.add(Na);
        mainFrame.add(tNAMA);
        mainFrame.add(Be);
        mainFrame.add(tBERAT);
        mainFrame.add(kg);
        mainFrame.add(Ti);
        mainFrame.add(tTINGGI);
        mainFrame.add(cm);
        mainFrame.add(ket);
        mainFrame.add(Cek1);
        mainFrame.add(Cek2);
        mainFrame.add(ID);
        mainFrame.add(brt);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) { 
        ID.setText(tNIM.getText()+", "+tNAMA.getText());
        String s1 = tBERAT.getText();  
        String s2 = tTINGGI.getText();  
        double a = Double.parseDouble(s1);  
        double b = Double.parseDouble(s2);  
        double c = 0,d = 0;
        d = (b*b/10000);
        c = a/d;
        if(e.getSource()== Cek1){  
            if(c<18.5){
                String result = String.valueOf(String.format("%.2f",c));
                brt.setText("Dengan hasil: "+result+" kamu termasuk Kurus");
            }else if(c>=18.5 & c<=24.9){  
                String result = String.valueOf(String.format("%.2f",c));
                brt.setText("Dengan hasil: "+result+" kamu termasuk Normal");  
            }else if(c>=25 & c<=29.9){  
                String result = String.valueOf(String.format("%.2f",c));
                brt.setText("Dengan hasil: "+result+" kamu termasuk Overweight");
            }else{
                String result = String.valueOf(String.format("%.2f",c));
                brt.setText("Dengan hasil: "+result+" kamu termasuk Obesitas");
            }
        }else if(e.getSource()== Cek2){  
            if(c<18.5){
                String result = String.valueOf(String.format("%.2f",c));
                brt.setText("Dengan hasil: "+result+" kamu termasuk Kurus");
            }else if(c>=18.5 & c<=22.9){  
                String result = String.valueOf(String.format("%.2f",c));
                brt.setText("Dengan hasil: "+result+" kamu termasuk Normal");  
            }else if(c>=23 & c<=24.9){  
                String result = String.valueOf(String.format("%.2f",c));
                brt.setText("Dengan hasil: "+result+" kamu termasuk Overweight");
            }else{
                String result = String.valueOf(String.format("%.2f",c));
                brt.setText("Dengan hasil: "+result+" kamu termasuk Obesitas");
            }
        }    
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Berat_Ideal demo = new Berat_Ideal();
        demo.tamplate();
    }
    
}
