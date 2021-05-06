package com.camba;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;


import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Scanner; // Import the Scanner class to read text files

public class cryption {

    private static SecretKeySpec secretKey;
    private static ArrayList<String> data = new ArrayList<String>();

    private static void setKey(String myKey)
    {
        MessageDigest sha = null;
        try {
            byte[] key = myKey.getBytes(StandardCharsets.UTF_8);
            sha = MessageDigest.getInstance("SHA-1");
            key = sha.digest(key);
            key = Arrays.copyOf(key, 16);
            secretKey = new SecretKeySpec(key, "AES");
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    private static String encrypt(String strToEncrypt, String secret)
    {
        try
        {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes(StandardCharsets.UTF_8)));
        }
        catch (Exception e)
        {
            System.out.println("Error while encrypting: " + e.toString());
        }
        return null;
    }

    private static String decrypt(String strToDecrypt, String secret)
    {
        try
        {
            setKey(secret);
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
        }
        catch (Exception e)
        {
            System.out.println("Error while decrypting: " + e.toString());
        }
        return null;
    }

    static ArrayList<String> read() {
        File myObj = new File(System.getProperty("user.dir") + "/content.txt");
        final String secretKey = "aadfasdfdfadf";

        String originalString = "a";

        System.out.println(originalString);
        String encryptedString = cryption.encrypt(originalString, secretKey) ;
        System.out.println(encryptedString);

        try {
            Scanner myReader = new Scanner(myObj);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            }

            while (myReader.hasNextLine()) {
                String decryptedString = cryption.decrypt(myReader.nextLine(), secretKey) ;
                data.add( decryptedString );
                System.out.println("the line is " + data.get(0));
            }

            myReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return data;
    }

    static <T> void write(T Var,int index){
        final String secretKey = "tbYxI!0R`(_qM0H";
        String encryptedString = cryption.encrypt((String)Var, secretKey) ;

        try{
            File dir = new File(".");
            String loc = dir.getCanonicalPath() + File.separator + "content.txt";

            FileWriter fstream = new FileWriter(loc, true);
            BufferedWriter out = new BufferedWriter(fstream);

            out.write(encryptedString);
            out.newLine();

            //close buffer writer
            out.close();
        }catch (IOException o){
            System.out.println(o);
        }
    }
}
