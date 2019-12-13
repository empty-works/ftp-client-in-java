/*
 */
package ftpclientinjava;

import ftpclientinjava.ui.StatusPanel;

/**
 *
 * @author MP
 */
public class FTPFrame extends javax.swing.JFrame {

    /**
     * 
     */
    public FTPFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        addStatusPanel();
    }
    
    
    
    private void addStatusPanel() {
        
        TopPanel.add(new StatusPanel());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        MiddlePanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        BottomPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(new java.awt.GridLayout(3, 1));

        TopPanel.setToolTipText(null);
        TopPanel.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(TopPanel);

        MiddlePanel.setToolTipText(null);
        MiddlePanel.setLayout(new java.awt.GridLayout(1, 2));

        jPanel2.setToolTipText(null);
        jPanel2.setLayout(new java.awt.GridBagLayout());
        MiddlePanel.add(jPanel2);

        jPanel1.setToolTipText(null);
        jPanel1.setLayout(new java.awt.GridBagLayout());
        MiddlePanel.add(jPanel1);

        getContentPane().add(MiddlePanel);

        BottomPanel.setToolTipText(null);
        BottomPanel.setLayout(new java.awt.GridLayout(1, 2));

        jPanel4.setToolTipText(null);
        jPanel4.setLayout(new java.awt.GridBagLayout());
        BottomPanel.add(jPanel4);

        jPanel3.setToolTipText(null);
        jPanel3.setLayout(new java.awt.GridBagLayout());
        BottomPanel.add(jPanel3);

        getContentPane().add(BottomPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    //public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
    
    
    //    try {
    //        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //            if ("Nimbus".equals(info.getName())) {
    //                javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                break;
    //            }
    //        }
    //    } catch (ClassNotFoundException ex) {
    //        java.util.logging.Logger.getLogger(FTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //    } catch (InstantiationException ex) {
    //        java.util.logging.Logger.getLogger(FTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //    } catch (IllegalAccessException ex) {
    //        java.util.logging.Logger.getLogger(FTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //        java.util.logging.Logger.getLogger(FTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //    }
        //</editor-fold>

        /* Create and display the form */
    //    java.awt.EventQueue.invokeLater(new Runnable() {
    //        public void run() {
    //            new FTPFrame().setVisible(true);
    //        }
    //    });
    //}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JPanel MiddlePanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
