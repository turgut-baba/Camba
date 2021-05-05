package com.camba;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* This class conencts to mysql and also allows links to be opened in browsers.*/


public class SQLconnector {

    public static String GetPass() throws SQLException,ClassNotFoundException{

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/dbname","root","root"); //here is the remote url.
        Statement stmt=con.createStatement();
        ResultSet rs = stmt.executeQuery("select *from UserAuth ORDER BY id DESC LIMIT 1;");
        /*
           while(rs.next())
               System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
         */
        con.close();
        return encryptThisString(rs.getString(1));

    }

    //this is here in-case we need a custom query.
    public static String GetPass(String query) throws SQLException,ClassNotFoundException{

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(query);
        Statement stmt=con.createStatement();
        ResultSet rs = stmt.executeQuery("select *from UserAuth ORDER BY id DESC LIMIT 1;");

        con.close();
        return encryptThisString(rs.getString(1));

    }


    //SHA-512 encrypter, inorder to encrypt and compare the input from the user with the value from sql database.
    private static String encryptThisString(String input)
    {
        try {
            // getInstance() method is called with algorithm SHA-512
            MessageDigest md = MessageDigest.getInstance("SHA-512");

            byte[] messageDigest = md.digest(input.getBytes());

            // Convert byte array into signum representation
            BigInteger no = new BigInteger(1, messageDigest);

            // Convert message digest into hex value
            String hashtext = no.toString(16);

            // Add preceding 0s to make it 32 bit
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }

            return hashtext;

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}


class BrowserLinking{
    public static void openWebpage(String url) {
        try {

            Desktop.getDesktop().browse(new URI(url));

        } catch (IOException | URISyntaxException e1) {
            e1.printStackTrace();
        }
        }
}
