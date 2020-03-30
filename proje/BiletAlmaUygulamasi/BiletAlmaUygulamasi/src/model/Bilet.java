package model;

import java.sql.Date;

public class Bilet {
	
	private String yolcu_ad;
	private String yolcu_soyad;
	private String varis;
	private String kalkis;
	private int koltukno;
	private Date kalkis_tarih;
	private int fiyat;
	
	
	public String getYolcu_ad() {
		return yolcu_ad;
	}


	public void setYolcu_ad(String yolcu_ad) {
		this.yolcu_ad = yolcu_ad;
	}


	public String getYolcu_soyad() {
		return yolcu_soyad;
	}


	public void setYolcu_soyad(String yolcu_soyad) {
		this.yolcu_soyad = yolcu_soyad;
	}


	public String getVaris() {
		return varis;
	}


	public void setVaris(String varis) {
		this.varis = varis;
	}


	public String getKalkis() {
		return kalkis;
	}


	public void setKalkis(String kalkis) {
		this.kalkis = kalkis;
	}


	public int getKoltukno() {
		return koltukno;
	}


	public void setKoltukno(int koltukno) {
		this.koltukno = koltukno;
	}


	public Date getKalkis_tarih() {
		return kalkis_tarih;
	}


	public void setKalkis_tarih(Date kalkis_tarih) {
		this.kalkis_tarih = kalkis_tarih;
	}


	public int getFiyat() {
		return fiyat;
	}


	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}


	public Bilet(String ad,String soyad,String kalkis,String varis,Date tarih,int fiyat) {
		this.yolcu_ad = ad;
		this.yolcu_soyad = soyad;
		this.kalkis = kalkis;
		this.varis = varis;
		this.kalkis_tarih=tarih;
		this.fiyat = fiyat;
	}

	
	
	

}
