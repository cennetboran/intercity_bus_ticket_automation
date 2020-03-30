package pages;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class startPage extends JFrame {
	
	private Veritabani veritabani;
	public static startPage sframe;
	private Bilesenler bilesen;
	
	private JPanel spanel;
	
	private JLabel baslik;
	private JLabel kadi;
	private JLabel sifre;
	
	private JButton giris;
	private JButton uyeOl;
	
	private JTextField kAdiText;
	private JTextField sifreText;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					 sframe = new startPage();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public startPage(String s) {
		
	}
	
	public startPage() {
		bilesen = new Bilesenler();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("SDÜ Otobüs Bilet Otomasyonu");
		setIconImage(new ImageIcon(getClass().getResource("/resimler/sdu-logo.png")).getImage()); //ikon resminin ayarlanmasý
		
		spanel = new JPanel();
		spanel.setBackground(Color.WHITE);
		spanel.setLocation(0, 0);
		spanel.setLayout(null);
		add(spanel);
		
		bilesen.labelOlustur(spanel, baslik, "Üye Giriþi", SwingConstants.CENTER, 25, 150, 40, 200, 70);
		
		bilesen.labelOlustur(spanel, kadi, "Kullanýcý Adý:", SwingConstants.LEFT, 16, 125, 150, 200, 20);
		bilesen.labelOlustur(spanel, sifre, "Þifre", SwingConstants.LEFT, 16, 125, 250, 200, 20);
		
		kAdiText = bilesen.textFieldOlustur(spanel, kAdiText, 125, 190, 250, 25);
		sifreText = bilesen.textFieldOlustur(spanel, sifreText, 125, 290, 250, 25);
		
		uyeOl = bilesen.buttonOlustur(spanel, uyeOl, "Üye Ol", 125, 360, 85, 30);
		giris = bilesen.buttonOlustur(spanel, giris, "Giris >>", 290, 360, 85, 30);
		
		
		
		veritabani = new Veritabani();
		girisButtonListener();
		uyeOlButtonListener();
	}
	
	
	
	public void girisButtonListener() {
		
		giris.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//BURAYA KULLANÝCÝ NESNESÝ YOLLANACAK;
				String k_adi = kAdiText.getText();
				String sifre = sifreText.getText();
				
				
				if(veritabani.kullaniciSorgula(k_adi, sifre)) {
					JOptionPane.showMessageDialog(sframe,"Giriþ Yapma iþlemi Baþarý ile Tamamlandý\n"
							+ "Hoþgeldiniz");
					new seferBelirlemePage();
				}
						
				else
					JOptionPane.showMessageDialog(sframe, "Sistemimizde böyle bir kullanýcý bulunmamaktadýr"
							+ "\nLütfen kullanýcý adnýzý ve þifrenizi doðru girdiðinizden emin olunuz\nKayýtlý deðilseniz kayýt olunuz");
				
				
			}
		});
		
		
		
	}
	
	
	public void uyeOlButtonListener() {
		
		
		uyeOl.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new uyeOlPage(veritabani);
			}
		});
		
		
	}
	
	
	
	/*baslik = new JLabel("Üye Giriþi", SwingConstants.CENTER);
	baslik.setFont(new Font("Arial", Font.BOLD, 25));
	baslik.setBounds(150, 40, 200, 70);
	spanel.add(baslik);*/
	
	/*kadi = new JLabel("Kullanýcý Adý:");
	kadi.setFont(new Font("Arial", Font.BOLD, 16));
	kadi.setBounds(125, 150, 200, 20);
	spanel.add(kadi);*/
	
	/*kAdiText = new JTextField();
	kAdiText.setBounds(125, 190, 250, 25);
	spanel.add(kAdiText);*/
	
	/*sifre = new JLabel("Þifre:");
	sifre.setFont(new Font("Arial", Font.BOLD, 16));
	sifre.setBounds(125, 250, 200, 20);
	spanel.add(sifre);*/
	
	/*sifreText = new JTextField();
	sifreText.setBounds(125, 290, 250, 25);
	spanel.add(sifreText);*/
	
	/*uyeOl = new JButton("Üyel Ol");
	uyeOl.setBounds(125, 360, 85, 30);
	spanel.add(uyeOl);*/
	
	/*giris = new JButton("Giriþ >>");
	giris.setBounds(290, 360, 85, 30);
	spanel.add(giris);*/
	
}
