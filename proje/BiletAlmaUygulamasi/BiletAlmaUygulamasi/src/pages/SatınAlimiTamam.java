package pages;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import model.Bilet;

public class SatýnAlimiTamam extends JFrame {

	private JPanel contentPane;
	private Bilet bilet;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public SatýnAlimiTamam(Bilet bilet) {
		this.bilet = bilet;
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBiletBilgileri = new JLabel("Bilet Bilgileri");
		lblBiletBilgileri.setHorizontalAlignment(SwingConstants.CENTER);
		lblBiletBilgileri.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBiletBilgileri.setBounds(158, 11, 102, 30);
		contentPane.add(lblBiletBilgileri);
		
		JLabel lblAdnz = new JLabel("Ad\u0131n\u0131z : ");
		lblAdnz.setBounds(29, 62, 65, 14);
		contentPane.add(lblAdnz);
		
		JLabel lblSoyadnz = new JLabel("Soyad\u0131n\u0131z : ");
		lblSoyadnz.setBounds(29, 87, 65, 14);
		contentPane.add(lblSoyadnz);
		
		JLabel lblKalkis = new JLabel("Kalk\u0131\u015F  :");
		lblKalkis.setBounds(29, 112, 46, 14);
		contentPane.add(lblKalkis);
		
		JLabel lblVar = new JLabel("Var\u0131\u015F : ");
		lblVar.setBounds(29, 137, 46, 14);
		contentPane.add(lblVar);
		
		JLabel lblTarih = new JLabel("Tarih   :");
		lblTarih.setBounds(29, 162, 46, 14);
		contentPane.add(lblTarih);
		
		JLabel lblKoltukNo = new JLabel("Koltuk No :");
		lblKoltukNo.setBounds(29, 187, 65, 14);
		contentPane.add(lblKoltukNo);
		
		JLabel lblAd = new JLabel("New label");
		lblAd.setText(Veritabani.kullanici.getIsim());
		lblAd.setBounds(132, 62, 128, 14);
		contentPane.add(lblAd);
		
		JLabel lblSoyad = new JLabel("New label");
		lblSoyad.setText(Veritabani.kullanici.getSoyisim());
		lblSoyad.setBounds(132, 87, 128, 14);
		contentPane.add(lblSoyad);
		
		JLabel lblKalkýss = new JLabel("New label");
		lblKalkýss.setText(bilet.getKalkis());
		lblKalkýss.setBounds(132, 112, 128, 14);
		contentPane.add(lblKalkýss);
		
		JLabel lblVariss = new JLabel("New label");
		lblVariss.setText(bilet.getVaris());
		lblVariss.setBounds(132, 137, 128, 14);
		contentPane.add(lblVariss);
		
		JLabel lblTarihh = new JLabel("New label");
		lblTarihh.setText(bilet.getKalkis_tarih().toString());
		lblTarihh.setBounds(132, 162, 128, 14);
		contentPane.add(lblTarihh);
		
		JLabel lblKno = new JLabel("New label");
		lblKno.setText(""+bilet.getKoltukno());
		lblKno.setBounds(132, 187, 46, 14);
		contentPane.add(lblKno);
		
		JLabel lblBiletFiyat = new JLabel("Bilet Fiyat\u0131 : ");
		lblBiletFiyat.setBounds(29, 219, 65, 14);
		contentPane.add(lblBiletFiyat);
		
		JLabel lblFiyat = new JLabel("New label");
		lblFiyat.setText(""+bilet.getFiyat());
		lblFiyat.setBounds(132, 219, 46, 14);
		contentPane.add(lblFiyat);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
