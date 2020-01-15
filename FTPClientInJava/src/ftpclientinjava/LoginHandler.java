/*
 */
package ftpclientinjava;

import ftpclientinjava.beans.UserLoginInput;
import ftpclientinjava.ui.StatusPanel;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author MP
 */
public class LoginHandler {
    
    private UserLoginInput userLogin;
    private String server;
    private String username;
    private String password;
    private int port;
    private Connection connection;
    private StatusPanel statusPanel;
    private static FTPClient ftpClient;
    private static boolean isConnected = false;
    
    public LoginHandler(UserLoginInput userLogin) {
        
        this.userLogin = userLogin;
    }
    
    public void login(StatusPanel statusPanel) throws IOException {
        
        this.statusPanel = statusPanel;
        this.server = userLogin.server;
        this.username = userLogin.username;
        this.password = userLogin.password;
        this.port = userLogin.port;
        
        statusPanel.addText("Logging in...");
        
        establishConnection();
        createFtpClient();
    }
    
    private void establishConnection() {
        
        connection = new Connection(username, password, server, port);
        statusPanel.addText("Connecting...");
    }
    
    private void createFtpClient() throws IOException {
        
        ftpClient = connection.getFTPClient(statusPanel);
    }
}
