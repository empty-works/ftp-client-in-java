/*
 */
package ftpclientinjava.ui.uploader;

import java.io.File;
import javax.swing.AbstractListModel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

/**
 *
 * @author MP
 */
public class UploadFileView extends javax.swing.JPanel {

    public UploadFileView() {
        initComponents();
    }
    
    public void listFiles(File file) {
        
        String[] fileNames = file.list();
        JList<String> fileList = new JList<>(fileNames);
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
        ListModel<String> model = fileList.getModel();
        for(int i = 0; i < model.getSize(); i++) {
            
            System.out.println(model.getElementAt(i));
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setToolTipText(null);
        setOpaque(false);
        setLayout(new java.awt.GridLayout(1, 0));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
