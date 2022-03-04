
package com.schoolproject.entities;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class HesaplamaEkrani extends javax.swing.JFrame {

    
    public HesaplamaEkrani() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        yasAlani = new javax.swing.JTextField();
        boyAlani = new javax.swing.JTextField();
        kiloAlani = new javax.swing.JTextField();
        sonucAlani = new javax.swing.JTextField();
        vkiHesapla = new javax.swing.JButton();
        bmhHesapla = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        idealKilo = new javax.swing.JButton();
        yagHesapla = new javax.swing.JButton();
        belOlcusuAlani = new javax.swing.JTextField();
        boyunOlcusuAlani = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cinsiyetAlani = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Yaş :");

        jLabel2.setText("Boy (cm):");

        jLabel4.setText("Kilo (kg) :");

        jLabel5.setText("Cinsiyet :");

        yasAlani.setText("0");

        boyAlani.setText("0");

        kiloAlani.setText("0");

        vkiHesapla.setText("Vücut Kitle İndeksi Hesapla");
        vkiHesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vkiHesaplaActionPerformed(evt);
            }
        });

        bmhHesapla.setText("Bazal Metabolizma Hızı Hesaplama");
        bmhHesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmhHesaplaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hesaplama Aracı");

        idealKilo.setText("İdeal Kilo Hesaplama");
        idealKilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idealKiloActionPerformed(evt);
            }
        });

        yagHesapla.setText("Vücut Yağ Oranı Hesaplama");
        yagHesapla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yagHesaplaActionPerformed(evt);
            }
        });

        belOlcusuAlani.setText("0");

        boyunOlcusuAlani.setText("0");

        jLabel6.setText("Bel Ölçüsü (cm):");

        jLabel7.setText("Boyun Ölçüsü (cm) :");

        cinsiyetAlani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kadın", "Erkek" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yasAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boyAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kiloAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boyunOlcusuAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cinsiyetAlani, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(belOlcusuAlani, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(vkiHesapla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bmhHesapla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(idealKilo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(yagHesapla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sonucAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yasAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boyAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kiloAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cinsiyetAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(belOlcusuAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boyunOlcusuAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vkiHesapla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idealKilo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bmhHesapla)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yagHesapla)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sonucAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
    
    // Burası Tamam!
    // Bu method vücut kitle indeksini hesaplar.
    private void vkiHesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vkiHesaplaActionPerformed
        
        double boy = Integer.parseInt(boyAlani.getText());
        boy = boy / 100;
        int kilo = Integer.parseInt(kiloAlani.getText());
        double sonuc = kilo / (boy * boy);
        
        if(boy == 0 || kilo == 0) {
            JOptionPane.showMessageDialog(null, "Bütün Alanları Doldurmanız Gerekiyor !");
        }
        else if(boy < 0 || kilo < 0) {
            JOptionPane.showMessageDialog(null, "Boy ve Kilo Alanı 0'dan Küçük Olamaz ! Olması Gerektiği Biçimde Değerleri Giriniz !");
        }
        else {
            sonucAlani.setText("Vücut Kitle İndeksi : " + new DecimalFormat("##.##").format(sonuc));
        }
        
        
        
    }//GEN-LAST:event_vkiHesaplaActionPerformed
    
    // Burası Tamam!
    // Bu method bazal metabolizma hızını hesaplar
    private void bmhHesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmhHesaplaActionPerformed
        double boy = Integer.parseInt(boyAlani.getText());
        double kilo = Integer.parseInt(kiloAlani.getText());
        int yas = Integer.parseInt(yasAlani.getText());
        String cinsiyet = (String)cinsiyetAlani.getSelectedItem();
        
        if(boy == 0 || kilo == 0 || yas == 0) {
            JOptionPane.showMessageDialog(null, "Bütün Alanları Doldurmanız Gerekiyor !");
        }
        else if(cinsiyet.equals("Kadın")) {
            if(boy < 0 || kilo < 0 || yas < 0) {
                   JOptionPane.showMessageDialog(null, "Boy ve Kilo Alanı 0'dan Küçük Olamaz ! Olması Gerektiği Biçimde Değerleri Giriniz !");
            }
            else {
                double sonuc = (655.1 + (9.56 * kilo) + (1.85 * boy) - (4.68 * yas));
                sonucAlani.setText("Bazal Metabolizma Hızı : " + sonuc);
            }
        }    
        else if(cinsiyet.equals("Erkek")){
            
            if(boy < 0 || kilo < 0 || yas < 0) {
                  JOptionPane.showMessageDialog(null, "Boy ve Kilo Alanı 0'dan Küçük Olamaz ! Olması Gerektiği Biçimde Değerleri Giriniz !");
            }   
            else {
                double sonuc = (66.5 + (13.75 * kilo) + (5.03 * boy) - (6.75 * yas));
                sonucAlani.setText("Bazal Metabolizma Hızı : " + sonuc);
            }
            
        }
        
    }//GEN-LAST:event_bmhHesaplaActionPerformed
    
    
    // Burasi Tamam!
    // Bu method ideal kiloyu hesaplar
    private void idealKiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idealKiloActionPerformed
        String cinsiyet = (String)cinsiyetAlani.getSelectedItem();
        double boy = Integer.parseInt(boyAlani.getText());
        double inch = boy * 0.39;
        
        if(boy == 0 || inch == 0 ) {
            JOptionPane.showMessageDialog(null, "Bütün Alanları Doldurmanız Gerekiyor !");
        }
        else if(cinsiyet.equals("Erkek")) {
            
            if(boy < 0 ) {
                  JOptionPane.showMessageDialog(null, "Boy Alanı 0'dan Küçük Olamaz ! Olması Gerektiği Biçimde Değeri Giriniz !");
            }  
            else {
                double sonuc = 50 + 2.3 * (inch - 60);
                sonucAlani.setText("İdeal Kilo : " + sonuc);
            }
            
        }
        else if(cinsiyet.equals("Kadın")) {
            
             if(boy < 0 ) {
                  JOptionPane.showMessageDialog(null, "Boy Alanı 0'dan Küçük Olamaz ! Olması Gerektiği Biçimde Değeri Giriniz !");
             } 
             else {
                 double sonuc = 45.5 + 2.3 * (inch - 60);
                 sonucAlani.setText("İdeal Kilo : " + sonuc);
             }
        }
    }//GEN-LAST:event_idealKiloActionPerformed
    
    
    // Burasi Tamam!
    // Bu method vücut yağ oranını hesaplar
    private void yagHesaplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yagHesaplaActionPerformed
        double kilo = Integer.parseInt(kiloAlani.getText());
        double boy = Integer.parseInt(boyAlani.getText());
        int yas = Integer.parseInt(yasAlani.getText());
        double inch = boy * 0.39;
        double pound = 2.2046 / kilo;
        String cinsiyet = (String)cinsiyetAlani.getSelectedItem();
        double sonuc = (pound / inch * inch) * 703;
        int bel = Integer.parseInt(belOlcusuAlani.getText());
        int boyun = Integer.parseInt(boyunOlcusuAlani.getText());
        
        if(bel == 0 || boyun == 0 || kilo == 0 || boy == 0 || yas == 0) {
               JOptionPane.showMessageDialog(null, "Bütün Alanları Doldurmanız Gerekiyor !");
        } 
        else if(bel < 0 || boyun < 0 || kilo < 0 || boy < 0 || yas < 0 ) {
            JOptionPane.showMessageDialog(null, "Bel, Boyun, Kilo, Boy veya Yaş Alanı 0'dan Küçük Olamaz ! Değerleri Gerektiği Biçimde Giriniz !");
        }
        else if(cinsiyet.equals("Erkek")) {
                 double yuzde = (1.20 * sonuc) + (0.23 * yas) - 5.4;
                 sonucAlani.setText("Vücut Yağ Oranı : " + yuzde);
        }
        
        else if(cinsiyet.equals("Kadın")) {
                double yuzde = (1.20 * sonuc) + (0.23 * yas) - 16.2;
                sonucAlani.setText("Vücut Yağ Oranı : " + yuzde);
        }  
    }//GEN-LAST:event_yagHesaplaActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(HesaplamaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesaplamaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesaplamaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesaplamaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesaplamaEkrani().setVisible(true);
            }
        });
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField belOlcusuAlani;
    private javax.swing.JButton bmhHesapla;
    private javax.swing.JTextField boyAlani;
    private javax.swing.JTextField boyunOlcusuAlani;
    private javax.swing.JComboBox<String> cinsiyetAlani;
    private javax.swing.JButton idealKilo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField kiloAlani;
    private javax.swing.JTextField sonucAlani;
    private javax.swing.JButton vkiHesapla;
    private javax.swing.JButton yagHesapla;
    private javax.swing.JTextField yasAlani;
    // End of variables declaration//GEN-END:variables
}
