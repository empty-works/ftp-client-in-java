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
        
        this.removeAll();
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.add(fileList);
        scrollPane.setViewportView(fileList);
        scrollPane.revalidate();
        scrollPane.repaint();
        this.add(scrollPane);
        this.revalidate();
        this.repaint();
        
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

        setToolTipText(null);
        setOpaque(false);
        setLayout(new java.awt.GridLayout(1, 0));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
