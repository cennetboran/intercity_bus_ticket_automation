package pages;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import model.Bilet;
import model.Sefer;
import model.SeferTableModel;

public class SeferlerPage extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JPanel panel;
	private JButton btnKoltukSecimiYap;
	private ArrayList<Sefer> seferListesi;
	private Bilet bilet;
	private SeferlerPage seferPage;

	/**
	 * Launch the application.
	 */
	public SeferlerPage()
	{
		
	}
	/**
	 * Create the frame.
	 */
	public SeferlerPage(ArrayList<Sefer> seferListesi) {
		setVisible(true);
		seferPage = new SeferlerPage();
		setTitle("Sefer Listesi");
		setBounds(200, 200, 684, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		if(seferListesi == null)
			System.out.println("NULLLLLLLLLLLLl");
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		this.seferListesi = seferListesi;
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new SeferTableModel(seferListesi,table));
		
		
		panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		btnKoltukSecimiYap = new JButton("Koltuk Se\u00E7imi Yap");
		panel.add(btnKoltukSecimiYap);
		koltukSecActionListener();
	}
	
	public void koltukSecActionListener() {
		btnKoltukSecimiYap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int index = table.getSelectedRow();
				if(index == -1)
					JOptionPane.showMessageDialog(seferPage, "Lütfen sefer Seçiniz");
				String ad = Veritabani.kullanici.getIsim();
				String soyad = Veritabani.kullanici.getSoyisim();
				String kalkis = seferListesi.get(index).getBaslangic();
				String varis = seferListesi.get(index).getBitis();
				Date tarih = seferListesi.get(index).getTarih();
				int fiyat = seferListesi.get(index).getFiyat();
				System.out.println("FÝYATTTTTTT : " +  fiyat);
				bilet = new Bilet(ad, soyad, kalkis, varis, tarih,fiyat);
				new KoltukSecimiFrame(bilet);
}
		});
	}

}
