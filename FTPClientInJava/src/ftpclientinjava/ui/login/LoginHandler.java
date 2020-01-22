/*
 */
package ftpclientinjava.ui.login;

import ftpclientinjava.utilities.UserLoginInputSingleton;
import ftpclientinjava.Connection;
import ftpclientinjava.ui.StatusPanel;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author MP
 */
public class LoginHandler {
    
    private UserLoginInputSingleton userLogin;
    private String server;
    private String username;
    private String password;
    private int port;
    private Connection connection;
    private StatusPanel statusPanel;
    private static FTPClient ftpClient;
    private static boolean isConnected = false;
    
    public LoginHandler(UserLoginInputSingleton userLogin) {
        
        this.userLogin = userLogin;
    }
    
    public void login(StatusPanel statusPanel) throws IOException {
        
        this.statusPanel = statusPanel;
        this.server = userLogin.getServer();
        this.username = userLogin.getUsername();
        this.password = userLogin.getPassword();
        this.port = userLogin.getPort();
        
        statusPanel.addText("Logging in...");
        
        establishConnection();
        createFtpClient();
    }
    
    private void establishConnection() {
        
        connection = new Connection(username, password, server, port);
        statusPanel.addText("Logging in...");
    }
    
    private void createFtpClient() throws IOException {
        
        ftpClient = connection.getFTPClient(statusPanel);
    }
}
