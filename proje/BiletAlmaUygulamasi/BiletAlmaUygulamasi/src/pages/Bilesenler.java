package pages;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bilesenler {
	public void labelOlustur(JPanel panel, JLabel label, String icerik, int textLabelYeri, int fontBoyutu, int koordinatX, int koordinatY, int genislik, int yukseklik) {
		label = new JLabel(icerik, textLabelYeri);
		label.setFont(new Font("Arial", Font.BOLD, fontBoyutu));
		label.setBounds(koordinatX, koordinatY, genislik, yukseklik);
		panel.add(label);
		
	}
	
	public JTextField textFieldOlustur(JPanel panel, JTextField textField, int koordinatX, int koordinatY, int genislik, int yukseklik) {
		textField = new JTextField();
		textField.setBounds(koordinatX, koordinatY, genislik, yukseklik);
		panel.add(textField);
		return textField;
	}
	
	public JButton buttonOlustur(JPanel panel, JButton button, String icerik, int koordinatX, int koordinatY, int genislik, int yukseklik) {
		button = new JButton(icerik);
		button.setBounds(koordinatX, koordinatY, genislik, yukseklik);
		panel.add(button);
		return button;
	}
	
	public JCheckBox checkBoxOlustur(JPanel panel, JCheckBox checkBox, String icerik, Color renk, int koordinatX, int koordinatY, int genislik, int yuskseklik) {
		checkBox = new JCheckBox(icerik);
		checkBox.setBackground(renk);
		checkBox.setBounds(koordinatX, koordinatY, genislik, yuskseklik);
		panel.add(checkBox);
		return checkBox;
	}
	
	public JComboBox comboBoxOlustur(JPanel panel, JComboBox comboBox, int koordinatX, int koordinatY, int yukseklik, int genislik) {
		comboBox.setBounds(koordinatX, koordinatY, yukseklik, genislik);
		panel.add(comboBox);
		return comboBox;
	}
}
