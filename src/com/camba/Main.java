package com.camba;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

//TODO: fix writing into cari so it can be readable.
public class Main
{
    private JLayeredPane Cari_Ekstre_Lp;
    /* example usage of serializer */
    public static void main(String [] args) {
        List<Cariler> current_cari = serializer.DeSerializeCari();
        serializer.serializeCari(current_cari,"aysun","065305098",432);
        Cariler displayed_Cari = null;

        System.out.println(current_cari);

        int Total_Recieved = 0;
        for(Cariler cari : current_cari) {
            System.out.println(cari.Name);
            System.out.println(cari.Receivable);
            System.out.println(cari.Tel);
            Total_Recieved += cari.Receivable;
        }
        Cari_Panel = new JPanel();
        Cari_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        Cari_Panel.setBackground(Color.WHITE);
        mainLp.add(Cari_Panel, "name_428870706961300");
        Cari_Panel.setLayout(null);

        JLabel lblCariler = new JLabel("Cariler");
        lblCariler.setOpaque(true);
        lblCariler.setForeground(Color.WHITE);
        lblCariler.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblCariler.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblCariler.setBackground(SystemColor.activeCaption);
        lblCariler.setBounds(0, 0, 870, 31);
        Cari_Panel.add(lblCariler);

        JPanel panel_4_1 = new JPanel();
        panel_4_1.setLayout(null);
        panel_4_1.setBorder(new LineBorder(new Color(153, 180, 209), 3, true));
        panel_4_1.setBackground(Color.WHITE);
        panel_4_1.setBounds(10, 42, 850, 104);
        Cari_Panel.add(panel_4_1);

        JLabel lblNewLabel_7_1 = new JLabel("Cari");
        lblNewLabel_7_1.setOpaque(true);
        lblNewLabel_7_1.setForeground(Color.WHITE);
        lblNewLabel_7_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_7_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblNewLabel_7_1.setBackground(SystemColor.activeCaption);
        lblNewLabel_7_1.setBounds(0, 0, 849, 24);
        panel_4_1.add(lblNewLabel_7_1);

        JLabel lblNewLabel_2_1_5_1 = new JLabel("Cari Ara");
        lblNewLabel_2_1_5_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_1.setBounds(10, 32, 89, 24);
        panel_4_1.add(lblNewLabel_2_1_5_1);

        JComboBox Cariler_comboBox = new JComboBox();
        Cariler_comboBox.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        Cariler_comboBox.setEditable(true);
        Cariler_comboBox.setBounds(10, 55, 387, 38);
        panel_4_1.add(Cariler_comboBox);

        Cariler_comboBox.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if	(e.getStateChange() == ItemEvent.SELECTED) {
                    for(Cariler cari : current_cari){
                        if(Cariler_comboBox.getSelectedItem().toString().equals(cari.Name)){
                            SwitchDigerPanels(Cam_1_Diger_Panel_1);
                            displayed_Cari = cari;
                        }
                    }
                }
            }
        });

        JLabel lblNewLabel_2_1_3_2_1 = new JLabel("Cari Say\u0131s\u0131");
        lblNewLabel_2_1_3_2_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_3_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_3_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_2_1_3_2_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.desktop));
        lblNewLabel_2_1_3_2_1.setBounds(610, 44, 113, 24);
        panel_4_1.add(lblNewLabel_2_1_3_2_1);

        JLabel lblNewLabel_2_1_1_1_1_2_1_1 = new JLabel(String.valueOf(current_cari.size()));
        lblNewLabel_2_1_1_1_1_2_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_1_1_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_1_1_1_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_2_1_1_1_1_2_1_1.setBounds(610, 69, 113, 24);
        panel_4_1.add(lblNewLabel_2_1_1_1_1_2_1_1);

        JLabel lblNewLabel_2_1_3_2_2 = new JLabel("Toplam Alacak");
        lblNewLabel_2_1_3_2_2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_3_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_3_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_2_1_3_2_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.desktop));
        lblNewLabel_2_1_3_2_2.setBounds(449, 44, 113, 24);
        panel_4_1.add(lblNewLabel_2_1_3_2_2);

        JLabel lblNewLabel_2_1_1_1_1_2_1_2 = new JLabel(String.valueOf(Total_Recieved));
        lblNewLabel_2_1_1_1_1_2_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_1_1_1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_1_1_1_2_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_2_1_1_1_1_2_1_2.setBounds(449, 69, 113, 24);
        panel_4_1.add(lblNewLabel_2_1_1_1_1_2_1_2);

        JLabel Cariekle_lbl = new JLabel("Cari Ekle");
        Cariekle_lbl.setBounds(763, 56, 77, 24);
        panel_4_1.add(Cariekle_lbl);
        Cariekle_lbl.setVerticalAlignment(SwingConstants.BOTTOM);
        Cariekle_lbl.setHorizontalAlignment(SwingConstants.CENTER);
        Cariekle_lbl.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        //AutoCompleteDecorator.decorate(comboBox_1);

        JPanel panel_2_1 = new JPanel();
        panel_2_1.setLayout(null);
        panel_2_1.setBorder(new LineBorder(new Color(153, 180, 209), 3, true));
        panel_2_1.setBackground(Color.WHITE);
        panel_2_1.setBounds(10, 157, 850, 357);
        Cari_Panel.add(panel_2_1);

        JLabel lblNewLabel_5_1 = new JLabel("Cari Detay");
        lblNewLabel_5_1.setOpaque(true);
        lblNewLabel_5_1.setForeground(Color.WHITE);
        lblNewLabel_5_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_5_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblNewLabel_5_1.setBackground(SystemColor.activeCaption);
        lblNewLabel_5_1.setBounds(0, 0, 849, 24);
        panel_2_1.add(lblNewLabel_5_1);

        JLabel lblNewLabel_2_1_3_2 = new JLabel("Toplam Alacak");
        lblNewLabel_2_1_3_2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_3_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_2_1_3_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.desktop));
        lblNewLabel_2_1_3_2.setBounds(66, 140, 113, 24);
        panel_2_1.add(lblNewLabel_2_1_3_2);

        JLabel lblNewLabel_2_1_1_1_1_2_1 = new JLabel("000");
        lblNewLabel_2_1_1_1_1_2_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_1_1_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_1_1_1_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_2_1_1_1_1_2_1.setBounds(66, 165, 113, 24);
        panel_2_1.add(lblNewLabel_2_1_1_1_1_2_1);

        JLabel Cari_but1 = new JLabel("Projelerini G\u00F6r\u00FCnt\u00FCle");
        Cari_but1.setOpaque(true);
        Cari_but1.setHorizontalAlignment(SwingConstants.CENTER);
        Cari_but1.setForeground(Color.WHITE);
        Cari_but1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        Cari_but1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Cari_but1.setBackground(SystemColor.activeCaption);
        Cari_but1.setBounds(52, 200, 150, 27);
        panel_2_1.add(Cari_but1);

        JLayeredPane Cari_Ekstre_Lp = new JLayeredPane();
        Cari_Ekstre_Lp.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Cari_Ekstre_Lp.setBounds(256, 35, 584, 311);
        panel_2_1.add(Cari_Ekstre_Lp);
        Cari_Ekstre_Lp.setLayout(new CardLayout(0, 0));

        JPanel Cari1_Ekstre_panel = new JPanel();
        Cari1_Ekstre_panel.setBackground(Color.WHITE);
        Cari_Ekstre_Lp.add(Cari1_Ekstre_panel, "name_577220096633100");
        Cari1_Ekstre_panel.setLayout(null);

        JLabel lblNewLabel_7_1_1 = new JLabel("Cari Ekstre");
        lblNewLabel_7_1_1.setBounds(0, 0, 587, 24);
        Cari1_Ekstre_panel.add(lblNewLabel_7_1_1);
        lblNewLabel_7_1_1.setOpaque(true);
        lblNewLabel_7_1_1.setForeground(Color.WHITE);
        lblNewLabel_7_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_7_1_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblNewLabel_7_1_1.setBackground(SystemColor.activeCaption);

        JLabel Yazdır_lbl = new JLabel("Yazd\u0131r");
        Yazdır_lbl.setBounds(491, 270, 77, 24);
        Cari1_Ekstre_panel.add(Yazdır_lbl);
        Yazdır_lbl.setVerticalAlignment(SwingConstants.BOTTOM);
        Yazdır_lbl.setHorizontalAlignment(SwingConstants.CENTER);
        Yazdır_lbl.setFont(new Font("Comic Sans MS", Font.BOLD, 13));

        JLabel Cari_but2 = new JLabel("Di\u011Fer Alacak Ekle");
        Cari_but2.setOpaque(true);
        Cari_but2.setHorizontalAlignment(SwingConstants.CENTER);
        Cari_but2.setForeground(Color.WHITE);
        Cari_but2.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        Cari_but2.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Cari_but2.setBackground(SystemColor.activeCaption);
        Cari_but2.setBounds(52, 238, 150, 27);
        panel_2_1.add(Cari_but2);

        JLabel Cari_but3 = new JLabel("Di\u011Fer \u00D6deme Ekle");
        Cari_but3.setOpaque(true);
        Cari_but3.setHorizontalAlignment(SwingConstants.CENTER);
        Cari_but3.setForeground(Color.WHITE);
        Cari_but3.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        Cari_but3.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Cari_but3.setBackground(SystemColor.activeCaption);
        Cari_but3.setBounds(52, 276, 150, 27);
        panel_2_1.add(Cari_but3);

        txtAdsoyad = new JTextField();
        txtAdsoyad.setBorder(null);
        txtAdsoyad.setText("Ad-Soyad");
        txtAdsoyad.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        txtAdsoyad.setHorizontalAlignment(SwingConstants.CENTER);
        txtAdsoyad.setBounds(10, 35, 227, 24);
        panel_2_1.add(txtAdsoyad);
        txtAdsoyad.setColumns(10);

        txtTelefon = new JTextField();
        txtTelefon.setBorder(null);
        txtTelefon.setText("Telefon");
        txtTelefon.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        txtTelefon.setHorizontalAlignment(SwingConstants.CENTER);
        txtTelefon.setColumns(10);
        txtTelefon.setBounds(10, 70, 227, 24);
        panel_2_1.add(txtTelefon);

        txtAdres = new JTextField();
        txtAdres.setBorder(null);
        txtAdres.setText("Adres");
        txtAdres.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        txtAdres.setHorizontalAlignment(SwingConstants.CENTER);
        txtAdres.setColumns(10);
        txtAdres.setBounds(10, 105, 227, 24);
        panel_2_1.add(txtAdres);

        JLabel Kaydet_2 = new JLabel("Kaydet");
        Kaydet_2.setOpaque(true);
        Kaydet_2.setHorizontalAlignment(SwingConstants.CENTER);
        Kaydet_2.setForeground(Color.WHITE);
        Kaydet_2.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        Kaydet_2.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Kaydet_2.setBackground(SystemColor.activeCaption);
        Kaydet_2.setBounds(52, 314, 150, 27);
        panel_2_1.add(Kaydet_2);

    }
    public void SwitchDigerPanels(JPanel panel) {
        Cari_Ekstre_Lp.removeAll();
        Cari_Ekstre_Lp.add(panel);
        Cari_Ekstre_Lp.repaint();
        Cari_Ekstre_Lp.revalidate();
    }

}