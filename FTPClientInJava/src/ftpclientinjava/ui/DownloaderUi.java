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
        jTextField1 = new javax.swing.JTextField();

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

        jTextField1.setText("Type file to download...");
        jTextField1.setToolTipText(null);
        jTextField1.setMinimumSize(new java.awt.Dimension(4, 40));
        jTextField1.setPreferredSize(new java.awt.Dimension(55, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        add(jTextField1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
