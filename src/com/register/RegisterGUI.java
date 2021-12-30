package com.register;

import com.decorate.*;
import com.logging.*;
import com.mysql.Connec;

import javax.swing.*;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterGUI extends JFrame {

    public  static JFrame frame ;
    public static  JPanel backgroundPanel;
    public static JPanel decorate;
    public static JPanel labelPanel;
    public static JLabel labelClose;
    public static JLabel labelMaximize;
    public static JLabel labelMinimize;
    public static JPanel mainPanel;
    public static JPanel minimizePanel;
    public static JPanel closePanel;
    public static JPanel maximizePanel;
    public static JTextField fieldTextUserName;
    public static JTextField fieldTextName;
    public static JTextField fieldTextSurname;
    public static JTextField fieldTextMail;
    public static JPasswordField fieldPassword;
    public static JPasswordField fieldPassword1;
    public static JLabel labelTitles;
    public static JLabel labelTitle;
    public static JButton buttonRegister;
    public static JButton buttonCancel;




public RegisterGUI (){
    frame = new JFrame();
    frame.setUndecorated(true);
    frame.setBackground(new Color(213,213,23));
    frame.setLayout(null);
    frame.setSize(400,600);
    frame.setVisible(true);
    frame.setTitle("MF_Register");
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);
    frame.setIconImage(new ImageIcon(getClass().getResource("/iconfolder/icon/IconTheme.png")).getImage());
  //  frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconfolder/decorate/Icon123.png")));



    new Decorate(frame,400);
    getFieldTextName();
    getLabelTitle();
    getFieldPassword();
    getButtonRegister();
    getButtonCancel();
    getLabelTitles("Name", 50);
    getLabelTitles("Surname",100);
    getLabelTitles("Username",150);
    getLabelTitles("E-Mail",200);
    getLabelTitles("Password",250);
    getLabelTitles("Retry Pas",300);


    getLabelPanel(50);
    getLabelPanel(100);
    getLabelPanel(150);
    getLabelPanel(200);
    getLabelPanel(250);
    getLabelPanel(300);


    getFieldTextMail();
    getFieldPassword1();
    getFieldTextSurname();
    getFieldTextUserName();
    getLabelPanel(30,80,340,390,true);
    getMainPanel();
    getBackgroundPanel();


}

    public  void getMainPanel (){
        mainPanel = new JPanel();
        mainPanel.setBounds(5,5,390,590);
        mainPanel.setBackground(new Color(23, 21, 22));
        frame.add(mainPanel);
    }
    public void getBackgroundPanel(){
        backgroundPanel = new JPanel();
        backgroundPanel.setBounds(0,0,400,600);
        backgroundPanel.setBackground(new Color(213,213,23));
        frame.add(backgroundPanel);
    }

    public void getFieldTextName(){
        fieldTextName = new JTextField("name");
        fieldTextName.setFont(new Font("Arial",Font.ITALIC,14));
        fieldTextName.setForeground(new Color(181, 197, 174));
        fieldTextName.setBounds(150,80+50+50,210,30);
        frame.add(fieldTextName);
    }
    public void getFieldTextSurname(){
        fieldTextSurname = new JTextField("surname");
        fieldTextSurname.setFont(new Font("Arial",Font.ITALIC,14));
        fieldTextSurname.setForeground(new Color(181, 197, 174));
        fieldTextSurname.setBounds(150,130+50+50,210,30);
        frame.add(fieldTextSurname);
    }
    public void getFieldTextUserName(){
        fieldTextUserName = new JTextField("username");
        fieldTextUserName.setFont(new Font("Arial",Font.ITALIC,14));
        fieldTextUserName.setForeground(new Color(181, 197, 174));
        fieldTextUserName.setBounds(150,180+50+50,210,30);
        frame.add(fieldTextUserName);
    }
    public void getFieldTextMail(){
        fieldTextMail = new JTextField("example@xxx.xx");
        fieldTextMail.setFont(new Font("Arial",Font.ITALIC,14));
        fieldTextMail.setForeground(new Color(181, 197, 174));
        fieldTextMail.setBounds(150,230+50+50,210,30);
        frame.add(fieldTextMail);
    }
    public void getFieldPassword (){
        fieldPassword = new JPasswordField("password");
        fieldPassword.setFont(new Font("Arial",Font.ITALIC,15));
        fieldPassword.setForeground(new Color(181, 197, 174));
        fieldPassword.setBounds(150,230+50+50+50,210,30);
        frame.add(fieldPassword);
    }
    public void getFieldPassword1 (){
        fieldPassword1 = new JPasswordField("password");
        fieldPassword1.setFont(new Font("Arial",Font.ITALIC,15));
        fieldPassword1.setForeground(new Color(181, 197, 174));
        fieldPassword1.setBounds(150,280+50+50+50,210,30);
        frame.add(fieldPassword1);
    }
    public void getLabelPanel(int y){
        labelPanel = new JPanel();
        labelPanel.setBounds(38,130+y,100,30);
        labelPanel.setBackground(new Color(46, 44, 45));
        frame.add(labelPanel);
    }
    public void getLabelPanel(int x ,int y, int width ,int height,boolean other){
        labelPanel = new JPanel();


        labelPanel.setBounds(x,y,width,height);
        labelPanel.setBackground(new Color(30, 28, 29));
        frame.add(labelPanel);
    }

    public void getLabelTitles(String string,int y){
        labelTitles = new JLabel(string);
        labelTitles.setBounds(45,132+y,120,26);

        labelTitles.setFont(new Font("Arial",Font.PLAIN,12));
        labelTitles.setForeground(new Color(255, 238, 53));
        frame.add(labelTitles);
    }
    public void getLabelTitle(){
        labelTitle = new JLabel("New Register");

        labelTitle.setBounds(100,120,200,31);

        labelTitle.setFont(new Font("Arial",Font.BOLD,30));
        labelTitle.setForeground(new Color(255, 238, 53));
        frame.add(labelTitle);
    }
    public void getButtonRegister(){

    buttonRegister = new JButton("Register");
    buttonRegister.setFont(new Font("Arial",Font.PLAIN,20));
    buttonRegister.setForeground(Color.BLACK);

    buttonRegister.setBackground(new Color(46, 44, 45));
    buttonRegister.setBounds(220,500,150,40);
    frame.add(buttonRegister);
    }
    public void getButtonCancel(){

        buttonCancel = new JButton("Cancel");
        buttonCancel.setFont(new Font("Arial",Font.PLAIN,20));
        buttonCancel.setForeground(Color.BLACK);
        buttonCancel.setBackground(new Color(46, 44, 45));
        buttonCancel.setBounds(30,500,150,40);
        frame.add(buttonCancel);
    }

    public static void register(){
        String username = RegisterGUI.fieldTextUserName.getText();
        String name = RegisterGUI.fieldTextName.getText();
        String surname = RegisterGUI.fieldTextSurname.getText();
        String mail = RegisterGUI.fieldTextMail.getText();
        String password = String.valueOf(RegisterGUI.fieldPassword.getPassword());



        try {
            if(Verify.BlanksFulledAndPasswordIsCorrect()){
                if (Verify.userExist(username)) {
                    PreparedStatement st;
                    ResultSet rs;



                    // String query = "INSERT INTO  all_users (Username,Password,Name,Surname,Mail) VALUES (?,?,?,?,?)";
                    st = Connec.getConnection().prepareStatement("INSERT INTO  UserInformations (Username,Password,Name,Surname,Mail) VALUES (?,?,?,?,?)");

                    st.setString(1, username);
                    st.setString(2, password);
                    st.setString(3, name);
                    st.setString(4, surname);
                    st.setString(5, mail);
                    st.execute();

                    st = Connec.getConnection().prepareStatement("INSERT INTO  Snake (Username,Login) VALUES (?,?)");
                    st.setString(1,username);
                    st.setString(2, "true");
                    st.execute();





                    JOptionPane.showMessageDialog(null, "Your account has been created", "Succesful!!", 2);

                    Thread.sleep(1000);
                    RegisterGUI.frame.dispose();
                    LoggingGUI.frame.setVisible(true);


                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
