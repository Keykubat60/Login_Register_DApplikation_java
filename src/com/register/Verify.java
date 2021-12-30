package com.register;

import com.mysql.Connec;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Verify {

    public static boolean BlanksFulledAndPasswordIsCorrect(){

    String username = RegisterGUI.fieldTextUserName.getText();
    String name = RegisterGUI.fieldTextName.getText();
    String surname = RegisterGUI.fieldTextSurname.getText();
    String mail = RegisterGUI.fieldTextMail.getText();
    String password = String.valueOf(RegisterGUI.fieldPassword.getPassword());
    String password1 = String.valueOf(RegisterGUI.fieldPassword1.getPassword());




    if (username.trim().equals("") || name.trim().equals("") || surname.trim().equals("") || mail.trim().equals("") ||
            password.trim().equals("") || password1.trim().equals("")) {
        JOptionPane.showMessageDialog(null, "One ore more files are empty!", "Empty files", 2);

        return false;
    } else if (!password.equals(password1)) {
        JOptionPane.showMessageDialog(null, "Password doesn't match", "Confirm Password", 2);
        return false;

    } else {
        return true;
    }



    }
    public static boolean  userExist(String username){

        PreparedStatement st;
        ResultSet rs;

        boolean checkusername = false;
        try {
            String query =  "SELECT * FROM UserInformations WHERE Username = ?";
            st = Connec.getConnection().prepareStatement(query);
            st.setString(1,username);

            rs = st.executeQuery();

            if(rs.next()){
        checkusername =false;
        JOptionPane.showMessageDialog(null , "Choose other username","Username exist",2);
        return checkusername;

    }
    else{
        checkusername = true;
        return checkusername;
    }
}
catch(Exception ex) {
    ex.printStackTrace();
}

     return true;
    }

}
