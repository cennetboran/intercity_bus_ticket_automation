package pages;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.*;

public class koltukSecimPage extends JFrame {
	
	private Bilesenler bilesen;
	
	private JPanel koltukSecimPanel;
	
	private JLabel baslik;
	
	private JButton[][] koltuklar;
	
	private String koltukNum;
	
	int sayi = 1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					koltukSecimPage koltukSecimFrame = new koltukSecimPage();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public koltukSecimPage() {
		bilesen = new Bilesenler();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(500, 700);
		setResizable(false);
		setLocationRelativeTo(null);
		setTitle("SDÜ Otobüs Bilet Otomasyonu");
		setIconImage(new ImageIcon(getClass().getResource("/resimler/sdu-logo.png")).getImage());
		
		koltukSecimPanel = new JPanel();
		koltukSecimPanel.setBackground(Color.WHITE);
		koltukSecimPanel.setLocation(0, 0);
		koltukSecimPanel.setLayout(null);
		add(koltukSecimPanel);
		
		bilesen.labelOlustur(koltukSecimPanel, baslik, "Koltuk Seçiniz", SwingConstants.CENTER, 25, 125, 40, 250, 70);
		
		koltuklar = new JButton[8][3];
		for(int i=0; i<koltuklar.length; i++) {
			
			for(int j=0; j<koltuklar[i].length; j++) {
				//bilesen.buttonOlustur(koltukSecimPanel, koltuklar[i][j], Integer.toString(i+j+sayi), 10+j*70, 100+i*70, 50, 50);
				
				if(j!=2) {
					bilesen.buttonOlustur(koltukSecimPanel, koltuklar[i][j], Integer.toString(i+j+sayi), 10+j*70, 100+i*70, 50, 50);
				} else {
					bilesen.buttonOlustur(koltukSecimPanel, koltuklar[i][j], Integer.toString(i+j+sayi), 10+j*95, 100+i*70, 50, 50);
				}
			}
			//sayi++;
		}
	}
}
