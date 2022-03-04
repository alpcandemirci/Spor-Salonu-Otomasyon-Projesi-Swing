package com.schoolproject.entities;


import java.sql.Date;


public class Uye {
    private int id;
    private String isim;
    private String soyisim;
    private String kimlikNumarasi;
    private String cinsiyet;
    private String telefonNumarasi;
    private String email;
    private String dogumTarihi;
    private final Date kayitTarihi;
    private int kilo;
    private int boy;
    private String aktifProgram;
    private int abonelikSuresi;
    private String hastalik;
    private String acilKisi;
    private String acilKisiNumarasi;
    public Uye(int id, String isim, String soyisim, String kimlikNumarasi, String cinsiyet, String telefonNumarasi, String email, String dogumTarihi, Date kayitTarihi, int kilo, int boy, String aktifProgram, int abonelikSuresi, String hastalik,String acilKisi,String acilKisiNumarasi) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.kimlikNumarasi = kimlikNumarasi;
        this.cinsiyet = cinsiyet;
        this.telefonNumarasi = telefonNumarasi;
        this.email = email;
        this.dogumTarihi = dogumTarihi;
        this.kayitTarihi = kayitTarihi;
        this.kilo = kilo;
        this.boy = boy;
        this.aktifProgram = aktifProgram;
        this.abonelikSuresi = abonelikSuresi;
        this.hastalik = hastalik;
        this.acilKisi = acilKisi;
        this.acilKisiNumarasi = acilKisiNumarasi;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public String getAktifProgram() {
        return aktifProgram;
    }

    public void setAktifProgram(String aktifProgram) {
        this.aktifProgram = aktifProgram;
    }

    public int getAbonelikSuresi() {
        return abonelikSuresi;
    }

    public void setAbonelikSuresi(int abonelikSuresi) {
        this.abonelikSuresi = abonelikSuresi;
    }

    public String getHastalik() {
        return hastalik;
    }

    public void setHastalik(String hastalik) {
        this.hastalik = hastalik;
    }
            
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getKimlikNumarasi() {
        return kimlikNumarasi;
    }

    public void setKimlikNumarasi(String kimlikNumarasi) {
        this.kimlikNumarasi = kimlikNumarasi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getTelefonNumarasi() {
        return telefonNumarasi;
    }

    public void setTelefonNumarasi(String telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public Date getKayitTarihi() {
        return kayitTarihi;
    }

   

    public String getAcilKisi() {
        return acilKisi;
    }

    public void setAcilKisi(String acilKisi) {
        this.acilKisi = acilKisi;
    }

    public String getAcilKisiNumarasi() {
        return acilKisiNumarasi;
    }

    public void setAcilKisiNumarasi(String acilKisiNumarasi) {
        this.acilKisiNumarasi = acilKisiNumarasi;
    }
    
    
    
    
}
