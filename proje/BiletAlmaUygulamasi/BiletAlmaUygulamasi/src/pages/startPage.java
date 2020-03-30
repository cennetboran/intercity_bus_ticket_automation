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
		setTitle("SD� Otob�s Bilet Otomasyonu");
		setIconImage(new ImageIcon(getClass().getResource("/resimler/sdu-logo.png")).getImage()); //ikon resminin ayarlanmas�
		
		spanel = new JPanel();
		spanel.setBackground(Color.WHITE);
		spanel.setLocation(0, 0);
		spanel.setLayout(null);
		add(spanel);
		
		bilesen.labelOlustur(spanel, baslik, "�ye Giri�i", SwingConstants.CENTER, 25, 150, 40, 200, 70);
		
		bilesen.labelOlustur(spanel, kadi, "Kullan�c� Ad�:", SwingConstants.LEFT, 16, 125, 150, 200, 20);
		bilesen.labelOlustur(spanel, sifre, "�ifre", SwingConstants.LEFT, 16, 125, 250, 200, 20);
		
		kAdiText = bilesen.textFieldOlustur(spanel, kAdiText, 125, 190, 250, 25);
		sifreText = bilesen.textFieldOlustur(spanel, sifreText, 125, 290, 250, 25);
		
		uyeOl = bilesen.buttonOlustur(spanel, uyeOl, "�ye Ol", 125, 360, 85, 30);
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
				
				//BURAYA KULLAN�C� NESNES� YOLLANACAK;
				String k_adi = kAdiText.getText();
				String sifre = sifreText.getText();
				
				
				if(veritabani.kullaniciSorgula(k_adi, sifre)) {
					JOptionPane.showMessageDialog(sframe,"Giri� Yapma i�lemi Ba�ar� ile Tamamland�\n"
							+ "Ho�geldiniz");
					new seferBelirlemePage();
				}
						
				else
					JOptionPane.showMessageDialog(sframe, "Sistemimizde b�yle bir kullan�c� bulunmamaktad�r"
							+ "\nL�tfen kullan�c� adn�z� ve �ifrenizi do�ru girdi�inizden emin olunuz\nKay�tl� de�ilseniz kay�t olunuz");
				
				
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
	
	
	
	/*baslik = new JLabel("�ye Giri�i", SwingConstants.CENTER);
	baslik.setFont(new Font("Arial", Font.BOLD, 25));
	baslik.setBounds(150, 40, 200, 70);
	spanel.add(baslik);*/
	
	/*kadi = new JLabel("Kullan�c� Ad�:");
	kadi.setFont(new Font("Arial", Font.BOLD, 16));
	kadi.setBounds(125, 150, 200, 20);
	spanel.add(kadi);*/
	
	/*kAdiText = new JTextField();
	kAdiText.setBounds(125, 190, 250, 25);
	spanel.add(kAdiText);*/
	
	/*sifre = new JLabel("�ifre:");
	sifre.setFont(new Font("Arial", Font.BOLD, 16));
	sifre.setBounds(125, 250, 200, 20);
	spanel.add(sifre);*/
	
	/*sifreText = new JTextField();
	sifreText.setBounds(125, 290, 250, 25);
	spanel.add(sifreText);*/
	
	/*uyeOl = new JButton("�yel Ol");
	uyeOl.setBounds(125, 360, 85, 30);
	spanel.add(uyeOl);*/
	
	/*giris = new JButton("Giri� >>");
	giris.setBounds(290, 360, 85, 30);
	spanel.add(giris);*/
	
}
