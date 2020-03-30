package pages;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.*;

public class odemePage extends JFrame {
	
	private Bilesenler bilesen;
	
	private JPanel odemePanel;
	
	private JLabel baslik;
	private JLabel kartNum;
	private JLabel cvv;
	
	private JTextField kartNumText;
	private JTextField cvvText;
	
	private JButton odemeOnay;
	private JButton geri;
	
	public static void main(String[] args ) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					odemePage odemeFrame = new odemePage();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public odemePage() {
		bilesen = new Bilesenler();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 550);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("SDÜ Otobüs Bilet Otomasyonu");
		setIconImage(new ImageIcon(getClass().getResource("/resimler/sdu-logo.png")).getImage());
		
		odemePanel = new JPanel();
		odemePanel.setBackground(Color.WHITE);
		odemePanel.setLocation(0, 0);
		odemePanel.setLayout(null);
		add(odemePanel);
		
		bilesen.labelOlustur(odemePanel, baslik, "Ödeme Bilgileriniz", SwingConstants.CENTER, 25, 125, 40, 250, 70);
		
		bilesen.labelOlustur(odemePanel, kartNum, "Kart Numaranýz:", SwingConstants.LEFT, 16, 65, 200, 200, 20);
		bilesen.textFieldOlustur(odemePanel, kartNumText, 200, 200, 200, 20);
		
		bilesen.labelOlustur(odemePanel, cvv, "CVV:", SwingConstants.LEFT, 16, 65, 270, 200, 20);
		bilesen.textFieldOlustur(odemePanel, kartNumText, 200, 270, 200, 20);
		
		bilesen.buttonOlustur(odemePanel, geri, "<< Geri", 125, 380, 85, 30);
		bilesen.buttonOlustur(odemePanel, odemeOnay, "Ödemeyi Onayla", 250, 380, 150, 30);
	}
}
