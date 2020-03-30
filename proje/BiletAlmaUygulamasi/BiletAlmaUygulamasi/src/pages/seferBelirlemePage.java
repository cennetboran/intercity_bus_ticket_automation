package pages;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.Sefer;

public class seferBelirlemePage extends JFrame {
	
	private Bilesenler bilesen;
	private Veritabani vTabani;
	private ArrayList<Sefer> seferler;
	
	private JPanel seferBelirlemePanel;
	
	private JLabel baslik;
	private JLabel baslangic;
	private JLabel varis;
	private JLabel tarih;
	private JLabel gunBaslik;
	private JLabel ayBaslik;
	private JLabel yilBaslik;
	
	private JComboBox baslangicComboBox;
	private JComboBox varisComboBox;
	private JComboBox gun;
	private JComboBox ay;
	private JComboBox yil;
	
	private String[] baslangiclar;
	private String[] varislar;
	private String[] gunler;
	private String[] aylar;
	private String[] yillar;
	
	private JButton iptal;
	private JButton seferleriListele;
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					seferBelirlemePage seferBelirlemeFrame = new seferBelirlemePage();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	public seferBelirlemePage() {
		vTabani =new  Veritabani();
		bilesen = new Bilesenler();
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 550);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("SDÜ Otobüs Bilet Otomasyonu");
		setIconImage(new ImageIcon(getClass().getResource("/resimler/sdu-logo.png")).getImage());
		
		seferBelirlemePanel = new JPanel();
		seferBelirlemePanel.setBackground(Color.WHITE);
		seferBelirlemePanel.setLocation(0, 0);
		seferBelirlemePanel.setLayout(null);
		add(seferBelirlemePanel);
		
		bilesen.labelOlustur(seferBelirlemePanel, baslik, "Sefer Belirleme", SwingConstants.CENTER, 25, 150, 40, 200, 70);
		
		bilesen.labelOlustur(seferBelirlemePanel, baslangic, "Baþlangýç:", SwingConstants.LEFT, 16, 100, 150, 200, 20);
		
		baslangicComboBox = new JComboBox();
		bilesen.comboBoxOlustur(seferBelirlemePanel, baslangicComboBox, 200, 150, 200, 20);
		
		baslangiclar = new String[5];
		baslangiclar[0] = "Ankara";
		baslangiclar[1] = "Istanbul";
		baslangiclar[2] = "Izmir";
		baslangiclar[3] = "Antalya";
		baslangiclar[4] = "Bursa";
		
		ComboBoxModel baslangiclarModel = new DefaultComboBoxModel(baslangiclar);
		baslangicComboBox.setModel(baslangiclarModel);
		
		bilesen.labelOlustur(seferBelirlemePanel, varis, "Varýþ:", SwingConstants.LEFT, 16, 100, 200, 200, 20);
		
		varisComboBox = new JComboBox();
		bilesen.comboBoxOlustur(seferBelirlemePanel, varisComboBox, 200, 200, 200, 20);
		
		varislar = new String[5];
		varislar[0] = "Ankara";
		varislar[1] = "Istanbul";
		varislar[2] = "Izmýr";
		varislar[3] = "Antalya";
		varislar[4] = "Bursa";
		
		ComboBoxModel varislarModel = new DefaultComboBoxModel(baslangiclar);
		varisComboBox.setModel(varislarModel);
		
		bilesen.labelOlustur(seferBelirlemePanel, tarih, "Tarih:", SwingConstants.LEFT, 16, 100, 280, 200, 20);
		
		bilesen.labelOlustur(seferBelirlemePanel, gunBaslik, "Gün", SwingConstants.CENTER, 16, 200, 250, 50, 20);
		
		gun = new JComboBox();
		bilesen.comboBoxOlustur(seferBelirlemePanel, gun, 200, 280, 50, 20);
		
		gunler = new String[31];
		
		for(int i=0; i<gunler.length; i++) {
			gunler[i] = Integer.toString(i+1);
		}
		
		ComboBoxModel gunlerModel = new DefaultComboBoxModel(gunler);
		gun.setModel(gunlerModel);
		
		bilesen.labelOlustur(seferBelirlemePanel, ayBaslik, "Ay", SwingConstants.CENTER, 16, 270, 250, 50, 20);
		
		ay = new JComboBox();
		bilesen.comboBoxOlustur(seferBelirlemePanel, ay, 260, 280, 70, 20);
		
		aylar = new String[12];
		aylar[0] = "01";
		aylar[1] = "02";
		aylar[2] = "03";
		aylar[3] = "04";
		aylar[4] = "05";
		aylar[5] = "06";
		aylar[6] = "07";
		aylar[7] = "08";
		aylar[8] = "09";
		aylar[9] = "10";
		aylar[10] = "11";
		aylar[11] = "12";
		
		
		
		ComboBoxModel aylarModel = new DefaultComboBoxModel(aylar);
		ay.setModel(aylarModel);
		
		bilesen.labelOlustur(seferBelirlemePanel, yilBaslik, "Yýl", SwingConstants.CENTER, 16, 340, 250, 50, 20);
		
		yil = new JComboBox();
		bilesen.comboBoxOlustur(seferBelirlemePanel, yil, 340, 280, 60, 20);
		
		yillar = new String[2];
		int yazilanYil = 2018;
		
		for(int i=0; i<yillar.length; i++) {
			yillar[i] = Integer.toString(yazilanYil + i);
		}
		
		ComboBoxModel yillarModel = new DefaultComboBoxModel(yillar);
		yil.setModel(yillarModel);
		
		bilesen.buttonOlustur(seferBelirlemePanel, iptal, "Ýptal", 125, 370, 85, 30);
		seferleriListele = bilesen.buttonOlustur(seferBelirlemePanel, seferleriListele, "Seferleri Listele", 250, 370, 150, 30);
		seferListeleAction();
	}
	
	
	private void seferListeleAction() {
		
		
		seferleriListele.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String kalkis = (String) baslangicComboBox.getSelectedItem();
				System.out.println(kalkis);
				String varis = (String) varisComboBox.getSelectedItem();
				System.out.println(varis);
				String yillar = (String) yil.getSelectedItem();
				System.out.println(yillar);
				String aylar = (String) ay.getSelectedItem();
				System.out.println(aylar);
				String gunler = (String) gun.getSelectedItem();
				System.out.println(gunler);
				
				seferler = vTabani.seferleriListele(kalkis, varis, yillar, aylar, gunler);
				new SeferlerPage(seferler);
			}
		});
		
		
		
	}
	
}
