/*
 */
package ftpclientinjava.ui.uploader;

import java.awt.Color;
import java.awt.Cursor;
import java.io.File;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

/**
 *
 * @author MP
 */
public class UploadFileView extends javax.swing.JPanel {

    private JList<String> fileList;
    private Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);
    private Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
    
    public UploadFileView() {
        initComponents();
    }
    
    public void listFiles(File file) {
        
        String[] fileNames = file.list();
        fileList = new JList<>(fileNames);
        fileList.setCellRenderer(new UploadFileViewCellRenderer());
        showFileList(fileNames, fileList);
    }
    
    private void showFileList(String[] fileNames, JList<String> fileList) {
        
        /*
        fileList.setModel(new AbstractListModel<String>() {
            @Override
            public int getSize() {
                return fileNames.length;
            }

            @Override
            public String getElementAt(int index) {
                
                return fileNames[index];
            }
        });

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.add(fileList);
        scrollPane.setViewportView(fileList);
        this.add(scrollPane);
        */
        
        FileViewContainer.removeAll();
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.add(fileList);
        scrollPane.setViewportView(fileList);
        scrollPane.revalidate();
        scrollPane.repaint();
        FileViewContainer.add(scrollPane);
        FileViewContainer.revalidate();
        FileViewContainer.repaint();
        
        /*
        ListModel<String> model = fileList.getModel();
        for(int i = 0; i < model.getSize(); i++) {
            
            String temp = model.getElementAt(i);
            System.out.println(temp);
        }
*/
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
        
        
    }//GEN-LAST:event_UploadButtonMouseExited

    private void UploadButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UploadButtonMousePressed
        
        
    }//GEN-LAST:event_UploadButtonMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FileViewContainer;
    private javax.swing.JLabel UploadButton;
    // End of variables declaration//GEN-END:variables
}
