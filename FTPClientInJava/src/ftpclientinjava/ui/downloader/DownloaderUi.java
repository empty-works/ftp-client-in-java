/*
 */
package ftpclientinjava.ui.downloader;

import ftpclientinjava.Uploader;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author MP
 */
public class DownloaderUi extends javax.swing.JPanel {

    /**
     * 
     */
    public DownloaderUi() {
        initComponents();
        
        displayFiles();
    }
    
    private void displayFiles() {
        
         
    }
    
    private void downloadFile() throws IOException {
        
        FTPClient ftpclient = getFtpClient();
        Downloader instance = new Downloader(ftpclient);
        instance.downloadFile(file, path);
        ftpclient.disconnect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        DownloadButton = new javax.swing.JLabel();

        setToolTipText(null);
        setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setToolTipText(null);

        jLabel1.setText("jLabel1");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jScrollPane1.setViewportView(jLabel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(jScrollPane1, gridBagConstraints);

        DownloadButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DownloadButton.setText("Download File");
        DownloadButton.setToolTipText(null);
        DownloadButton.setMaximumSize(new java.awt.Dimension(34, 50));
        DownloadButton.setMinimumSize(new java.awt.Dimension(34, 50));
        DownloadButton.setPreferredSize(new java.awt.Dimension(34, 50));
        DownloadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DownloadButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DownloadButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DownloadButtonMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(DownloadButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void DownloadButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DownloadButtonMouseEntered
        
    }//GEN-LAST:event_DownloadButtonMouseEntered

    private void DownloadButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DownloadButtonMouseExited
        
    }//GEN-LAST:event_DownloadButtonMouseExited

    private void DownloadButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DownloadButtonMousePressed
        
    }//GEN-LAST:event_DownloadButtonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DownloadButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
