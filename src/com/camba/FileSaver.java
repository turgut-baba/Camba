package com.camba;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import org.apache.pdfbox.pdmodel.PDPageContentStream;

import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.io.*;

public class FileSaver {

    public static void pdf(String pdf_name,String[] document_contents) throws IOException {
        PDDocument doc = new PDDocument();
        try (doc) {
            PDPage page = new PDPage();
            doc.addPage(page);

            PDFont font = PDType1Font.HELVETICA_BOLD;

            PDPageContentStream contents = new PDPageContentStream(doc, page);
            contents.beginText();
            contents.setFont(font, 30);
            contents.newLineAtOffset(50, 700);

            for (String line :document_contents){
                contents.showText(line);
            }
            contents.endText();
            contents.close();
        }


        if(System.getProperty("os.name").equals("windows"))
            doc.save(javax.swing.filechooser.FileSystemView.getFileSystemView().getHomeDirectory() + "/" + pdf_name); //if on os, add /desktop.
        else
            doc.save(javax.swing.filechooser.FileSystemView.getFileSystemView().getHomeDirectory() + "/desktop/" + pdf_name);

        doc.close();
    }

}
