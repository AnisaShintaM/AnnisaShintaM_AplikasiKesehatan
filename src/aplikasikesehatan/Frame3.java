/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasikesehatan;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Frame3 extends javax.swing.JFrame {
    String temp="";
    Double tin ,bt ,h1;


    /**
     * Creates new form Frame3
     */
    public Frame3() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        tinggi = new javax.swing.JTextField();
        berat = new javax.swing.JTextField();
        perempuan = new javax.swing.JRadioButton();
        laki = new javax.swing.JRadioButton();
        btnhitung = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ideal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnreset = new javax.swing.JButton();
        hasil = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        saran = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Swis721 Blk BT", 0, 12)); // NOI18N
        jLabel1.setText("Jenis Kelamin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 230, 110, 20);

        jLabel5.setFont(new java.awt.Font("Swis721 Blk BT", 0, 12)); // NOI18N
        jLabel5.setText("Berat Badan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 170, 130, 30);

        jLabel4.setFont(new java.awt.Font("Swis721 Blk BT", 0, 12)); // NOI18N
        jLabel4.setText("Tinggi Badan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 120, 140, 30);

        jLabel3.setFont(new java.awt.Font("Swis721 Blk BT", 0, 12)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 70, 110, 30);

        nama.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        getContentPane().add(nama);
        nama.setBounds(160, 70, 240, 30);

        tinggi.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        getContentPane().add(tinggi);
        tinggi.setBounds(160, 120, 240, 30);

        berat.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        getContentPane().add(berat);
        berat.setBounds(160, 170, 240, 30);

        buttonGroup1.add(perempuan);
        perempuan.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        perempuan.setText("Perempuan");
        getContentPane().add(perempuan);
        perempuan.setBounds(160, 230, 110, 23);

        buttonGroup1.add(laki);
        laki.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        laki.setText("Laki - Laki");
        getContentPane().add(laki);
        laki.setBounds(290, 230, 100, 23);

        btnhitung.setBackground(new java.awt.Color(255, 102, 102));
        btnhitung.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        btnhitung.setText("HITUNG");
        btnhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhitungActionPerformed(evt);
            }
        });
        getContentPane().add(btnhitung);
        btnhitung.setBounds(100, 280, 100, 30);

        jLabel6.setBackground(new java.awt.Color(51, 255, 51));
        jLabel6.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("Berat badan ideal Anda adalah ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 330, 260, 30);
        getContentPane().add(ideal);
        ideal.setBounds(280, 330, 50, 30);

        jLabel7.setBackground(new java.awt.Color(51, 255, 51));
        jLabel7.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("kg");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 330, 30, 30);

        btnreset.setBackground(new java.awt.Color(102, 255, 255));
        btnreset.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset);
        btnreset.setBounds(220, 280, 110, 30);

        hasil.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        getContentPane().add(hasil);
        hasil.setBounds(10, 370, 420, 30);

        jLabel8.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("CHECK IDEAL");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(120, 0, 200, 30);

        jLabel9.setFont(new java.awt.Font("Swis721 Blk BT", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 0));
        jLabel9.setText("PHILIP HOSPITAL");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(150, 30, 140, 20);

        saran.setFont(new java.awt.Font("Swis721 Hv BT", 0, 12)); // NOI18N
        getContentPane().add(saran);
        saran.setBounds(10, 410, 420, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/3181-3767-thickbox.jpg"))); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-30, 0, 480, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void btnhitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhitungActionPerformed
        if(berat.getText().equals("")||tinggi.getText().equals("")||nama.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kotak isian Belum diisi, maka harus diisi");

        }else if (perempuan.isSelected()||laki.isSelected())
        try{
            Proses();
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Inputan ada yang salah");
        }
        else {
            JOptionPane.showMessageDialog(null,  "Jenis Kelamin silahkan diisi");
        }
    }//GEN-LAST:event_btnhitungActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
            nama.setText("");
            tinggi.setText("");
            berat.setText("");
            buttonGroup1.clearSelection();
            ideal.setText("");
            saran.setText("");
            hasil.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_btnresetActionPerformed

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
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField berat;
    private javax.swing.JButton btnhitung;
    private javax.swing.JButton btnreset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField hasil;
    private javax.swing.JTextField ideal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton laki;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton perempuan;
    private javax.swing.JTextField saran;
    private javax.swing.JTextField tinggi;
    // End of variables declaration//GEN-END:variables

    private void Proses() {
         tin = Double.valueOf(tinggi.getText());
         bt = Double.valueOf(berat.getText());
        
        if(perempuan.isSelected()) {
            h1 = (tin - 110) * 1;
        } else if (laki.isSelected()) {
            h1 = (tin - 104) * 1;
        }
        temp = Double.toString(h1.intValue());
        if(h1 < bt) {
            ideal.setText(temp);
            hasil.setText("Maaf " + nama.getText() + " , Sepertinya Anda Overweight :(");
            saran.setText("Banyaklah berolahraga dan hindari makanan berkolesterol yaa");
        
        } else if (h1>bt) {
            ideal.setText(temp);
            hasil.setText("Maaf " + nama.getText() + " , Sepertinya adan underweight :(");
            saran.setText("Banyaklah berolahraga dan makan makanan berkarbohidrat tinggi yaa");
     
        }else {
            ideal.setText(temp);
            hasil.setText("Haloo " + nama.getText() + " Berat Anda sudah ideal :)");
            saran.setText("Lanjutkan pola makan teratur dan gaya hidup sehat");
            
        }}

   
}
