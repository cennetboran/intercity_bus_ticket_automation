package pages;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.Bilet;

public class KoltukSecimiFrame extends JFrame implements ActionListener{

	private JPanel contentPane;
	private Bilet bilet;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public KoltukSecimiFrame(Bilet bilet) {
		this.bilet = bilet;	
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnK = new JButton("1");
		btnK.setBounds(22, 64, 89, 23);
		btnK.addActionListener(this);
		contentPane.add(btnK);
		
		JButton btnK_1 = new JButton("2");
		btnK_1.setBounds(138, 64, 89, 23);
		btnK_1.addActionListener(this);
		contentPane.add(btnK_1);
		
		JButton btnK_2 = new JButton("3");
		btnK_2.setBounds(323, 64, 89, 23);
		btnK_2.addActionListener(this);
		contentPane.add(btnK_2);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.setBounds(22, 126, 89, 23);
		btnNewButton.addActionListener(this);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("5");
		btnNewButton_1.setBounds(138, 126, 89, 23);
		btnNewButton_1.addActionListener(this);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("6");
		btnNewButton_2.setBounds(323, 126, 89, 23);
		btnNewButton_2.addActionListener(this);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("7");
		btnNewButton_3.setBounds(22, 183, 89, 23);
		btnNewButton_3.addActionListener(this);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.setBounds(138, 183, 89, 23);
		btnNewButton_4.addActionListener(this);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("9");
		btnNewButton_5.setBounds(323, 183, 89, 23);
		btnNewButton_5.addActionListener(this);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("10");
		btnNewButton_6.setBounds(22, 228, 89, 23);
		btnNewButton_6.addActionListener(this);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("11");
		btnNewButton_7.setBounds(138, 228, 89, 23);
		btnNewButton_7.addActionListener(this);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("12");
		btnNewButton_8.setBounds(323, 228, 89, 23);
		btnNewButton_8.addActionListener(this);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("13");
		btnNewButton_9.setBounds(22, 276, 89, 23);
		btnNewButton_9.addActionListener(this);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("14");
		btnNewButton_10.setBounds(138, 276, 89, 23);
		btnNewButton_10.addActionListener(this);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("15");
		btnNewButton_11.setBounds(323, 276, 89, 23);
		btnNewButton_11.addActionListener(this);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("16");
		btnNewButton_12.setBounds(22, 320, 89, 23);
		btnNewButton_12.addActionListener(this);
		contentPane.add(btnNewButton_12);
		
		JButton button = new JButton("17");
		button.setBounds(138, 320, 89, 23);
		button.addActionListener(this);
		contentPane.add(button);
		
		JButton button_1 = new JButton("18");
		button_1.setBounds(323, 320, 89, 23);
		button_1.addActionListener(this);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("19");
		button_2.setBounds(22, 365, 89, 23);
		button_2.addActionListener(this);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("20");
		button_3.setBounds(138, 365, 89, 23);
		button_3.addActionListener(this);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("21");
		button_4.setBounds(323, 365, 89, 23);
		button_4.addActionListener(this);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("22");
		button_5.addActionListener(this);
		button_5.setBounds(22, 399, 89, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("23");
		button_6.setBounds(138, 399, 89, 23);
		button_6.addActionListener(this);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("24");
		button_7.setBounds(323, 399, 89, 23);
		button_7.addActionListener(this);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("25");
		button_8.setBounds(22, 447, 89, 23);
		button_8.addActionListener(this);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("26");
		button_9.setBounds(138, 447, 89, 23);
		button_9.addActionListener(this);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("27");
		button_10.setBounds(323, 447, 89, 23);
		button_10.addActionListener(this);
		contentPane.add(button_10);
		
		JButton btnSatnAlmTamamla = new JButton("Sat\u0131n Al\u0131m\u0131 Tamamla");
		btnSatnAlmTamamla.setBounds(148, 490, 195, 23);
		btnSatnAlmTamamla.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//En son sayfaya gidicek;
				new SatýnAlimiTamam(bilet);
			}
		});
		contentPane.add(btnSatnAlmTamamla);
	}
	
	public void actionListenerss() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton tempButton =(JButton) e.getSource();
		
		int koltukNo =Integer.parseInt(tempButton.getText());JOptionPane.showMessageDialog(this, koltukNo+ " Numuaralý Koltuk Seçildi!");
		bilet.setKoltukno(koltukNo);
	}
	
}
