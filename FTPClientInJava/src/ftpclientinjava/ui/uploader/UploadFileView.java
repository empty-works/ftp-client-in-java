/*
 */
package ftpclientinjava.ui.uploader;

import java.io.File;
import javax.swing.JList;
import javax.swing.JScrollPane;

/**
 *
 * @author MP
 */
public class UploadFileView extends javax.swing.JPanel {

    private File file;
    
    public UploadFileView(File file) {
        initComponents();
        
        this.file = file;
    }
    
    public void listFiles() {
        
        String[] fileNames = file.list();
        JList<String> fileList = new JList<>(fileNames);
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.add(fileList);
        this.add(scrollPane);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setToolTipText(null);
        setOpaque(false);
        setLayout(new java.awt.GridLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
