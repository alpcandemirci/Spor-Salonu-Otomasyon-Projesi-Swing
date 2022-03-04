
package com.schoolproject.entities;

import com.schoolproject.dataaccess.KullaniciIslemleri;
import javax.swing.JOptionPane;

/**
 *
 * @author Mazlum
 */
public class EgitmenEklemeEkrani extends javax.swing.JFrame {
    KullaniciIslemleri uyeEklemeIslemi = new KullaniciIslemleri();
    /**
     * Creates new form EgitmenEklemeEkrani
     */
    public EgitmenEklemeEkrani() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        egitmenIsimAlani = new javax.swing.JTextField();
        egitmenSoyisimAlani = new javax.swing.JTextField();
        egitmenTelefonNoAlani = new javax.swing.JTextField();
        egitmenDogumTarihiAlani = new javax.swing.JTextField();
        egitmenEmailAlani = new javax.swing.JTextField();
        egitmenKimlikNumarasiAlani = new javax.swing.JTextField();
        mesajYazisiAlani = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        egitmenEklemeButonu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        egitmenMaasAlani = new javax.swing.JTextField();
        egitmenCinsiyetAlani = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setText("Cinsiyet : ");

        jLabel7.setText("Email : ");

        jLabel8.setText("Doğum Tarihi : ");

        egitmenIsimAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egitmenIsimAlaniActionPerformed(evt);
            }
        });

        egitmenKimlikNumarasiAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egitmenKimlikNumarasiAlaniActionPerformed(evt);
            }
        });

        mesajYazisiAlani.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        mesajYazisiAlani.setForeground(new java.awt.Color(204, 0, 0));
        mesajYazisiAlani.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Eğitmen  Ekleme ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setText("T.C Kimlik Numarası :");

        jLabel4.setText("Telefon Numarası :");

        jLabel5.setText("Soyisim :");

        jLabel9.setText("İsim :");

        egitmenEklemeButonu.setText("Yeni Eğitmen Ekle");
        egitmenEklemeButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egitmenEklemeButonuActionPerformed(evt);
            }
        });

        jLabel2.setText("Maaş :");

        egitmenMaasAlani.setText("0");

        egitmenCinsiyetAlani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kadın", "Erkek" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(egitmenEklemeButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(mesajYazisiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 57, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(egitmenSoyisimAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egitmenIsimAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egitmenTelefonNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egitmenDogumTarihiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(egitmenKimlikNumarasiAlani)
                            .addComponent(egitmenEmailAlani)
                            .addComponent(egitmenMaasAlani, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(egitmenCinsiyetAlani, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesajYazisiAlani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(egitmenIsimAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egitmenSoyisimAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egitmenTelefonNoAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egitmenDogumTarihiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egitmenCinsiyetAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egitmenKimlikNumarasiAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egitmenEmailAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(egitmenMaasAlani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(egitmenEklemeButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void egitmenIsimAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egitmenIsimAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_egitmenIsimAlaniActionPerformed

    private void egitmenKimlikNumarasiAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egitmenKimlikNumarasiAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_egitmenKimlikNumarasiAlaniActionPerformed
    // Burasi Tamam!
    // Bu method egitmen eklemeye yarar. T.C. Kimlik Numarasini, telefon numarasininin 11 haneli olmasini kosulla kontrol eder.
    // Bu kosullar saglandigi takdirde geri kalan alanlarin bos olup olmamasi durumunu kosulla kontrol eder. Butun kosullar saglaniyor ise KullaniciIslemleri class'indaki egitmenEkle() methoduna gonderme yapar.
    private void egitmenEklemeButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egitmenEklemeButonuActionPerformed

        
        String isim = egitmenIsimAlani.getText();
        String soyisim = egitmenSoyisimAlani.getText();
        String cinsiyet = (String)egitmenCinsiyetAlani.getSelectedItem();
        String kimlikNumarasi = egitmenKimlikNumarasiAlani.getText();
        String telefonNumarasi = egitmenTelefonNoAlani.getText();
        String email = egitmenEmailAlani.getText();
        String dogumTarihi = egitmenDogumTarihiAlani.getText();
        int maas = Integer.parseInt(egitmenMaasAlani.getText());
        
        if(isim.length() == 0 || soyisim.length() == 0 || cinsiyet.length() == 0 || kimlikNumarasi.length() == 0 || telefonNumarasi.length() == 0 || email.length() == 0 || dogumTarihi.length() == 0) {
            JOptionPane.showMessageDialog(null, "Bütün Alanları Doldurmanız Gerekiyor !");
        }
        else if(kimlikNumarasi.length() != 11) {
            JOptionPane.showMessageDialog(null, "T.C Kimlik Numarasını Yanlış Girdiniz. Lütfen 11 Haneli T.C Kimlik Numarasını Giriniz!");
        }
        else if(telefonNumarasi.length() != 11) {
                JOptionPane.showMessageDialog(null, "Telefon Numarasını Yanlış Girdiniz. Lütfen 05XXXXXXXXX Olacak Şekilde 11 Haneli Telefon Numarasını Giriniz!");
            }
        else if(maas < 0 || maas == 0) {
            JOptionPane.showMessageDialog(null, "Maaş Alanı 0'dan Küçük Olamaz ! Olması Gerektiği Biçimde Değeri Giriniz !");
        }
        else {
             uyeEklemeIslemi.egitmenEkle(isim,soyisim,cinsiyet,kimlikNumarasi,telefonNumarasi,email,dogumTarihi,maas);
             AnaEkranFrame geriDonus = new AnaEkranFrame();
             setVisible(false);
             geriDonus.setVisible(true);
        }       
    }//GEN-LAST:event_egitmenEklemeButonuActionPerformed

    
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
            java.util.logging.Logger.getLogger(EgitmenEklemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EgitmenEklemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EgitmenEklemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EgitmenEklemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EgitmenEklemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> egitmenCinsiyetAlani;
    private javax.swing.JTextField egitmenDogumTarihiAlani;
    private javax.swing.JButton egitmenEklemeButonu;
    private javax.swing.JTextField egitmenEmailAlani;
    private javax.swing.JTextField egitmenIsimAlani;
    private javax.swing.JTextField egitmenKimlikNumarasiAlani;
    private javax.swing.JTextField egitmenMaasAlani;
    private javax.swing.JTextField egitmenSoyisimAlani;
    private javax.swing.JTextField egitmenTelefonNoAlani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mesajYazisiAlani;
    // End of variables declaration//GEN-END:variables
}
