/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6gui;

/**
 *
 * @author User
 */
public class Latihan4 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan4
     */
    public Latihan4() {
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

        jPanel1 = new javax.swing.JPanel();
        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jurusan = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Absen = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        rdb2 = new javax.swing.JRadioButton();
        rdb1 = new javax.swing.JRadioButton();
        cb2 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb1 = new javax.swing.JCheckBox();
        Hapus = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Biodata Siswa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 100, 30);

        jLabel2.setText("Absen");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 130, 50, 30);

        jLabel3.setText("Jurusan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 180, 50, 30);

        jLabel4.setText("Hasil");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 320, 50, 30);

        jLabel5.setText("Nama");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 90, 50, 30);
        getContentPane().add(Absen);
        Absen.setBounds(110, 130, 210, 30);
        getContentPane().add(Nama);
        Nama.setBounds(110, 90, 210, 30);

        jurusan.add(rdb2);
        rdb2.setText("TKJ");
        getContentPane().add(rdb2);
        rdb2.setBounds(220, 180, 43, 30);

        rdb1.setText("RPL");
        rdb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb1ActionPerformed(evt);
            }
        });
        getContentPane().add(rdb1);
        rdb1.setBounds(110, 180, 43, 30);

        cb2.setText("Teknisi");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        getContentPane().add(cb2);
        cb2.setBounds(210, 220, 90, 30);

        cb3.setText("Animator");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        getContentPane().add(cb3);
        cb3.setBounds(110, 260, 90, 30);

        cb4.setText("Designer");
        getContentPane().add(cb4);
        cb4.setBounds(210, 260, 90, 30);

        cb1.setText("Programing");
        getContentPane().add(cb1);
        cb1.setBounds(110, 220, 90, 30);

        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus);
        Hapus.setBounds(140, 290, 80, 30);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(230, 290, 80, 30);

        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(50, 290, 80, 30);

        jLabel6.setText("Hobi");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 220, 50, 30);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(16, 360, 360, 110);

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdb1ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        String nama = Nama.getText();
        String absen = Absen.getText();
        String jurusan;
        String hobi = "";
        if(rdb1.isSelected())
            jurusan = "RPL";
        else if (rdb2.isSelected())
            jurusan = "TKJ";
        else
            jurusan = " ";
      //untuk checbock
      if (cb1.isSelected())
          hobi+=cb1.getText()+", ";
      if (cb2.isSelected())
          hobi+=cb2.getText()+", ";
       if (cb3.isSelected())
          hobi+=cb3.getText()+", ";
        if (cb4.isSelected())
          hobi+=cb4.getText()+", ";
        TA.setText("Nama siswa: "+nama+"\nAbsen siswa: "+absen+"\nJurusan Anda: "+jurusan+"\nHobi anda: "+hobi);
            
        
    }//GEN-LAST:event_SubmitActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        TA.setText("");
        Nama.setText("");
        Absen.setText("");
        jurusan.clearSelection();
        cb1.setSelected(false);
        cb2.setSelected(false);
        cb3.setSelected(false);
        cb4.setSelected(false);
    }//GEN-LAST:event_HapusActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton Submit;
    private javax.swing.JTextArea TA;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jurusan;
    private javax.swing.JRadioButton rdb1;
    private javax.swing.JRadioButton rdb2;
    // End of variables declaration//GEN-END:variables
}
