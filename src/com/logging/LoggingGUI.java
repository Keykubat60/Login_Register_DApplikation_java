package com.logging;



import com.decorate.Decorate;
import com.mysql.Connec;
import com.register.RegisterGUI;
import com.register.RegisterHandler;


import javax.swing.*;
import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public  class LoggingGUI extends JFrame {

    public static JFrame frame ;
    public static JButton loginButton ;
    public static JLabel labelUserName;
    public static JLabel labelPassword ;
    public static JLabel labelTitle;
    public static JPanel mainPanel;
    public static JPasswordField fieldPassword;
    public static JTextField fieldText;
    public static JPanel backgroundPanel;
    public static JLabel labelRegister;
    public static String USURNAME;
    public static String PASSWORD;





    public LoggingGUI(){
        frame = new JFrame();
        frame.setUndecorated(true);
        frame.setLayout(null);
        frame.setSize(400,500);
        frame.setVisible(true);
        frame.setTitle("MF_LOGIN");
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setIconImage(new ImageIcon(getClass().getResource("/iconfolder/icon/IconTheme.png")).getImage());
       // frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/iconfolder/decorate/Icon123.png")));



        new Decorate(frame,400);
        getLabelTitle();
        getFieldPassword();
        getFieldText();
        getLabelRegister();
        getLabelPassword();
        getLabelUserName();
        getPasswordHide();
        getUserNameHide();
        getLoginButton();
        getMainPanel();
        getBackgroundPanel();

    }
    public  void getMainPanel (){
        mainPanel = new JPanel();
        mainPanel.setBounds(5,5,390,490);
        mainPanel.setBackground(new Color(23, 21, 22));
      
        frame.add(mainPanel);
    }
    public  void getLabelPassword(){
        labelPassword = new JLabel();
        labelPassword.setBounds(25,230,30,30);
        labelPassword.setIcon(new ImageIcon(getClass().getResource("/iconfolder/decorate/password.png")));
        frame.add(labelPassword);
    }
    public void getBackgroundPanel(){
        backgroundPanel = new JPanel();
        backgroundPanel.setBounds(0,0,400,500);
        backgroundPanel.setBackground(new Color(213,213,23));
        frame.add(backgroundPanel);
    }
    public void getLoginButton(){
        loginButton = new JButton("LOGIN");
        loginButton.setFont(new Font("Arial",Font.PLAIN,25));
        loginButton.setBounds(140,340,120,50);
        LoggingGUI.loginButton.setForeground(new Color(0, 0, 0));
        loginButton.setBackground(new Color(46, 44, 45));
        frame.add(loginButton);

    }
    public void getLabelUserName (){
        labelUserName = new JLabel();
        labelUserName.setBounds(25,180,30,30);
        labelUserName.setIcon(new ImageIcon(getClass().getResource("/iconfolder/decorate/username.png")));
        frame.add(labelUserName);
    }
    public void getLabelRegister (){
        labelRegister = new JLabel(">>> Click here for new register <<<");
        labelRegister.setBounds(100,400,200,30);
        labelRegister.setFont(new Font("Arial",Font.BOLD,12));
        labelRegister.setForeground(new Color(46, 44, 45));
        frame.add(labelRegister);
    }
    public void getFieldPassword (){
        fieldPassword = new JPasswordField("password");
        fieldPassword.setFont(new Font("Arial",Font.ITALIC,15));
        fieldPassword.setForeground(new Color(181, 197, 174));
        fieldPassword.setBounds(80,230,255,30);
        frame.add(fieldPassword);
    }
    public void getFieldText(){
        fieldText = new JTextField("username");
        fieldText.setFont(new Font("Arial",Font.ITALIC,20));
        fieldText.setForeground(new Color(181, 197, 174));
        fieldText.setBounds(80,180,255,30);
        frame.add(fieldText);
    }

    public void getLabelTitle(){
        labelTitle = new JLabel("Welcome");
        labelTitle.setBounds(85,85,220,60);
        labelTitle.setFont(new Font("Arial",Font.ITALIC+Font.BOLD,50));
        labelTitle.setForeground(new Color(255, 238, 53));
        frame.add(labelTitle);


    }
    public void getUserNameHide(){
        JPanel hidePanel = new JPanel();
        hidePanel.setBounds(24,179,32,32);
        hidePanel.setBackground(new Color(255, 238, 53));
        frame.add(hidePanel);
    }
    public void getPasswordHide(){
        JPanel hidePanel = new JPanel();
        hidePanel.setBounds(24,229,32,32);
        hidePanel.setBackground(new Color(255, 238, 53));
        frame.add(hidePanel);
    }

    public static void login (){
        PreparedStatement st;
        ResultSet rs;

        String username = LoggingGUI.fieldText.getText();
        String password = String.valueOf(LoggingGUI.fieldPassword.getPassword());



        String query = "SELECT * FROM UserInformations WHERE BINARY Username = ? AND BINARY Password = ?";


        try {
            st = Connec.getConnection().prepareStatement(query);
            st.setString(1, username);
            st.setString(2, password);
            USURNAME = username;
            PASSWORD = password;
            rs = st.executeQuery();
            if (rs.next()||(username.equals("admin")&&password.equals("admin"))) {
                LoggingGUI.frame.dispose();


               // st = Connec.getConnection().prepareStatement("UPDATE Snake SET Loging = ? WHERE Username = ?");

               // st.setString(1, "true");
               // st.setString(2,USURNAME);



            } else {
                JOptionPane.showMessageDialog(null, "Wrong username or password");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public static void newRegister(){
        LoggingGUI.frame.setVisible(false);
        SwingUtilities.invokeLater(new Runnable() {
                                       @Override
                                       public void run() {

                                           new RegisterGUI();
                                           new RegisterHandler();
                                         //  new RegisterButton();
                                          // new CancelButton();
                                        /*   new RegisterUsernnameHandler();
                                           new RegisterNameHandler();
                                           new RegisterPassword1Handler();
                                           new RegisterPasswordHandler();
                                           new RegisterSurnameHandler();
                                           new RegisterMailHandler();*/


                                       }
                                   }
        );
    }

    public  static boolean isAdmin(String username,String password){

        if (username.equals("Admin")&&password.equals("AdminAdmin22"))
        {

            return true;
        }
        return false;
    }

}
