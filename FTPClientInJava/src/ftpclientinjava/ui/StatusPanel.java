/*
 */
package ftpclientinjava.ui;

/**
 *
 * @author MP
 */
public class StatusPanel extends javax.swing.JPanel {

    private StringBuilder sb = new StringBuilder("Not connected...");
    
    /**
     * 
     */
    public StatusPanel() {
        initComponents(); 
        
        StatusTextArea.append(sb.toString());
    }
    
    public void addText(String text) {
        
        StatusTextArea.setText("");
        sb.append("\n" + text);
        StatusTextArea.append(sb.toString());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        StatusTextArea = new javax.swing.JTextArea();

        setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText(null);
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        StatusTextArea.setColumns(20);
        StatusTextArea.setRows(5);
        jScrollPane1.setViewportView(StatusTextArea);

        jPanel1.add(jScrollPane1);

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea StatusTextArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
