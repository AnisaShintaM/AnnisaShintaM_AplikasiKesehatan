/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasikesehatan;

/**
 *
 * @author user
 */
public class Frame2 extends javax.swing.JFrame {

    /**
     * Creates new form Frame2
     */
    public Frame2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcom = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        Hasil1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        Hasil3 = new javax.swing.JTextArea();
        reset1 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        Gejala = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Hasil2 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("HEALTH INFORMATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 570, 30);

        jLabel2.setFont(new java.awt.Font("Swis721 Blk BT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("PHILIP HOSPITAL");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(330, 50, 240, 20);

        jLabel3.setFont(new java.awt.Font("Segoe WP Black", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Apa Masalahmu ?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 110, 160, 30);

        jcom.setFont(new java.awt.Font("Tekton Pro Cond", 1, 14)); // NOI18N
        jcom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilihlah Salah Satu--", "Tifus", "DBD", "Usus Buntu", "Influenza", " " }));
        jcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcomActionPerformed(evt);
            }
        });
        getContentPane().add(jcom);
        jcom.setBounds(320, 110, 320, 30);

        Hasil1.setColumns(20);
        Hasil1.setRows(5);
        jScrollPane3.setViewportView(Hasil1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(100, 330, 360, 120);

        Hasil3.setColumns(20);
        Hasil3.setRows(5);
        jScrollPane4.setViewportView(Hasil3);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(550, 330, 370, 120);

        reset1.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        reset1.setText("BACK");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });
        getContentPane().add(reset1);
        reset1.setBounds(840, 10, 90, 30);

        reset.setFont(new java.awt.Font("Swis721 BlkCn BT", 0, 14)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset);
        reset.setBounds(690, 110, 90, 30);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 220, 100, 30);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(null);
        jPanel3.add(jPanel4);
        jPanel4.setBounds(20, 220, 100, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(20, 220, 100, 30);

        jPanel5.setBackground(new java.awt.Color(204, 153, 255));
        jPanel5.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(null);
        jPanel5.add(jPanel6);
        jPanel6.setBounds(20, 220, 100, 30);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setLayout(null);
        jPanel7.add(jPanel8);
        jPanel8.setBounds(20, 220, 100, 30);

        jPanel5.add(jPanel7);
        jPanel7.setBounds(20, 220, 100, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(20, 220, 100, 30);

        jLabel6.setFont(new java.awt.Font("Segoe WP Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Definisi");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 0, 80, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 220, 90, 30);

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe WP Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Penyebab");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel9);
        jPanel9.setBounds(10, 380, 120, 30);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(null);

        Gejala.setFont(new java.awt.Font("Segoe WP Black", 0, 14)); // NOI18N
        Gejala.setForeground(new java.awt.Color(51, 51, 51));
        Gejala.setText("Gejala");
        jPanel10.add(Gejala);
        Gejala.setBounds(20, 0, 60, 30);

        getContentPane().add(jPanel10);
        jPanel10.setBounds(470, 210, 80, 30);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe WP Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Anjuran");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel11);
        jPanel11.setBounds(470, 380, 100, 30);

        Hasil2.setColumns(20);
        Hasil2.setRows(5);
        jScrollPane5.setViewportView(Hasil2);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(550, 170, 370, 120);

        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane6.setViewportView(Hasil);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(100, 170, 360, 120);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/77.-Asuransi-Kesehatan-Saja-atau-Dengan-Investasi.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -10, 940, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcomActionPerformed
         if(jcom.getSelectedItem().equals("Tifus")){
           Hasil.append("Tifus (tipes) atau demam tifoid adalah \npenyakit yang terjadi karena infeksi bakteri \nSalmonella typhi dan umumnya menyebar melalui \nmakanan dan minuman yang telah terkontaminasi.");
           Hasil1.append("Cara penularan penyakit tifus bisa melalui \nmakanan atau minuman yang sudah terkontaminasi \nbakteri Salmonella. Penularan bisa dengan memegang \nbarang orang yang sudah terinfeksi, memakai barang \nyang sama dan memakan makanan yang sama");
           Hasil2.append("Berikut adalah gejala Tifus: \n-Demam atau panas dengan suhu tinggi \n-Ruam berupa bintik-bintik merah muda kecil \n-Rasa Kebingungan, disorientasi tempat dan lingkungan \n-Tidak nafsu Makan");
           Hasil3.append("Berikut cara penanganannya : \n-Minum air yang cukup \n-Mengkonsumsi cacing tanah \n-Jangan makan makanan pedas \n-Konsumsilah Bawang Putih \n-Perbanyaklah Istirahat");
                }
        else
            if(jcom.getSelectedItem().equals("DBD")){
           Hasil.append("Demam berdarah atau demam dengue (disingkat DBD) \nadalah infeksi yang disebabkan oleh virus dengue \nDemam dengue juga disebut sebagai \nbreakbone fever karena demam tersebut \ndapat menyebabkan penderitanya mengalami nyeri \nhebat seakan patah tulang");
           Hasil1.append("Penyakit demam dengue disebabkan oleh virus dengue \nyang ditularkan kepada manusia melalui perantara nyamuk \nAedes aegypti dan Aedes albopictus");
           Hasil2.append("-Mendadak demam tinggi, bisa mencapai 105 ° F \n-Sakit di belakang mata \n-Nyeri sendi, otot \n-Sakit kepala yang hebat Ruam di sebagian besar tubuh");
           Hasil3.append("-Makan makanan bergizi \n-Rutin olahraga \n-Makanlah daun pepaya untuk penanganan alami \n-Konsumsi telur yang banyak mengandung protein \n-Konsumsi air kelapa");
        }      
            else if(jcom.getSelectedItem().equals("Usus Buntu")){
           Hasil.append("Penyakit usus buntu adalah peradangan atau \npembengkakan apendiks atau usus buntu. Sedangkan usus \nbuntu adalah organ berbentuk kantong kecil \ndan tipis berukuran 5 hingga 10 cm yang terhubung \npada usus besar");
           Hasil1.append("Berikut Penyebabnya : \n-Tinja \n-Kelenjar getah bening yang membengkak di dinding usus. \n Pembengkakan ini biasanya berkembang setelah terjadi \ninfeksi saluran pernapasan atas.");
           Hasil2.append("-Kehilangan nafsu makan \n-Perut kembung dan tak bisa  buang gas \n-Mual dan mutah \n-Konstipasi atau diare \n-Demam");
           Hasil3.append("Untuk pengobatan secara alamin : \n-Daun sambiloto \n-Tanaman krokot \n-Kunir dan Jeruk nipis \n-Mengkudu \n-Kunyit");}
         
        else if(jcom.getSelectedItem().equals("Influenza")){
           Hasil.append("Influenza, yang lebih dikenal dengan sebutan flu, \nmerupakan penyakit menular yang disebabkan oleh \nvirus RNA dari familia Orthomyxoviridae(virus influenza), \nyang menyerang unggas dan mamalia.");
           Hasil1.append("Virus flu menyebar lewat udara \nketika seseorang terinfeksi batuk, \nbersin atau bicara.");
           Hasil2.append("-Demam dan menggigil \n-Batuk dan hidung tersumbat \n-Nyeri tubuh \n-Mudah kelelahan \n-Iritasi mata \n-Ruam petechiae");
           Hasil3.append("Disarankan untuk banyak istirahat \nMeminum banyak cairan \nMenghindari penggunaan alkohol dan rokok \nKonsumsi obat seperti parasetamol");
        }        
    }//GEN-LAST:event_jcomActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        Hasil.setText("");
        Hasil1.setText("");
        Hasil2.setText("");
        Hasil3.setText("");
    // TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
         new Frame1().setVisible(true);
            dispose(); // TODO add your handling code here:
    }//GEN-LAST:event_reset1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gejala;
    private javax.swing.JTextArea Hasil;
    private javax.swing.JTextArea Hasil1;
    private javax.swing.JTextArea Hasil2;
    private javax.swing.JTextArea Hasil3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> jcom;
    private javax.swing.JButton reset;
    private javax.swing.JButton reset1;
    // End of variables declaration//GEN-END:variables
}
