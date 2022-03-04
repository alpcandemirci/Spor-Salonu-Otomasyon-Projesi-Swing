
package com.schoolproject.entities;
import com.schoolproject.dataaccess.KullaniciIslemleri;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class AnaEkranFrame extends javax.swing.JFrame {
    DefaultTableModel uyeModel;
    DefaultTableModel egitmenModel;
    KullaniciIslemleri islemler = new KullaniciIslemleri();
    
    // Burasi Tamam!
    public AnaEkranFrame() {
       
        initComponents();
        uyeModel = (DefaultTableModel)uyeTablosu.getModel();
        egitmenModel = (DefaultTableModel)egitmenTablosu.getModel();
        // Bu iki method cagirimi Frame Cagrildigi anda tabloda egitmen ve uyelerin listelenmesini saglar.
        uyeGoruntule();
        egitmenGoruntule();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        egitmenAramaCubugu = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        uyeEkle = new javax.swing.JButton();
        uyeGuncelle = new javax.swing.JButton();
        uyeSil = new javax.swing.JButton();
        egitmenGuncelle = new javax.swing.JButton();
        egitmenSil = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        uyeTablosu = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        egitmenTablosu = new javax.swing.JTable();
        egitmenEkle = new javax.swing.JButton();
        uyeAramaCubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        kimlikNumarsiGnc = new javax.swing.JTextField();
        isimGnc = new javax.swing.JTextField();
        soyisimGnc = new javax.swing.JTextField();
        kiloGnc = new javax.swing.JTextField();
        boyGnc = new javax.swing.JTextField();
        telefonNumarasiGnc = new javax.swing.JTextField();
        emailGnc = new javax.swing.JTextField();
        dogumTarihiGnc = new javax.swing.JTextField();
        abonelikSureGnc = new javax.swing.JTextField();
        acilKisiGnc = new javax.swing.JTextField();
        acilKisiNumarasiGnc = new javax.swing.JTextField();
        maasGnc = new javax.swing.JTextField();
        hastalikGnc = new javax.swing.JTextField();
        calismaProgramiButonu = new javax.swing.JButton();
        hesaplamaEkraniButonu = new javax.swing.JButton();
        calismaProgramiGnc = new javax.swing.JComboBox<>();
        cinsiyetGnc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(900, 500));

        egitmenAramaCubugu.setToolTipText("Eğitmen Arama Çubuğu");
        egitmenAramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                egitmenAramaCubuguKeyReleased(evt);
            }
        });

        uyeEkle.setText("Üye Ekle");
        uyeEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeEkleActionPerformed(evt);
            }
        });

        uyeGuncelle.setText("Üye Güncelle");
        uyeGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeGuncelleActionPerformed(evt);
            }
        });

        uyeSil.setText("Üye Sil");
        uyeSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uyeSilActionPerformed(evt);
            }
        });

        egitmenGuncelle.setText("Eğitmen Güncelle");
        egitmenGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egitmenGuncelleActionPerformed(evt);
            }
        });

        egitmenSil.setText("Eğitmen Sil");
        egitmenSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egitmenSilActionPerformed(evt);
            }
        });

        uyeTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İd", "İsim", "Soyisim", "Cinsiyet", "Kimlik Numarası", "Doğum Tarihi", "Telefon Numarası", "Email", "Boy", "Kilo", "Hastalık", "Çalışma Programı", "Abonelik Süresi", "Acil Kişi", "Acil Numarası", "Kayıt Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        uyeTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uyeTablosuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(uyeTablosu);

        jTabbedPane1.addTab("Üyeler", jScrollPane1);

        egitmenTablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İd", "İsim", "Soyisim", "Cinsiyet", "Kimlik Numarası", "Doğum Tarihi", "Telefon Numarası", "Email", "Maaş", "Kayıt Tarihi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        egitmenTablosu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                egitmenTablosuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(egitmenTablosu);

        jTabbedPane1.addTab("Eğitmenler", jScrollPane2);

        egitmenEkle.setText("Eğitmen Ekle");
        egitmenEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                egitmenEkleActionPerformed(evt);
            }
        });

        uyeAramaCubugu.setToolTipText("Üye Arama Çubuğu");
        uyeAramaCubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                uyeAramaCubuguKeyReleased(evt);
            }
        });

        kimlikNumarsiGnc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kimlikNumarsiGnc.setText("Kimlik No ");
        kimlikNumarsiGnc.setToolTipText("Kimlik Numarası Alanı");
        kimlikNumarsiGnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kimlikNumarsiGncActionPerformed(evt);
            }
        });

        isimGnc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        isimGnc.setText("İsim");
        isimGnc.setToolTipText("İsim Alanı");
        isimGnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isimGncActionPerformed(evt);
            }
        });

        soyisimGnc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        soyisimGnc.setText("Soyisim");
        soyisimGnc.setToolTipText("Soyisim Alanı");
        soyisimGnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soyisimGncActionPerformed(evt);
            }
        });

        kiloGnc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        kiloGnc.setText("Kilo");
        kiloGnc.setToolTipText("Kilo Alanı");
        kiloGnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiloGncActionPerformed(evt);
            }
        });

        boyGnc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        boyGnc.setText("Boy");
        boyGnc.setToolTipText("Boy Alanı");
        boyGnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boyGncActionPerformed(evt);
            }
        });

        telefonNumarasiGnc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        telefonNumarasiGnc.setText("Telefon No");
        telefonNumarasiGnc.setToolTipText("Telefon Numarası Alanı. 05XXXXXXXXX Şeklinde Giriniz.");
        telefonNumarasiGnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonNumarasiGncActionPerformed(evt);
            }
        });

        emailGnc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        emailGnc.setText("Email");
        emailGnc.setToolTipText("Email Alanı");
        emailGnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailGncActionPerformed(evt);
            }
        });

        dogumTarihiGnc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dogumTarihiGnc.setText("Doğum Tarihi");
        dogumTarihiGnc.setToolTipText("Doğum Tarihi Alanı");
        dogumTarihiGnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogumTarihiGncActionPerformed(evt);
            }
        });

        abonelikSureGnc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        abonelikSureGnc.setText("Abonelik Süre");
        abonelikSureGnc.setToolTipText("Abonelik Süresi Alanı");
        abonelikSureGnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abonelikSureGncActionPerformed(evt);
            }
        });

        acilKisiGnc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        acilKisiGnc.setText("Acil Kişi");
        acilKisiGnc.setToolTipText("Acil Kişi Alanı");
        acilKisiGnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acilKisiGncActionPerformed(evt);
            }
        });

        acilKisiNumarasiGnc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        acilKisiNumarasiGnc.setText("Acil Kişi No");
        acilKisiNumarasiGnc.setToolTipText("Acil Kişi Numarası Alanı. 05XXXXXXXXX Şeklinde Giriniz.");
        acilKisiNumarasiGnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acilKisiNumarasiGncActionPerformed(evt);
            }
        });

        maasGnc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        maasGnc.setText("Maaş");
        maasGnc.setToolTipText("Maaş Alanı");
        maasGnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maasGncActionPerformed(evt);
            }
        });

        hastalikGnc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hastalikGnc.setText("Hastalık");
        hastalikGnc.setToolTipText("Hastalık Alanı");
        hastalikGnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastalikGncActionPerformed(evt);
            }
        });

        calismaProgramiButonu.setText("Çalışma Programları");
        calismaProgramiButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calismaProgramiButonuActionPerformed(evt);
            }
        });

        hesaplamaEkraniButonu.setText("Hesaplama Ekranı");
        hesaplamaEkraniButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hesaplamaEkraniButonuActionPerformed(evt);
            }
        });

        calismaProgramiGnc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Adaptasyon Programı", "Kilo Verme", "Hacim Kazanma" }));

        cinsiyetGnc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kadın", "Erkek" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isimGnc, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(soyisimGnc, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(kimlikNumarsiGnc, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(dogumTarihiGnc, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(cinsiyetGnc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kiloGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boyGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonNumarasiGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hastalikGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(acilKisiGnc)
                    .addComponent(abonelikSureGnc)
                    .addComponent(acilKisiNumarasiGnc)
                    .addComponent(calismaProgramiGnc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(maasGnc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calismaProgramiButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uyeEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(uyeSil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(uyeGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(uyeAramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(egitmenAramaCubugu)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(egitmenEkle, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(hesaplamaEkraniButonu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(egitmenGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(egitmenSil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uyeAramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uyeEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uyeSil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(uyeGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calismaProgramiButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(isimGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefonNumarasiGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calismaProgramiGnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(soyisimGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(abonelikSureGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(boyGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(acilKisiGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cinsiyetGnc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kimlikNumarsiGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kiloGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(acilKisiNumarasiGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(egitmenAramaCubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(egitmenEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(egitmenSil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(egitmenGuncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hesaplamaEkraniButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hastalikGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maasGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogumTarihiGnc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Burasi Tamam!
    // Bu method egitmen arama cubugundaki ifadeyi alip egitmenDinamikAra() methoduna gonderir.
    private void egitmenAramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_egitmenAramaCubuguKeyReleased

        String ara = egitmenAramaCubugu.getText();
        egitmenDinamikAra(ara);
    }//GEN-LAST:event_egitmenAramaCubuguKeyReleased
    
    // Burasi Tamam!
    // Bu method tablodaki uyeleri aramamizi saglar. Bu method ile sadece uyeleri arayabiliriz.
    public void uyeDinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> uyeTr = new TableRowSorter<DefaultTableModel>(uyeModel);
        uyeTablosu.setRowSorter(uyeTr);
        uyeTr.setRowFilter(RowFilter.regexFilter(ara));   
    }
    
    // Burasi Tamam!
    // Bu method tablodaki egitmenleri aramamizi saglar. Bu method ile sadece egitmenleri arayabiliriz.
    public void egitmenDinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> egitmenTr = new TableRowSorter<DefaultTableModel>(egitmenModel);
        egitmenTablosu.setRowSorter(egitmenTr);
        egitmenTr.setRowFilter(RowFilter.regexFilter(ara));
    }
    
    // Burasi Tamam!
    // Bu method uye arama cubugundaki ifadeyi alip uyeDinamikAra() methoduna gonderir.
    private void uyeAramaCubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uyeAramaCubuguKeyReleased

        String ara = uyeAramaCubugu.getText();
        uyeDinamikAra(ara);

    }//GEN-LAST:event_uyeAramaCubuguKeyReleased
 
    // Burasi Tamam!
    // Bu method egitmen guncellemeye yarar. Methodun icindeki sorgular  tablonun bos olmasi, herhangi bir satirin secilmemis olmasi , T.C. Kimlik Numarasi ve Telefon Numarasinin 11 haneli olma kosulunu sorgular.
    // Bu kosullarin hepsi saglaniyor ise KullaniciIslemleri class'indaki egitmenGuncelle() methoduna gonderme yapar.
    private void egitmenGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egitmenGuncelleActionPerformed
        
        String isim = isimGnc.getText();
        String soyisim = soyisimGnc.getText();
        String kimlikNumarasi = kimlikNumarsiGnc.getText();
        String telefonNo = telefonNumarasiGnc.getText();
        String email = emailGnc.getText();
        String cinsiyet = (String)cinsiyetGnc.getSelectedItem();
        String dogumTarihi = dogumTarihiGnc.getText();
        int maas = Integer.parseInt(maasGnc.getText());
        
        
        int selectedrow = egitmenTablosu.getSelectedRow();
        
        if(selectedrow == -1) {
            if(egitmenModel.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Eğitmen Tablosu Boş!");
            } else {
                JOptionPane.showMessageDialog(null, "Lütfen Bir Eğitmen Seçin!");
            }
        }
        
        else if(isim.length() == 0 || soyisim.length() == 0 || email.length() == 0 || kimlikNumarasi.length() == 0 || telefonNo.length() == 0 || cinsiyet.length() == 0 || dogumTarihi.length() == 0) {
            JOptionPane.showMessageDialog(null, "Bütün Alanları Doldurmanız Gerekiyor !");
        }
        
        else if(kimlikNumarasi.length() != 11) {
             JOptionPane.showMessageDialog(null, "T.C Kimlik Numarasını Yanlış Girdiniz. Lütfen 11 Haneli T.C Kimlik Numarasını Giriniz!");
        }
        
        else if(telefonNo.length() != 11) {
             JOptionPane.showMessageDialog(null, "Telefon Numarasını Yanlış Girdiniz. Lütfen 05XXXXXXXXX Şekilnde 11 Haneli Telefon Numarasını Giriniz!");
                    }
                    
        else if(maas < 0){
             JOptionPane.showMessageDialog(null, "Maaş Alanı 0'dan Küçük Olamaz ! Gerekli Değeri Giriniz !");
        }
        
        else {
            int id = (int)egitmenModel.getValueAt(selectedrow, 0);
            islemler.egitmenGuncelle(isim, soyisim, cinsiyet,  kimlikNumarasi, telefonNo, email, dogumTarihi, maas,id);
            islemler.egitmenleriGetir();
            egitmenGoruntule();
        }
                    
    }//GEN-LAST:event_egitmenGuncelleActionPerformed
       
    
    // Burasi Tamam!
    // Bu method uye silmeye yarar. Icinde bulunan sorgular Frame icindeki tabloda bir satir secilip secilmedigini kontrol eder. Eger secilmis ise KullaniciIslemleri class'indaki uyeSil() methoduna gonderme yapar.
    private void uyeSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeSilActionPerformed
        // TODO add your handling code here:
        int selectedRow = uyeTablosu.getSelectedRow();

        if(selectedRow == -1 ) {
            if(uyeModel.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Üye Tablosu Şu Anda Boş!");
            } else {
                JOptionPane.showMessageDialog(null, "Lütfen Silinecek Kişiyi Seçin!");
            }
        }
        else {
            int id = (int)uyeModel.getValueAt(selectedRow, 0);
            islemler.uyeSil(id);
            
            uyeGoruntule();
            JOptionPane.showMessageDialog(null, "Üye Başarıyla Silindi...");
        }

    }//GEN-LAST:event_uyeSilActionPerformed

    // Burasi Tamam!
    // Bu method uye guncellemeye yarar. Methodun icindeki sorgular  tablonun bos olmasi, herhangi bir satirin secilmemis olmasi , T.C. Kimlik Numarasi , Telefon Numarasi ve Acil Durumda Aranacak Kisinin Numarasinin  11 haneli olma kosulunu sorgular.
    // Bu kosullarin hepsi saglaniyor ise KullaniciIslemleri class'indaki uyeGuncelle() methoduna gonderme yapar.
    private void uyeGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeGuncelleActionPerformed
      
          
      
        String isim = isimGnc.getText();
        String soyisim = soyisimGnc.getText();
        String kimlikNumarasi = kimlikNumarsiGnc.getText();
        String telefonNo = telefonNumarasiGnc.getText();
        String email = emailGnc.getText();
        String cinsiyet = (String)cinsiyetGnc.getSelectedItem();
        String hastalik = hastalikGnc.getText();
        int abonelikSuresi = Integer.parseInt(abonelikSureGnc.getText());
        int boy = Integer.parseInt(boyGnc.getText());
        int kilo = Integer.parseInt(kiloGnc.getText());
        String calismaProgrami = (String)calismaProgramiGnc.getSelectedItem();
        String dogumTarihi = dogumTarihiGnc.getText();
        String acilKisi = acilKisiGnc.getText();
        String acilKisiNo = acilKisiNumarasiGnc.getText();
        String acilKisiNumara = acilKisiNumarasiGnc.getText();
        int selectedrow = uyeTablosu.getSelectedRow();
        
        
            if(selectedrow == -1) {
                if(uyeModel.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "Üye Tablosu Boş!");
                } else {
                    JOptionPane.showMessageDialog(null, "Lütfen Bir Üye Seçin!");
                }
            }
            else {
               
                if(isim.length() == 0 || soyisim.length() == 0 || kimlikNumarasi.length() == 0 || telefonNo.length() == 0 || email.length() == 0 || calismaProgrami.length() == 0 || dogumTarihi.length() == 0 || acilKisi.length() == 0 || acilKisiNo.length() == 0) {
                    JOptionPane.showMessageDialog(null, "Hastalık Haricinde Bütün Alanları Doldurmanız Gerekiyor !");
                }
                else if(kimlikNumarasi.length() != 11) {
                        JOptionPane.showMessageDialog(null, "T.C Kimlik Numarasını Yanlış Girdiniz. Lütfen 11 Haneli T.C Kimlik Numarasını Giriniz!");
                }
                else if(telefonNo.length() != 11) {
                        JOptionPane.showMessageDialog(null, "Telefon Numarasını Yanlış Girdiniz. Lütfen 05XXXXXXXXX Şekilnde 11 Haneli Telefon Numarasını Giriniz!");
                }
                else if(acilKisiNumara.length() != 11) {
                            JOptionPane.showMessageDialog(null, "Acil Kişi Numarası Hatalı. Lütfen 05XXXXXXXXX Şekilnde 11 Haneli Telefon Numarasını Giriniz!");
                }
                    
                else if(kilo < 0 || boy < 0 || abonelikSuresi < 0){
                            
                            JOptionPane.showMessageDialog(null, "Boy, Kilo veya Abonelik Süresi Kısımları 0'dan Küçük Olamaz ! Uygun Değerleri Girmeniz Gerekiyor !"); 
                }
                else {
                        int id = (int)uyeModel.getValueAt(selectedrow, 0);
                        islemler.uyeGuncelle(isim, soyisim, cinsiyet, hastalik, kimlikNumarasi, telefonNo, email, boy, kilo, abonelikSuresi, dogumTarihi, acilKisi,acilKisiNumara , calismaProgrami,id);
                        islemler.uyeleriGetir();
                        uyeGoruntule();
                }
                    }
    }//GEN-LAST:event_uyeGuncelleActionPerformed
  
    // Burasi Tamam!
    // Bu method uye eklemeye yarar. AnaEkranFrame'de Uye Ekle methoduna tiklandigi takdirde UyeEklemeEkranina gonderme yapar.
    private void uyeEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uyeEkleActionPerformed

        UyeEklemeEkrani ekran = new UyeEklemeEkrani();
        ekran.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_uyeEkleActionPerformed
    
    
    // Burasi Tamam!
    // Bu method egitmen eklemeye yarar. AnaEkranFrame'de Egitmen Ekle methoduna tiklandigi takdirde EgitmenEklemeEkranina gonderme yapar.
    private void egitmenEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egitmenEkleActionPerformed
        
        EgitmenEklemeEkrani ekran = new EgitmenEklemeEkrani();
        ekran.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_egitmenEkleActionPerformed
   
    // Burasi Tamam!
    // Bu method egitmen silmeye yarar. Icinde bulunan sorgular Frame icindeki tabloda bir satir secilip secilmedigini kontrol eder. Eger secilmis ise KullaniciIslemleri class'indaki egitmenSil() methoduna gonderme yapar.
    private void egitmenSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_egitmenSilActionPerformed

        int selectedRow = egitmenTablosu.getSelectedRow();

        if(selectedRow == -1 ) {
            if(egitmenModel.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "Eğitmen Tablosu Şu Anda Boş!");
            } else {
                JOptionPane.showMessageDialog(null, "Lütfen Silinecek Kişiyi Seçin!");
            }
        }
        else {
            int id = (int)egitmenModel.getValueAt(selectedRow, 0);
            islemler.egitmenSil(id);
            
            egitmenGoruntule();
            JOptionPane.showMessageDialog(null, "Eğitmen Başarıyla Silindi...");
        }
        
        
    }//GEN-LAST:event_egitmenSilActionPerformed

    private void kimlikNumarsiGncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kimlikNumarsiGncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kimlikNumarsiGncActionPerformed
    
    // Burasi Tamam!
    // Bu method egitmen tablosundaki herhangi bir satira tiklandiginda sol ust tarafta bulunan JTextField'lerin secilen satirdaki degerlerle doldurulmasini saglar.
    private void egitmenTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_egitmenTablosuMouseClicked
        // TODO add your handling code here:
        
        int selectedrow = egitmenTablosu.getSelectedRow();
        isimGnc.setText(egitmenModel.getValueAt(selectedrow, 1).toString());
        soyisimGnc.setText(egitmenModel.getValueAt(selectedrow, 2).toString());
        cinsiyetGnc.setSelectedItem(egitmenModel.getValueAt(selectedrow, 3).toString());
        kimlikNumarsiGnc.setText(egitmenModel.getValueAt(selectedrow, 4).toString());
        dogumTarihiGnc.setText(egitmenModel.getValueAt(selectedrow, 5).toString());
        telefonNumarasiGnc.setText(egitmenModel.getValueAt(selectedrow, 6).toString());
        emailGnc.setText(egitmenModel.getValueAt(selectedrow, 7).toString());
        maasGnc.setText(egitmenModel.getValueAt(selectedrow, 8).toString());
        boyGnc.setText("");
        kiloGnc.setText(""); 
        abonelikSureGnc.setText("");
        acilKisiGnc.setText("");
        acilKisiNumarasiGnc.setText("");
        hastalikGnc.setText("");
        
        
    }//GEN-LAST:event_egitmenTablosuMouseClicked
    
    // Burasi Tamam!
    // Bu method uye tablosundaki herhangi bir satira tiklandiginda sol ust tarafta bulunan JTextField'lerin secilen satirdaki degerlerle doldurulmasini saglar.
    private void uyeTablosuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uyeTablosuMouseClicked
        int selectedrow = uyeTablosu.getSelectedRow();
        isimGnc.setText(uyeModel.getValueAt(selectedrow, 1).toString());
        soyisimGnc.setText(uyeModel.getValueAt(selectedrow, 2).toString());
        cinsiyetGnc.setSelectedItem(uyeModel.getValueAt(selectedrow, 3).toString());
        kimlikNumarsiGnc.setText(uyeModel.getValueAt(selectedrow, 4).toString());
        dogumTarihiGnc.setText(uyeModel.getValueAt(selectedrow, 5).toString());
        telefonNumarasiGnc.setText(uyeModel.getValueAt(selectedrow, 6).toString());
        emailGnc.setText(uyeModel.getValueAt(selectedrow, 7).toString());
        boyGnc.setText((uyeModel.getValueAt(selectedrow, 8)).toString());
        kiloGnc.setText((uyeModel.getValueAt(selectedrow, 9)).toString());
        hastalikGnc.setText(uyeModel.getValueAt(selectedrow, 10).toString());
        calismaProgramiGnc.setSelectedItem(uyeModel.getValueAt(selectedrow, 11).toString());
        abonelikSureGnc.setText((uyeModel.getValueAt(selectedrow, 12)).toString());
        acilKisiGnc.setText(uyeModel.getValueAt(selectedrow, 13).toString());
        acilKisiNumarasiGnc.setText(uyeModel.getValueAt(selectedrow, 14).toString());
        maasGnc.setText("");
        
    }//GEN-LAST:event_uyeTablosuMouseClicked

    private void isimGncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isimGncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isimGncActionPerformed

    private void soyisimGncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soyisimGncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soyisimGncActionPerformed

    private void kiloGncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiloGncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kiloGncActionPerformed

    private void boyGncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boyGncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boyGncActionPerformed

    private void telefonNumarasiGncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonNumarasiGncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonNumarasiGncActionPerformed

    private void emailGncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailGncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailGncActionPerformed

    private void dogumTarihiGncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogumTarihiGncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dogumTarihiGncActionPerformed

    private void abonelikSureGncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abonelikSureGncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_abonelikSureGncActionPerformed

    private void acilKisiGncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acilKisiGncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acilKisiGncActionPerformed

    private void acilKisiNumarasiGncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acilKisiNumarasiGncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acilKisiNumarasiGncActionPerformed

    private void maasGncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maasGncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maasGncActionPerformed

    private void hastalikGncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastalikGncActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hastalikGncActionPerformed
    
    // Burasi Tamam!
    // Bu method calisma programi ekranini gostermeye yarar.
    private void calismaProgramiButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calismaProgramiButonuActionPerformed
        CalismaProgramiEkrani ekran = new CalismaProgramiEkrani();
        ekran.setVisible(true);
        
        
    }//GEN-LAST:event_calismaProgramiButonuActionPerformed
    
    
    // Burasi Tamam!
    // Bu method hesaplama ekranini gostermeye yarar.
    private void hesaplamaEkraniButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hesaplamaEkraniButonuActionPerformed
        
        HesaplamaEkrani ekran = new HesaplamaEkrani();
        ekran.setVisible(true);
        
    }//GEN-LAST:event_hesaplamaEkraniButonuActionPerformed
        
   

    
    
    //Burasi Tamam
    // Bu method KullaniciIslemleri class'indaki uyeleriGetir methodundaki uyeleri AnaEkranFrame'deki uye tablosunda listelemeyi saglar.
    public void uyeGoruntule() {
        uyeModel.setRowCount(0);
        ArrayList<Uye> uyeler = new ArrayList<Uye>();
        uyeler = islemler.uyeleriGetir();
        
        if(uyeler != null) {
            for(Uye uye : uyeler) {
                Object[] eklenecek = {uye.getId(),uye.getIsim(),uye.getSoyisim(),uye.getCinsiyet(),uye.getKimlikNumarasi(),uye.getDogumTarihi(),uye.getTelefonNumarasi(),uye.getEmail(),uye.getBoy(),uye.getKilo(),uye.getHastalik(),uye.getAktifProgram(),uye.getAbonelikSuresi(),uye.getAcilKisi(),uye.getAcilKisiNumarasi(),uye.getKayitTarihi()};
                
                uyeModel.addRow(eklenecek);
            }
        }
        
    }
    
    // Burasi Tamam
    // Bu method KullaniciIslemleri class'indaki egitmenleriGetir methodundaki egitmenleri AnaEkranFrame'deki egitmen tablosunda listelemeyi saglar.
    public void egitmenGoruntule() {
        egitmenModel.setRowCount(0);
        ArrayList<Egitmen> egitmenler = new ArrayList<Egitmen>();
        egitmenler = islemler.egitmenleriGetir();
        
        if(egitmenler != null) {
            for(Egitmen egitmen : egitmenler) {
                Object[] eklenecek = {egitmen.getEgitmenId(),egitmen.getEgitmenIsim(),egitmen.getEgitmenSoyisim(),egitmen.getEgitmencinsiyet(),egitmen.getEgitmenKimlikNumarasi(),egitmen.getEgitmenDogumTarihi(),egitmen.getEgitmenTelefonNo(),egitmen.getEgitmenEmail(),egitmen.getEgitmenMaas(),egitmen.getEgitmenKayitTarihi()};
                
                egitmenModel.addRow(eklenecek);
            }
        }
    }
    
    
    
    // Burasi Tamam
    
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
            java.util.logging.Logger.getLogger(AnaEkranFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkranFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkranFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkranFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkranFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abonelikSureGnc;
    private javax.swing.JTextField acilKisiGnc;
    private javax.swing.JTextField acilKisiNumarasiGnc;
    private javax.swing.JTextField boyGnc;
    private javax.swing.JButton calismaProgramiButonu;
    private javax.swing.JComboBox<String> calismaProgramiGnc;
    private javax.swing.JComboBox<String> cinsiyetGnc;
    private javax.swing.JTextField dogumTarihiGnc;
    private javax.swing.JTextField egitmenAramaCubugu;
    private javax.swing.JButton egitmenEkle;
    private javax.swing.JButton egitmenGuncelle;
    private javax.swing.JButton egitmenSil;
    private javax.swing.JTable egitmenTablosu;
    private javax.swing.JTextField emailGnc;
    private javax.swing.JTextField hastalikGnc;
    private javax.swing.JButton hesaplamaEkraniButonu;
    private javax.swing.JTextField isimGnc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField kiloGnc;
    private javax.swing.JTextField kimlikNumarsiGnc;
    private javax.swing.JTextField maasGnc;
    private javax.swing.JTextField soyisimGnc;
    private javax.swing.JTextField telefonNumarasiGnc;
    private javax.swing.JTextField uyeAramaCubugu;
    private javax.swing.JButton uyeEkle;
    private javax.swing.JButton uyeGuncelle;
    private javax.swing.JButton uyeSil;
    private javax.swing.JTable uyeTablosu;
    // End of variables declaration//GEN-END:variables
}
