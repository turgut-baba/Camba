package HomePage;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.border.MatteBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.DefaultComboBoxModel;



public class HomePage extends JFrame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel mainPane;
    private JLabel SirketLogo_Label;
    private JLayeredPane mainLp,ProjeOlustur_Diger_Lp;
    private JPanel Home_Panel,Urun_Panel,Sirket_Panel,Rapor_Panel,Ayar_Panel,SSS_Panel,BalkonSis_Panel,Foto_Panel,Cari_Panel,ProJeOlstur_Panel,Projeler_Panel;
    private JPanel Cam_1_Diger_Panel_1,Cam_2_Diger_Panel_1,Cam_3_Diger_Panel_1,Cam_4_Diger_Panel_1,Cam_5_Diger_Panel_1,Cam_6_Diger_Panel_1,Cam_7_Diger_Panel_1;
    final private JComboBox<?> comboBox;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private final ButtonGroup buttonGroup = new ButtonGroup();
    private final ButtonGroup buttonGroup_1 = new ButtonGroup();
    private final ButtonGroup buttonGroup_2 = new ButtonGroup();
    private final ButtonGroup buttonGroup_3 = new ButtonGroup();
    private final ButtonGroup buttonGroup_4 = new ButtonGroup();
    private final ButtonGroup buttonGroup_5 = new ButtonGroup();
    private final ButtonGroup buttonGroup_6 = new ButtonGroup();
    private final ButtonGroup buttonGroup_7 = new ButtonGroup();
    private JTextField textField_9;
    private JTextField textField_10;
    private JTextField textField_11;
    private JTextField txtAdsoyad;
    private JTextField txtTelefon;
    private JTextField txtAdres;
    private JTextField textField_3;
    private JTextField textField_4;
    private JTextField textField_5;
    private JTextField textField_6;
    private JTextField textField_7;
    private JTextField textField_8;
    private JTextField textField_12;
    private JTextField textField_15;
    List<Cariler> current_cari = serializer.DeSerializeCari();     //the list object that will hold the cari objects.
    Cariler displayed_Cari = null;                                 //an empty cari object to temporarily put into object list so we can save later.
    //if we need to save a var, we use: serializer.serializeCari(current_cari,"kullanıcı adı","tel no su string halinde",432);


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    HomePage frame = new HomePage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // call and repaint panel on JLayaredPanel
    public void SwitchDigerPanels(JPanel panel) {
        ProjeOlustur_Diger_Lp.removeAll();
        ProjeOlustur_Diger_Lp.add(panel);
        ProjeOlustur_Diger_Lp.repaint();
        ProjeOlustur_Diger_Lp.revalidate();
    }

    public void SwitchMainPanels(JPanel panel) {
        mainLp.removeAll();
        mainLp.add(panel);
        mainLp.repaint();
        mainLp.revalidate();
    }
    /**
     * Create the frame.
     */
    public HomePage() {
        setResizable(false);
        setTitle("Camba Cam Balkon");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 975, 650);
        mainPane = new JPanel();
        mainPane.setBackground(Color.WHITE);
        mainPane.setBorder(new EmptyBorder(1, 5, 5, 5));
        setContentPane(mainPane);
        mainPane.setLayout(null);

        JPanel NavBar_Panel = new JPanel();
        NavBar_Panel.setBorder(null);
        NavBar_Panel.setBackground(Color.WHITE);
        NavBar_Panel.setBounds(0, 0, 75, 611);
        mainPane.add(NavBar_Panel);

        ImageIcon Navbarimg = new ImageIcon(getClass().getResource("Navbar.png"));
        Image scaleImage = Navbarimg.getImage().getScaledInstance(100,620,Image.SCALE_DEFAULT);
        NavBar_Panel.setLayout(null);

        JButton Ayarlar_Button = new JButton(new ImageIcon(getClass().getResource("ayarlar2.png")));
        Ayarlar_Button.setContentAreaFilled(false);
        Ayarlar_Button.setBounds(15, 480, 40, 40);
        NavBar_Panel.add(Ayarlar_Button);
        Ayarlar_Button.setBorderPainted(false);

        JButton BalkonSis_Button = new JButton(new ImageIcon(getClass().getResource("balkon.png")));
        BalkonSis_Button.setContentAreaFilled(false);
        BalkonSis_Button.setBounds(15, 429, 40, 40);
        NavBar_Panel.add(BalkonSis_Button);
        BalkonSis_Button.setBorderPainted(false);

        JButton Foto_Button = new JButton(new ImageIcon(getClass().getResource("foto.png")));
        Foto_Button.setContentAreaFilled(false);
        Foto_Button.setBounds(15, 378, 40, 40);
        NavBar_Panel.add(Foto_Button);
        Foto_Button.setBorderPainted(false);

        JButton Sirket_Button = new JButton(new ImageIcon(getClass().getResource("sirket_bilgileri.png")));
        Sirket_Button.setContentAreaFilled(false);
        Sirket_Button.setBounds(15, 327, 40, 40);
        NavBar_Panel.add(Sirket_Button);
        Sirket_Button.setBorderPainted(false);

        JButton Rapor_Button = new JButton(new ImageIcon(getClass().getResource("raporlar.png")));
        Rapor_Button.setContentAreaFilled(false);
        Rapor_Button.setBounds(15, 276, 40, 40);
        NavBar_Panel.add(Rapor_Button);
        Rapor_Button.setBorderPainted(false);

        JButton Urun_Button = new JButton(new ImageIcon(getClass().getResource("urunler.png")));
        Urun_Button.setContentAreaFilled(false);
        Urun_Button.setBounds(15, 225, 40, 40);
        NavBar_Panel.add(Urun_Button);
        Urun_Button.setBorderPainted(false);

        JButton SSS_Button = new JButton(new ImageIcon(getClass().getResource("sss.png")));
        SSS_Button.setContentAreaFilled(false);
        SSS_Button.setBounds(15, 531, 40, 40);
        NavBar_Panel.add(SSS_Button);
        SSS_Button.setBorderPainted(false);

        JLabel Version_Label = new JLabel("Version");
        Version_Label.setForeground(Color.WHITE);
        Version_Label.setBounds(13, 582, 50, 14);
        NavBar_Panel.add(Version_Label);
        Version_Label.setFont(new Font("Comic Sans MS", Font.BOLD, 11));

        JLabel CambaLogo_Label = new JLabel("<html>Camba<br>&nbsp;Logo</html>");
        CambaLogo_Label.setForeground(Color.WHITE);
        CambaLogo_Label.setBounds(10, 11, 50, 50);
        NavBar_Panel.add(CambaLogo_Label);
        CambaLogo_Label.setVerticalAlignment(SwingConstants.TOP);
        CambaLogo_Label.setHorizontalAlignment(SwingConstants.CENTER);
        CambaLogo_Label.setFont(new Font("Comic Sans MS", Font.BOLD, 11));

        JButton Cari_Button = new JButton(new ImageIcon(getClass().getResource("cariler.png")));
        Cari_Button.setContentAreaFilled(false);
        Cari_Button.setBounds(15, 174, 40, 40);
        NavBar_Panel.add(Cari_Button);
        Cari_Button.setBorderPainted(false);

        JButton Projeler_Button = new JButton(new ImageIcon(getClass().getResource("urunler.png")));
        Projeler_Button.setContentAreaFilled(false);
        Projeler_Button.setBounds(15, 123, 40, 40);
        NavBar_Panel.add(Projeler_Button);
        Projeler_Button.setBorderPainted(false);

        JButton Home_Button = new JButton(new ImageIcon(getClass().getResource("home2.png")));
        Home_Button.setBounds(15, 72, 40, 40);
        NavBar_Panel.add(Home_Button);
        Home_Button.setOpaque(false);
        Home_Button.setContentAreaFilled(false);
        Home_Button.setBorderPainted(false);
        Home_Button.setBorderPainted(false);
        JLabel Navbar_Image_Label = new JLabel(Navbarimg);
        Navbar_Image_Label.setBounds(0, 0, 75, 611);
        NavBar_Panel.add(Navbar_Image_Label);
        Navbar_Image_Label.setInheritsPopupMenu(false);
        Home_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwitchMainPanels(Home_Panel);
            }
        });
        Projeler_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwitchMainPanels(Projeler_Panel);
            }
        });
        Cari_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwitchMainPanels(Cari_Panel);
            }
        });
        SSS_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwitchMainPanels(SSS_Panel);
            }
        });
        Urun_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwitchMainPanels(Urun_Panel);
            }
        });
        Rapor_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwitchMainPanels(Rapor_Panel);
            }
        });
        Sirket_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwitchMainPanels(Sirket_Panel);
            }
        });
        Foto_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwitchMainPanels(Foto_Panel);
            }
        });
        BalkonSis_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwitchMainPanels(BalkonSis_Panel);
            }
        });
        Ayarlar_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwitchMainPanels(Ayar_Panel);
            }
        });

        JPanel UserPanel = new JPanel();
        UserPanel.setBackground(Color.WHITE);
        UserPanel.setBorder(new LineBorder(new Color(153, 180, 209), 3, true));
        UserPanel.setBounds(82, 5, 575, 64);
        mainPane.add(UserPanel);
        UserPanel.setLayout(null);

        JLabel UserName_Label = new JLabel("Berdan Nergis");
        UserName_Label.setVerticalAlignment(SwingConstants.TOP);
        UserName_Label.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        UserName_Label.setBounds(10, 18, 150, 24);
        UserPanel.add(UserName_Label);

        SirketLogo_Label = new JLabel("\u015Eirket Logo");
        SirketLogo_Label.setFont(new Font("Comic Sans MS", Font.BOLD, 11));
        SirketLogo_Label.setBounds(499, 11, 66, 42);
        UserPanel.add(SirketLogo_Label);

        JLabel SirketName_Label = new JLabel("Cam \u015Eirketi");
        SirketName_Label.setVerticalAlignment(SwingConstants.TOP);
        SirketName_Label.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        SirketName_Label.setBounds(230, 18, 150, 35);
        UserPanel.add(SirketName_Label);

        mainLp = new JLayeredPane();
        mainLp.setBounds(82, 75, 870, 525);
        mainPane.add(mainLp);
        mainLp.setLayout(new CardLayout(0, 0));

        Home_Panel = new JPanel();
        Home_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        Home_Panel.setBackground(Color.WHITE);
        mainLp.add(Home_Panel, "name_428870671181000");
        Home_Panel.setLayout(null);

        JLabel lblHomePage = new JLabel("Home Page");
        lblHomePage.setOpaque(true);
        lblHomePage.setForeground(Color.WHITE);
        lblHomePage.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblHomePage.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblHomePage.setBackground(SystemColor.activeCaption);
        lblHomePage.setBounds(0, 0, 870, 31);
        Home_Panel.add(lblHomePage);

        Urun_Panel = new JPanel();
        Urun_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        Urun_Panel.setBackground(Color.WHITE);
        mainLp.add(Urun_Panel, "name_428870689024500");
        Urun_Panel.setLayout(null);

        JLabel lblrnler = new JLabel("\u00DCr\u00FCnler");
        lblrnler.setOpaque(true);
        lblrnler.setForeground(Color.WHITE);
        lblrnler.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblrnler.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblrnler.setBackground(SystemColor.activeCaption);
        lblrnler.setBounds(0, 0, 870, 31);
        Urun_Panel.add(lblrnler);

        JPanel panel_4_1_1 = new JPanel();
        panel_4_1_1.setLayout(null);
        panel_4_1_1.setBorder(new LineBorder(new Color(153, 180, 209), 3, true));
        panel_4_1_1.setBackground(Color.WHITE);
        panel_4_1_1.setBounds(10, 42, 850, 104);
        Urun_Panel.add(panel_4_1_1);

        JLabel lblNewLabel_7_1_2 = new JLabel("\u00DCr\u00FCn Se\u00E7");
        lblNewLabel_7_1_2.setOpaque(true);
        lblNewLabel_7_1_2.setForeground(Color.WHITE);
        lblNewLabel_7_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_7_1_2.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblNewLabel_7_1_2.setBackground(SystemColor.activeCaption);
        lblNewLabel_7_1_2.setBounds(0, 0, 849, 24);
        panel_4_1_1.add(lblNewLabel_7_1_2);

        JLabel lblNewLabel_2_1_5_1_1 = new JLabel("Ara");
        lblNewLabel_2_1_5_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_1_1.setBounds(10, 32, 89, 24);
        panel_4_1_1.add(lblNewLabel_2_1_5_1_1);

        JComboBox Urunler_comboBox = new JComboBox();
        Urunler_comboBox.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        Urunler_comboBox.setEditable(true);
        Urunler_comboBox.setBounds(10, 55, 590, 38);
        panel_4_1_1.add(Urunler_comboBox);

        JLabel lblNewLabel_2_1_3_2_1_1 = new JLabel("\u00DCr\u00FCn Say\u0131s\u0131");
        lblNewLabel_2_1_3_2_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_3_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_3_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_2_1_3_2_1_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.desktop));
        lblNewLabel_2_1_3_2_1_1.setBounds(727, 44, 113, 24);
        panel_4_1_1.add(lblNewLabel_2_1_3_2_1_1);

        JLabel lblNewLabel_2_1_1_1_1_2_1_1_1 = new JLabel("000");
        lblNewLabel_2_1_1_1_1_2_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_1_1_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_1_1_1_2_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_2_1_1_1_1_2_1_1_1.setBounds(727, 69, 113, 24);
        panel_4_1_1.add(lblNewLabel_2_1_1_1_1_2_1_1_1);

        JLabel Kaydet_2_1_1 = new JLabel("\u00DCr\u00FCn\u00FC Ekle");
        Kaydet_2_1_1.setOpaque(true);
        Kaydet_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Kaydet_2_1_1.setForeground(Color.WHITE);
        Kaydet_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        Kaydet_2_1_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Kaydet_2_1_1.setBackground(SystemColor.activeCaption);
        Kaydet_2_1_1.setBounds(610, 55, 107, 27);
        panel_4_1_1.add(Kaydet_2_1_1);

        JPanel panel_2_1_1 = new JPanel();
        panel_2_1_1.setLayout(null);
        panel_2_1_1.setBorder(new LineBorder(new Color(153, 180, 209), 3, true));
        panel_2_1_1.setBackground(Color.WHITE);
        panel_2_1_1.setBounds(10, 157, 850, 357);
        Urun_Panel.add(panel_2_1_1);

        JLabel lblNewLabel_5_1_1 = new JLabel("\u00DCr\u00FCn Hareketleri");
        lblNewLabel_5_1_1.setOpaque(true);
        lblNewLabel_5_1_1.setForeground(Color.WHITE);
        lblNewLabel_5_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_5_1_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblNewLabel_5_1_1.setBackground(SystemColor.activeCaption);
        lblNewLabel_5_1_1.setBounds(0, 0, 849, 24);
        panel_2_1_1.add(lblNewLabel_5_1_1);

        JLayeredPane Ürün_Hareketleri_Lp = new JLayeredPane();
        Ürün_Hareketleri_Lp.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Ürün_Hareketleri_Lp.setBounds(10, 35, 830, 311);
        panel_2_1_1.add(Ürün_Hareketleri_Lp);
        Ürün_Hareketleri_Lp.setLayout(null);

        JLabel Kaydet_2_1 = new JLabel("\u00DCr\u00FCn\u00FC D\u00FCzenle");
        Kaydet_2_1.setBounds(713, 273, 107, 27);
        Ürün_Hareketleri_Lp.add(Kaydet_2_1);
        Kaydet_2_1.setOpaque(true);
        Kaydet_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        Kaydet_2_1.setForeground(Color.WHITE);
        Kaydet_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        Kaydet_2_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Kaydet_2_1.setBackground(SystemColor.activeCaption);

        JLabel Urun_Adı_lb = new JLabel("\u00DCr\u00FCn Ad\u0131");
        Urun_Adı_lb.setOpaque(true);
        Urun_Adı_lb.setForeground(Color.WHITE);
        Urun_Adı_lb.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Urun_Adı_lb.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Urun_Adı_lb.setBackground(SystemColor.activeCaption);
        Urun_Adı_lb.setBounds(0, 0, 830, 24);
        Ürün_Hareketleri_Lp.add(Urun_Adı_lb);

        JLabel lblNewLabel_2_1_5_1_1_1 = new JLabel("Tarih");
        lblNewLabel_2_1_5_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_1_1_1.setBounds(10, 35, 89, 24);
        Ürün_Hareketleri_Lp.add(lblNewLabel_2_1_5_1_1_1);

        JLabel lblNewLabel_2_1_5_1_1_2 = new JLabel("Miktar");
        lblNewLabel_2_1_5_1_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_1_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_1_1_2.setBounds(10, 70, 89, 24);
        Ürün_Hareketleri_Lp.add(lblNewLabel_2_1_5_1_1_2);

        JLabel lblNewLabel_2_1_5_1_1_3 = new JLabel("Birim Fiyat");
        lblNewLabel_2_1_5_1_1_3.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_1_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_1_1_3.setBounds(10, 105, 89, 24);
        Ürün_Hareketleri_Lp.add(lblNewLabel_2_1_5_1_1_3);

        JLabel lblNewLabel_2_1_5_1_1_1_1 = new JLabel("Toplam Tutar");
        lblNewLabel_2_1_5_1_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_1_1_1_1.setBounds(10, 140, 89, 24);
        Ürün_Hareketleri_Lp.add(lblNewLabel_2_1_5_1_1_1_1);

        JLabel lblNewLabel_2_1_5_1_1_2_1 = new JLabel("A\u00E7\u0131klama");
        lblNewLabel_2_1_5_1_1_2_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_1_1_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_1_1_2_1.setBounds(10, 175, 89, 24);
        Ürün_Hareketleri_Lp.add(lblNewLabel_2_1_5_1_1_2_1);

        JLabel lblNewLabel_2_1_5_1_1_1_1_1 = new JLabel("---");
        lblNewLabel_2_1_5_1_1_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_1_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_1_1_1_1_1.setBounds(109, 140, 89, 24);
        Ürün_Hareketleri_Lp.add(lblNewLabel_2_1_5_1_1_1_1_1);

        JLabel lblNewLabel_2_1_5_1_1_2_1_1 = new JLabel("---");
        lblNewLabel_2_1_5_1_1_2_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_1_1_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_1_1_2_1_1.setBounds(109, 175, 89, 24);
        Ürün_Hareketleri_Lp.add(lblNewLabel_2_1_5_1_1_2_1_1);

        JLabel lblNewLabel_2_1_5_1_1_3_1 = new JLabel("---");
        lblNewLabel_2_1_5_1_1_3_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_1_1_3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_1_1_3_1.setBounds(109, 105, 89, 24);
        Ürün_Hareketleri_Lp.add(lblNewLabel_2_1_5_1_1_3_1);

        JLabel lblNewLabel_2_1_5_1_1_2_2 = new JLabel("---");
        lblNewLabel_2_1_5_1_1_2_2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_1_1_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_1_1_2_2.setBounds(109, 70, 89, 24);
        Ürün_Hareketleri_Lp.add(lblNewLabel_2_1_5_1_1_2_2);

        JLabel lblNewLabel_2_1_5_1_1_1_2 = new JLabel("---");
        lblNewLabel_2_1_5_1_1_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_1_1_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_1_1_1_2.setBounds(109, 35, 89, 24);
        Ürün_Hareketleri_Lp.add(lblNewLabel_2_1_5_1_1_1_2);

        List<Cariler> current_cari = serializer.DeSerializeCari();
        serializer.serializeCari(current_cari,"ahmet","0 553 050 98 56",432);
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
                            displayed_Cari = cari; // so we can use later to get the methods. ex: displayed_Cari.Name
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







        Sirket_Panel = new JPanel();
        Sirket_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        Sirket_Panel.setBackground(Color.WHITE);
        mainLp.add(Sirket_Panel, "name_428870724384700");
        Sirket_Panel.setLayout(null);

        JLabel lblirketBilgileri = new JLabel("\u015Eirket Bilgileri");
        lblirketBilgileri.setOpaque(true);
        lblirketBilgileri.setForeground(Color.WHITE);
        lblirketBilgileri.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblirketBilgileri.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblirketBilgileri.setBackground(SystemColor.activeCaption);
        lblirketBilgileri.setBounds(0, 0, 870, 31);
        Sirket_Panel.add(lblirketBilgileri);

        JPanel panel_4_2 = new JPanel();
        panel_4_2.setLayout(null);
        panel_4_2.setBorder(new LineBorder(new Color(153, 180, 209), 3, true));
        panel_4_2.setBackground(Color.WHITE);
        panel_4_2.setBounds(10, 42, 850, 213);
        Sirket_Panel.add(panel_4_2);

        JLabel lblNewLabel_7_2 = new JLabel("Proje \u0130simlendirme");
        lblNewLabel_7_2.setOpaque(true);
        lblNewLabel_7_2.setForeground(Color.WHITE);
        lblNewLabel_7_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_7_2.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblNewLabel_7_2.setBackground(SystemColor.activeCaption);
        lblNewLabel_7_2.setBounds(0, 0, 849, 24);
        panel_4_2.add(lblNewLabel_7_2);

        JLabel lblNewLabel_2_1_5_2 = new JLabel("\u015Eirket Ad\u0131");
        lblNewLabel_2_1_5_2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_2.setBounds(10, 35, 89, 24);
        panel_4_2.add(lblNewLabel_2_1_5_2);

        textField_3 = new JTextField();
        textField_3.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField_3.setColumns(10);
        textField_3.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField_3.setBounds(10, 60, 265, 22);
        panel_4_2.add(textField_3);

        JLabel lblNewLabel_2_1_1_3_1 = new JLabel("Ad-Soyad");
        lblNewLabel_2_1_1_3_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_1_3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_1_3_1.setBounds(10, 93, 89, 24);
        panel_4_2.add(lblNewLabel_2_1_1_3_1);

        textField_4 = new JTextField();
        textField_4.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField_4.setColumns(10);
        textField_4.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField_4.setBounds(10, 118, 265, 22);
        panel_4_2.add(textField_4);

        JLabel lblNewLabel_2_1_2_3_1 = new JLabel("Telefon");
        lblNewLabel_2_1_2_3_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_2_3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_2_3_1.setBounds(10, 151, 111, 24);
        panel_4_2.add(lblNewLabel_2_1_2_3_1);

        textField_5 = new JTextField();
        textField_5.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField_5.setColumns(10);
        textField_5.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField_5.setBounds(10, 176, 265, 22);
        panel_4_2.add(textField_5);

        JLabel lblNewLabel_2_1_5_2_1 = new JLabel("Web Site");
        lblNewLabel_2_1_5_2_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_2_1.setBounds(326, 35, 89, 24);
        panel_4_2.add(lblNewLabel_2_1_5_2_1);

        textField_6 = new JTextField();
        textField_6.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField_6.setColumns(10);
        textField_6.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField_6.setBounds(326, 60, 284, 22);
        panel_4_2.add(textField_6);

        JLabel lblNewLabel_2_1_1_3_1_1 = new JLabel("Yetkili E-Posta");
        lblNewLabel_2_1_1_3_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_1_3_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_1_3_1_1.setBounds(326, 93, 89, 24);
        panel_4_2.add(lblNewLabel_2_1_1_3_1_1);

        textField_7 = new JTextField();
        textField_7.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField_7.setColumns(10);
        textField_7.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField_7.setBounds(326, 118, 284, 22);
        panel_4_2.add(textField_7);

        JLabel lblNewLabel_2_1_2_3_1_1 = new JLabel("Adres");
        lblNewLabel_2_1_2_3_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_2_3_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_2_3_1_1.setBounds(326, 151, 111, 24);
        panel_4_2.add(lblNewLabel_2_1_2_3_1_1);

        textField_8 = new JTextField();
        textField_8.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField_8.setColumns(10);
        textField_8.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField_8.setBounds(326, 176, 284, 22);
        panel_4_2.add(textField_8);

        JLabel lblNewLabel_2_1_5_2_1_1 = new JLabel("\u015Eirket Logosu");
        lblNewLabel_2_1_5_2_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_2_1_1.setBounds(699, 35, 89, 24);
        panel_4_2.add(lblNewLabel_2_1_5_2_1_1);

        JLabel lblNewLabel_2_1_5_2_1_1_1 = new JLabel("Logo");
        lblNewLabel_2_1_5_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_5_2_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_2_1_1_1.setBounds(665, 70, 151, 108);
        panel_4_2.add(lblNewLabel_2_1_5_2_1_1_1);

        JLabel lblNewLabel_2_1_5_2_1_1_2 = new JLabel("De\u011Fi\u015Ftirmek \u0130\u00E7in Logoya T\u0131klay\u0131n...");
        lblNewLabel_2_1_5_2_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_5_2_1_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_2_1_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        lblNewLabel_2_1_5_2_1_1_2.setBounds(646, 171, 203, 24);
        panel_4_2.add(lblNewLabel_2_1_5_2_1_1_2);

        JPanel panel_4_2_1 = new JPanel();
        panel_4_2_1.setLayout(null);
        panel_4_2_1.setBorder(new LineBorder(new Color(153, 180, 209), 3, true));
        panel_4_2_1.setBackground(Color.WHITE);
        panel_4_2_1.setBounds(10, 266, 850, 95);
        Sirket_Panel.add(panel_4_2_1);

        JLabel lblNewLabel_7_2_1 = new JLabel("Firma \u0130simlendirme");
        lblNewLabel_7_2_1.setOpaque(true);
        lblNewLabel_7_2_1.setForeground(Color.WHITE);
        lblNewLabel_7_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_7_2_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblNewLabel_7_2_1.setBackground(SystemColor.activeCaption);
        lblNewLabel_7_2_1.setBounds(0, 0, 849, 24);
        panel_4_2_1.add(lblNewLabel_7_2_1);

        JLabel lblNewLabel_2_1_5_2_2 = new JLabel("\u015Eirket Ad\u0131");
        lblNewLabel_2_1_5_2_2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_2_2.setBounds(10, 35, 89, 24);
        panel_4_2_1.add(lblNewLabel_2_1_5_2_2);

        textField_12 = new JTextField();
        textField_12.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField_12.setColumns(10);
        textField_12.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField_12.setBounds(10, 60, 265, 22);
        panel_4_2_1.add(textField_12);

        JLabel lblNewLabel_2_1_5_2_1_2 = new JLabel("Web Site");
        lblNewLabel_2_1_5_2_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5_2_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5_2_1_2.setBounds(326, 35, 89, 24);
        panel_4_2_1.add(lblNewLabel_2_1_5_2_1_2);

        textField_15 = new JTextField();
        textField_15.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField_15.setColumns(10);
        textField_15.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField_15.setBounds(326, 60, 284, 22);
        panel_4_2_1.add(textField_15);

        JLabel Sonraki2_1_1_1_3 = new JLabel("Kaydet");
        Sonraki2_1_1_1_3.setOpaque(true);
        Sonraki2_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
        Sonraki2_1_1_1_3.setForeground(Color.WHITE);
        Sonraki2_1_1_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        Sonraki2_1_1_1_3.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Sonraki2_1_1_1_3.setBackground(SystemColor.activeCaption);
        Sonraki2_1_1_1_3.setBounds(710, 479, 150, 35);
        Sirket_Panel.add(Sonraki2_1_1_1_3);

        Rapor_Panel = new JPanel();
        Rapor_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        Rapor_Panel.setBackground(Color.WHITE);
        mainLp.add(Rapor_Panel, "name_428870742364800");
        Rapor_Panel.setLayout(null);

        JLabel lblRaporlar = new JLabel("Raporlar");
        lblRaporlar.setOpaque(true);
        lblRaporlar.setForeground(Color.WHITE);
        lblRaporlar.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblRaporlar.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblRaporlar.setBackground(SystemColor.activeCaption);
        lblRaporlar.setBounds(0, 0, 870, 31);
        Rapor_Panel.add(lblRaporlar);

        BalkonSis_Panel = new JPanel();
        BalkonSis_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        BalkonSis_Panel.setBackground(Color.WHITE);
        mainLp.add(BalkonSis_Panel, "name_428870764322000");
        BalkonSis_Panel.setLayout(null);

        JLabel lblBalkonSistemleri = new JLabel("Balkon Sistemleri");
        lblBalkonSistemleri.setOpaque(true);
        lblBalkonSistemleri.setForeground(Color.WHITE);
        lblBalkonSistemleri.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblBalkonSistemleri.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblBalkonSistemleri.setBackground(SystemColor.activeCaption);
        lblBalkonSistemleri.setBounds(0, 0, 870, 31);
        BalkonSis_Panel.add(lblBalkonSistemleri);

        Ayar_Panel = new JPanel();
        Ayar_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        Ayar_Panel.setBackground(Color.WHITE);
        mainLp.add(Ayar_Panel, "name_428870782664800");
        Ayar_Panel.setLayout(null);

        JLabel lblAyarlar = new JLabel("Ayarlar");
        lblAyarlar.setOpaque(true);
        lblAyarlar.setForeground(Color.WHITE);
        lblAyarlar.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblAyarlar.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblAyarlar.setBackground(SystemColor.activeCaption);
        lblAyarlar.setBounds(0, 0, 870, 31);
        Ayar_Panel.add(lblAyarlar);

        SSS_Panel = new JPanel();
        SSS_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        SSS_Panel.setBackground(Color.WHITE);
        mainLp.add(SSS_Panel, "name_428870800927100");
        SSS_Panel.setLayout(null);

        JLabel lblSssVeIletiim = new JLabel("SSS ve \u0130leti\u015Fim");
        lblSssVeIletiim.setOpaque(true);
        lblSssVeIletiim.setForeground(Color.WHITE);
        lblSssVeIletiim.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblSssVeIletiim.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblSssVeIletiim.setBackground(SystemColor.activeCaption);
        lblSssVeIletiim.setBounds(0, 0, 870, 31);
        SSS_Panel.add(lblSssVeIletiim);

        Foto_Panel = new JPanel();
        Foto_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        Foto_Panel.setBackground(Color.WHITE);
        mainLp.add(Foto_Panel, "name_428870821116400");
        Foto_Panel.setLayout(null);

        JLabel lblFotoraflar = new JLabel("Foto\u011Fraflar");
        lblFotoraflar.setOpaque(true);
        lblFotoraflar.setForeground(Color.WHITE);
        lblFotoraflar.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblFotoraflar.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblFotoraflar.setBackground(SystemColor.activeCaption);
        lblFotoraflar.setBounds(0, 0, 870, 31);
        Foto_Panel.add(lblFotoraflar);

        JLabel Sonraki2_1_1_1_3_1 = new JLabel("Resim Ekle");
        Sonraki2_1_1_1_3_1.setOpaque(true);
        Sonraki2_1_1_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        Sonraki2_1_1_1_3_1.setForeground(Color.WHITE);
        Sonraki2_1_1_1_3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        Sonraki2_1_1_1_3_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Sonraki2_1_1_1_3_1.setBackground(SystemColor.activeCaption);
        Sonraki2_1_1_1_3_1.setBounds(710, 479, 150, 35);
        Foto_Panel.add(Sonraki2_1_1_1_3_1);

        JLabel Sonraki2_1_1_1_3_1_1 = new JLabel("Resim \u00C7ek");
        Sonraki2_1_1_1_3_1_1.setOpaque(true);
        Sonraki2_1_1_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Sonraki2_1_1_1_3_1_1.setForeground(Color.WHITE);
        Sonraki2_1_1_1_3_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        Sonraki2_1_1_1_3_1_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Sonraki2_1_1_1_3_1_1.setBackground(SystemColor.activeCaption);
        Sonraki2_1_1_1_3_1_1.setBounds(10, 479, 150, 35);
        Foto_Panel.add(Sonraki2_1_1_1_3_1_1);

        JLabel lblNewLabel_2_1_3_3 = new JLabel("Resim Say\u0131s\u0131");
        lblNewLabel_2_1_3_3.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_3_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_3_3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_2_1_3_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.desktop));
        lblNewLabel_2_1_3_3.setBounds(747, 42, 113, 24);
        Foto_Panel.add(lblNewLabel_2_1_3_3);

        JLabel lblNewLabel_2_1_1_1_1_2_2 = new JLabel("000");
        lblNewLabel_2_1_1_1_1_2_2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_1_1_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_1_1_1_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_2_1_1_1_1_2_2.setBounds(747, 67, 113, 24);
        Foto_Panel.add(lblNewLabel_2_1_1_1_1_2_2);

        ProJeOlstur_Panel = new JPanel();
        ProJeOlstur_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        ProJeOlstur_Panel.setBackground(Color.WHITE);
        mainLp.add(ProJeOlstur_Panel, "name_432296284066100");
        ProJeOlstur_Panel.setLayout(null);

        String arr[] = {"Cam-1","Cam-2","Cam-3","Cam-4","Cam-5","Cam-6","Cam-7"};
        JPanel Combobox_Panel = new JPanel();
        Combobox_Panel.setBounds(10, 38, 850, 65);
        ProJeOlstur_Panel.add(Combobox_Panel);
        Combobox_Panel.setBackground(Color.WHITE);
        Combobox_Panel.setLayout(new GridLayout(0, 1, 0, 0));
        comboBox = new JComboBox(arr);
        comboBox.setDoubleBuffered(true);
        comboBox.setBackground(Color.WHITE);
        comboBox.setBorder(new LineBorder(new Color(153, 180, 209), 2));
        comboBox.setAlignmentX(Component.LEFT_ALIGNMENT);
        Combobox_Panel.add(comboBox);

        JPanel AlmRng_Panel = new JPanel();
        AlmRng_Panel.setBounds(10, 114, 850, 75);
        ProJeOlstur_Panel.add(AlmRng_Panel);
        AlmRng_Panel.setBackground(Color.WHITE);
        AlmRng_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        AlmRng_Panel.setLayout(null);

        JLabel AlmRng_lb = new JLabel("Al\u00FCminyum Rengi");
        AlmRng_lb.setForeground(Color.WHITE);
        AlmRng_lb.setOpaque(true);
        AlmRng_lb.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        AlmRng_lb.setBounds(0, 0, 850, 25);
        AlmRng_Panel.add(AlmRng_lb);
        AlmRng_lb.setHorizontalAlignment(SwingConstants.LEFT);
        AlmRng_lb.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        AlmRng_lb.setBackground(SystemColor.activeCaption);

        JRadioButton Rb1 = new JRadioButton("Eloksal");
        Rb1.setHorizontalAlignment(SwingConstants.LEFT);
        Rb1.setBackground(Color.WHITE);
        Rb1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb1.setBounds(10, 35, 82, 23);
        AlmRng_Panel.add(Rb1);

        JRadioButton Rb2 = new JRadioButton("Bronz");
        Rb2.setHorizontalAlignment(SwingConstants.LEFT);
        Rb2.setBackground(Color.WHITE);
        Rb2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb2.setBounds(94, 35, 72, 23);
        AlmRng_Panel.add(Rb2);

        JRadioButton Rb3 = new JRadioButton("Ah\u015Fap");
        Rb3.setHorizontalAlignment(SwingConstants.LEFT);
        Rb3.setBackground(Color.WHITE);
        Rb3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb3.setBounds(168, 35, 72, 23);
        AlmRng_Panel.add(Rb3);

        JRadioButton Rb4 = new JRadioButton("Antrasit Gri");
        Rb4.setHorizontalAlignment(SwingConstants.LEFT);
        Rb4.setBackground(Color.WHITE);
        Rb4.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb4.setBounds(242, 35, 115, 23);
        AlmRng_Panel.add(Rb4);

        JRadioButton Rb5 = new JRadioButton("Beyaz");
        Rb5.setHorizontalAlignment(SwingConstants.LEFT);
        Rb5.setBackground(Color.WHITE);
        Rb5.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb5.setBounds(358, 35, 72, 23);
        AlmRng_Panel.add(Rb5);

        JRadioButton Rb6 = new JRadioButton("Siyah");
        Rb6.setHorizontalAlignment(SwingConstants.LEFT);
        Rb6.setBackground(Color.WHITE);
        Rb6.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb6.setBounds(432, 35, 72, 23);
        AlmRng_Panel.add(Rb6);

        JRadioButton Rb7 = new JRadioButton("RAL");
        Rb7.setHorizontalAlignment(SwingConstants.LEFT);
        Rb7.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb7.setBackground(Color.WHITE);
        Rb7.setBounds(506, 35, 61, 23);
        AlmRng_Panel.add(Rb7);
        ButtonGroup AlRngRadBut = new ButtonGroup();
        AlRngRadBut.add(Rb1);
        AlRngRadBut.add(Rb2);
        AlRngRadBut.add(Rb3);
        AlRngRadBut.add(Rb4);
        AlRngRadBut.add(Rb5);
        AlRngRadBut.add(Rb6);
        AlRngRadBut.add(Rb7);

        JPanel CamRng_Panel = new JPanel();
        CamRng_Panel.setBounds(10, 200, 850, 75);
        ProJeOlstur_Panel.add(CamRng_Panel);
        CamRng_Panel.setLayout(null);
        CamRng_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        CamRng_Panel.setBackground(Color.WHITE);

        JLabel CamRng_lb = new JLabel("Cam Rengi");
        CamRng_lb.setForeground(Color.WHITE);
        CamRng_lb.setOpaque(true);
        CamRng_lb.setHorizontalAlignment(SwingConstants.LEFT);
        CamRng_lb.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        CamRng_lb.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        CamRng_lb.setBackground(SystemColor.activeCaption);
        CamRng_lb.setBounds(0, 0, 850, 23);
        CamRng_Panel.add(CamRng_lb);

        JRadioButton CRb1 = new JRadioButton("\u015Eeffaf");
        CRb1.setHorizontalAlignment(SwingConstants.CENTER);
        CRb1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        CRb1.setBackground(Color.WHITE);
        CRb1.setBounds(6, 42, 82, 23);
        CamRng_Panel.add(CRb1);

        JRadioButton CRb2 = new JRadioButton("F\u00FCme");
        CRb2.setHorizontalAlignment(SwingConstants.CENTER);
        CRb2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        CRb2.setBackground(Color.WHITE);
        CRb2.setBounds(90, 42, 72, 25);
        CamRng_Panel.add(CRb2);

        JRadioButton CRb3 = new JRadioButton("Bronz");
        CRb3.setHorizontalAlignment(SwingConstants.CENTER);
        CRb3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        CRb3.setBackground(Color.WHITE);
        CRb3.setBounds(164, 42, 72, 23);
        CamRng_Panel.add(CRb3);

        JRadioButton CRb4 = new JRadioButton("Reflekte Mavi");
        CRb4.setHorizontalAlignment(SwingConstants.CENTER);
        CRb4.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        CRb4.setBackground(Color.WHITE);
        CRb4.setBounds(238, 42, 132, 23);
        CamRng_Panel.add(CRb4);

        JRadioButton CRb5 = new JRadioButton("Ye\u015Fil");
        CRb5.setHorizontalAlignment(SwingConstants.CENTER);
        CRb5.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        CRb5.setBackground(Color.WHITE);
        CRb5.setBounds(372, 42, 72, 23);
        CamRng_Panel.add(CRb5);

        JRadioButton CRb6 = new JRadioButton("Mavi");
        CRb6.setHorizontalAlignment(SwingConstants.CENTER);
        CRb6.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        CRb6.setBackground(Color.WHITE);
        CRb6.setBounds(446, 42, 72, 23);
        CamRng_Panel.add(CRb6);

        JRadioButton CRb7 = new JRadioButton("Reflekte F\u00FCme");
        CRb7.setHorizontalAlignment(SwingConstants.CENTER);
        CRb7.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        CRb7.setBackground(Color.WHITE);
        CRb7.setBounds(520, 42, 143, 23);
        CamRng_Panel.add(CRb7);
        ButtonGroup CamRadButGrp = new ButtonGroup();
        CamRadButGrp.add(CRb1);
        CamRadButGrp.add(CRb2);
        CamRadButGrp.add(CRb3);
        CamRadButGrp.add(CRb4);
        CamRadButGrp.add(CRb5);
        CamRadButGrp.add(CRb6);
        CamRadButGrp.add(CRb7);

        ProjeOlustur_Diger_Lp = new JLayeredPane();
        ProjeOlustur_Diger_Lp.setBounds(10, 286, 850, 187);
        ProJeOlstur_Panel.add(ProjeOlustur_Diger_Lp);
        ProjeOlustur_Diger_Lp.setLayout(new CardLayout(0, 0));

        Cam_1_Diger_Panel_1 = new JPanel();
        Cam_1_Diger_Panel_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Cam_1_Diger_Panel_1.setBackground(Color.WHITE);
        ProjeOlustur_Diger_Lp.add(Cam_1_Diger_Panel_1, "name_448305839140000");
        Cam_1_Diger_Panel_1.setLayout(null);

        comboBox.addItemListener(new ItemListener(){

            @Override
            public void itemStateChanged(ItemEvent e) {
                if	(e.getStateChange() == ItemEvent.SELECTED) {

                    switch (comboBox.getSelectedItem().toString()) {
                        case "Cam-1":
                            SwitchDigerPanels(Cam_1_Diger_Panel_1);
                            break;
                        case "Cam-2":
                            SwitchDigerPanels(Cam_2_Diger_Panel_1);
                            break;
                        case "Cam-3":
                            SwitchDigerPanels(Cam_3_Diger_Panel_1);
                            break;
                        case "Cam-4":
                            SwitchDigerPanels(Cam_4_Diger_Panel_1);
                            break;
                        case "Cam-5":
                            SwitchDigerPanels(Cam_5_Diger_Panel_1);
                            break;
                        case "Cam-6":
                            SwitchDigerPanels(Cam_6_Diger_Panel_1);
                            break;
                        case "Cam-7":
                            SwitchDigerPanels(Cam_7_Diger_Panel_1);
                            break;
                    }

                }

            }

        });

        JCheckBox chckbxNewCheckBox = new JCheckBox("<html>Harici Damlal\u0131k<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox.setBackground(Color.WHITE);
        chckbxNewCheckBox.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox.setBounds(6, 40, 150, 45);
        Cam_1_Diger_Panel_1.add(chckbxNewCheckBox);

        JCheckBox chckbxIspanyoletKol = new JCheckBox("<html>\u0130spanyolet Kol<br> &nbsp;<br>&nbsp;</html>");
        chckbxIspanyoletKol.setVerticalAlignment(SwingConstants.TOP);
        chckbxIspanyoletKol.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxIspanyoletKol.setBackground(Color.WHITE);
        chckbxIspanyoletKol.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxIspanyoletKol.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxIspanyoletKol.setBounds(6, 88, 150, 45);
        Cam_1_Diger_Panel_1.add(chckbxIspanyoletKol);

        JCheckBox chckbxKpete = new JCheckBox("<html>K\u00FCpe\u015Fte<br> &nbsp;<br>&nbsp;</html>");
        chckbxKpete.setVerticalAlignment(SwingConstants.TOP);
        chckbxKpete.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxKpete.setBackground(Color.WHITE);
        chckbxKpete.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxKpete.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxKpete.setBounds(6, 136, 150, 45);
        Cam_1_Diger_Panel_1.add(chckbxKpete);

        JCheckBox chckbxPerdelikAyarProfili = new JCheckBox("<html>Perdelik Ayar Profili<br> &nbsp;<br>&nbsp;</html>");
        chckbxPerdelikAyarProfili.setVerticalAlignment(SwingConstants.TOP);
        chckbxPerdelikAyarProfili.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxPerdelikAyarProfili.setBackground(Color.WHITE);
        chckbxPerdelikAyarProfili.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxPerdelikAyarProfili.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxPerdelikAyarProfili.setBounds(310, 41, 242, 45);
        Cam_1_Diger_Panel_1.add(chckbxPerdelikAyarProfili);

        JCheckBox chckbxPlastikTekerler = new JCheckBox("<html>Plastik Teker<br> &nbsp;<br>&nbsp;</html>");
        chckbxPlastikTekerler.setVerticalAlignment(SwingConstants.TOP);
        chckbxPlastikTekerler.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxPlastikTekerler.setBackground(Color.WHITE);
        chckbxPlastikTekerler.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxPlastikTekerler.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxPlastikTekerler.setBounds(310, 88, 242, 45);
        Cam_1_Diger_Panel_1.add(chckbxPlastikTekerler);

        JCheckBox chckbxHerCepheyiBamsz = new JCheckBox("<html>Her Cepheyi Ba\u011F\u0131ms\u0131z Hesapla<br> &nbsp;<br>&nbsp;</html>");
        chckbxHerCepheyiBamsz.setVerticalAlignment(SwingConstants.TOP);
        chckbxHerCepheyiBamsz.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxHerCepheyiBamsz.setBackground(Color.WHITE);
        chckbxHerCepheyiBamsz.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxHerCepheyiBamsz.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxHerCepheyiBamsz.setBounds(310, 136, 242, 45);
        Cam_1_Diger_Panel_1.add(chckbxHerCepheyiBamsz);

        JCheckBox chckbxNewCheckBox_5_1 = new JCheckBox("<html>Mermer<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_5_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_5_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1.setBackground(Color.WHITE);
        chckbxNewCheckBox_5_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_5_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1.setBounds(158, 136, 150, 45);
        Cam_1_Diger_Panel_1.add(chckbxNewCheckBox_5_1);

        JCheckBox chckbxNewCheckBox_4_1 = new JCheckBox("<html>Montaj Dahil<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_4_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_4_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1.setBackground(Color.WHITE);
        chckbxNewCheckBox_4_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_4_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1.setBounds(158, 88, 150, 45);
        Cam_1_Diger_Panel_1.add(chckbxNewCheckBox_4_1);

        JCheckBox chckbxNewCheckBox_3_1 = new JCheckBox("<html>Kapaks\u0131z Hesapla<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_3_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_3_1.setBackground(Color.WHITE);
        chckbxNewCheckBox_3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_3_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_3_1.setBounds(158, 40, 150, 45);
        Cam_1_Diger_Panel_1.add(chckbxNewCheckBox_3_1);

        JLabel CamRng_lb_1 = new JLabel("Di\u011Fer");
        CamRng_lb_1.setOpaque(true);
        CamRng_lb_1.setHorizontalAlignment(SwingConstants.LEFT);
        CamRng_lb_1.setForeground(Color.WHITE);
        CamRng_lb_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        CamRng_lb_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        CamRng_lb_1.setBackground(SystemColor.activeCaption);
        CamRng_lb_1.setBounds(0, 0, 850, 23);
        Cam_1_Diger_Panel_1.add(CamRng_lb_1);

        JToggleButton toggleButton = new JToggleButton("New toggle button");
        toggleButton.setBounds(582, 88, 121, 23);
        Cam_1_Diger_Panel_1.add(toggleButton);

        JPanel Sistem_Cepheleri_Panel = new JPanel();
        Sistem_Cepheleri_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        Sistem_Cepheleri_Panel.setBackground(Color.WHITE);
        mainLp.add(Sistem_Cepheleri_Panel, "name_498609784460100");
        Sistem_Cepheleri_Panel.setLayout(null);

        Cam_2_Diger_Panel_1 = new JPanel();
        Cam_2_Diger_Panel_1.setBackground(Color.WHITE);
        Cam_2_Diger_Panel_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Cam_2_Diger_Panel_1.setLayout(null);
        ProjeOlustur_Diger_Lp.add(Cam_2_Diger_Panel_1, "name_483240038113000");

        JCheckBox chckbxNewCheckBox_1 = new JCheckBox("<html>Harici Damlal\u0131k<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_1.setBackground(Color.WHITE);
        chckbxNewCheckBox_1.setBounds(6, 40, 150, 45);
        Cam_2_Diger_Panel_1.add(chckbxNewCheckBox_1);

        JCheckBox chckbxIspanyoletKol_1 = new JCheckBox("<html>\u0130spanyolet Kol<br> &nbsp;<br>&nbsp;</html>");
        chckbxIspanyoletKol_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxIspanyoletKol_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxIspanyoletKol_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxIspanyoletKol_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxIspanyoletKol_1.setBackground(Color.WHITE);
        chckbxIspanyoletKol_1.setBounds(6, 88, 150, 45);
        Cam_2_Diger_Panel_1.add(chckbxIspanyoletKol_1);

        JCheckBox chckbxKpete_1 = new JCheckBox("<html>K\u00FCpe\u015Fte<br> &nbsp;<br>&nbsp;</html>");
        chckbxKpete_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxKpete_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxKpete_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxKpete_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxKpete_1.setBackground(Color.WHITE);
        chckbxKpete_1.setBounds(6, 136, 150, 45);
        Cam_2_Diger_Panel_1.add(chckbxKpete_1);

        JCheckBox chckbxPerdelikAyarProfili_1 = new JCheckBox("<html>Perdelik Ayar Profili<br> &nbsp;<br>&nbsp;</html>");
        chckbxPerdelikAyarProfili_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxPerdelikAyarProfili_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxPerdelikAyarProfili_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxPerdelikAyarProfili_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxPerdelikAyarProfili_1.setBackground(Color.WHITE);
        chckbxPerdelikAyarProfili_1.setBounds(310, 41, 242, 45);
        Cam_2_Diger_Panel_1.add(chckbxPerdelikAyarProfili_1);

        JCheckBox chckbxPlastikTekerler_1 = new JCheckBox("<html>Plastik Teker<br> &nbsp;<br>&nbsp;</html>");
        chckbxPlastikTekerler_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxPlastikTekerler_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxPlastikTekerler_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxPlastikTekerler_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxPlastikTekerler_1.setBackground(Color.WHITE);
        chckbxPlastikTekerler_1.setBounds(310, 88, 242, 45);
        Cam_2_Diger_Panel_1.add(chckbxPlastikTekerler_1);

        JCheckBox chckbxHerCepheyiBamsz_1 = new JCheckBox("<html>Her Cepheyi Ba\u011F\u0131ms\u0131z Hesapla<br> &nbsp;<br>&nbsp;</html>");
        chckbxHerCepheyiBamsz_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxHerCepheyiBamsz_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxHerCepheyiBamsz_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxHerCepheyiBamsz_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxHerCepheyiBamsz_1.setBackground(Color.WHITE);
        chckbxHerCepheyiBamsz_1.setBounds(310, 136, 242, 45);
        Cam_2_Diger_Panel_1.add(chckbxHerCepheyiBamsz_1);

        JCheckBox chckbxNewCheckBox_5_1_1 = new JCheckBox("<html>Mermer<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_5_1_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_5_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_5_1_1.setBackground(Color.WHITE);
        chckbxNewCheckBox_5_1_1.setBounds(158, 136, 150, 45);
        Cam_2_Diger_Panel_1.add(chckbxNewCheckBox_5_1_1);

        JCheckBox chckbxNewCheckBox_4_1_1 = new JCheckBox("<html>Montaj Dahil<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_4_1_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_4_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_4_1_1.setBackground(Color.WHITE);
        chckbxNewCheckBox_4_1_1.setBounds(158, 88, 150, 45);
        Cam_2_Diger_Panel_1.add(chckbxNewCheckBox_4_1_1);

        JCheckBox chckbxNewCheckBox_3_1_1 = new JCheckBox("<html>Kapaks\u0131z Hesapla<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_3_1_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_3_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_3_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_3_1_1.setBackground(Color.WHITE);
        chckbxNewCheckBox_3_1_1.setBounds(158, 40, 150, 45);
        Cam_2_Diger_Panel_1.add(chckbxNewCheckBox_3_1_1);

        JLabel CamRng_lb_1_1 = new JLabel("Di\u011Fer");
        CamRng_lb_1_1.setOpaque(true);
        CamRng_lb_1_1.setHorizontalAlignment(SwingConstants.LEFT);
        CamRng_lb_1_1.setForeground(Color.WHITE);
        CamRng_lb_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        CamRng_lb_1_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        CamRng_lb_1_1.setBackground(SystemColor.activeCaption);
        CamRng_lb_1_1.setBounds(0, 0, 850, 23);
        Cam_2_Diger_Panel_1.add(CamRng_lb_1_1);

        Cam_3_Diger_Panel_1 = new JPanel();
        Cam_3_Diger_Panel_1.setBackground(Color.WHITE);
        Cam_3_Diger_Panel_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Cam_3_Diger_Panel_1.setLayout(null);
        ProjeOlustur_Diger_Lp.add(Cam_3_Diger_Panel_1, "name_483246545795000");

        JCheckBox chckbxNewCheckBox_2 = new JCheckBox("<html>Harici Damlal\u0131k<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_2.setBackground(Color.WHITE);
        chckbxNewCheckBox_2.setBounds(6, 40, 150, 45);
        Cam_3_Diger_Panel_1.add(chckbxNewCheckBox_2);

        JCheckBox chckbxIspanyoletKol_2 = new JCheckBox("<html>\u0130spanyolet Kol<br> &nbsp;<br>&nbsp;</html>");
        chckbxIspanyoletKol_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxIspanyoletKol_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxIspanyoletKol_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxIspanyoletKol_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxIspanyoletKol_2.setBackground(Color.WHITE);
        chckbxIspanyoletKol_2.setBounds(6, 88, 150, 45);
        Cam_3_Diger_Panel_1.add(chckbxIspanyoletKol_2);

        JCheckBox chckbxKpete_2 = new JCheckBox("<html>K\u00FCpe\u015Fte<br> &nbsp;<br>&nbsp;</html>");
        chckbxKpete_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxKpete_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxKpete_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxKpete_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxKpete_2.setBackground(Color.WHITE);
        chckbxKpete_2.setBounds(6, 136, 150, 45);
        Cam_3_Diger_Panel_1.add(chckbxKpete_2);

        JCheckBox chckbxPerdelikAyarProfili_2 = new JCheckBox("<html>Perdelik Ayar Profili<br> &nbsp;<br>&nbsp;</html>");
        chckbxPerdelikAyarProfili_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxPerdelikAyarProfili_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxPerdelikAyarProfili_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxPerdelikAyarProfili_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxPerdelikAyarProfili_2.setBackground(Color.WHITE);
        chckbxPerdelikAyarProfili_2.setBounds(310, 41, 242, 45);
        Cam_3_Diger_Panel_1.add(chckbxPerdelikAyarProfili_2);

        JCheckBox chckbxPlastikTekerler_2 = new JCheckBox("<html>Plastik Teker<br> &nbsp;<br>&nbsp;</html>");
        chckbxPlastikTekerler_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxPlastikTekerler_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxPlastikTekerler_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxPlastikTekerler_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxPlastikTekerler_2.setBackground(Color.WHITE);
        chckbxPlastikTekerler_2.setBounds(310, 88, 242, 45);
        Cam_3_Diger_Panel_1.add(chckbxPlastikTekerler_2);

        JCheckBox chckbxHerCepheyiBamsz_2 = new JCheckBox("<html>Her Cepheyi Ba\u011F\u0131ms\u0131z Hesapla<br> &nbsp;<br>&nbsp;</html>");
        chckbxHerCepheyiBamsz_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxHerCepheyiBamsz_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxHerCepheyiBamsz_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxHerCepheyiBamsz_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxHerCepheyiBamsz_2.setBackground(Color.WHITE);
        chckbxHerCepheyiBamsz_2.setBounds(310, 136, 242, 45);
        Cam_3_Diger_Panel_1.add(chckbxHerCepheyiBamsz_2);

        JCheckBox chckbxNewCheckBox_5_1_2 = new JCheckBox("<html>Mermer<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_5_1_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_5_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_5_1_2.setBackground(Color.WHITE);
        chckbxNewCheckBox_5_1_2.setBounds(158, 136, 150, 45);
        Cam_3_Diger_Panel_1.add(chckbxNewCheckBox_5_1_2);

        JCheckBox chckbxNewCheckBox_4_1_2 = new JCheckBox("<html>Montaj Dahil<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_4_1_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_4_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_4_1_2.setBackground(Color.WHITE);
        chckbxNewCheckBox_4_1_2.setBounds(158, 88, 150, 45);
        Cam_3_Diger_Panel_1.add(chckbxNewCheckBox_4_1_2);

        JCheckBox chckbxNewCheckBox_3_1_2 = new JCheckBox("<html>Kapaks\u0131z Hesapla<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_3_1_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_3_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_3_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_3_1_2.setBackground(Color.WHITE);
        chckbxNewCheckBox_3_1_2.setBounds(158, 40, 150, 45);
        Cam_3_Diger_Panel_1.add(chckbxNewCheckBox_3_1_2);

        JCheckBox chckbxNewCheckBox_5_1_2_1 = new JCheckBox("<html>Jaluzi Perde<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_5_1_2_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_5_1_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_5_1_2_1.setBackground(Color.WHITE);
        chckbxNewCheckBox_5_1_2_1.setBounds(694, 40, 150, 45);
        Cam_3_Diger_Panel_1.add(chckbxNewCheckBox_5_1_2_1);

        JCheckBox chckbxKpete_2_1 = new JCheckBox("<html>Tijli Kilit<br> &nbsp;<br>&nbsp;</html>");
        chckbxKpete_2_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxKpete_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxKpete_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxKpete_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxKpete_2_1.setBackground(Color.WHITE);
        chckbxKpete_2_1.setBounds(542, 40, 150, 45);
        Cam_3_Diger_Panel_1.add(chckbxKpete_2_1);

        JRadioButton Rb1_1 = new JRadioButton("4+12+4");
        buttonGroup.add(Rb1_1);
        Rb1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Rb1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb1_1.setBackground(Color.WHITE);
        Rb1_1.setBounds(564, 98, 82, 23);
        Cam_3_Diger_Panel_1.add(Rb1_1);

        JRadioButton Rb2_1 = new JRadioButton("4+16+4");
        buttonGroup.add(Rb2_1);
        Rb2_1.setHorizontalAlignment(SwingConstants.CENTER);
        Rb2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb2_1.setBackground(Color.WHITE);
        Rb2_1.setBounds(648, 98, 91, 23);
        Cam_3_Diger_Panel_1.add(Rb2_1);

        JRadioButton Rb3_1 = new JRadioButton("4+22+4");
        buttonGroup.add(Rb3_1);
        Rb3_1.setHorizontalAlignment(SwingConstants.CENTER);
        Rb3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb3_1.setBackground(Color.WHITE);
        Rb3_1.setBounds(741, 98, 88, 23);
        Cam_3_Diger_Panel_1.add(Rb3_1);

        JRadioButton rdbtnTekTemperli = new JRadioButton("Tek Temperli");
        buttonGroup_1.add(rdbtnTekTemperli);
        rdbtnTekTemperli.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnTekTemperli.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        rdbtnTekTemperli.setBackground(Color.WHITE);
        rdbtnTekTemperli.setBounds(554, 144, 142, 23);
        Cam_3_Diger_Panel_1.add(rdbtnTekTemperli);

        JRadioButton rdbtniftTemperli = new JRadioButton("\u00C7ift Temperli");
        buttonGroup_1.add(rdbtniftTemperli);
        rdbtniftTemperli.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtniftTemperli.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        rdbtniftTemperli.setBackground(Color.WHITE);
        rdbtniftTemperli.setBounds(698, 144, 146, 23);
        Cam_3_Diger_Panel_1.add(rdbtniftTemperli);

        JLabel CamRng_lb_1_2 = new JLabel("Di\u011Fer");
        CamRng_lb_1_2.setOpaque(true);
        CamRng_lb_1_2.setHorizontalAlignment(SwingConstants.LEFT);
        CamRng_lb_1_2.setForeground(Color.WHITE);
        CamRng_lb_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        CamRng_lb_1_2.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        CamRng_lb_1_2.setBackground(SystemColor.activeCaption);
        CamRng_lb_1_2.setBounds(0, 0, 850, 23);
        Cam_3_Diger_Panel_1.add(CamRng_lb_1_2);

        Cam_4_Diger_Panel_1 = new JPanel();
        Cam_4_Diger_Panel_1.setBackground(Color.WHITE);
        Cam_4_Diger_Panel_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Cam_4_Diger_Panel_1.setLayout(null);
        ProjeOlustur_Diger_Lp.add(Cam_4_Diger_Panel_1, "name_483248989624300");

        JCheckBox chckbxNewCheckBox_4_1_2_1 = new JCheckBox("<html>Montaj Dahil<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_4_1_2_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_4_1_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_4_1_2_1.setBackground(Color.WHITE);
        chckbxNewCheckBox_4_1_2_1.setBounds(162, 30, 150, 45);
        Cam_4_Diger_Panel_1.add(chckbxNewCheckBox_4_1_2_1);

        JCheckBox chckbxNewCheckBox_5_1_2_2 = new JCheckBox("<html>Mermer<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_5_1_2_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_5_1_2_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_5_1_2_2.setBackground(Color.WHITE);
        chckbxNewCheckBox_5_1_2_2.setBounds(466, 30, 150, 45);
        Cam_4_Diger_Panel_1.add(chckbxNewCheckBox_5_1_2_2);

        JCheckBox chckbxKpete_2_2 = new JCheckBox("<html>K\u00FCpe\u015Fte<br> &nbsp;<br>&nbsp;</html>");
        chckbxKpete_2_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxKpete_2_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxKpete_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxKpete_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxKpete_2_2.setBackground(Color.WHITE);
        chckbxKpete_2_2.setBounds(314, 30, 150, 45);
        Cam_4_Diger_Panel_1.add(chckbxKpete_2_2);

        JCheckBox chckbxNewCheckBox_4_1_2_1_1 = new JCheckBox("<html>E\u015Fikli<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_4_1_2_1_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_4_1_2_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_4_1_2_1_1.setBackground(Color.WHITE);
        chckbxNewCheckBox_4_1_2_1_1.setBounds(10, 30, 150, 45);
        Cam_4_Diger_Panel_1.add(chckbxNewCheckBox_4_1_2_1_1);

        JLabel CamRng_lb_1_3 = new JLabel("Di\u011Fer");
        CamRng_lb_1_3.setOpaque(true);
        CamRng_lb_1_3.setHorizontalAlignment(SwingConstants.LEFT);
        CamRng_lb_1_3.setForeground(Color.WHITE);
        CamRng_lb_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        CamRng_lb_1_3.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        CamRng_lb_1_3.setBackground(SystemColor.activeCaption);
        CamRng_lb_1_3.setBounds(0, 0, 850, 23);
        Cam_4_Diger_Panel_1.add(CamRng_lb_1_3);

        Cam_5_Diger_Panel_1 = new JPanel();
        Cam_5_Diger_Panel_1.setBackground(Color.WHITE);
        Cam_5_Diger_Panel_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Cam_5_Diger_Panel_1.setLayout(null);
        ProjeOlustur_Diger_Lp.add(Cam_5_Diger_Panel_1, "name_483329043110800");

        JCheckBox chckbxKpete_2_2_1 = new JCheckBox("<html>K\u00FCpe\u015Fte<br> &nbsp;<br>&nbsp;</html>");
        chckbxKpete_2_2_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxKpete_2_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxKpete_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxKpete_2_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxKpete_2_2_1.setBackground(Color.WHITE);
        chckbxKpete_2_2_1.setBounds(314, 30, 150, 45);
        Cam_5_Diger_Panel_1.add(chckbxKpete_2_2_1);

        JCheckBox chckbxNewCheckBox_5_1_2_2_1 = new JCheckBox("<html>Mermer<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_5_1_2_2_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_5_1_2_2_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_2_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_5_1_2_2_1.setBackground(Color.WHITE);
        chckbxNewCheckBox_5_1_2_2_1.setBounds(10, 30, 150, 45);
        Cam_5_Diger_Panel_1.add(chckbxNewCheckBox_5_1_2_2_1);

        JCheckBox chckbxNewCheckBox_4_1_2_1_2 = new JCheckBox("<html>Montaj Dahil<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_4_1_2_1_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_4_1_2_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_4_1_2_1_2.setBackground(Color.WHITE);
        chckbxNewCheckBox_4_1_2_1_2.setBounds(162, 30, 150, 45);
        Cam_5_Diger_Panel_1.add(chckbxNewCheckBox_4_1_2_1_2);

        JLabel CamRng_lb_1_4 = new JLabel("Di\u011Fer");
        CamRng_lb_1_4.setOpaque(true);
        CamRng_lb_1_4.setHorizontalAlignment(SwingConstants.LEFT);
        CamRng_lb_1_4.setForeground(Color.WHITE);
        CamRng_lb_1_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        CamRng_lb_1_4.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        CamRng_lb_1_4.setBackground(SystemColor.activeCaption);
        CamRng_lb_1_4.setBounds(0, 0, 850, 23);
        Cam_5_Diger_Panel_1.add(CamRng_lb_1_4);

        Cam_6_Diger_Panel_1 = new JPanel();
        Cam_6_Diger_Panel_1.setBackground(Color.WHITE);
        Cam_6_Diger_Panel_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Cam_6_Diger_Panel_1.setLayout(null);
        ProjeOlustur_Diger_Lp.add(Cam_6_Diger_Panel_1, "name_483334252549500");

        JRadioButton Rb1_1_1 = new JRadioButton("4+12+4");
        buttonGroup_2.add(Rb1_1_1);
        Rb1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Rb1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb1_1_1.setBackground(Color.WHITE);
        Rb1_1_1.setBounds(568, 40, 82, 23);
        Cam_6_Diger_Panel_1.add(Rb1_1_1);

        JRadioButton rdbtnTekTemperli_1 = new JRadioButton("Tek Temperli");
        buttonGroup_3.add(rdbtnTekTemperli_1);
        rdbtnTekTemperli_1.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnTekTemperli_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        rdbtnTekTemperli_1.setBackground(Color.WHITE);
        rdbtnTekTemperli_1.setBounds(558, 86, 142, 23);
        Cam_6_Diger_Panel_1.add(rdbtnTekTemperli_1);

        JRadioButton Rb2_1_1 = new JRadioButton("4+16+4");
        buttonGroup_2.add(Rb2_1_1);
        Rb2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Rb2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb2_1_1.setBackground(Color.WHITE);
        Rb2_1_1.setBounds(652, 40, 91, 23);
        Cam_6_Diger_Panel_1.add(Rb2_1_1);

        JRadioButton Rb3_1_1 = new JRadioButton("4+22+4");
        buttonGroup_2.add(Rb3_1_1);
        Rb3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Rb3_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb3_1_1.setBackground(Color.WHITE);
        Rb3_1_1.setBounds(745, 40, 88, 23);
        Cam_6_Diger_Panel_1.add(Rb3_1_1);

        JRadioButton rdbtniftTemperli_1 = new JRadioButton("\u00C7ift Temperli");
        buttonGroup_3.add(rdbtniftTemperli_1);
        rdbtniftTemperli_1.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtniftTemperli_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        rdbtniftTemperli_1.setBackground(Color.WHITE);
        rdbtniftTemperli_1.setBounds(702, 86, 146, 23);
        Cam_6_Diger_Panel_1.add(rdbtniftTemperli_1);

        JCheckBox chckbxNewCheckBox_4_1_2_2 = new JCheckBox("<html>Montaj Dahil<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_4_1_2_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_4_1_2_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_4_1_2_2.setBackground(Color.WHITE);
        chckbxNewCheckBox_4_1_2_2.setBounds(162, 30, 150, 45);
        Cam_6_Diger_Panel_1.add(chckbxNewCheckBox_4_1_2_2);

        JCheckBox chckbxNewCheckBox_5_1_2_3 = new JCheckBox("<html>Mermer<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_5_1_2_3.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_5_1_2_3.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_2_3.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_2_3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_5_1_2_3.setBackground(Color.WHITE);
        chckbxNewCheckBox_5_1_2_3.setBounds(10, 30, 150, 45);
        Cam_6_Diger_Panel_1.add(chckbxNewCheckBox_5_1_2_3);

        JCheckBox chckbxKpete_2_3 = new JCheckBox("<html>K\u00FCpe\u015Fte<br> &nbsp;<br>&nbsp;</html>");
        chckbxKpete_2_3.setVerticalAlignment(SwingConstants.TOP);
        chckbxKpete_2_3.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxKpete_2_3.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxKpete_2_3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxKpete_2_3.setBackground(Color.WHITE);
        chckbxKpete_2_3.setBounds(311, 30, 150, 45);
        Cam_6_Diger_Panel_1.add(chckbxKpete_2_3);

        JCheckBox chckbxKpete_2_3_1 = new JCheckBox("<html>Karolaj<br> &nbsp;<br>&nbsp;</html>");
        chckbxKpete_2_3_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxKpete_2_3_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxKpete_2_3_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxKpete_2_3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxKpete_2_3_1.setBackground(Color.WHITE);
        chckbxKpete_2_3_1.setBounds(10, 78, 150, 45);
        Cam_6_Diger_Panel_1.add(chckbxKpete_2_3_1);

        JLabel CamRng_lb_1_5 = new JLabel("Di\u011Fer");
        CamRng_lb_1_5.setOpaque(true);
        CamRng_lb_1_5.setHorizontalAlignment(SwingConstants.LEFT);
        CamRng_lb_1_5.setForeground(Color.WHITE);
        CamRng_lb_1_5.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        CamRng_lb_1_5.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        CamRng_lb_1_5.setBackground(SystemColor.activeCaption);
        CamRng_lb_1_5.setBounds(0, 0, 850, 23);
        Cam_6_Diger_Panel_1.add(CamRng_lb_1_5);

        Cam_7_Diger_Panel_1 = new JPanel();
        Cam_7_Diger_Panel_1.setBackground(Color.WHITE);
        Cam_7_Diger_Panel_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Cam_7_Diger_Panel_1.setLayout(null);
        ProjeOlustur_Diger_Lp.add(Cam_7_Diger_Panel_1, "name_483336630939800");

        JCheckBox chckbxNewCheckBox_4_1_2_1_1_1 = new JCheckBox("<html>E\u015Fikli<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_4_1_2_1_1_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_4_1_2_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_4_1_2_1_1_1.setBackground(Color.WHITE);
        chckbxNewCheckBox_4_1_2_1_1_1.setBounds(6, 30, 150, 45);
        Cam_7_Diger_Panel_1.add(chckbxNewCheckBox_4_1_2_1_1_1);

        JCheckBox chckbxKpete_2_2_2 = new JCheckBox("<html>K\u00FCpe\u015Fte<br> &nbsp;<br>&nbsp;</html>");
        chckbxKpete_2_2_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxKpete_2_2_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxKpete_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxKpete_2_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxKpete_2_2_2.setBackground(Color.WHITE);
        chckbxKpete_2_2_2.setBounds(310, 30, 150, 45);
        Cam_7_Diger_Panel_1.add(chckbxKpete_2_2_2);

        JCheckBox chckbxNewCheckBox_4_1_2_1_3 = new JCheckBox("<html>Montaj Dahil<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_4_1_2_1_3.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_4_1_2_1_3.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_4_1_2_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_4_1_2_1_3.setBackground(Color.WHITE);
        chckbxNewCheckBox_4_1_2_1_3.setBounds(158, 30, 150, 45);
        Cam_7_Diger_Panel_1.add(chckbxNewCheckBox_4_1_2_1_3);

        JCheckBox chckbxNewCheckBox_5_1_2_2_2 = new JCheckBox("<html>Mermer<br> &nbsp;<br>&nbsp;</html>");
        chckbxNewCheckBox_5_1_2_2_2.setVerticalAlignment(SwingConstants.TOP);
        chckbxNewCheckBox_5_1_2_2_2.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxNewCheckBox_5_1_2_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxNewCheckBox_5_1_2_2_2.setBackground(Color.WHITE);
        chckbxNewCheckBox_5_1_2_2_2.setBounds(158, 78, 150, 45);
        Cam_7_Diger_Panel_1.add(chckbxNewCheckBox_5_1_2_2_2);

        JRadioButton Rb1_1_1_1 = new JRadioButton("4+12+4");
        buttonGroup_4.add(Rb1_1_1_1);
        Rb1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Rb1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb1_1_1_1.setBackground(Color.WHITE);
        Rb1_1_1_1.setBounds(564, 40, 82, 23);
        Cam_7_Diger_Panel_1.add(Rb1_1_1_1);

        JRadioButton Rb2_1_1_1 = new JRadioButton("4+16+4");
        buttonGroup_4.add(Rb2_1_1_1);
        Rb2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Rb2_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb2_1_1_1.setBackground(Color.WHITE);
        Rb2_1_1_1.setBounds(648, 40, 91, 23);
        Cam_7_Diger_Panel_1.add(Rb2_1_1_1);

        JRadioButton Rb3_1_1_1 = new JRadioButton("4+22+4");
        buttonGroup_4.add(Rb3_1_1_1);
        Rb3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Rb3_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb3_1_1_1.setBackground(Color.WHITE);
        Rb3_1_1_1.setBounds(741, 40, 88, 23);
        Cam_7_Diger_Panel_1.add(Rb3_1_1_1);

        JRadioButton rdbtniftTemperli_1_1 = new JRadioButton("\u00C7ift Temperli");
        buttonGroup_5.add(rdbtniftTemperli_1_1);
        rdbtniftTemperli_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtniftTemperli_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        rdbtniftTemperli_1_1.setBackground(Color.WHITE);
        rdbtniftTemperli_1_1.setBounds(698, 86, 146, 23);
        Cam_7_Diger_Panel_1.add(rdbtniftTemperli_1_1);

        JRadioButton rdbtnTekTemperli_1_1 = new JRadioButton("Tek Temperli");
        buttonGroup_5.add(rdbtnTekTemperli_1_1);
        rdbtnTekTemperli_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        rdbtnTekTemperli_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        rdbtnTekTemperli_1_1.setBackground(Color.WHITE);
        rdbtnTekTemperli_1_1.setBounds(554, 86, 142, 23);
        Cam_7_Diger_Panel_1.add(rdbtnTekTemperli_1_1);

        JCheckBox chckbxKpete_2_3_1_1 = new JCheckBox("<html>Karolaj<br> &nbsp;<br>&nbsp;</html>");
        chckbxKpete_2_3_1_1.setVerticalAlignment(SwingConstants.TOP);
        chckbxKpete_2_3_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
        chckbxKpete_2_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        chckbxKpete_2_3_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        chckbxKpete_2_3_1_1.setBackground(Color.WHITE);
        chckbxKpete_2_3_1_1.setBounds(6, 78, 150, 45);
        Cam_7_Diger_Panel_1.add(chckbxKpete_2_3_1_1);

        JLabel CamRng_lb_1_6 = new JLabel("Di\u011Fer");
        CamRng_lb_1_6.setOpaque(true);
        CamRng_lb_1_6.setHorizontalAlignment(SwingConstants.LEFT);
        CamRng_lb_1_6.setForeground(Color.WHITE);
        CamRng_lb_1_6.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        CamRng_lb_1_6.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        CamRng_lb_1_6.setBackground(SystemColor.activeCaption);
        CamRng_lb_1_6.setBounds(0, 0, 850, 23);
        Cam_7_Diger_Panel_1.add(CamRng_lb_1_6);

        JLabel Sonraki = new JLabel("Sonraki Sayfa");
        Sonraki.setBounds(710, 479, 150, 35);
        ProJeOlstur_Panel.add(Sonraki);
        Sonraki.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SwitchMainPanels(Sistem_Cepheleri_Panel);
            }
        });
        Sonraki.setForeground(SystemColor.text);
        Sonraki.setBackground(SystemColor.activeCaption);
        Sonraki.setOpaque(true);
        Sonraki.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Sonraki.setHorizontalAlignment(SwingConstants.CENTER);
        Sonraki.setFont(new Font("Comic Sans MS", Font.BOLD, 17));

        JLabel lblProjeOlutur = new JLabel("Proje Olu\u015Ftur");
        lblProjeOlutur.setOpaque(true);
        lblProjeOlutur.setForeground(Color.WHITE);
        lblProjeOlutur.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblProjeOlutur.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblProjeOlutur.setBackground(SystemColor.activeCaption);
        lblProjeOlutur.setBounds(0, 0, 870, 31);
        ProJeOlstur_Panel.add(lblProjeOlutur);



        JLabel Onceki = new JLabel("\u00D6nceki Sayfa");
        Onceki.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SwitchMainPanels(ProJeOlstur_Panel);
            }
        });
        Onceki.setBounds(10, 479, 150, 35);
        Onceki.setOpaque(true);
        Onceki.setHorizontalAlignment(SwingConstants.CENTER);
        Onceki.setForeground(Color.WHITE);
        Onceki.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        Onceki.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Onceki.setBackground(SystemColor.activeCaption);
        Sistem_Cepheleri_Panel.add(Onceki);

        JLabel Sonraki2 = new JLabel("Sonraki Sayfa");
        Sonraki2.setOpaque(true);
        Sonraki2.setHorizontalAlignment(SwingConstants.CENTER);
        Sonraki2.setForeground(Color.WHITE);
        Sonraki2.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        Sonraki2.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Sonraki2.setBackground(SystemColor.activeCaption);
        Sonraki2.setBounds(710, 479, 150, 35);
        Sistem_Cepheleri_Panel.add(Sonraki2);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBorder(new LineBorder(new Color(153, 180, 209), 3, true));
        panel.setBounds(10, 45, 850, 122);
        Sistem_Cepheleri_Panel.add(panel);
        panel.setLayout(null);

        JLabel lblNewLabel = new JLabel("<html>&nbsp;Fiyatlar</html>");
        lblNewLabel.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblNewLabel.setForeground(Color.WHITE);
        lblNewLabel.setOpaque(true);
        lblNewLabel.setBackground(SystemColor.activeCaption);
        lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel.setBounds(0, 0, 849, 24);
        panel.add(lblNewLabel);

        JLabel lblNewLabel_2 = new JLabel("Toplam Balkon Tutar\u0131 A\u015Fa\u011F\u0131daki Miktar \u0130le \u00C7arp\u0131lmaktad\u0131r.");
        lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        lblNewLabel_2.setBounds(10, 27, 305, 14);
        panel.add(lblNewLabel_2);

        JLabel lblNewLabel_2_1 = new JLabel("Miktar");
        lblNewLabel_2_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1.setBounds(10, 45, 89, 24);
        panel.add(lblNewLabel_2_1);

        textField = new JTextField();
        textField.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField.setBounds(10, 70, 184, 23);
        panel.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel_2_1_1 = new JLabel("M2 Fiyat\u0131");
        lblNewLabel_2_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_1.setBounds(337, 45, 89, 24);
        panel.add(lblNewLabel_2_1_1);

        textField_1 = new JTextField();
        textField_1.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField_1.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField_1.setColumns(10);
        textField_1.setBounds(337, 70, 184, 23);
        panel.add(textField_1);

        JLabel lblNewLabel_2_1_2 = new JLabel("Cam\u0131n M2 Fiyat\u0131");
        lblNewLabel_2_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_2.setBounds(644, 45, 104, 24);
        panel.add(lblNewLabel_2_1_2);

        textField_2 = new JTextField();
        textField_2.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField_2.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField_2.setColumns(10);
        textField_2.setBounds(644, 70, 184, 23);
        panel.add(textField_2);

        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        panel_1.setBackground(Color.WHITE);
        panel_1.setBounds(10, 178, 850, 290);
        Sistem_Cepheleri_Panel.add(panel_1);

        JLabel lblnbspcephe = new JLabel("<html>&nbsp;Cephe \u00D6l\u00E7\u00FCleri</html>");
        lblnbspcephe.setOpaque(true);
        lblnbspcephe.setForeground(Color.WHITE);
        lblnbspcephe.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblnbspcephe.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblnbspcephe.setBackground(SystemColor.activeCaption);
        lblnbspcephe.setBounds(0, 0, 849, 24);
        panel_1.add(lblnbspcephe);

        JLabel lblNewLabel_2_2 = new JLabel("(Not : L\u00FCtfen Cephe Geni\u015Fliklerini Soldan Sa\u011Fa Do\u011Fru Giriniz)");
        lblNewLabel_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        lblNewLabel_2_2.setBounds(279, 265, 305, 14);
        panel_1.add(lblNewLabel_2_2);

        JLabel lblcephelleri = new JLabel("<html>Cephe Ekle</html>");
        lblcephelleri.setHorizontalAlignment(SwingConstants.CENTER);
        lblcephelleri.setOpaque(true);
        lblcephelleri.setForeground(Color.WHITE);
        lblcephelleri.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblcephelleri.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblcephelleri.setBackground(SystemColor.activeCaption);
        lblcephelleri.setBounds(300, 219, 249, 35);
        panel_1.add(lblcephelleri);

        JLabel lblSistemCepheleri = new JLabel("Sistem Cepheleri");
        lblSistemCepheleri.setOpaque(true);
        lblSistemCepheleri.setForeground(Color.WHITE);
        lblSistemCepheleri.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblSistemCepheleri.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblSistemCepheleri.setBackground(SystemColor.activeCaption);
        lblSistemCepheleri.setBounds(0, 0, 870, 31);
        Sistem_Cepheleri_Panel.add(lblSistemCepheleri);


        Projeler_Panel = new JPanel();
        Projeler_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        Projeler_Panel.setBackground(Color.WHITE);
        mainLp.add(Projeler_Panel, "name_432653611919100");
        Projeler_Panel.setLayout(null);


        JLabel lblnbspprojeler = new JLabel("Projeler");
        lblnbspprojeler.setForeground(Color.WHITE);
        lblnbspprojeler.setBounds(0, 0, 870, 31);
        Projeler_Panel.add(lblnbspprojeler);
        lblnbspprojeler.setOpaque(true);
        lblnbspprojeler.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblnbspprojeler.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblnbspprojeler.setBackground(SystemColor.activeCaption);

        JLabel lblNewLabel_1 = new JLabel("Bekleyen Projeler");
        lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_1.setBounds(21, 42, 238, 76);
        Projeler_Panel.add(lblNewLabel_1);
        lblNewLabel_1.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);

        JLabel lblNewLabel_3 = new JLabel("<html>\u00DCretimi Devam Eden Projeler</html>");
        lblNewLabel_3.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_3.setBounds(317, 42, 238, 76);
        Projeler_Panel.add(lblNewLabel_3);
        lblNewLabel_3.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblNewLabel_3.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);

        JLabel lblNewLabel_4 = new JLabel("Tamamlanm\u0131\u015F Projeler");
        lblNewLabel_4.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_4.setBounds(611, 42, 238, 76);
        Projeler_Panel.add(lblNewLabel_4);
        lblNewLabel_4.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblNewLabel_4.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);

        JLayeredPane Projeler_Lp_Lp = new JLayeredPane();
        Projeler_Lp_Lp.setBounds(21, 129, 828, 385);
        Projeler_Panel.add(Projeler_Lp_Lp);
        Projeler_Lp_Lp.setLayout(new CardLayout(0, 0));

        JPanel Bekleyen_Panel = new JPanel();
        Bekleyen_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        Bekleyen_Panel.setBackground(Color.WHITE);
        Projeler_Lp_Lp.add(Bekleyen_Panel, "name_489235400389600");
        Bekleyen_Panel.setLayout(null);

        JPanel MKA_Panel = new JPanel();
        MKA_Panel.setBackground(Color.WHITE);
        MKA_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        MKA_Panel.setBounds(10, 11, 808, 58);
        Bekleyen_Panel.add(MKA_Panel);
        MKA_Panel.setLayout(null);

        JLabel SirketName_Label_2 = new JLabel("Maliyet");
        SirketName_Label_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.activeCaption));
        SirketName_Label_2.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        SirketName_Label_2.setBounds(57, 11, 150, 18);
        MKA_Panel.add(SirketName_Label_2);

        JLabel SirketName_Label_2_1 = new JLabel("Kazan\u00E7");
        SirketName_Label_2_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.activeCaption));
        SirketName_Label_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        SirketName_Label_2_1.setBounds(330, 11, 150, 18);
        MKA_Panel.add(SirketName_Label_2_1);

        JLabel SirketName_Label_2_2 = new JLabel("Alacak");
        SirketName_Label_2_2.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.activeCaption));
        SirketName_Label_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        SirketName_Label_2_2.setBounds(623, 11, 150, 18);
        MKA_Panel.add(SirketName_Label_2_2);

        JLabel SirketName_Label_2_4 = new JLabel("000");
        SirketName_Label_2_4.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_4.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        SirketName_Label_2_4.setBounds(57, 31, 150, 27);
        MKA_Panel.add(SirketName_Label_2_4);

        JLabel SirketName_Label_2_1_2 = new JLabel("000");
        SirketName_Label_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        SirketName_Label_2_1_2.setBounds(330, 31, 150, 27);
        MKA_Panel.add(SirketName_Label_2_1_2);

        JLabel SirketName_Label_2_2_2 = new JLabel("000");
        SirketName_Label_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        SirketName_Label_2_2_2.setBounds(623, 31, 150, 27);
        MKA_Panel.add(SirketName_Label_2_2_2);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBackground(Color.WHITE);
        scrollPane.setViewportBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        scrollPane.setBounds(10, 80, 808, 294);
        Bekleyen_Panel.add(scrollPane);

        JPanel UretDevEden_Panel = new JPanel();
        UretDevEden_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        UretDevEden_Panel.setBackground(Color.WHITE);
        Projeler_Lp_Lp.add(UretDevEden_Panel, "name_489237420360900");
        UretDevEden_Panel.setLayout(null);

        JPanel MKA2_Panel = new JPanel();
        MKA2_Panel.setLayout(null);
        MKA2_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        MKA2_Panel.setBackground(Color.WHITE);
        MKA2_Panel.setBounds(10, 11, 808, 58);
        UretDevEden_Panel.add(MKA2_Panel);

        JLabel SirketName_Label_2_3 = new JLabel("Maliyet");
        SirketName_Label_2_3.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_3.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        SirketName_Label_2_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.activeCaption));
        SirketName_Label_2_3.setBounds(57, 11, 150, 18);
        MKA2_Panel.add(SirketName_Label_2_3);

        JLabel SirketName_Label_2_1_1 = new JLabel("Kazan\u00E7");
        SirketName_Label_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        SirketName_Label_2_1_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.activeCaption));
        SirketName_Label_2_1_1.setBounds(330, 11, 150, 18);
        MKA2_Panel.add(SirketName_Label_2_1_1);

        JLabel SirketName_Label_2_2_1 = new JLabel("Alacak");
        SirketName_Label_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        SirketName_Label_2_2_1.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.activeCaption));
        SirketName_Label_2_2_1.setBounds(623, 11, 150, 18);
        MKA2_Panel.add(SirketName_Label_2_2_1);

        JLabel SirketName_Label_2_4_1 = new JLabel("000");
        SirketName_Label_2_4_1.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_4_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        SirketName_Label_2_4_1.setBounds(57, 31, 150, 27);
        MKA2_Panel.add(SirketName_Label_2_4_1);

        JLabel SirketName_Label_2_1_2_1 = new JLabel("000");
        SirketName_Label_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_1_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        SirketName_Label_2_1_2_1.setBounds(330, 31, 150, 27);
        MKA2_Panel.add(SirketName_Label_2_1_2_1);

        JLabel SirketName_Label_2_2_2_1 = new JLabel("000");
        SirketName_Label_2_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_2_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        SirketName_Label_2_2_2_1.setBounds(623, 31, 150, 27);
        MKA2_Panel.add(SirketName_Label_2_2_2_1);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setViewportBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        scrollPane_1.setBackground(Color.WHITE);
        scrollPane_1.setBounds(10, 80, 808, 282);
        UretDevEden_Panel.add(scrollPane_1);

        JPanel Tamamlanmıs_Panel = new JPanel();
        Tamamlanmıs_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        Tamamlanmıs_Panel.setBackground(Color.WHITE);
        Projeler_Lp_Lp.add(Tamamlanmıs_Panel, "name_489241071017700");
        Tamamlanmıs_Panel.setLayout(null);

        JPanel MKA3_Panel = new JPanel();
        MKA3_Panel.setLayout(null);
        MKA3_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        MKA3_Panel.setBackground(Color.WHITE);
        MKA3_Panel.setBounds(10, 11, 808, 58);
        Tamamlanmıs_Panel.add(MKA3_Panel);

        JLabel SirketName_Label_2_5 = new JLabel("Maliyet");
        SirketName_Label_2_5.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_5.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        SirketName_Label_2_5.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.activeCaption));
        SirketName_Label_2_5.setBounds(57, 11, 150, 18);
        MKA3_Panel.add(SirketName_Label_2_5);

        JLabel SirketName_Label_2_1_3 = new JLabel("Kazan\u00E7");
        SirketName_Label_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        SirketName_Label_2_1_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.activeCaption));
        SirketName_Label_2_1_3.setBounds(330, 11, 150, 18);
        MKA3_Panel.add(SirketName_Label_2_1_3);

        JLabel SirketName_Label_2_2_3 = new JLabel("Alacak");
        SirketName_Label_2_2_3.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_2_3.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        SirketName_Label_2_2_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.activeCaption));
        SirketName_Label_2_2_3.setBounds(623, 11, 150, 18);
        MKA3_Panel.add(SirketName_Label_2_2_3);

        JLabel SirketName_Label_2_4_2 = new JLabel("000");
        SirketName_Label_2_4_2.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_4_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        SirketName_Label_2_4_2.setBounds(57, 31, 150, 27);
        MKA3_Panel.add(SirketName_Label_2_4_2);

        JLabel SirketName_Label_2_1_2_2 = new JLabel("000");
        SirketName_Label_2_1_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_1_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        SirketName_Label_2_1_2_2.setBounds(330, 31, 150, 27);
        MKA3_Panel.add(SirketName_Label_2_1_2_2);

        JLabel SirketName_Label_2_2_2_2 = new JLabel("000");
        SirketName_Label_2_2_2_2.setHorizontalAlignment(SwingConstants.CENTER);
        SirketName_Label_2_2_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        SirketName_Label_2_2_2_2.setBounds(623, 31, 150, 27);
        MKA3_Panel.add(SirketName_Label_2_2_2_2);

        JScrollPane scrollPane_2 = new JScrollPane();
        scrollPane_2.setViewportBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        scrollPane_2.setBackground(Color.WHITE);
        scrollPane_2.setBounds(10, 80, 808, 282);
        Tamamlanmıs_Panel.add(scrollPane_2);

        JPanel Aldoks_Sabitler_Panel = new JPanel();
        Aldoks_Sabitler_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Aldoks_Sabitler_Panel.setBackground(Color.WHITE);
        mainLp.add(Aldoks_Sabitler_Panel, "name_530120138651100");
        Aldoks_Sabitler_Panel.setLayout(null);

        JPanel AlmRng_Panel_1 = new JPanel();
        AlmRng_Panel_1.setLayout(null);
        AlmRng_Panel_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        AlmRng_Panel_1.setBackground(Color.WHITE);
        AlmRng_Panel_1.setBounds(10, 42, 850, 75);
        Aldoks_Sabitler_Panel.add(AlmRng_Panel_1);

        JLabel AlmRng_lb_1 = new JLabel("Aldoks Sabit Ayarlar\u0131");
        AlmRng_lb_1.setOpaque(true);
        AlmRng_lb_1.setHorizontalAlignment(SwingConstants.LEFT);
        AlmRng_lb_1.setForeground(Color.WHITE);
        AlmRng_lb_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        AlmRng_lb_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        AlmRng_lb_1.setBackground(SystemColor.activeCaption);
        AlmRng_lb_1.setBounds(0, 0, 850, 25);
        AlmRng_Panel_1.add(AlmRng_lb_1);

        JRadioButton Rb1_2 = new JRadioButton("Kompozit");
        buttonGroup_6.add(Rb1_2);
        Rb1_2.setHorizontalAlignment(SwingConstants.CENTER);
        Rb1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb1_2.setBackground(Color.WHITE);
        Rb1_2.setBounds(10, 35, 105, 23);
        AlmRng_Panel_1.add(Rb1_2);

        JRadioButton Rb2_2 = new JRadioButton("16mm Tempersiz");
        buttonGroup_6.add(Rb2_2);
        Rb2_2.setHorizontalAlignment(SwingConstants.CENTER);
        Rb2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb2_2.setBackground(Color.WHITE);
        Rb2_2.setBounds(115, 35, 152, 23);
        AlmRng_Panel_1.add(Rb2_2);

        JRadioButton Rb3_2 = new JRadioButton("8mm Tempersiz");
        buttonGroup_6.add(Rb3_2);
        Rb3_2.setHorizontalAlignment(SwingConstants.CENTER);
        Rb3_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb3_2.setBackground(Color.WHITE);
        Rb3_2.setBounds(269, 35, 133, 23);
        AlmRng_Panel_1.add(Rb3_2);

        JRadioButton Rb4_1 = new JRadioButton("Balkon Cam\u0131 \u0130le Ayn\u0131");
        Rb4_1.setBorderPainted(true);
        buttonGroup_6.add(Rb4_1);
        Rb4_1.setOpaque(false);
        Rb4_1.setBorder(new MatteBorder(0, 0, 3, 3, (Color) new Color(153, 180, 209)));
        Rb4_1.setHorizontalAlignment(SwingConstants.CENTER);
        Rb4_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb4_1.setBackground(Color.WHITE);
        Rb4_1.setBounds(395, 21, 203, 54);
        AlmRng_Panel_1.add(Rb4_1);

        JRadioButton Rb5_1 = new JRadioButton("\u0130nce Kasa");
        buttonGroup_7.add(Rb5_1);
        Rb5_1.setHorizontalAlignment(SwingConstants.CENTER);
        Rb5_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb5_1.setBackground(Color.WHITE);
        Rb5_1.setBounds(604, 35, 119, 23);
        AlmRng_Panel_1.add(Rb5_1);

        JRadioButton Rb6_1 = new JRadioButton("Kal\u0131n Kasa");
        buttonGroup_7.add(Rb6_1);
        Rb6_1.setHorizontalAlignment(SwingConstants.CENTER);
        Rb6_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        Rb6_1.setBackground(Color.WHITE);
        Rb6_1.setBounds(725, 35, 119, 23);
        AlmRng_Panel_1.add(Rb6_1);

        JLabel lblAldoksSabitler = new JLabel("Aldoks Sabitler");
        lblAldoksSabitler.setOpaque(true);
        lblAldoksSabitler.setForeground(Color.WHITE);
        lblAldoksSabitler.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblAldoksSabitler.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblAldoksSabitler.setBackground(SystemColor.activeCaption);
        lblAldoksSabitler.setBounds(0, 0, 870, 31);
        Aldoks_Sabitler_Panel.add(lblAldoksSabitler);

        JLabel Onceki_1 = new JLabel("\u00D6nceki Sayfa");
        Onceki_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SwitchMainPanels(Sistem_Cepheleri_Panel);
            }
        });
        Onceki_1.setOpaque(true);
        Onceki_1.setHorizontalAlignment(SwingConstants.CENTER);
        Onceki_1.setForeground(Color.WHITE);
        Onceki_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        Onceki_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Onceki_1.setBackground(SystemColor.activeCaption);
        Onceki_1.setBounds(10, 479, 150, 35);
        Aldoks_Sabitler_Panel.add(Onceki_1);

        JLabel Sonraki2_1 = new JLabel("Sonraki Sayfa");
        Sonraki2_1.setOpaque(true);
        Sonraki2_1.setHorizontalAlignment(SwingConstants.CENTER);
        Sonraki2_1.setForeground(Color.WHITE);
        Sonraki2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        Sonraki2_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Sonraki2_1.setBackground(SystemColor.activeCaption);
        Sonraki2_1.setBounds(710, 479, 150, 35);
        Aldoks_Sabitler_Panel.add(Sonraki2_1);

        JPanel panel_1_1 = new JPanel();
        panel_1_1.setLayout(null);
        panel_1_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        panel_1_1.setBackground(Color.WHITE);
        panel_1_1.setBounds(10, 128, 850, 340);
        Aldoks_Sabitler_Panel.add(panel_1_1);

        JLabel lblSabitlleri = new JLabel("Sabit \u00D6l\u00E7\u00FCleri");
        lblSabitlleri.setOpaque(true);
        lblSabitlleri.setForeground(Color.WHITE);
        lblSabitlleri.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblSabitlleri.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblSabitlleri.setBackground(SystemColor.activeCaption);
        lblSabitlleri.setBounds(0, 0, 849, 24);
        panel_1_1.add(lblSabitlleri);

        JLabel lblSabitEkle = new JLabel("Sabit Ekle");
        lblSabitEkle.setOpaque(true);
        lblSabitEkle.setHorizontalAlignment(SwingConstants.CENTER);
        lblSabitEkle.setForeground(Color.WHITE);
        lblSabitEkle.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblSabitEkle.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblSabitEkle.setBackground(SystemColor.activeCaption);
        lblSabitEkle.setBounds(303, 294, 249, 35);
        panel_1_1.add(lblSabitEkle);

        JPanel Sistem_Cizimi_Panel = new JPanel();
        Sistem_Cizimi_Panel.setLocation(-222, 0);
        Sistem_Cizimi_Panel.setLayout(null);
        Sistem_Cizimi_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        Sistem_Cizimi_Panel.setBackground(Color.WHITE);
        mainLp.add(Sistem_Cizimi_Panel, "name_531909520714500");

        Sonraki2_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SwitchMainPanels(Sistem_Cizimi_Panel);
            }
        });
        JLabel lblSistemizimi = new JLabel("Sistem \u00C7izimi");
        lblSistemizimi.setOpaque(true);
        lblSistemizimi.setForeground(Color.WHITE);
        lblSistemizimi.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblSistemizimi.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblSistemizimi.setBackground(SystemColor.activeCaption);
        lblSistemizimi.setBounds(0, 0, 870, 31);
        Sistem_Cizimi_Panel.add(lblSistemizimi);

        JLabel Onceki_1_1 = new JLabel("\u00D6nceki Sayfa");
        Onceki_1_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SwitchMainPanels(Aldoks_Sabitler_Panel);
            }
        });
        Onceki_1_1.setOpaque(true);
        Onceki_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Onceki_1_1.setForeground(Color.WHITE);
        Onceki_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        Onceki_1_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Onceki_1_1.setBackground(SystemColor.activeCaption);
        Onceki_1_1.setBounds(10, 479, 150, 35);
        Sistem_Cizimi_Panel.add(Onceki_1_1);

        JLabel Sonraki2_1_1 = new JLabel("Sonraki Sayfa");
        Sonraki2_1_1.setOpaque(true);
        Sonraki2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Sonraki2_1_1.setForeground(Color.WHITE);
        Sonraki2_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        Sonraki2_1_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Sonraki2_1_1.setBackground(SystemColor.activeCaption);
        Sonraki2_1_1.setBounds(710, 479, 150, 35);
        Sistem_Cizimi_Panel.add(Sonraki2_1_1);

        JPanel panel_1_1_1 = new JPanel();
        panel_1_1_1.setLayout(null);
        panel_1_1_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        panel_1_1_1.setBackground(Color.WHITE);
        panel_1_1_1.setBounds(10, 42, 850, 426);
        Sistem_Cizimi_Panel.add(panel_1_1_1);

        JLabel lblBalkonekli = new JLabel("Balkon \u015Eekli");
        lblBalkonekli.setOpaque(true);
        lblBalkonekli.setForeground(Color.WHITE);
        lblBalkonekli.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblBalkonekli.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblBalkonekli.setBackground(SystemColor.activeCaption);
        lblBalkonekli.setBounds(0, 0, 849, 24);
        panel_1_1_1.add(lblBalkonekli);

        JLabel lblsttenGrn = new JLabel("\u00DCstten G\u00F6r\u00FCn\u00FC\u015F");
        lblsttenGrn.setOpaque(true);
        lblsttenGrn.setHorizontalAlignment(SwingConstants.CENTER);
        lblsttenGrn.setForeground(Color.WHITE);
        lblsttenGrn.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblsttenGrn.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblsttenGrn.setBackground(SystemColor.activeCaption);
        lblsttenGrn.setBounds(300, 355, 249, 35);
        panel_1_1_1.add(lblsttenGrn);

        JLabel lblNewLabel_2_2_1 = new JLabel("(Not : D\u00FCzenlemek \u0130\u00E7in Camlara T\u0131klay\u0131n. Di\u011Fer Camlar\u0131 G\u00F6rmek \u0130\u00E7in Sa\u011Fa Do\u011Fru S\u00FCr\u00FCkleyin.)");
        lblNewLabel_2_2_1.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        lblNewLabel_2_2_1.setBounds(200, 401, 465, 14);
        panel_1_1_1.add(lblNewLabel_2_2_1);

        JPanel Projeyi_Tamamla_Panel = new JPanel();
        Projeyi_Tamamla_Panel.setLayout(null);
        Projeyi_Tamamla_Panel.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        Projeyi_Tamamla_Panel.setBackground(Color.WHITE);
        mainLp.add(Projeyi_Tamamla_Panel, "name_532867181687400");

        JLabel lblProjeyiTamamla = new JLabel("Projeyi Tamamla");
        lblProjeyiTamamla.setOpaque(true);
        lblProjeyiTamamla.setForeground(Color.WHITE);
        lblProjeyiTamamla.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        lblProjeyiTamamla.setBorder(new LineBorder(SystemColor.activeCaption, 4, true));
        lblProjeyiTamamla.setBackground(SystemColor.activeCaption);
        lblProjeyiTamamla.setBounds(0, 0, 870, 31);
        Projeyi_Tamamla_Panel.add(lblProjeyiTamamla);

        Sonraki2_1_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SwitchMainPanels(Projeyi_Tamamla_Panel);
            }
        });

        JLabel Onceki_1_1_1 = new JLabel("\u00D6nceki Sayfa");
        Onceki_1_1_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SwitchMainPanels(Sistem_Cizimi_Panel);
            }
        });
        Onceki_1_1_1.setOpaque(true);
        Onceki_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Onceki_1_1_1.setForeground(Color.WHITE);
        Onceki_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        Onceki_1_1_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Onceki_1_1_1.setBackground(SystemColor.activeCaption);
        Onceki_1_1_1.setBounds(10, 479, 150, 35);
        Projeyi_Tamamla_Panel.add(Onceki_1_1_1);

        JLabel Sonraki2_1_1_1 = new JLabel("Kaydet");
        Sonraki2_1_1_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SwitchMainPanels(Home_Panel);
            }
        });
        Sonraki2_1_1_1.setOpaque(true);
        Sonraki2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Sonraki2_1_1_1.setForeground(Color.WHITE);
        Sonraki2_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 17));
        Sonraki2_1_1_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Sonraki2_1_1_1.setBackground(SystemColor.activeCaption);
        Sonraki2_1_1_1.setBounds(710, 479, 150, 35);
        Projeyi_Tamamla_Panel.add(Sonraki2_1_1_1);

        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBorder(new LineBorder(new Color(153, 180, 209), 3, true));
        panel_2.setBackground(Color.WHITE);
        panel_2.setBounds(10, 42, 850, 122);
        Projeyi_Tamamla_Panel.add(panel_2);

        JLabel lblNewLabel_5 = new JLabel("\u00C7\u0131kt\u0131lar");
        lblNewLabel_5.setOpaque(true);
        lblNewLabel_5.setForeground(Color.WHITE);
        lblNewLabel_5.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_5.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblNewLabel_5.setBackground(SystemColor.activeCaption);
        lblNewLabel_5.setBounds(0, 0, 849, 24);
        panel_2.add(lblNewLabel_5);

        JLabel lblNewLabel_2_3 = new JLabel("Hesaplamaya Sabit Do\u011Framalar Dahil Edilmi\u015Ftir.");
        lblNewLabel_2_3.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        lblNewLabel_2_3.setBounds(301, 96, 246, 14);
        panel_2.add(lblNewLabel_2_3);

        JLabel lblNewLabel_2_1_3 = new JLabel("Genel Toplam");
        lblNewLabel_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_3.setBorder(new MatteBorder(0, 0, 2, 0, (Color) SystemColor.desktop));
        lblNewLabel_2_1_3.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_2_1_3.setBounds(688, 35, 113, 24);
        panel_2.add(lblNewLabel_2_1_3);

        JLabel lblNewLabel_2_1_1_1 = new JLabel("Balkon Alan\u0131 :");
        lblNewLabel_2_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        lblNewLabel_2_1_1_1.setBounds(10, 35, 113, 24);
        panel_2.add(lblNewLabel_2_1_1_1);

        JLabel lblNewLabel_2_1_3_1 = new JLabel("M2 Sat\u0131\u015F Fiyat\u0131 : ");
        lblNewLabel_2_1_3_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_3_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        lblNewLabel_2_1_3_1.setBounds(10, 70, 156, 41);
        panel_2.add(lblNewLabel_2_1_3_1);

        JLabel lblNewLabel_2_1_1_1_1 = new JLabel("000");
        lblNewLabel_2_1_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        lblNewLabel_2_1_1_1_1.setBounds(106, 35, 113, 24);
        panel_2.add(lblNewLabel_2_1_1_1_1);

        JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("000");
        lblNewLabel_2_1_1_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        lblNewLabel_2_1_1_1_1_1.setBounds(126, 87, 113, 24);
        panel_2.add(lblNewLabel_2_1_1_1_1_1);

        JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("000");
        lblNewLabel_2_1_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_1_1_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_1_1_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_2_1_1_1_1_2.setBounds(688, 60, 113, 24);
        panel_2.add(lblNewLabel_2_1_1_1_1_2);

        JLabel Sonraki2_1_1_1_1 = new JLabel("Tutar D\u00FCzenle ");
        Sonraki2_1_1_1_1.setOpaque(true);
        Sonraki2_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        Sonraki2_1_1_1_1.setForeground(Color.WHITE);
        Sonraki2_1_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        Sonraki2_1_1_1_1.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Sonraki2_1_1_1_1.setBackground(SystemColor.activeCaption);
        Sonraki2_1_1_1_1.setBounds(229, 63, 150, 27);
        panel_2.add(Sonraki2_1_1_1_1);

        JLabel Sonraki2_1_1_1_2 = new JLabel("Maliyet G\u00F6ster");
        Sonraki2_1_1_1_2.setOpaque(true);
        Sonraki2_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        Sonraki2_1_1_1_2.setForeground(Color.WHITE);
        Sonraki2_1_1_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        Sonraki2_1_1_1_2.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        Sonraki2_1_1_1_2.setBackground(SystemColor.activeCaption);
        Sonraki2_1_1_1_2.setBounds(459, 63, 150, 27);
        panel_2.add(Sonraki2_1_1_1_2);

        JPanel panel_3 = new JPanel();
        panel_3.setLayout(null);
        panel_3.setBorder(new LineBorder(new Color(153, 180, 209), 3, true));
        panel_3.setBackground(Color.WHITE);
        panel_3.setBounds(10, 175, 850, 77);
        Projeyi_Tamamla_Panel.add(panel_3);

        JLabel lblNewLabel_6 = new JLabel("Cari Bilgileri");
        lblNewLabel_6.setOpaque(true);
        lblNewLabel_6.setForeground(Color.WHITE);
        lblNewLabel_6.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_6.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblNewLabel_6.setBackground(SystemColor.activeCaption);
        lblNewLabel_6.setBounds(0, 0, 849, 24);
        panel_3.add(lblNewLabel_6);

        JLabel lblNewLabel_2_1_3_1_1 = new JLabel("CariImg");
        lblNewLabel_2_1_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_3_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        lblNewLabel_2_1_3_1_1.setBounds(10, 35, 60, 31);
        panel_3.add(lblNewLabel_2_1_3_1_1);

        JLabel lblNewLabel_2_1_3_1_2 = new JLabel("M\u00FC\u015Fteri Ekle");
        lblNewLabel_2_1_3_1_2.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_3_1_2.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
        lblNewLabel_2_1_3_1_2.setBounds(79, 35, 156, 31);
        panel_3.add(lblNewLabel_2_1_3_1_2);

        JLabel lblNewLabel_2_1_3_1_1_1 = new JLabel("+");
        lblNewLabel_2_1_3_1_1_1.setForeground(SystemColor.text);
        lblNewLabel_2_1_3_1_1_1.setOpaque(true);
        lblNewLabel_2_1_3_1_1_1.setBackground(SystemColor.activeCaption);
        lblNewLabel_2_1_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_2_1_3_1_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 65));
        lblNewLabel_2_1_3_1_1_1.setBounds(787, 0, 62, 77);
        panel_3.add(lblNewLabel_2_1_3_1_1_1);

        JPanel panel_4 = new JPanel();
        panel_4.setLayout(null);
        panel_4.setBorder(new LineBorder(new Color(153, 180, 209), 3, true));
        panel_4.setBackground(Color.WHITE);
        panel_4.setBounds(10, 263, 850, 104);
        Projeyi_Tamamla_Panel.add(panel_4);

        JLabel lblNewLabel_7 = new JLabel("Proje \u0130simlendirme");
        lblNewLabel_7.setOpaque(true);
        lblNewLabel_7.setForeground(Color.WHITE);
        lblNewLabel_7.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        lblNewLabel_7.setBorder(new LineBorder(SystemColor.activeCaption, 3, true));
        lblNewLabel_7.setBackground(SystemColor.activeCaption);
        lblNewLabel_7.setBounds(0, 0, 849, 24);
        panel_4.add(lblNewLabel_7);

        JLabel lblNewLabel_2_1_5 = new JLabel("Proje Ad\u0131 ");
        lblNewLabel_2_1_5.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_5.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_5.setBounds(10, 35, 89, 24);
        panel_4.add(lblNewLabel_2_1_5);

        textField_9 = new JTextField();
        textField_9.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField_9.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField_9.setColumns(10);
        textField_9.setBounds(10, 60, 184, 22);
        panel_4.add(textField_9);

        JLabel lblNewLabel_2_1_1_3 = new JLabel("M2 Fiyat\u0131");
        lblNewLabel_2_1_1_3.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_1_3.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_1_3.setBounds(337, 35, 89, 24);
        panel_4.add(lblNewLabel_2_1_1_3);

        textField_10 = new JTextField();
        textField_10.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField_10.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField_10.setColumns(10);
        textField_10.setBounds(337, 60, 184, 22);
        panel_4.add(textField_10);

        JLabel lblNewLabel_2_1_2_3 = new JLabel("Cam\u0131n M2 Fiyat\u0131");
        lblNewLabel_2_1_2_3.setVerticalAlignment(SwingConstants.BOTTOM);
        lblNewLabel_2_1_2_3.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        lblNewLabel_2_1_2_3.setBounds(644, 35, 111, 24);
        panel_4.add(lblNewLabel_2_1_2_3);

        textField_11 = new JTextField();
        textField_11.setBorder(new LineBorder(SystemColor.activeCaption, 2, true));
        textField_11.setFont(new Font("Comic Sans MS", Font.BOLD, 12));
        textField_11.setColumns(10);
        textField_11.setBounds(644, 60, 184, 22);
        panel_4.add(textField_11);
        Sonraki2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SwitchMainPanels(Aldoks_Sabitler_Panel);
            }
        });

        JButton ProjeEkle_Button = new JButton("", new ImageIcon(getClass().getResource("plus-flat.png")));
        ProjeEkle_Button.setBorderPainted(false);
        ProjeEkle_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                SwitchMainPanels(ProJeOlstur_Panel);
            }
        });
        ProjeEkle_Button.setBorder(new EmptyBorder(0, 0, 0, 0));
        ProjeEkle_Button.setBackground(Color.WHITE);
        ProjeEkle_Button.setBounds(888, 5, 64, 64);
        mainPane.add(ProjeEkle_Button);
    }
}
