/*
 */
package ftpclientinjava;

import ftpclientinjava.beans.UserLoginInput;
import ftpclientinjava.ui.DownloaderUi;
import ftpclientinjava.ui.LoginUi;
import ftpclientinjava.ui.StatusPanel;
import ftpclientinjava.ui.uploader.UploaderUi;

/**
 *
 * @author MP
 */
public class FTPFrame extends javax.swing.JFrame {

    private UserLoginInput userLogin = new UserLoginInput();
    private StatusPanel statusPanel = new StatusPanel();
    
    /**
     * 
     */
    public FTPFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        addStatusPanel();
        addLoginPanel();
        addUploaderPanel();
        addDownloaderPanel();
    }
    
    private void addStatusPanel() {
        
        StatusContainer.add(statusPanel);
    }
    
    private void addLoginPanel() {
        
        LoginContainer.add(new LoginUi(userLogin, statusPanel));
    }
    
    private void addUploaderPanel() {
        
        UploaderUi uu = new UploaderUi();
        UploadTopView.add(uu);
        uu.initAll();
    }
    
    private void addDownloaderPanel() {
        
        DownloadContainer.add(new DownloaderUi());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        LoginContainer = new javax.swing.JPanel();
        StatusContainer = new javax.swing.JPanel();
        BottomContainer = new javax.swing.JPanel();
        UploadContainer = new javax.swing.JPanel();
        UploadTopView = new javax.swing.JPanel();
        UploadBottomView = new javax.swing.JPanel();
        DownloadContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Basic FTP Client in Java by Empty Works");
        setMinimumSize(new java.awt.Dimension(1100, 750));
        setPreferredSize(new java.awt.Dimension(1100, 750));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        LoginContainer.setToolTipText(null);
        LoginContainer.setMinimumSize(new java.awt.Dimension(10, 50));
        LoginContainer.setPreferredSize(new java.awt.Dimension(100, 50));
        LoginContainer.setLayout(new java.awt.GridLayout(1, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        getContentPane().add(LoginContainer, gridBagConstraints);

        StatusContainer.setBackground(new java.awt.Color(255, 255, 255));
        StatusContainer.setToolTipText(null);
        StatusContainer.setLayout(new java.awt.GridLayout(1, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(StatusContainer, gridBagConstraints);

        BottomContainer.setToolTipText(null);
        BottomContainer.setLayout(new java.awt.GridLayout(1, 2));

        UploadContainer.setToolTipText(null);
        UploadContainer.setLayout(new java.awt.GridLayout(2, 1));

        UploadTopView.setToolTipText(null);
        UploadTopView.setOpaque(false);
        UploadTopView.setLayout(new java.awt.GridLayout(1, 0));
        UploadContainer.add(UploadTopView);

        UploadBottomView.setToolTipText(null);
        UploadBottomView.setOpaque(false);
        UploadBottomView.setLayout(new java.awt.GridLayout(1, 0));
        UploadContainer.add(UploadBottomView);

        BottomContainer.add(UploadContainer);

        DownloadContainer.setToolTipText(null);
        DownloadContainer.setLayout(new java.awt.GridLayout(1, 0));
        BottomContainer.add(DownloadContainer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.4;
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
    private javax.swing.JPanel StatusContainer;
    private javax.swing.JPanel UploadBottomView;
    private javax.swing.JPanel UploadContainer;
    private javax.swing.JPanel UploadTopView;
    // End of variables declaration//GEN-END:variables
}
