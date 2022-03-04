
package com.schoolproject.dataaccess;
import com.schoolproject.entities.Egitmen;
import com.schoolproject.entities.Uye;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class KullaniciIslemleri {
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    
    
    
    // Burasi Tamam!
    // Egitmen silmeye yarar. Ana ekranda Egitmen sil butonuna basildiginda bu methoda ulasilir.
    public void egitmenSil(int id) {
        
        String sorgu = "Delete from instructors where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    // Burasi Tamam!
    // Uye silmeye yarar. Ana ekranda Uye sil butonuna basildiginda bu methoda ulasilir.
    public void uyeSil(int id) {
        String sorgu = "Delete from members where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    // Burasi Tamam!
    // Egitmen guncellemeye yarar. Ana ekranda egitmen guncelle butonuna basildiginda orda bulunan gerekli sartlari sagladigi takdirde bu methoda erisilir.
    public void egitmenGuncelle(String isim,String soyisim,String cinsiyet,String kimlikNumarasi,String telefonNo,String email,String dogumTarihi,int maas,int id) {
        
        String sorgu = "Update instructors set first_name = ?, last_name = ?, gender = ?, identity_number = ?, date_of_birth  = ? , phone_number = ?, salary = ? , email = ? where id =" + id + "";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, isim);
            preparedStatement.setString(2, soyisim);
            preparedStatement.setString(3, cinsiyet);
            preparedStatement.setString(4, kimlikNumarasi);
            preparedStatement.setString(5, dogumTarihi);
            preparedStatement.setString(6, telefonNo);
            preparedStatement.setInt(7, maas);
            preparedStatement.setString(8, email);
            preparedStatement.executeUpdate();
            if(preparedStatement.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Eğitmen Güncelleme Başarıyla Tamamlandı...");
            }
            else {
                JOptionPane.showMessageDialog(null, "Veritabanında İşlem Yaparken Beklenmedik Bir Hata Oluştu !");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    // Burasi Tamam!
    // Uye guncellemeye yarar. Ana ekranda uye guncelle butonuna basildiginda orda bulunan gerekli sartlari sagladigi takdirde bu methoda erisilir.
    public void uyeGuncelle(String isim, String soyisim, String cinsiyet,String hastalik, String kimlikNumarasi, String telefonNumarasi,String email,int boy,int kilo,int abonelikSuresi,String dogumTarihi,String acilDurumKisi,String acilDurumNumara,String calismaProgrami,int id) {
        
        String sorgu = "Update members set first_name = ?, last_name = ?, identity_number = ?, phone_number = ?, email = ?, gender = ?, membership_duration = ?, active_program = ?, disease = ?, height = ?, weight = ?, date_of_birth = ?, emergency_name = ?, emergency_phone_number = ? Where id = " + id + "";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, isim);
            preparedStatement.setString(2, soyisim);
            preparedStatement.setString(3, kimlikNumarasi);
            preparedStatement.setString(4, telefonNumarasi);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, cinsiyet);
            preparedStatement.setInt(7, abonelikSuresi);
            preparedStatement.setString(8, calismaProgrami);
            preparedStatement.setString(9, hastalik);
            preparedStatement.setInt(10, boy);
            preparedStatement.setInt(11, kilo);
            preparedStatement.setString(12, dogumTarihi);
            preparedStatement.setString(13, acilDurumKisi);
            preparedStatement.setString(14, acilDurumNumara);
            preparedStatement.executeUpdate();
            if(preparedStatement.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Üye Güncelleme Başarıyla Tamamlandı...");
            }
            else {
                JOptionPane.showMessageDialog(null, "Veritabanında İşlem Yaparken Beklenmedik Bir Hata Oluştu !");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    // Burasi Tamam!
    // Egitmen eklemeye yarar. Ana ekranda egitmen ekle butonuna basildiginda egitmen ekle ekrani acilir. Orada gerekli kosullar saglandiginda ve yeni egitmen ekle butonuna basildiginda bu methoda erisilir.
    public void egitmenEkle(String isim,String soyisim,String cinsiyet,String kimlikNumarasi,String telefonNumarasi,String email,String dogumTarihi,int maas) {
        
        String sorgu = "Insert Into instructors(first_name,last_name,gender,identity_number,date_of_birth,phone_number,salary,email) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, isim);
            preparedStatement.setString(2, soyisim);
            preparedStatement.setString(3, cinsiyet);
            preparedStatement.setString(4, kimlikNumarasi);
            preparedStatement.setString(5, dogumTarihi);
            preparedStatement.setString(6, telefonNumarasi);
            preparedStatement.setInt(7, maas);
            preparedStatement.setString(8, email);
            
            preparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Eğitmen Başarıyla Eklendi!");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    // Burasi Tamam!
    // Uye eklemeye yarar. Ana ekranda uye ekle butonuna basildiginda uye ekle ekrani acilir. Orada gerekli kosullar saglandiginda ve yeni uye ekle butonuna basildiginda bu methoda erisilir.
    public void uyeEkle(String isim, String soyisim, String cinsiyet,String hastalik, String kimlikNumarasi, String telefonNumarasi,String email,int boy,int kilo,int abonelikSuresi,String calismaProgrami,String dogumTarihi,String acilDurumKisi,String acilDurumNumara) {
        String sorgu1 = "Insert Into members(first_name,last_name,identity_number,phone_number,email,gender,membership_duration,active_program,disease,height,weight,date_of_birth,emergency_name,emergency_phone_number) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? , ?)";
        
        try {
            preparedStatement = con.prepareStatement(sorgu1);
            preparedStatement.setString(1, isim);
            preparedStatement.setString(2, soyisim);
            preparedStatement.setString(3, kimlikNumarasi);
            preparedStatement.setString(4, telefonNumarasi);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, cinsiyet);
            preparedStatement.setInt(7, abonelikSuresi);
            preparedStatement.setString(8, calismaProgrami);
            preparedStatement.setString(9, hastalik);
            preparedStatement.setInt(10, boy);
            preparedStatement.setInt(11, kilo);
            preparedStatement.setString(12, dogumTarihi);
            preparedStatement.setString(13, acilDurumKisi);
            preparedStatement.setString(14, acilDurumNumara);
            preparedStatement.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Üye Başarıyla Eklendi");
           
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }

    
    
    // Burasi Tamam!
    //  Bu method veritabanindaki egitmenleri Arraylist yardimiyla getirmeye yarar.
    public ArrayList<Egitmen> egitmenleriGetir() {
        
        ArrayList<Egitmen> egitmenCikti = new ArrayList<Egitmen>();
        
        try {
            statement = con.createStatement();
            String sorgu = "Select *From instructors"; 
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()) {
                int id = rs.getInt("id");
                String isim = rs.getString("first_name");
                String soyisim = rs.getString("last_name");
                String kimlikNumarasi = rs.getString("identity_number");
                String cinsiyet = rs.getString("gender");
                String telefonNumarasi = rs.getString("phone_number");
                String email = rs.getString("email");
                String dogumTarihi = rs.getString("date_of_birth");
                Date kayitTarihi = rs.getDate("created_at");
                int maas = rs.getInt("salary");
                egitmenCikti.add(new Egitmen(id, isim, soyisim, cinsiyet, kimlikNumarasi, dogumTarihi, telefonNumarasi, email, maas, kayitTarihi));
            }
            return egitmenCikti;
        } 
            
        catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    
    // Burasi Tamam!
    //  Bu method veritabanindaki uyeleri Arraylist yardimiyla getirmeye yarar.
    public ArrayList<Uye> uyeleriGetir() {
        
        ArrayList<Uye> uyeCikti = new ArrayList<Uye>();
        
        try {
            statement = con.createStatement();
            String sorgu = "Select *From members "; 
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()) {
                
                int id = rs.getInt("id");
                String isim = rs.getString("first_name");
                String soyisim = rs.getString("last_name");
                String kimlikNumarasi = rs.getString("identity_number");
                String cinsiyet = rs.getString("gender");
                String telefonNumarasi = rs.getString("phone_number");
                String email = rs.getString("email");
                String dogumTarihi = rs.getString("date_of_birth");
                Date kayitTarihi = rs.getDate("created_at");
                int boy = rs.getInt("height");
                int kilo = rs.getInt("weight");
                String hastalik = rs.getString("disease");
                String aktifProgram = rs.getString("active_program");
                int abonelikSuresi = rs.getInt("membership_duration");
                String acilKisi = rs.getString("emergency_name");
                String acilKisiNumarasi = rs.getString("emergency_phone_number");
                uyeCikti.add(new Uye(id, isim, soyisim, kimlikNumarasi, cinsiyet, telefonNumarasi, email, dogumTarihi, kayitTarihi, kilo, boy,aktifProgram , abonelikSuresi, hastalik,acilKisi,acilKisiNumarasi));
                 
            }
            return uyeCikti;
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    } 
    
    
    // Burasi Tamam!
    // Bu method Veritabanindaki admins tablosundaki kullanici adi ve sifreyi getirmeye yarar.
    // GirisEkrani Framesinden gonderilen username ve password Veritabanindaki username ve password'e esit ise true deger donmesini saglayarak adminin AnaEkranFrame'ye girisini saglar.
    public boolean girisYap(String username, String password) {

    String sorgu = "Select * From admins where username = ? and password = ?";

        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
            
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    // Burasi Tamam!
    // Bu method program calismaya basladiginda veritabanina baglanip baglanmadigini kontrol eder.
    public KullaniciIslemleri() {
        
        String url = "jdbc:postgresql://" + Database.host + ":" + Database.port + "/" + Database.dbIsmi + "?useUnicode=true&characterEncoding=utf8";
        
     
        try {
            con = DriverManager.getConnection(url,Database.kullaniciAdi,Database.parola);
            System.out.println("Baglanti Basarili.");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veritabanına Bağlantı Başarısız!");
        }
    }
    
    
    
}
