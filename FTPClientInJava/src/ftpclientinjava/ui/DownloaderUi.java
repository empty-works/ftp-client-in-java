/*
 */
package ftpclientinjava.ui;

import ftpclientinjava.Downloader;
import ftpclientinjava.Uploader;
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
    
    private void downloadFile() {
        
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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        add(DownloadButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DownloadButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
