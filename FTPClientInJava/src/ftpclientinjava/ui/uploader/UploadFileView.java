/*
 */
package ftpclientinjava.ui.uploader;

import java.io.File;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

/**
 *
 * @author MP
 */
public class UploadFileView extends javax.swing.JPanel {

    JList<String> fileList;
    
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
        FileViewContainer.setLayout(new java.awt.GridLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(FileViewContainer, gridBagConstraints);

        UploadButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UploadButton.setText("Upload");
        UploadButton.setToolTipText(null);
        UploadButton.setMinimumSize(new java.awt.Dimension(34, 45));
        UploadButton.setPreferredSize(new java.awt.Dimension(34, 45));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        add(UploadButton, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FileViewContainer;
    private javax.swing.JLabel UploadButton;
    // End of variables declaration//GEN-END:variables
}
