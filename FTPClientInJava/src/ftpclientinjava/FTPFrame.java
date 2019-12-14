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
        
        TopPanel.add(new StatusPanel());
    }
    
    private void addDownloaderPanel() {
        
        DownloadContainer.add(new DownloaderUi());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        TopPanel = new javax.swing.JPanel();
        MiddlePanel = new javax.swing.JPanel();
        UploadContainer = new javax.swing.JPanel();
        DownloadContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setPreferredSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        TopPanel.setToolTipText(null);
        TopPanel.setLayout(new java.awt.GridLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(TopPanel, gridBagConstraints);

        MiddlePanel.setToolTipText(null);
        MiddlePanel.setLayout(new java.awt.GridLayout(1, 2));

        UploadContainer.setToolTipText(null);
        UploadContainer.setLayout(new java.awt.GridBagLayout());
        MiddlePanel.add(UploadContainer);

        DownloadContainer.setToolTipText(null);
        DownloadContainer.setLayout(new java.awt.GridLayout());
        MiddlePanel.add(DownloadContainer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.2;
        getContentPane().add(MiddlePanel, gridBagConstraints);

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
    private javax.swing.JPanel DownloadContainer;
    private javax.swing.JPanel MiddlePanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JPanel UploadContainer;
    // End of variables declaration//GEN-END:variables
}
