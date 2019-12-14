/*
 */
package ftpclientinjava;

import ftpclientinjava.ui.DownloaderUi;
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
        
        addDownloaderPanel();
    }
    
    
    
    private void addStatusPanel() {
        
        TopContainer.add(new StatusPanel());
    }
    
    private void addDownloaderPanel() {
        
        DownloadContainer.add(new DownloaderUi());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        TopContainer = new javax.swing.JPanel();
        LoginContainer = new javax.swing.JPanel();
        BottomContainer = new javax.swing.JPanel();
        UploadContainer = new javax.swing.JPanel();
        DownloadContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        TopContainer.setBackground(new java.awt.Color(255, 255, 255));
        TopContainer.setToolTipText(null);
        TopContainer.setLayout(new java.awt.GridLayout(1, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(TopContainer, gridBagConstraints);

        LoginContainer.setToolTipText(null);
        LoginContainer.setMinimumSize(new java.awt.Dimension(10, 50));
        LoginContainer.setPreferredSize(new java.awt.Dimension(100, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        getContentPane().add(LoginContainer, gridBagConstraints);

        BottomContainer.setToolTipText(null);
        BottomContainer.setLayout(new java.awt.GridLayout(1, 2));

        UploadContainer.setToolTipText(null);
        UploadContainer.setLayout(new java.awt.GridBagLayout());
        BottomContainer.add(UploadContainer);

        DownloadContainer.setToolTipText(null);
        DownloadContainer.setLayout(new java.awt.GridLayout(1, 0));
        BottomContainer.add(DownloadContainer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        getContentPane().add(BottomContainer, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FTPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FTPFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomContainer;
    private javax.swing.JPanel DownloadContainer;
    private javax.swing.JPanel LoginContainer;
    private javax.swing.JPanel TopContainer;
    private javax.swing.JPanel UploadContainer;
    // End of variables declaration//GEN-END:variables
}
