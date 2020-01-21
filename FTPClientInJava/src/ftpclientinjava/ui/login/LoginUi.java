/*
 */
package ftpclientinjava.ui.login;

import ftpclientinjava.FTPFrame;
import ftpclientinjava.ui.document_filters.PortIntFilter;
import ftpclientinjava.ui.StatusPanel;
import ftpclientinjava.ui.document_filters.CompositeFiltersFilter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.PlainDocument;

/**
 *
 * @author MP
 */
public class LoginUi extends javax.swing.JPanel {

    private UserLoginInputSingleton userLogin = new UserLoginInputSingleton();
    public static LoginHandler loginHandler;
    private StatusPanel statusPanel;
    
    
    /**
     * 
     */
    public LoginUi(StatusPanel statusPanel) {
        initComponents();
        
        this.userLogin = userLogin;
        this.statusPanel = statusPanel;
        setPortFilters();
    }
    
    private void setPortFilters() {
        
        PlainDocument doc = (PlainDocument) PortTextField.getDocument();
        doc.setDocumentFilter(new CompositeFiltersFilter(
                new PortIntFilter()/*, new NumLimitFilter()*/));
    }
    
    private void setServer(String server) {
        
        try {
            
            System.out.println("Server: " + server);
            userLogin.setServer(server);
        } catch(NullPointerException npe) {
            
            Logger.getLogger(FTPFrame.class.getName()).log(Level.SEVERE, null, npe);
            statusPanel.addText("Server not found!");
        } 
    }
    
    private void setUsername(String username) {
        
        userLogin.setUsername(username);
    }
    
    private void setPassword(String password) {
        
        userLogin.setPassword(password);
    }
    
    private void setPort(String port) {
        
        if(!port.equals("")) {
            
            userLogin.setPort(Integer.parseInt(port));
        }        
    }
    
    private void sendToLoginHandler() throws IOException {
        
        loginHandler = new LoginHandler(userLogin);
        loginHandler.login(statusPanel);
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
        ResetButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 185, 150));
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

        PortTextField.setColumns(4);
        PortTextField.setText("21");
        PortTextField.setToolTipText(null);
        PortTextField.setMinimumSize(new java.awt.Dimension(250, 19));
        PortTextField.setPreferredSize(new java.awt.Dimension(250, 19));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 5, 5);
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
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 30, 5, 30);
        LogCon5.add(connectButton, gridBagConstraints);

        ResetButton.setText("Reset");
        ResetButton.setToolTipText(null);
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 5, 5);
        LogCon5.add(ResetButton, gridBagConstraints);

        add(LogCon5);
    }// </editor-fold>//GEN-END:initComponents

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        
        setServer(ServerTextField.getText());
        setUsername(UsernameTextField.getText());
        setPassword(PasswordField.getPassword().toString());
        setPort(PortTextField.getText());
        try {
            sendToLoginHandler();
        } catch (IOException ex) {
            Logger.getLogger(LoginUi.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(
                    LoginUi.this, ex, "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_connectButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
        
        ServerTextField.setText("");
        UsernameTextField.setText("");
        PasswordField.setText("");
        PortTextField.setText("21");
    }//GEN-LAST:event_ResetButtonActionPerformed


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
    private javax.swing.JButton ResetButton;
    private javax.swing.JLabel ServerLabel;
    private javax.swing.JTextField ServerTextField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JTextField UsernameTextField;
    private javax.swing.JButton connectButton;
    // End of variables declaration//GEN-END:variables
}
