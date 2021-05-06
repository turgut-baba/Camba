package com.camba;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
    List<Cariler> current_cari = serializer.DeSerializeCari();
    serializer.serializeCari(current_cari,"ahmet","0 553 050 98 56",432);
    Cariler displayed_Cari = null;

 */

public class serializer {

    private static final String SAMPLE_CSV_FILE_PATH = "./ser.txt";

    private static <CURRENT_OBJECT> void write(CURRENT_OBJECT e){
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

    private static <CURRENT_OBJECT> CURRENT_OBJECT read(){
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

    static void serializeCari(List<Cariler> Cari_List,String name,String tel, int receivable){
        Cariler new_cari = new Cariler();
        new_cari.Name = name;
        new_cari.Tel = tel;
        new_cari.Receivable = receivable;
        Cari_List.add(new_cari);
        serializer.write(Cari_List);
    }

    static List<Cariler> DeSerializeCari(){
        return serializer.read();
        /*
        List<Project> current_project = serializer.read();
        return current_project;
        */
    }

    static void serializeProject(){
        List<Project> avadible_project = new ArrayList<>();
        serializer.write(avadible_project);
    }
    static List<Project> DeSerializeProject(){
        return serializer.read();
    }
}

    /*
    Backup cari:

    static void new_serializeCari(String name,String tel, int receivable){
        Cariler new_cari = new Cariler();
        new_cari.Name = name;
        new_cari.Tel = tel;
        new_cari.Receivable = receivable;
        List<Cariler> avadible_cari = new ArrayList<>();
        avadible_cari.add(new_cari);
        serializer.write(avadible_cari);
    }

     */

