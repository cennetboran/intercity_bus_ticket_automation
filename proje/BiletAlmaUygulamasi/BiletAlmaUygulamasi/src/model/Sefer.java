package model;

import java.sql.Date;

public class Sefer {

	private int sefer_id;
	private String baslangic;
	private String bitis;
	private Date tarih;
	private int kalkis_saat;
	private int kalkis_dakika;
	private int fiyat;
	public int getSefer_id() {
		return sefer_id;
	}
	public void setSefer_id(int sefer_id) {
		this.sefer_id = sefer_id;
	}
	public String getBaslangic() {
		return baslangic;
	}
	public void setBaslangic(String baslangic) {
		this.baslangic = baslangic;
	}
	public String getBitis() {
		return bitis;
	}
	public void setBitis(String bitis) {
		this.bitis = bitis;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
		
	}
	public Date getTarih() {
		return tarih;
	}
	public void setTarih(Date tarih) {
		this.tarih = tarih;
	}
	public int getKalkis_saat() {
		return kalkis_saat;
	}
	public void setKalkis_saat(int kalkis_saat) {
		this.kalkis_saat = kalkis_saat;
	}
	public int getKalkis_dakika() {
		return kalkis_dakika;
	}
	public void setKalkis_dakika(int kalkis_dakika) {
		this.kalkis_dakika = kalkis_dakika;
	}
	
	
	
	
	
}
