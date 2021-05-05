package com.camba;

import java.io.*;

class serializer {
    private static final String SAMPLE_CSV_FILE_PATH = "./new.csv";

    static void write(Employee e){
        try {
            FileOutputStream fileOut =
                    new FileOutputStream(SAMPLE_CSV_FILE_PATH);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    static <CURRENT_OBJECT> CURRENT_OBJECT read(){
        CURRENT_OBJECT e = null;
        try {
            FileInputStream fileIn = new FileInputStream(SAMPLE_CSV_FILE_PATH);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (CURRENT_OBJECT)in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Employee class not found");
            c.printStackTrace();
        }
        return e;
    }
}
