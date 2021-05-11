import java.awt.*;
import java.awt.event.*;

/*  Nama    : Brylian Fandhi Safsalta
    NIM     : A11.2019.12169
    Kelompok: A11.4418 */

public class AwtControlDemo{
    //Property 
    private Frame mainFrame;
    private Label headerLabel;
    private Label statusLabel;
    private Panel controlPanel;

    private void prepareGUI(){
        mainFrame = new Frame("Ini Fandhi");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(3,1));
        mainFrame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new Label();
        headerLabel.setAlignment(Label.CENTER);
        statusLabel = new Label();
        statusLabel.setAlignment(Label.CENTER);
        statusLabel.setSize(350,100);

        controlPanel = new Panel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }

    private void showEventDemo(){
        headerLabel.setText("Control in action: Button");

        // Berguna sebagai penampilan tombol dan dapat melakukan aksi dari klik tombol tersebut
        Button okButton = new Button("OK");
        Button submitButton = new Button("Submit");
        Button cancelButton = new Button("Cancel");

        okButton.setActionCommand("ok");
        submitButton.setActionCommand("submit");
        cancelButton.setActionCommand("cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);

        // Pembuatan pemilihan suatu data atau benda dan dapat di submit atau tampil
        final Choice fruitChoice = new Choice();

      fruitChoice.add("Mangga");
      fruitChoice.add("Durian");
      fruitChoice.add("Jambu");
      fruitChoice.add("Semangka");

      Button showButton = new Button("Show");
      showButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {     
            String data = "Buah yang di pilih: " 
            + fruitChoice.getItem(fruitChoice.getSelectedIndex());
            statusLabel.setText(data);
         }
      }); 

      controlPanel.add(fruitChoice);
      controlPanel.add(showButton);
    
    //Pembuatan tampilan menu di bagian atas

        //create a menu bar
      final MenuBar menuBar = new MenuBar();

      //create menus
      Menu fileMenu = new Menu("File");
      Menu editMenu = new Menu("Edit"); 
      final Menu aboutMenu = new Menu("About");

      //create menu items
      MenuItem newMenuItem = 
         new MenuItem("New",new MenuShortcut(KeyEvent.VK_N));
      newMenuItem.setActionCommand("New");

      MenuItem openMenuItem = new MenuItem("Open");
      openMenuItem.setActionCommand("Open");

      MenuItem saveMenuItem = new MenuItem("Save");
      saveMenuItem.setActionCommand("Save");

      MenuItem exitMenuItem = new MenuItem("Exit");
      exitMenuItem.setActionCommand("Exit");

      MenuItem cutMenuItem = new MenuItem("Cut");
      cutMenuItem.setActionCommand("Cut");

      MenuItem copyMenuItem = new MenuItem("Copy");
      copyMenuItem.setActionCommand("Copy");

      MenuItem pasteMenuItem = new MenuItem("Paste");
      pasteMenuItem.setActionCommand("Paste");
   
      ButtonClickListener menuItemListener = new ButtonClickListener();

      newMenuItem.addActionListener(menuItemListener);
      openMenuItem.addActionListener(menuItemListener);
      saveMenuItem.addActionListener(menuItemListener);
      exitMenuItem.addActionListener(menuItemListener);
      cutMenuItem.addActionListener(menuItemListener);
      copyMenuItem.addActionListener(menuItemListener);
      pasteMenuItem.addActionListener(menuItemListener);

      final CheckboxMenuItem showWindowMenu = 
         new CheckboxMenuItem("Show About", true);
      showWindowMenu.addItemListener(new ItemListener() {
         public void itemStateChanged(ItemEvent e) {
            if(showWindowMenu.getState()){
               menuBar.add(aboutMenu);
            }else{
               menuBar.remove(aboutMenu);
            }
         }
      });

      //add menu items to menus
      fileMenu.add(newMenuItem);
      fileMenu.add(openMenuItem);
      fileMenu.add(saveMenuItem);
      fileMenu.addSeparator();
      fileMenu.add(showWindowMenu);
      fileMenu.addSeparator();
      fileMenu.add(exitMenuItem);

      editMenu.add(cutMenuItem);
      editMenu.add(copyMenuItem);
      editMenu.add(pasteMenuItem);

      //add menu to menubar
      menuBar.add(fileMenu);
      menuBar.add(editMenu);
      menuBar.add(aboutMenu);

      //add menubar to the frame
      mainFrame.setMenuBar(menuBar);
      mainFrame.setVisible(true);       
   }
    
    public static void main(String[] args){
        AwtControlDemo demo = new AwtControlDemo();
        demo.prepareGUI();
        demo.showEventDemo();
    }

    public class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            statusLabel.setText(e.getActionCommand() 
            + " MenuItem clicked.");
            if(command.equals("ok")){
                statusLabel.setText("OK Button terklik.");
            }else if(command.equals("submit")){
                statusLabel.setText("Submit Button terklik.");
            }else if(command.equals("cancel")) {
                statusLabel.setText("Cancel Button terklik.");
            }
        }   
    }
}