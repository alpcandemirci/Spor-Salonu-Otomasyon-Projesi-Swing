
package com.schoolproject.entities;
import com.schoolproject.entities.AnaEkranFrame;
import com.schoolproject.dataaccess.KullaniciIslemleri;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;



public class UyeEklemeEkrani extends javax.swing.JFrame {

   KullaniciIslemleri uyeEklemeIslemi = new KullaniciIslemleri();
   CalismaProgramiEkrani calismaProgramiBilgiGonder = new CalismaProgramiEkrani();
    public UyeEklemeEkrani() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        uyeIsimAlani = new javax.swing.JTextField();
        uyeSoyisimAlani = new javax.swing.JTextField();
        uyeTelefonNoAlani = new javax.swing.JTextField();
        uyeDogumTarihiAlani = new javax.swing.JTextField();
        uyeEmailAlani = new javax.swing.JTextField();
        uyeKimlikNumarasiAlani = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        uyeBoyAlani = new javax.swing.JTextField();
        uyeAbonelikSuresiAlani = new javax.swing.JTextField();
        uyeHastalikAlani = new javax.swing.JTextField();
        uyeKiloAlani = new javax.swing.JTextField();
        uyeEklemeButonu = new javax.swing.JButton();
        mesajYazisiAlani = new javax.swing.JLabel();
        calismaProgramiAlani = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        uyeAcilKisiIsmiAlani = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        uyeAcilNumarasiAlani = new javax.swing.JTextField();
        programlar = new javax.swing.JButton();
        hesaplamalar = new javax.swing.JButton();
        uyeCinsiyetAlani = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 500));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Üye Ekleme ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("Kilo : ");

        jLabel3.setText("T.C Kimlik Numarası :");

        jLabel4.setText("Telefon Numarası :");

        jLabel5.setText("Soyisim :");

        jLabel6.setText("Cinsiyet : ");

        jLabel7.setText("Email : ");

        jLabel8.setText("Doğum Tarihi : ");

        uyeIsimAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeIsimAlaniActionPerformed(evt);
            }
        });

        uyeKimlikNumarasiAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeKimlikNumarasiAlaniActionPerformed(evt);
            }
        });

        jLabel9.setText("İsim :");

        jLabel10.setText("Hastalık : ");

        jLabel11.setText("Boy : ");

        jLabel12.setText("Çalışma Programı : ");

        jLabel13.setText("Abonelik Süresi : ");

        uyeBoyAlani.setText("1");
        uyeBoyAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeBoyAlaniActionPerformed(evt);
            }
        });

        uyeAbonelikSuresiAlani.setText("3");
        uyeAbonelikSuresiAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeAbonelikSuresiAlaniActionPerformed(evt);
            }
        });

        uyeHastalikAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeHastalikAlaniActionPerformed(evt);
            }
        });

        uyeKiloAlani.setText("1");
        uyeKiloAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeKiloAlaniActionPerformed(evt);
            }
        });

        uyeEklemeButonu.setText("Yeni Üye Ekle");
        uyeEklemeButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeEklemeButonuActionPerformed(evt);
            }
        });

        mesajYazisiAlani.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        mesajYazisiAlani.setForeground(new java.awt.Color(204, 0, 0));
        mesajYazisiAlani.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        calismaProgramiAlani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adaptasyon Programı", "Kilo Verme", "Hacim Kazanma" }));
        calismaProgramiAlani.setToolTipText("");
        calismaProgramiAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calismaProgramiAlaniActionPerformed(evt);
            }
        });

        jLabel14.setText("Acil Durumda Aranacak Kişi :");

        uyeAcilKisiIsmiAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeAcilKisiIsmiAlaniActionPerformed(evt);
            }
        });

        jLabel15.setText("Numarası : ");

        uyeAcilNumarasiAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeAcilNumarasiAlaniActionPerformed(evt);
            }
        });

        programlar.setText("Çalışma Programları");
        programlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programlarActionPerformed(evt);
            }
        });

        hesaplamalar.setText("Hesaplama Ekranı");
        hesaplamalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplamalarActionPerformed(evt);
            }
        });

        uyeCinsiyetAlani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kadın", "Erkek" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(mesajYazisiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uyeKimlikNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(uyeSoyisimAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(uyeIsimAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(uyeTelefonNoAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(uyeEmailAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(uyeDogumTarihiAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(uyeCinsiyetAlani, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uyeBoyAlani)
                                    .addComponent(uyeHastalikAlani)
                                    .addComponent(uyeKiloAlani)
                                    .addComponent(calismaProgramiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(uyeAcilNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uyeAbonelikSuresiAlani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(uyeAcilKisiIsmiAlani, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(hesaplamalar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(uyeEklemeButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(programlar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesajYazisiAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uyeIsimAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeBoyAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeSoyisimAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeKiloAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeHastalikAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeCinsiyetAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeKimlikNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calismaProgramiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeTelefonNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeAbonelikSuresiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeDogumTarihiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(uyeAcilKisiIsmiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uyeEmailAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(uyeAcilNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uyeEklemeButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(programlar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hesaplamalar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uyeKimlikNumarasiAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeKimlikNumarasiAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uyeKimlikNumarasiAlaniActionPerformed

    private void uyeAbonelikSuresiAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeAbonelikSuresiAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uyeAbonelikSuresiAlaniActionPerformed

    private void uyeBoyAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeBoyAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uyeBoyAlaniActionPerformed

    private void uyeHastalikAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeHastalikAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uyeHastalikAlaniActionPerformed

    private void uyeKiloAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeKiloAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uyeKiloAlaniActionPerformed
    
    // Burasi Tamam!
    // Bu method uye eklemeye yarar. T.C. Kimlik Numarasini, telefon numarasini ve acil durumda aranacak kisinin numarasininin 11 haneli olmasini kosulla kontrol eder.
    // Bu kosullar saglandigi takdirde geri kalan alanlarin bos olup olmamasi durumunu kosulla kontrol eder. Butun kosullar saglaniyor ise KullaniciIslemleri class'indaki uyeEkle() methoduna gonderme yapar.
    private void uyeEklemeButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeEklemeButonuActionPerformed

            
            String isim = uyeIsimAlani.getText();
            String soyisim = uyeSoyisimAlani.getText();
            String cinsiyet = (String)uyeCinsiyetAlani.getSelectedItem();
            String hastalik = uyeHastalikAlani.getText();
            String kimlikNumarasi = uyeKimlikNumarasiAlani.getText();
            String telefonNumarasi = uyeTelefonNoAlani.getText();
            String email = uyeEmailAlani.getText();
            int boy = Integer.parseInt(uyeBoyAlani.getText());
            int kilo = Integer.parseInt(uyeKiloAlani.getText());
            int abonelikSuresi = Integer.parseInt(uyeAbonelikSuresiAlani.getText());
            String calismaProgrami = (String)calismaProgramiAlani.getSelectedItem();
            String dogumTarihi = uyeDogumTarihiAlani.getText();
            String acilDurumKisi = uyeAcilKisiIsmiAlani.getText();
            String acilDurumNumarasi = uyeAcilNumarasiAlani.getText();
            
            
            if(isim.length() == 0 || soyisim.length() == 0 || cinsiyet.length() == 0 || kimlikNumarasi.length() == 0 || telefonNumarasi.length() == 0 || email.length() == 0 || calismaProgrami.length() == 0 || dogumTarihi.length() == 0 || acilDurumKisi.length() == 0 || acilDurumNumarasi.length() == 0) {
                JOptionPane.showMessageDialog(null, "Hastalık Haricindeki Bütün Alanların Doldurulması Gerekiyor !");
            } 
            
            else if(kimlikNumarasi.length() != 11) {
                JOptionPane.showMessageDialog(null, "T.C Kimlik Numarasını Yanlış Girdiniz. Lütfen 11 Haneli T.C. Kimlik Numarasını Giriniz!");
            }
            else if(telefonNumarasi.length() != 11) {
                     JOptionPane.showMessageDialog(null, "Telefon Numarasını Yanlış Girdiniz. Lütfen 05XXXXXXXXX Şekilnde 11 Haneli Telefon Numarasını Giriniz!");
                }
            else if(acilDurumNumarasi.length() != 11) {
                        JOptionPane.showMessageDialog(null, "Acil Durumda Aranacak Kişinin Numarasını Yanlış Girdiniz. Lütfen 05XXXXXXXXX Olacak Şekilde Numarayı Giriniz!");
                }
            else if(kilo < 0 || boy < 0 || abonelikSuresi < 0 || kilo == 0 || boy == 0 || abonelikSuresi == 0){
                
                JOptionPane.showMessageDialog(null, "Boy, Kilo veya Abonelik Süresi  Alanlarının 0'dan Büyük Olması Gerekiyor ! Olması Gerektiği Biçimde Değerler Giriniz !");
            }
            else {
                uyeEklemeIslemi.uyeEkle(isim,soyisim,cinsiyet,hastalik,kimlikNumarasi,telefonNumarasi,email,boy,kilo,abonelikSuresi,calismaProgrami,dogumTarihi,acilDurumKisi,acilDurumNumarasi);
                    AnaEkranFrame geriDonus = new AnaEkranFrame();
                    setVisible(false);
                    geriDonus.setVisible(true);
                    
            }
    }//GEN-LAST:event_uyeEklemeButonuActionPerformed

    private void uyeIsimAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeIsimAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uyeIsimAlaniActionPerformed

    private void uyeAcilKisiIsmiAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeAcilKisiIsmiAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uyeAcilKisiIsmiAlaniActionPerformed

    private void uyeAcilNumarasiAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeAcilNumarasiAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uyeAcilNumarasiAlaniActionPerformed

    private void calismaProgramiAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calismaProgramiAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calismaProgramiAlaniActionPerformed

    private void programlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programlarActionPerformed
        
        CalismaProgramiEkrani ekran = new CalismaProgramiEkrani();
        ekran.setVisible(true);
        
        
    }//GEN-LAST:event_programlarActionPerformed

    private void hesaplamalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplamalarActionPerformed
        
        HesaplamaEkrani ekran = new HesaplamaEkrani();
        ekran.setVisible(true);
        
        
        
    }//GEN-LAST:event_hesaplamalarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UyeEklemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UyeEklemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UyeEklemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UyeEklemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UyeEklemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> calismaProgramiAlani;
    private javax.swing.JButton hesaplamalar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mesajYazisiAlani;
    private javax.swing.JButton programlar;
    private javax.swing.JTextField uyeAbonelikSuresiAlani;
    private javax.swing.JTextField uyeAcilKisiIsmiAlani;
    private javax.swing.JTextField uyeAcilNumarasiAlani;
    private javax.swing.JTextField uyeBoyAlani;
    private javax.swing.JComboBox<String> uyeCinsiyetAlani;
    private javax.swing.JTextField uyeDogumTarihiAlani;
    private javax.swing.JButton uyeEklemeButonu;
    private javax.swing.JTextField uyeEmailAlani;
    private javax.swing.JTextField uyeHastalikAlani;
    private javax.swing.JTextField uyeIsimAlani;
    private javax.swing.JTextField uyeKiloAlani;
    private javax.swing.JTextField uyeKimlikNumarasiAlani;
    private javax.swing.JTextField uyeSoyisimAlani;
    private javax.swing.JTextField uyeTelefonNoAlani;
    // End of variables declaration//GEN-END:variables
}
