
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class futama extends javax.swing.JFrame {

    /**
     * Creates new form futama
     */
    public futama() {
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
        labelnama = new javax.swing.JLabel();
        btntekan = new javax.swing.JButton();
        labelnim = new javax.swing.JLabel();
        labelkelas = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pemrograman Provis");

        labelnama.setText("Halo Dunia");

        btntekan.setText("Tekan Saya");
        btntekan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntekanMouseClicked(evt);
            }
        });

        labelnim.setText("NIM");

        labelkelas.setText("Kelas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelnama)
                    .addComponent(labelkelas)
                    .addComponent(labelnim)
                    .addComponent(btntekan))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelnama)
                .addGap(18, 18, 18)
                .addComponent(labelnim)
                .addGap(18, 18, 18)
                .addComponent(labelkelas)
                .addGap(67, 67, 67)
                .addComponent(btntekan)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntekanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntekanMouseClicked
        // TODO add your handling code here:
        labelnama.setText("Halo nama saya Umar");
        labelnim.setText("10118340");
        labelkelas.setText("IF - 8");
        JOptionPane.showMessageDialog(null, "Selemat Anda berhasil mengubah label nama, NIM, dan kelas!");
    }//GEN-LAST:event_btntekanMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntekan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelkelas;
    private javax.swing.JLabel labelnama;
    private javax.swing.JLabel labelnim;
    // End of variables declaration//GEN-END:variables
}
