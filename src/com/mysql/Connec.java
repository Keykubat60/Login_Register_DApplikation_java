package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Connec {

    static    String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://sql7.freemysqlhosting.net:3306/sql7329809?serverTimezone=UTC";
    static String username = "sql7329809";
    static String password = "PIbnrAusIL";

    public static void createTable() throws Exception {
        try {
            Connection verbindung = getConnection();
            PreparedStatement befehl = verbindung.prepareStatement("CREATE TABLE IF NOT EXISTS tablename(id int NOT NULL AUTO_INCREMENT PRIMARY KEY,vorname varchar(255),nachname varchar(255))");
            befehl.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("the table has been created!");
        }
    }

    public static Connection getConnection() throws Exception {

        try {
            Class.forName(driver);

            Connection myconn = DriverManager.getConnection(url, username, password);
            return myconn;

        } catch (Exception e) {
            System.out.println(e);

        }
        return null;

    }

    public static void getFerbinden() throws Exception {
       /* try {
            //String driver = "com.mysql.cj.jdbc.Driver";

            //Class.forName(driver);
            Connection mycon = DriverManager.getConnection(url, username, password);
            Statement stm = mycon.createStatement();
            ResultSet myrslt = stm.executeQuery("select * from ");

            while (myrslt.next()) {
                System.out.println(myrslt.getString("Username") + ", " + myrslt.getString("Password") + ", "
                        + myrslt.getString("Name") + ", " + myrslt.getString("Surname") + ", "
                        + myrslt.getString("Password") + ", " + myrslt.getString("Mail"));
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }*/
    }
}