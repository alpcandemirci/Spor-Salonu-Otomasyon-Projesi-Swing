
package com.schoolproject.entities;

import java.sql.Date;

public class Egitmen {
    private int egitmenId;
    private String egitmenIsim;
    private String egitmenSoyisim;
    private String egitmencinsiyet;
    private String egitmenKimlikNumarasi;
    private String egitmenDogumTarihi;
    private String egitmenTelefonNo;
    private String egitmenEmail;
    private int egitmenMaas;
    private Date egitmenKayitTarihi;

    public Egitmen(int egitmenId, String egitmenIsim, String egitmenSoyisim, String egitmencinsiyet, String egitmenKimlikNumarasi, String egitmenDogumTarihi, String egitmenTelefonNo, String egitmenEmail, int egitmenMaas, Date egitmenKayitTarihi) {
        this.egitmenId = egitmenId;
        this.egitmenIsim = egitmenIsim;
        this.egitmenSoyisim = egitmenSoyisim;
        this.egitmencinsiyet = egitmencinsiyet;
        this.egitmenKimlikNumarasi = egitmenKimlikNumarasi;
        this.egitmenDogumTarihi = egitmenDogumTarihi;
        this.egitmenTelefonNo = egitmenTelefonNo;
        this.egitmenEmail = egitmenEmail;
        this.egitmenMaas = egitmenMaas;
        this.egitmenKayitTarihi = egitmenKayitTarihi;
    }

    public int getEgitmenId() {
        return egitmenId;
    }

    public void setEgitmenId(int egitmenId) {
        this.egitmenId = egitmenId;
    }

    public String getEgitmenIsim() {
        return egitmenIsim;
    }

    public void setEgitmenIsim(String egitmenIsim) {
        this.egitmenIsim = egitmenIsim;
    }

    public String getEgitmenSoyisim() {
        return egitmenSoyisim;
    }

    public void setEgitmenSoyisim(String egitmenSoyisim) {
        this.egitmenSoyisim = egitmenSoyisim;
    }

    public String getEgitmencinsiyet() {
        return egitmencinsiyet;
    }

    public void setEgitmencinsiyet(String egitmencinsiyet) {
        this.egitmencinsiyet = egitmencinsiyet;
    }

    public String getEgitmenKimlikNumarasi() {
        return egitmenKimlikNumarasi;
    }

    public void setEgitmenKimlikNumarasi(String egitmenKimlikNumarasi) {
        this.egitmenKimlikNumarasi = egitmenKimlikNumarasi;
    }

    public String getEgitmenDogumTarihi() {
        return egitmenDogumTarihi;
    }

    public void setEgitmenDogumTarihi(String egitmenDogumTarihi) {
        this.egitmenDogumTarihi = egitmenDogumTarihi;
    }

    public String getEgitmenTelefonNo() {
        return egitmenTelefonNo;
    }

    public void setEgitmenTelefonNo(String egitmenTelefonNo) {
        this.egitmenTelefonNo = egitmenTelefonNo;
    }

    public String getEgitmenEmail() {
        return egitmenEmail;
    }

    public void setEgitmenEmail(String egitmenEmail) {
        this.egitmenEmail = egitmenEmail;
    }

    public int getEgitmenMaas() {
        return egitmenMaas;
    }

    public void setEgitmenMaas(int egitmenMaas) {
        this.egitmenMaas = egitmenMaas;
    }

    public Date getEgitmenKayitTarihi() {
        return egitmenKayitTarihi;
    }

    public void setEgitmenKayitTarihi(Date egitmenKayitTarihi) {
        this.egitmenKayitTarihi = egitmenKayitTarihi;
    }
    
    
    
    
}
