/*
 */
package ftpclientinjava.ui.uploader;

import java.awt.Color;
import java.awt.Cursor;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author MP
 */
public class UploadFileView extends javax.swing.JPanel {

    private JList<String> fileList;
    private Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);
    private Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
    private String[] fileNames;
    private String filePath;
    
    public UploadFileView() {
        initComponents();
    }
    
    public void listFiles(File file) {
        
        filePath = file.getAbsolutePath();
        System.out.println("File path: " + filePath);
        fileNames = file.list();
        fileList = new JList<>(fileNames);
        fileList.setCellRenderer(new UploadFileViewCellRenderer());
        showFileList(fileNames, fileList);
    }
    
    private void showFileList(String[] fileNames, JList<String> fileList) {
        
        FileViewContainer.removeAll();
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.add(fileList);
        scrollPane.setViewportView(fileList);
        scrollPane.revalidate();
        scrollPane.repaint();
        FileViewContainer.add(scrollPane);
        FileViewContainer.revalidate();
        FileViewContainer.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        FileViewContainer = new javax.swing.JPanel();
        UploadButton = new javax.swing.JLabel();

        setToolTipText(null);
        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        FileViewContainer.setToolTipText(null);
        FileViewContainer.setLayout(new java.awt.GridLayout(1, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(FileViewContainer, gridBagConstraints);

        UploadButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        UploadButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UploadButton.setText("Upload");
        UploadButton.setToolTipText(null);
        UploadButton.setMinimumSize(new java.awt.Dimension(34, 45));
        UploadButton.setPreferredSize(new java.awt.Dimension(34, 45));
        UploadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UploadButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UploadButtonMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UploadButtonMousePressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        add(UploadButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void UploadButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadButtonMouseEntered
        
        UploadButton.setBackground(Color.orange);
        UploadButton.setCursor(handCursor);
    }//GEN-LAST:event_UploadButtonMouseEntered

    private void UploadButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadButtonMouseExited
        
        UploadButton.setBackground(Color.white);
        UploadButton.setCursor(defaultCursor);
    }//GEN-LAST:event_UploadButtonMouseExited

    private void UploadButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadButtonMousePressed
        
        int selectedIndex = fileList.getSelectedIndex();
        String selectedFileName = fileNames[selectedIndex];
        System.out.println("Selected upload file: " + filePath + File.separator + selectedFileName);
        try {
            //File file = new File(getClass().getClassLoader().getResource(
            //        filePath + File.pathSeparator + selectedFileName).toURI());
            File file = new File(filePath + File.separator + selectedFileName);
            System.out.println("New file: " + file);
            
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
            Logger.getLogger(UploadFileView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_UploadButtonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FileViewContainer;
    private javax.swing.JLabel UploadButton;
    // End of variables declaration//GEN-END:variables
}
