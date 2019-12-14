/*
 */
package ftpclientinjava.ui;

/**
 *
 * @author MP
 */
public class LoginUi extends javax.swing.JPanel {

    /**
     * 
     */
    public LoginUi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        LogCon1 = new javax.swing.JPanel();
        ServerLabel = new javax.swing.JLabel();
        ServerTextField = new javax.swing.JTextField();
        LogCon2 = new javax.swing.JPanel();
        UsernameLabel = new javax.swing.JLabel();
        UsernameTextField1 = new javax.swing.JTextField();
        LogCon3 = new javax.swing.JPanel();
        LogCon4 = new javax.swing.JPanel();
        LogCon5 = new javax.swing.JPanel();

        setToolTipText(null);
        setLayout(new java.awt.GridLayout(1, 5));

        LogCon1.setToolTipText(null);
        LogCon1.setOpaque(false);
        LogCon1.setLayout(new java.awt.GridBagLayout());

        ServerLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ServerLabel.setText("Server:");
        ServerLabel.setToolTipText(null);
        ServerLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        ServerLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        LogCon1.add(ServerLabel, gridBagConstraints);

        ServerTextField.setToolTipText(null);
        ServerTextField.setMinimumSize(new java.awt.Dimension(6, 19));
        ServerTextField.setPreferredSize(new java.awt.Dimension(55, 6));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        LogCon1.add(ServerTextField, gridBagConstraints);

        add(LogCon1);

        LogCon2.setToolTipText(null);
        LogCon2.setOpaque(false);
        LogCon2.setLayout(new java.awt.GridBagLayout());

        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsernameLabel.setText("Username:");
        UsernameLabel.setToolTipText(null);
        UsernameLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        UsernameLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        LogCon2.add(UsernameLabel, gridBagConstraints);

        UsernameTextField1.setToolTipText(null);
        UsernameTextField1.setMinimumSize(new java.awt.Dimension(6, 19));
        UsernameTextField1.setPreferredSize(new java.awt.Dimension(55, 6));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        LogCon2.add(UsernameTextField1, gridBagConstraints);

        add(LogCon2);

        LogCon3.setToolTipText(null);
        LogCon3.setOpaque(false);
        LogCon3.setLayout(new java.awt.GridBagLayout());
        add(LogCon3);

        LogCon4.setToolTipText(null);
        LogCon4.setOpaque(false);
        LogCon4.setLayout(new java.awt.GridBagLayout());
        add(LogCon4);

        LogCon5.setToolTipText(null);
        LogCon5.setOpaque(false);
        LogCon5.setLayout(new java.awt.GridBagLayout());
        add(LogCon5);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogCon1;
    private javax.swing.JPanel LogCon2;
    private javax.swing.JPanel LogCon3;
    private javax.swing.JPanel LogCon4;
    private javax.swing.JPanel LogCon5;
    private javax.swing.JLabel ServerLabel;
    private javax.swing.JTextField ServerTextField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField1;
    // End of variables declaration//GEN-END:variables
}
