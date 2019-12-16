/*
 */
package ftpclientinjava.ui;

import ftpclientinjava.LoginHandler;
import ftpclientinjava.beans.UserLoginInput;

/**
 *
 * @author MP
 */
public class LoginUi extends javax.swing.JPanel {

    private UserLoginInput userLogin;
    private LoginHandler login;
    
    /**
     * 
     */
    public LoginUi(UserLoginInput userLogin) {
        initComponents();
        
        this.userLogin = userLogin;
        login = new LoginHandler(userLogin);
        
    }
    
    private void setServer(String server) {
        
        
    }
    
    private void setUsername(String username) {
        
        
    }
    
    private void setPassword(String password) {
        
        
    }
    
    private void setPort(String port) {
        
        
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
        UsernameTextField = new javax.swing.JTextField();
        LogCon3 = new javax.swing.JPanel();
        PasswordLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        LogCon4 = new javax.swing.JPanel();
        PortLabel = new javax.swing.JLabel();
        PortTextField = new javax.swing.JTextField();
        LogCon5 = new javax.swing.JPanel();
        connectButton = new javax.swing.JButton();

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
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
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
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        LogCon2.add(UsernameLabel, gridBagConstraints);

        UsernameTextField.setToolTipText(null);
        UsernameTextField.setMinimumSize(new java.awt.Dimension(6, 19));
        UsernameTextField.setPreferredSize(new java.awt.Dimension(55, 6));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        LogCon2.add(UsernameTextField, gridBagConstraints);

        add(LogCon2);

        LogCon3.setToolTipText(null);
        LogCon3.setOpaque(false);
        LogCon3.setLayout(new java.awt.GridBagLayout());

        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PasswordLabel.setText("Password");
        PasswordLabel.setToolTipText(null);
        PasswordLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PasswordLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        LogCon3.add(PasswordLabel, gridBagConstraints);

        PasswordField.setToolTipText(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
        LogCon3.add(PasswordField, gridBagConstraints);

        add(LogCon3);

        LogCon4.setToolTipText(null);
        LogCon4.setOpaque(false);
        LogCon4.setLayout(new java.awt.GridBagLayout());

        PortLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PortLabel.setText("Port:");
        PortLabel.setToolTipText(null);
        PortLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        PortLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 0);
        LogCon4.add(PortLabel, gridBagConstraints);

        PortTextField.setToolTipText(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 100);
        LogCon4.add(PortTextField, gridBagConstraints);

        add(LogCon4);

        LogCon5.setToolTipText(null);
        LogCon5.setOpaque(false);
        LogCon5.setLayout(new java.awt.GridBagLayout());

        connectButton.setText("Connect");
        connectButton.setToolTipText(null);
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        LogCon5.add(connectButton, gridBagConstraints);

        add(LogCon5);
    }// </editor-fold>//GEN-END:initComponents

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        
        setServer(ServerTextField.getText());
        setUsername(UsernameTextField.getText());
        setPassword(PasswordField.getPassword().toString());
        setPort(PortTextField.getText());
    }//GEN-LAST:event_connectButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogCon1;
    private javax.swing.JPanel LogCon2;
    private javax.swing.JPanel LogCon3;
    private javax.swing.JPanel LogCon4;
    private javax.swing.JPanel LogCon5;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PortLabel;
    private javax.swing.JTextField PortTextField;
    private javax.swing.JLabel ServerLabel;
    private javax.swing.JTextField ServerTextField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JButton connectButton;
    // End of variables declaration//GEN-END:variables
}
