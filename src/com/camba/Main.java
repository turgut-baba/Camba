/*new File(".").getCanonicalPath() + File.separator + "ser.txt"*/
package com.camba;
import com.camba.cryption;

import java.io.*;
import java.io.IOException;

import java.io.FileReader;

class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}

public class Main
{
    /* example usage of serializer */
    public static void main(String [] args) {
        BrowserLinking.openWebpage("https://youtube.com");
        Employee Old_emp = serializer.read(); // reads the previous implementations
        serializer.write(Old_emp); //sets the current objects for future uses.
    }


}



