package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Kullanici;
import model.Sefer;

public class Veritabani {
	
	private Connection myConnection;
	private PreparedStatement myPreparedStatement;
	private Statement myStatement; 
	private String sqlKayit = "insert into kullanici (kullanici_adi,kullanici_isim,kullanici_soyisim,kullanici_sifre,cinsiyet) values (?,?,?,?,?)";
	private String sqlLogin;
	private String sqlSeferListele;
	private ResultSet myResultSet;
	public static Kullanici kullanici;
	
	
	public Veritabani() {
		
		if(myConnection == null) {
		try {
			myConnection = DriverManager.getConnection("jdbc:mysql://localhost/biletuygulama?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","root");
			System.out.println("Baðlanti Basarili!!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			System.out.println("Baðlanti Basarisiz!!!!");
		
			e.printStackTrace();
		}
		
		
		}
		else
			System.out.println("Veritabani Zaten Baðlý");
		
		
	}
	
	
	
	public boolean kullaniciSorgula(String kAdi,String sifre) {
		sqlLogin = "select kullanici_adi,kullanici_isim,kullanici_soyisim from kullanici where kullanici_adi ='"+kAdi+"' && kullanici_sifre ='" +sifre + "'" ;
		try {
			myStatement = myConnection.createStatement();
			
			
			myResultSet = myStatement.executeQuery(sqlLogin);
			kullanici = new Kullanici();
			if(!myResultSet.next()) {
				myStatement.close();
				myResultSet.close();
				return false;
			}
			myResultSet.previous();
			while(myResultSet.next()) {
				
				kullanici.setIsim(myResultSet.getString(2));
				kullanici.setSoyisim( myResultSet.getString(3));
				System.out.println("Kullanýcý Adý : " + myResultSet.getString(1));
				System.out.println("Kullanici Ýsim : " + myResultSet.getString(2));
				System.out.println("Kullanici Soyisim : " + myResultSet.getString(3));
				
			}
			myStatement.close();
			myResultSet.close();
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
		
		
		
		
		
		
	}
	

	
	public boolean kayitYap(Kullanici user) {
		try {
			myPreparedStatement = myConnection.prepareStatement(sqlKayit);
			myPreparedStatement.setString(1, user.getKullaniciAdi());
			myPreparedStatement.setString(2, user.getIsim());
			myPreparedStatement.setString(3, user.getSoyisim());
			myPreparedStatement.setString(4, user.getSifre());
			myPreparedStatement.setString(5, user.getCinsiyet());
			
		    int i = myPreparedStatement.executeUpdate();
			
			if(i == 0) {
				System.out.println("KAYIT BAÞARISIZ!!");
			}
			else {
				
				System.out.println("KAYIT BAÞARILI!");
				
			}
			
			myPreparedStatement.close();
				
			return true;
			
		} catch (SQLIntegrityConstraintViolationException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("SQL Hatasý Oluþtu!");
			return false;
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			return false;
		}
		
	}
	
	public ArrayList<Sefer> seferleriListele(String kalkis,String varis,String yil,String ay,String gun) {
		ArrayList<Sefer>seferler = new ArrayList<Sefer>(); 
		sqlSeferListele = "select kalkis,varis,tarih,kalkis_saat,kalkis_dakika,fiyat from sefer where kalkis = '" + kalkis + "' && varis = '" + varis + "' && tarih = '" + yil +"-" + ay + "-" + gun + "'" ;
		try {
			myStatement = myConnection.createStatement();
			
			myResultSet = myStatement.executeQuery(sqlSeferListele);
			
			if(!myResultSet.next())
			{
				myResultSet.close();
				myStatement.close();
				return null;
			}
			
			myResultSet.previous();///Ýlk Satýra Dön
			while(myResultSet.next()) {
				Sefer tempSefer = new Sefer();
				tempSefer.setBaslangic(myResultSet.getString(1));
				tempSefer.setBitis(myResultSet.getString(2));
				tempSefer.setTarih(myResultSet.getDate(3));
				tempSefer.setKalkis_saat(myResultSet.getInt(4));
				tempSefer.setKalkis_dakika(myResultSet.getInt(5));
				System.out.println("FÝYATTTTTTTT::::::::"  + myResultSet.getInt(6));
				tempSefer.setFiyat(myResultSet.getInt(6));
				seferler.add(tempSefer);				
			
			}
			
			
			return seferler;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
		
	}
	
	

}
