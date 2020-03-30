package pages;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import model.Kullanici;

public class uyeOlPage extends JFrame {
	
	private Bilesenler bilesen;
	private Veritabani vTabani;
	private Kullanici kullanici;
	private uyeOlPage uyeOlPage;
	
	private boolean isimKontrol = true;
	private boolean cinsiyetKontrol = true;
	private boolean soyisimKontrol = true;
	private boolean kullaniciAdiKontrol = true;

	
	
	private JPanel uyeOlPanel;
	
	private JLabel uyeOlBaslik;
	private JLabel isim;
	private JLabel soyIsim;
	private JLabel cinsiyet;
	private JLabel kullaniciAdi;
	private JLabel kullaniciSifre;
	
	private JCheckBox erkek;
	private JCheckBox kadin;
	
	private JTextField isimText;
	private JTextField soyIsimText;
	private JTextField kullaniciAdiText;
	private JTextField kullaniciSifreText;
	
	private JButton uyelikOnay;
	private JButton geri;
	
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					uyeOlPage uyeOlFrame = new uyeOlPage();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	public uyeOlPage(String s) {
		
	}
	
	public uyeOlPage(Veritabani vTabani) {
		bilesen = new Bilesenler();
		this.vTabani = vTabani;
		uyeOlPage = new uyeOlPage("");
		
	//	setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 550);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("SDÜ Otobüs Bilet Otomasyonu");
		setIconImage(new ImageIcon(getClass().getResource("/resimler/sdu-logo.png")).getImage()); //ikon resminin ayarlanmasý
		
		uyeOlPanel = new JPanel();
		uyeOlPanel.setBackground(Color.WHITE);
		uyeOlPanel.setLocation(0, 0);
		uyeOlPanel.setLayout(null);
		add(uyeOlPanel);
		
		/*uyeOlBaslik = new JLabel("Üyelik Bilgileri", SwingConstants.CENTER);
		uyeOlBaslik.setFont(new Font("Arial", Font.BOLD, 25));
		uyeOlBaslik.setBounds(150, 40, 200, 70);
		uyeOlPanel.add(uyeOlBaslik);*/
		bilesen.labelOlustur(uyeOlPanel, uyeOlBaslik, "Üyelilk Bilgileri", SwingConstants.CENTER, 25, 150, 40, 200, 70);
		
		/*isim = new JLabel("Ýsim:");
		isim.setFont(new Font("Arial", Font.BOLD, 16));
		isim.setBounds(100, 150, 200, 20);
		uyeOlPanel.add(isim);*/
		bilesen.labelOlustur(uyeOlPanel, isim, "Ýsim:", SwingConstants.LEFT, 16, 100, 150, 200, 20);
		
		/*isimText = new JTextField();
		isimText.setBounds(220, 150, 200, 25);
		uyeOlPanel.add(isimText);*/
		isimText = bilesen.textFieldOlustur(uyeOlPanel, isimText, 220, 150, 200, 25);
		
		/*soyIsim = new JLabel("Soyisim:");
		soyIsim.setFont(new Font("Arial", Font.BOLD, 16));
		soyIsim.setBounds(100, 200, 200, 20);
		uyeOlPanel.add(soyIsim);*/
		bilesen.labelOlustur(uyeOlPanel, soyIsim, "Soyisim:", SwingConstants.LEFT, 16, 100, 200, 200, 20);
		
		/*soyIsimText = new JTextField();
		soyIsimText.setBounds(220, 200, 200, 25);
		uyeOlPanel.add(soyIsimText);*/
		soyIsimText = bilesen.textFieldOlustur(uyeOlPanel, soyIsimText, 220, 200, 200, 25);
		
		/*cinsiyet = new JLabel("Cinsiyet:");
		cinsiyet.setFont(new Font("Arial", Font.BOLD, 16));
		cinsiyet.setBounds(100, 250, 200, 25);
		uyeOlPanel.add(cinsiyet);*/
		bilesen.labelOlustur(uyeOlPanel, cinsiyet, "Cinsiyet:", SwingConstants.LEFT, 16, 100, 250, 200, 20);
		
		/*erkek = new JCheckBox("Erkek");
		erkek.setBounds(220, 250, 60, 20);
		erkek.setBackground(Color.WHITE);
		uyeOlPanel.add(erkek);*/
		erkek = bilesen.checkBoxOlustur(uyeOlPanel, erkek, "Erkek", Color.WHITE, 220, 250, 60, 20);
		
		/*kadin = new JCheckBox("Kadýn");
		kadin.setBounds(320, 250, 60, 20);
		kadin.setBackground(Color.WHITE);
		uyeOlPanel.add(kadin);*/
		kadin = bilesen.checkBoxOlustur(uyeOlPanel, kadin, "Kadýn", Color.WHITE, 320, 250, 60, 20);
		
		/*kullaniciAdi = new JLabel("Kullanýcý Adý:");
		kullaniciAdi.setFont(new Font("Arial", Font.BOLD, 16));
		kullaniciAdi.setBounds(100, 300, 200, 20);
		uyeOlPanel.add(kullaniciAdi);*/
		bilesen.labelOlustur(uyeOlPanel, kullaniciAdi, "Kullanýcý Adý:", SwingConstants.LEFT, 16, 100, 300, 200, 20);
		
		/*kullaniciAdiText = new JTextField();
		kullaniciAdiText.setBounds(220, 300, 200, 25);
		uyeOlPanel.add(kullaniciAdiText);*/
		kullaniciAdiText = bilesen.textFieldOlustur(uyeOlPanel, kullaniciAdiText, 220, 300, 200, 25);
		
		/*kullaniciSifre = new JLabel("Þifre:");
		kullaniciSifre.setFont(new Font("Arial", Font.BOLD, 16));
		kullaniciSifre.setBounds(100, 350, 200, 20);
		uyeOlPanel.add(kullaniciSifre);*/
		bilesen.labelOlustur(uyeOlPanel, kullaniciSifre, "Þifre:", SwingConstants.LEFT, 16, 100, 350, 200, 20);
		
		/*kullaniciSifreText = new JTextField();
		kullaniciSifreText.setBounds(220, 350, 200, 25);
		uyeOlPanel.add(kullaniciSifreText);*/
		kullaniciSifreText = bilesen.textFieldOlustur(uyeOlPanel, kullaniciSifreText, 220, 350, 200, 25);
		
		/*geri = new JButton("<< Geri");
		geri.setBounds(125, 420, 85, 30);
		uyeOlPanel.add(geri);*/
		geri = bilesen.buttonOlustur(uyeOlPanel, geri, "<< Geri", 125, 420, 85, 30);
		
		/*uyelikOnay = new JButton("Üyeliði Onayla");
		uyelikOnay.setBounds(250, 420, 150, 30);
		uyeOlPanel.add(uyelikOnay);*/
		uyelikOnay = bilesen.buttonOlustur(uyeOlPanel, uyelikOnay, "Üyeliði Onayla", 250, 420, 150, 30);
		
		uyelikOnayListener();
		
	}
	
	public void uyelikOnayListener() {
		
		uyelikOnay.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				kullanici = new Kullanici();
				isimSoyisimKontrol(kullanici);
				cinsiyetKontrol(kullanici);
				kullaniciAdiKontrol(kullanici);
				if(kullaniciAdiKontrol && isimKontrol && soyisimKontrol && cinsiyetKontrol) {
					
					if(vTabani.kayitYap(kullanici)) {
						JOptionPane.showMessageDialog(uyeOlPage,"Üye Kaydýnýz Baþarý ile Tamamlandý!");
					}
					else {
						JOptionPane.showMessageDialog(uyeOlPage,"Bu kullanýcý adý kullanýlmaktadýr lütfen baþka bir kullanýcý adý belirleyiniz");
					}
					
				}
				
			
				
				
			}

			
		});
		
	}
	
	
	public void kullaniciAdiKontrol(Kullanici kullanici) {

		
			
		
			kullanici.setKullaniciAdi(kullaniciAdiText.getText());
			kullanici.setSifre(kullaniciSifreText.getText());
		
		
	}

	public void isimSoyisimKontrol(Kullanici kullanici) {
		
		if(isimText.getText().length() <2) {
			JOptionPane.showMessageDialog(uyeOlPage,"Lütfen Geçerli bir isim giriniz");
			isimKontrol = false;
		}
			
		else if(soyIsimText.getText().length() < 2) {
			
			JOptionPane.showMessageDialog(uyeOlPage,"Lütfen Geçerli bir soyisim giriniz");
			soyisimKontrol = false;
		}
			
		else {
			
			kullanici.setIsim(isimText.getText());
			kullanici.setSoyisim(soyIsimText.getText());
			isimKontrol = true;
			soyisimKontrol = true;
			
			
		}
		
	}
	
	public void cinsiyetKontrol(Kullanici kullanici) {
		if(erkek.isSelected() && kadin.isSelected()) {
			JOptionPane.showMessageDialog(uyeOlPage,"Lütfen Sadece 1 Cinsiyet Seçiniz");
			cinsiyetKontrol = false;
		}
			
		else if(!(erkek.isSelected() || kadin.isSelected())) {
			JOptionPane.showMessageDialog(uyeOlPage,"Lütfen En Az 1 Tane Cinsiyet Seçiniz");
			cinsiyetKontrol = false;
		} 
			
		else {
			 if(erkek.isSelected()) {
				kullanici.setCinsiyet(erkek.getText());
				System.out.println("Cinsiyet Erkek Seçildi");
				cinsiyetKontrol = true;	
			 }
				
			else if(kadin.isSelected()) {
				System.out.println("Cinsiyet Kadýn Seçildi");
				kullanici.setCinsiyet(kadin.getText());	
				cinsiyetKontrol = true;	
			}
			
				
		}
		
			
	}
	
	
	
	
	
	
	
}
