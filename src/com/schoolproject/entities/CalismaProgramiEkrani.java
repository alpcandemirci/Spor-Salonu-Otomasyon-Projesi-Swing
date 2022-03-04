/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.schoolproject.entities;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author Mazlum
 */
public class CalismaProgramiEkrani extends javax.swing.JFrame {
   
    DefaultTableModel erkekAdaptasyonModel;
    DefaultTableModel erkekYagModel;
    DefaultTableModel erkekHacimModel;  
    DefaultTableModel kadinAdaptasyonModel;
    DefaultTableModel kadinYagModel;    
    DefaultTableModel kadinHacimModel;        
    
    public CalismaProgramiEkrani() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        erkekAdaptasyonModel = (DefaultTableModel)erkekYag.getModel();
        erkekHacimModel = (DefaultTableModel)erkekHacim.getModel();
        kadinAdaptasyonModel = (DefaultTableModel)kadinAdaptasyon.getModel();
        kadinYagModel = (DefaultTableModel)kadinYag.getModel();
        kadinHacimModel = (DefaultTableModel)kadinYag.getModel();
        erkekAdaptasyon();
        erkekYagYakma();
        erkekHacimKazanma();
        kadinAdaptasyon();
        kadinYagYakma();
        kadinHacimKazanma();
    }
    
    public void kadinHacimKazanma() {
        ArrayList<String> hareketAdiEkle = new ArrayList<String>();
        hareketAdiEkle.add("Hip Thrust");
        hareketAdiEkle.add("Goblet Squat");
        hareketAdiEkle.add("Romanian Deadlift");
        hareketAdiEkle.add("Incline Press");
        hareketAdiEkle.add("Lat Pulldown");
        hareketAdiEkle.add("Leg Raise");
        hareketAdiEkle.add("Crunch");
        hareketAdiEkle.add("Leg Press");
        hareketAdiEkle.add("İnverted Row");
        
        ArrayList<Integer> setSayisiEkle = new ArrayList<Integer>();
        setSayisiEkle.add(3);
        setSayisiEkle.add(2);
        ArrayList<Integer> tekrarSayisiEkle = new ArrayList<Integer>();
        tekrarSayisiEkle.add(20);
        tekrarSayisiEkle.add(12);
        tekrarSayisiEkle.add(15);
        tekrarSayisiEkle.add(10);
        kadinHacimModel = (DefaultTableModel)kadinHacim.getModel();
        
        for(int i = 0 ; i < hareketAdiEkle.size() ; i++) {
            
            if(i == 0) { 
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(0)};
                kadinHacimModel.addRow(eklenecek);
            }
            else if(i == 1) { 
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(1)};
                kadinHacimModel.addRow(eklenecek);
            }
            else if(i == 2) { 
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(1),tekrarSayisiEkle.get(2)};
                kadinHacimModel.addRow(eklenecek);
            }
            else if(i == 3) { 
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(1),tekrarSayisiEkle.get(3)};
                kadinHacimModel.addRow(eklenecek);
            }
            else if(i == 4) { 
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(1),tekrarSayisiEkle.get(3)};
                kadinHacimModel.addRow(eklenecek);
            }
            else if(i == 5) { 
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(3)};
                kadinHacimModel.addRow(eklenecek);
            }
            else if(i == 6) { 
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(0)};
                kadinHacimModel.addRow(eklenecek);
            }
            else if(i == 7) { 
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(3)};
                kadinHacimModel.addRow(eklenecek);
            }
            else if(i == 8) { 
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(1),tekrarSayisiEkle.get(3)};
                kadinHacimModel.addRow(eklenecek);
            }
        }
        
    }
    
    
    // Burası Tamam !
    public void kadinYagYakma() {
        ArrayList<String> hareketAdiEkle = new ArrayList<String>();
        hareketAdiEkle.add("Hip Thrust");
        hareketAdiEkle.add("Goblet Squat");
        hareketAdiEkle.add("Romanian Deadlift");
        hareketAdiEkle.add("Seated Row");
        hareketAdiEkle.add("Push Up");
        hareketAdiEkle.add("Leg Press");
        hareketAdiEkle.add("Crunch");
        hareketAdiEkle.add("Yürüme");
        hareketAdiEkle.add("Bisiklet");
        hareketAdiEkle.add("Plank");
        ArrayList<Integer> setSayisiEkle = new ArrayList<Integer>();
        setSayisiEkle.add(3);
        setSayisiEkle.add(2);
        ArrayList<Integer> tekrarSayisiEkle = new ArrayList<Integer>();
        tekrarSayisiEkle.add(10);
        tekrarSayisiEkle.add(12);
        tekrarSayisiEkle.add(15);
        tekrarSayisiEkle.add(20);
        kadinYagModel = (DefaultTableModel)kadinYag.getModel();
        for(int i = 0; i < hareketAdiEkle.size(); i++) {
            if(i == 0) {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(0)};
                kadinYagModel.addRow(eklenecek);
            }
            else if(i == 1) {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(1)};
                kadinYagModel.addRow(eklenecek);
            }
            else if(i == 2) {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(1),tekrarSayisiEkle.get(2)};
                kadinYagModel.addRow(eklenecek);
            }
            else if(i == 3) {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(1)};
                kadinYagModel.addRow(eklenecek);
            }
            else if(i == 4) {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(1),"MAX"};
                kadinYagModel.addRow(eklenecek);
            }
            else if(i == 5) {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(1)};
                kadinYagModel.addRow(eklenecek);
            }
            else if(i == 6) {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(3)};
                kadinYagModel.addRow(eklenecek);
            }
            else if(i == 7) {
                Object[] eklenecek = {hareketAdiEkle.get(i),"-","45 Dk"};
                kadinYagModel.addRow(eklenecek);
            }
            else if(i == 8) {
                Object[] eklenecek = {hareketAdiEkle.get(i),"-","30 Dk"};
                kadinYagModel.addRow(eklenecek);
            }
            else if(i == 9) {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),"1 Dk"};
                kadinYagModel.addRow(eklenecek);
            }
        }
        
        
    }
    
    
    
    // Burası Tamam !
    public void kadinAdaptasyon() {
        ArrayList<String> hareketAdiEkle = new ArrayList<String>();
        hareketAdiEkle.add("Hip Thrust");
        hareketAdiEkle.add("Goblet Squat");
        hareketAdiEkle.add("Romanian Deadlift");
        hareketAdiEkle.add("Incline Press");
        hareketAdiEkle.add("Lat Pulldown");
        hareketAdiEkle.add("Leg Raise");
        hareketAdiEkle.add("Crunch");
        hareketAdiEkle.add("Yürüme");
        
        ArrayList<Integer> setSayisiEkle = new ArrayList<Integer>();
        setSayisiEkle.add(3);
        setSayisiEkle.add(2);
        ArrayList<Integer> tekrarSayisiEkle = new ArrayList<Integer>();
        tekrarSayisiEkle.add(10);
        tekrarSayisiEkle.add(12);
        tekrarSayisiEkle.add(15);
        tekrarSayisiEkle.add(20);
        kadinAdaptasyonModel = (DefaultTableModel)kadinAdaptasyon.getModel();
        
        for(int i = 0; i < hareketAdiEkle.size();i++) {
            
            if(i ==0) {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(0)};
                kadinAdaptasyonModel.addRow(eklenecek);
            }
            else if(i == 1) {
                 Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(1)};
                 kadinAdaptasyonModel.addRow(eklenecek);
            }
            else if(i == 2 ) {
                 Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(1),tekrarSayisiEkle.get(2)};
                 kadinAdaptasyonModel.addRow(eklenecek);
            }
            else if(i == 5) {
                 Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(0)};
                kadinAdaptasyonModel.addRow(eklenecek);
            }
            else if(i == 6) {
                 Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(3)};
                kadinAdaptasyonModel.addRow(eklenecek);
            }
            else if(i == 7) {
                 Object[] eklenecek = {hareketAdiEkle.get(i),"-","20 Dk"};
                kadinAdaptasyonModel.addRow(eklenecek);
            }
            else {
                 Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(1),tekrarSayisiEkle.get(0)};
                kadinAdaptasyonModel.addRow(eklenecek);
            }
                
            
        }
        
        
    }
    
    
    
    
    // Burası Tamam !
    public void erkekHacimKazanma() {
        ArrayList<String> hareketAdiEkle = new ArrayList<String>();
        hareketAdiEkle.add("Dumbbell Bench Press");
        hareketAdiEkle.add("Dumbbell Fly");
        hareketAdiEkle.add("SM Shoulder Press");
        hareketAdiEkle.add("Lateral Raise");
        hareketAdiEkle.add("Dumbbell Alt Curl");
        hareketAdiEkle.add("Push Down");
        hareketAdiEkle.add("Cable Curl");
        hareketAdiEkle.add("Barbell Scut Curl");
        hareketAdiEkle.add("Pull Down");
        hareketAdiEkle.add("Cable Row");
        hareketAdiEkle.add("T Bar Row");
        hareketAdiEkle.add("Crunch");
        hareketAdiEkle.add("Knee Up");
        
        ArrayList<Integer> setSayisiEkle = new ArrayList<Integer>();
        setSayisiEkle.add(3);
        
        ArrayList<Integer> tekrarSayisiEkle = new ArrayList<Integer>();
        tekrarSayisiEkle.add(15);
        tekrarSayisiEkle.add(12);
        erkekHacimModel = (DefaultTableModel)erkekHacim.getModel();
        for(int i = 0;i < hareketAdiEkle.size();i++) {
            
            if(i == 0) {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(0)};
                erkekHacimModel.addRow(eklenecek);  
            }
            else {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(1)};
                erkekHacimModel.addRow(eklenecek);  
            }
        }
        
        
        
        
        
    }
    
    
    // Burası Tamam !
    public void erkekYagYakma() {
        ArrayList<String> hareketAdiEkle = new ArrayList<String>();
        hareketAdiEkle.add("Chest Press");
        hareketAdiEkle.add("Shoulder Press");
        hareketAdiEkle.add("Lateral Raise");
        hareketAdiEkle.add("Seated Row");
        hareketAdiEkle.add("Dumbbell Curl");
        hareketAdiEkle.add("Leg Press");
        hareketAdiEkle.add("Crunch");
        hareketAdiEkle.add("Yürüme");
        hareketAdiEkle.add("Bisiklet");
        hareketAdiEkle.add("Plank");
        ArrayList<Integer> setSayisiEkle = new ArrayList<Integer>();
        setSayisiEkle.add(3);
        ArrayList<Integer> tekrarSayisiEkle = new ArrayList<Integer>();
        tekrarSayisiEkle.add(12);
        tekrarSayisiEkle.add(20);
        erkekYagModel = (DefaultTableModel)erkekYag.getModel();
        for(int i = 0 ; i < 10 ;i++ ) {
            if(i < 6) {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(0)};
                 erkekYagModel.addRow(eklenecek);  
            }
            else if(i == 6) {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),20};
                 erkekYagModel.addRow(eklenecek); 
            }
            else if(i == 7) {
                Object[] eklenecek = {hareketAdiEkle.get(i),"-","45 Dk"};
                erkekYagModel.addRow(eklenecek); 
            }
            else if(i == 8){
                Object[] eklenecek = {hareketAdiEkle.get(i),"-","30Dk"};
                 erkekYagModel.addRow(eklenecek);  
            }     
            else if(i == 9) {
                Object[] eklenecek = {hareketAdiEkle.get(i),3,"1 Dk"};
                erkekYagModel.addRow(eklenecek); 
            }
        }
    }
    
    
    
    // Burasi Tamam !
    public void erkekAdaptasyon() {
        ArrayList<String> hareketAdiEkle = new ArrayList<String>();
        hareketAdiEkle.add("Chest Press");
        hareketAdiEkle.add("Shoulder Press");
        hareketAdiEkle.add("Lateral Raise");
        hareketAdiEkle.add("Seated Row");
        hareketAdiEkle.add("Dumbbell Curl");
        hareketAdiEkle.add("Leg Press");
        hareketAdiEkle.add("Crunch");
        hareketAdiEkle.add("Yürüme");
        
        ArrayList<Integer> setSayisiEkle = new ArrayList<Integer>();
        setSayisiEkle.add(3);
        ArrayList<Integer> tekrarSayisiEkle = new ArrayList<Integer>();
        tekrarSayisiEkle.add(12);
        tekrarSayisiEkle.add(20);
        erkekAdaptasyonModel = (DefaultTableModel)erkekAdaptasyon.getModel();    
        
        for(int i = 0 ; i < 8 ;i++ ) {
            if(i == 7) {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),"20 Dk"};
                 erkekAdaptasyonModel.addRow(eklenecek);  
            }
            else {
                Object[] eklenecek = {hareketAdiEkle.get(i),setSayisiEkle.get(0),tekrarSayisiEkle.get(0)};
                 erkekAdaptasyonModel.addRow(eklenecek);  
            }     
        }
    }
    
    
    
            
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu14 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        erkekYK = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        erkekAdaptasyon = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        erkekYag = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        erkekHacim = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        kadinAdaptasyon = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        kadinYag = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        kadinHacim = new javax.swing.JTable();

        jMenu14.setText("File");
        jMenuBar6.add(jMenu14);

        jMenu15.setText("Edit");
        jMenuBar6.add(jMenu15);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        erkekAdaptasyon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hareket Adı", "Set Sayısı", "Tekrar Sayısı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(erkekAdaptasyon);
        if (erkekAdaptasyon.getColumnModel().getColumnCount() > 0) {
            erkekAdaptasyon.getColumnModel().getColumn(0).setResizable(false);
            erkekAdaptasyon.getColumnModel().getColumn(1).setResizable(false);
            erkekAdaptasyon.getColumnModel().getColumn(2).setResizable(false);
        }

        erkekYK.addTab("Erkek Adaptasyon Programı", jScrollPane1);

        erkekYag.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hareket Adı", "Set Sayısı", "Tekrar Sayısı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(erkekYag);
        if (erkekYag.getColumnModel().getColumnCount() > 0) {
            erkekYag.getColumnModel().getColumn(0).setResizable(false);
            erkekYag.getColumnModel().getColumn(1).setResizable(false);
            erkekYag.getColumnModel().getColumn(2).setResizable(false);
        }

        erkekYK.addTab("Erkek Yağ Yakma", jScrollPane2);

        erkekHacim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hareket Adı", "Set Sayısı", "Tekrar Sayısı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(erkekHacim);
        if (erkekHacim.getColumnModel().getColumnCount() > 0) {
            erkekHacim.getColumnModel().getColumn(0).setResizable(false);
            erkekHacim.getColumnModel().getColumn(1).setResizable(false);
            erkekHacim.getColumnModel().getColumn(2).setResizable(false);
        }

        erkekYK.addTab("Erkek Hacim Kazanma", jScrollPane3);

        kadinAdaptasyon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hareket Adı", "Set Sayısı", "Tekrar Sayısı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(kadinAdaptasyon);
        if (kadinAdaptasyon.getColumnModel().getColumnCount() > 0) {
            kadinAdaptasyon.getColumnModel().getColumn(0).setResizable(false);
            kadinAdaptasyon.getColumnModel().getColumn(1).setResizable(false);
            kadinAdaptasyon.getColumnModel().getColumn(2).setResizable(false);
        }

        erkekYK.addTab("Kadın Adaptasyon Programı", jScrollPane4);

        kadinYag.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hareket Adı", "Set Sayısı", "Tekrar Sayısı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(kadinYag);
        if (kadinYag.getColumnModel().getColumnCount() > 0) {
            kadinYag.getColumnModel().getColumn(0).setResizable(false);
            kadinYag.getColumnModel().getColumn(1).setResizable(false);
            kadinYag.getColumnModel().getColumn(2).setResizable(false);
        }

        erkekYK.addTab("Kadın Yağ Yakma", jScrollPane5);

        kadinHacim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hareket Adı", "Set Sayısı", "Tekrar Sayısı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(kadinHacim);
        if (kadinHacim.getColumnModel().getColumnCount() > 0) {
            kadinHacim.getColumnModel().getColumn(1).setResizable(false);
            kadinHacim.getColumnModel().getColumn(2).setResizable(false);
        }

        erkekYK.addTab("Kadın Hacim Kazanma", jScrollPane6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(erkekYK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(erkekYK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
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
            java.util.logging.Logger.getLogger(CalismaProgramiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalismaProgramiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalismaProgramiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalismaProgramiEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalismaProgramiEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable erkekAdaptasyon;
    private javax.swing.JTable erkekHacim;
    private javax.swing.JTabbedPane erkekYK;
    private javax.swing.JTable erkekYag;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable kadinAdaptasyon;
    private javax.swing.JTable kadinHacim;
    private javax.swing.JTable kadinYag;
    // End of variables declaration//GEN-END:variables

}
