package com.register;

import com.logging.LoggingGUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class RegisterHandler implements MouseListener, FocusListener, ActionListener,KeyListener{

public RegisterHandler(){

    RegisterGUI.buttonCancel.addFocusListener(this);
    RegisterGUI.buttonCancel.addMouseListener(this);
    RegisterGUI.buttonCancel.addKeyListener(this);
    RegisterGUI.buttonRegister.addActionListener(this);
    RegisterGUI.buttonRegister.addFocusListener(this);
    RegisterGUI.buttonRegister.addMouseListener(this);
    RegisterGUI.buttonRegister.addKeyListener(this);
    RegisterGUI.fieldTextMail.addFocusListener(this);
    RegisterGUI.fieldTextMail.addKeyListener(this);
    RegisterGUI.fieldTextName.addFocusListener(this);
    RegisterGUI.fieldTextName.addKeyListener(this);
    RegisterGUI.fieldPassword1.addFocusListener(this);
    RegisterGUI.fieldPassword1.addKeyListener(this);
    RegisterGUI.fieldPassword.addFocusListener(this);
    RegisterGUI.fieldPassword.addKeyListener(this);
    RegisterGUI.fieldTextSurname.addFocusListener(this);
    RegisterGUI.fieldTextSurname.addKeyListener(this);
    RegisterGUI.fieldTextUserName.addFocusListener(this);
    RegisterGUI.fieldTextUserName.addKeyListener(this);

}
    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource().equals(RegisterGUI.buttonCancel)){
            RegisterGUI.buttonCancel.setForeground(new Color(255, 238, 53));
            Border cancelButton1 = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 238, 53));
            RegisterGUI.buttonCancel.setBorder(cancelButton1);
        }else if(e.getSource().equals(RegisterGUI.buttonRegister)){
            RegisterGUI.buttonRegister.setForeground(new Color(255, 238, 53));
            Border registerButton1 = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 238, 53));
            RegisterGUI.buttonRegister.setBorder(registerButton1);
        }else if (e.getSource().equals(RegisterGUI.fieldTextMail)){
            if(RegisterGUI.fieldTextMail.getText().trim().toLowerCase().equals("example@xxx.xx")){
                RegisterGUI.fieldTextMail.setText("");
                RegisterGUI.fieldTextMail.setForeground(Color.BLACK);
                RegisterGUI.fieldTextMail.setFont(new Font("Arial",Font.PLAIN,18));
            }
            Border border1 = BorderFactory.createMatteBorder(2,2,2,2,new Color(255, 238, 53));
            RegisterGUI.fieldTextMail.setBorder(border1);
        }else if(e.getSource().equals(RegisterGUI.fieldTextName)){
            if(RegisterGUI.fieldTextName.getText().trim().toLowerCase().equals("name")){
                RegisterGUI.fieldTextName.setText("");
                RegisterGUI.fieldTextName.setForeground(Color.BLACK);
                RegisterGUI.fieldTextName.setFont(new Font("Arial",Font.PLAIN,18));
            }
            Border border1 = BorderFactory.createMatteBorder(2,2,2,2,new Color(255, 238, 53));
            RegisterGUI.fieldTextName.setBorder(border1);
        }else if(e.getSource().equals(RegisterGUI.fieldPassword1)){
            String pass = String.valueOf(RegisterGUI.fieldPassword1.getPassword());

            if(pass.trim().toLowerCase().equals("password")) {
                RegisterGUI.fieldPassword1.setText("");
                RegisterGUI.fieldPassword1.setForeground(Color.BLACK);
                RegisterGUI.fieldPassword1.setFont(new Font("Arial", Font.PLAIN, 18));
            }

            Border border1 = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 238, 53));
            RegisterGUI.fieldPassword1.setBorder(border1);
        }else if(e.getSource().equals(RegisterGUI.fieldPassword)){
            String pass = String.valueOf(RegisterGUI.fieldPassword.getPassword());

            if(pass.trim().toLowerCase().equals("password")) {


                RegisterGUI.fieldPassword.setText("");
                RegisterGUI.fieldPassword.setForeground(Color.BLACK);
                RegisterGUI.fieldPassword.setFont(new Font("Arial", Font.PLAIN, 18));
            }
            Border border1= BorderFactory.createMatteBorder(2,2,2,2,new Color(255, 238, 53));
            RegisterGUI.fieldPassword.setBorder(border1);
        }else if(e.getSource().equals(RegisterGUI.fieldTextSurname)){
            if(RegisterGUI.fieldTextSurname.getText().trim().toLowerCase().equals("surname")){
                RegisterGUI.fieldTextSurname.setText("");
                RegisterGUI.fieldTextSurname.setForeground(Color.BLACK);
                RegisterGUI.fieldTextSurname.setFont(new Font("Arial",Font.PLAIN,18));
            }
            Border fieldTextName = BorderFactory.createMatteBorder(2,2,2,2,new Color(255, 238, 53));
            RegisterGUI.fieldTextSurname.setBorder(fieldTextName);
        }else if(e.getSource().equals(RegisterGUI.fieldTextUserName)){
            if(RegisterGUI.fieldTextUserName.getText().trim().toLowerCase().equals("username")){
                RegisterGUI.fieldTextUserName.setText("");
                RegisterGUI.fieldTextUserName.setForeground(Color.BLACK);
                RegisterGUI.fieldTextUserName.setFont(new Font("Arial",Font.PLAIN,18));
            }
            Border border1 = BorderFactory.createMatteBorder(2,2,2,2,new Color(255, 238, 53));
            RegisterGUI.fieldTextUserName.setBorder(border1);
        }
    }

    @Override
    public void focusLost(FocusEvent e) {
        if(e.getSource().equals(RegisterGUI.buttonCancel)){
            RegisterGUI.buttonCancel.setForeground(new Color(0, 0, 0));
            Border cancelButton1 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
            RegisterGUI.buttonCancel.setBorder(cancelButton1);
        }else if(e.getSource().equals(RegisterGUI.buttonRegister)){
            RegisterGUI.buttonRegister.setForeground(new Color(0, 0, 0));
            Border registerButton1 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
            RegisterGUI.buttonRegister.setBorder(registerButton1);
        }else if (e.getSource().equals(RegisterGUI.fieldTextMail)){
            if(RegisterGUI.fieldTextMail.getText().trim().toLowerCase().equals("example@xxx.xx")||
                    RegisterGUI.fieldTextMail.getText().trim().toLowerCase().equals("")){
                RegisterGUI.fieldTextMail.setText("example@xxx.xx");
                RegisterGUI.fieldTextMail.setFont(new Font("Arial",Font.ITALIC,15));
                RegisterGUI.fieldTextMail.setForeground(new Color(153, 167, 147));
            }
            RegisterGUI.fieldTextMail.setBorder(null);
        }else if(e.getSource().equals(RegisterGUI.fieldTextName)){
            if(RegisterGUI.fieldTextName.getText().trim().toLowerCase().equals("name")||
                    RegisterGUI.fieldTextName.getText().trim().toLowerCase().equals("")){
                RegisterGUI.fieldTextName.setText("name");
                RegisterGUI.fieldTextName.setFont(new Font("Arial",Font.ITALIC,15));
                RegisterGUI.fieldTextName.setForeground(new Color(153, 167, 147));
            }
            RegisterGUI.fieldTextName.setBorder(null);
        }else if(e.getSource().equals(RegisterGUI.fieldPassword1)){
            String pass = String.valueOf(RegisterGUI.fieldPassword1.getPassword());
            if(pass.trim().toLowerCase().equals("password")||
                    pass.trim().toLowerCase().equals("")){
                RegisterGUI.fieldPassword1.setText("password");
                RegisterGUI.fieldPassword1.setFont(new Font("Arial",Font.ITALIC,15));
                RegisterGUI.fieldPassword1.setForeground(new Color(153, 167, 147));
            }
            RegisterGUI.fieldPassword1.setBorder(null);
        }else if(e.getSource().equals(RegisterGUI.fieldPassword)){
            String pass = String.valueOf(RegisterGUI.fieldPassword.getPassword());
            if(pass.trim().toLowerCase().equals("password")||
                    pass.trim().toLowerCase().equals("")){
                RegisterGUI.fieldPassword.setText("password");
                RegisterGUI.fieldPassword.setFont(new Font("Arial",Font.ITALIC,15));
                RegisterGUI.fieldPassword.setForeground(new Color(153, 167, 147));
            }
            RegisterGUI.fieldPassword.setBorder(null);
        }else if(e.getSource().equals(RegisterGUI.fieldTextSurname)){
            if(RegisterGUI.fieldTextSurname.getText().trim().toLowerCase().equals("surname")||
                    RegisterGUI.fieldTextSurname.getText().trim().toLowerCase().equals("")){
                RegisterGUI.fieldTextSurname.setText("surname");
                RegisterGUI.fieldTextSurname.setFont(new Font("Arial",Font.ITALIC,15));
                RegisterGUI.fieldTextSurname.setForeground(new Color(153, 167, 147));
            }
            RegisterGUI.fieldTextSurname.setBorder(null);
        }else if(e.getSource().equals(RegisterGUI.fieldTextUserName)){
            if(RegisterGUI.fieldTextUserName.getText().trim().toLowerCase().equals("username")||
                    RegisterGUI.fieldTextUserName.getText().trim().toLowerCase().equals("")){
                RegisterGUI.fieldTextUserName.setText("username");
                RegisterGUI.fieldTextUserName.setFont(new Font("Arial",Font.ITALIC,15));
                RegisterGUI.fieldTextUserName.setForeground(new Color(153, 167, 147));
            }
            RegisterGUI.fieldTextUserName.setBorder(null);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
if(e.getSource()==RegisterGUI.buttonCancel){
    RegisterGUI.buttonCancel.doClick();
}else
    RegisterGUI.buttonRegister.doClick();



        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource().equals(RegisterGUI.buttonCancel)) {
            RegisterGUI.frame.setVisible(false);
            LoggingGUI.frame.setVisible(true);
        }else if(e.getSource().equals(RegisterGUI.buttonRegister)){

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
        if(e.getSource().equals(RegisterGUI.buttonCancel)) {
            RegisterGUI.buttonCancel.setForeground(new Color(255, 238, 53));
            Border loginButton1 = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(255, 238, 53));
            RegisterGUI.buttonCancel.setBorder(loginButton1);
        }else if(e.getSource().equals(RegisterGUI.buttonRegister)){
            RegisterGUI.buttonRegister.setForeground(new Color(255, 238, 53));
            Border loginButton1 = BorderFactory.createMatteBorder(2,2,2,2,new Color(255, 238, 53));
            RegisterGUI.buttonRegister.setBorder(loginButton1);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource().equals(RegisterGUI.buttonCancel)) {
            RegisterGUI.buttonCancel.setForeground(new Color(0, 0, 0));
            Border loginButton1 = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(0, 0, 0));
            RegisterGUI.buttonCancel.setBorder(loginButton1);
        }else if(e.getSource().equals(RegisterGUI.buttonRegister)){
            RegisterGUI.buttonRegister.setForeground(new Color(0, 0, 0));
            Border loginButton1 = BorderFactory.createMatteBorder(1,1,1,1,new Color(0, 0, 0));
            RegisterGUI.buttonRegister.setBorder(loginButton1);
        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {

            RegisterGUI.register();

    }

}
