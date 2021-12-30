package com.logging;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class LoggingHandler implements FocusListener, KeyListener, MouseListener,ActionListener {

    public LoggingHandler(){
        LoggingGUI.labelRegister.addMouseListener(this);
        LoggingGUI.fieldPassword.addFocusListener(this);
        LoggingGUI.fieldPassword.addKeyListener(this);
        LoggingGUI.fieldText.addFocusListener(this);
        LoggingGUI.fieldText.addKeyListener(this);
        LoggingGUI.loginButton.addFocusListener(this);
        LoggingGUI.loginButton.addActionListener(this);
        LoggingGUI.loginButton.addMouseListener(this);
        LoggingGUI.loginButton.addKeyListener(this);

    }

    @Override
    public void focusGained(FocusEvent e) {
        if (LoggingGUI.loginButton.equals(e.getSource())) {
            LoggingGUI.loginButton.setForeground(new Color(255, 238, 53));
            Border loginButton1 = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 238, 53));
            LoggingGUI.loginButton.setBorder(loginButton1);
        }else if (e.getSource().equals(LoggingGUI.fieldPassword)){
            String pass = String.valueOf(LoggingGUI.fieldPassword.getPassword());
            if(pass.trim().toLowerCase().equals("password")) {

                LoggingGUI.fieldPassword.setText("");
                LoggingGUI.fieldPassword.setForeground(Color.BLACK);
                LoggingGUI.fieldPassword.setFont(new Font("Arial",Font.PLAIN,18));
            }
            Border fieldPasswordBorder = BorderFactory.createMatteBorder(2,2,2,2,new Color(255, 238, 53));
            LoggingGUI.fieldPassword.setBorder(fieldPasswordBorder);
        }else if(e.getSource().equals(LoggingGUI.fieldText)){
            if(LoggingGUI.fieldText.getText().trim().toLowerCase().equals("username")){
                LoggingGUI.fieldText.setText("");
                LoggingGUI.fieldText.setForeground(Color.BLACK);
                LoggingGUI.fieldText.setFont(new Font("Arial",Font.PLAIN,18));
            }
            Border fieldTextBorder = BorderFactory.createMatteBorder(2 ,2,2,2,new Color(255, 238, 53));
            LoggingGUI.fieldText.setBorder(fieldTextBorder);
        }



    }

    @Override
    public void focusLost(FocusEvent e) {
        if(LoggingGUI.loginButton.equals(e.getSource())){
            LoggingGUI.loginButton.setForeground(new Color(0, 0, 0));
            Border loginButton1 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
            LoggingGUI.loginButton.setBorder(loginButton1);
        }else if (e.getSource().equals(LoggingGUI.fieldPassword)){
            String pass = String.valueOf(LoggingGUI.fieldPassword.getPassword());
            if(pass.trim().toLowerCase().equals("password")||
                    pass.trim().toLowerCase().equals("")){
                LoggingGUI.fieldPassword.setText("password");
                LoggingGUI.fieldPassword.setFont(new Font("Arial",Font.ITALIC,15));
                LoggingGUI.fieldPassword.setForeground(new Color(153, 167, 147));
            }


            LoggingGUI.fieldPassword.setBorder(null);
        }else if(e.getSource().equals(LoggingGUI.fieldText)){
            if(LoggingGUI.fieldText.getText().trim().toLowerCase().equals("username")||
                    LoggingGUI.fieldText.getText().trim().toLowerCase().equals("")){
                LoggingGUI.fieldText.setText("username");
                LoggingGUI.fieldText.setFont(new Font("Arial",Font.ITALIC,15));
                LoggingGUI.fieldText.setForeground(new Color(153, 167, 147));
            }
            LoggingGUI.fieldText.setBorder(null);
        }




    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {

            LoggingGUI.loginButton.doClick();

        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
if(e.getSource().equals(LoggingGUI.labelRegister)){
    LoggingGUI.newRegister();
}




    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
if(e.getSource().equals(LoggingGUI.loginButton))
{
    LoggingGUI.loginButton.setForeground(new Color(255, 238, 53));
    Border loginButton1 = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 238, 53));
    LoggingGUI.loginButton.setBorder(loginButton1);
}
else if(e.getSource().equals(LoggingGUI.labelRegister))
{
    LoggingGUI.labelRegister.setForeground(new Color(255, 238, 53));
}



    }

    @Override
    public void mouseExited(MouseEvent e) {
if(e.getSource().equals(LoggingGUI.loginButton)){
    LoggingGUI.loginButton.setForeground(new Color(0, 0, 0));
    Border loginButton1 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
    LoggingGUI.loginButton.setBorder(loginButton1);
}
else if(e.getSource().equals(LoggingGUI.labelRegister))
{
    LoggingGUI.labelRegister.setForeground(new Color(46, 44, 45));
}

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(LoggingGUI.loginButton)) {
            if (!LoggingGUI.fieldText.getText().equals("username")) {
               // LoggingGUI.login();                                 !!!      TO LOGIN IF IT IS VERIFY !!!!! but first add DATABASE TO mysql Connec !!!
            } else {
                JOptionPane.showMessageDialog(null, "Wrong username or password");
            }
        }





    }
}
