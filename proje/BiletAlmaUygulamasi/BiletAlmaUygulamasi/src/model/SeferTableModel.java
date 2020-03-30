package model;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

public class SeferTableModel extends AbstractTableModel {

	
	private static final int KALKIS_COL=0;
	private static final int VARIS_COL=1;
	private static final int TARIH_COL=2;
	private static final int KALKIS_SAAT_COL=3;
	private static final int KALKIS_DAK_COL=4;
	private static final int FIYAT_COL=5;
	
	private ArrayList<Sefer> seferListesi;
	private JTable table;
	
	
	public SeferTableModel(ArrayList<Sefer> seferListesi,JTable table) {
		this.seferListesi = seferListesi;
		this.table = table;
	}

	private String[] sutunAdlari = {"Kalkýþ Yeri","Varýþ Yeri","Tarih","Kalkýþ Saat","Kalkýþ Dakika","Fiyat"};
	
	
	
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return sutunAdlari[column];
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return sutunAdlari.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return seferListesi.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		Sefer tempSefer = seferListesi.get(row); 
		System.out.println("Seçilen satýr :" + table.getSelectedRow() );

		switch (col) {
		case KALKIS_COL:
			return tempSefer.getBaslangic();
		case VARIS_COL:
			return tempSefer.getBitis();
			
		case TARIH_COL:
			return tempSefer.getTarih();
			
		case KALKIS_SAAT_COL:
			return tempSefer.getKalkis_saat();
			
		case KALKIS_DAK_COL :
			return tempSefer.getKalkis_dakika();
			
		case FIYAT_COL:
			return tempSefer.getFiyat();
			
		default:
			return null;
			
		}		
	
	}
	
	
	
	
}
