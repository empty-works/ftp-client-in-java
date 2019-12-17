/*
 */
package ftpclientinjava;

import ftpclientinjava.beans.UserLoginInput;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author MP
 */
public class LoginHandler {
    
    private UserLoginInput userLogin = null; 
    private String server;
    private String username;
    private String password;
    private int port;
    private Connection connection;
    private FTPClient ftpClient;
    
    public LoginHandler(UserLoginInput userLogin) {
        
        this.userLogin = userLogin;
    }
    
    public void login() throws IOException {
        
        this.server = userLogin.server;
        this.username = userLogin.username;
        this.password = userLogin.password;
        this.port = userLogin.port;
        
        establishConnection();
        createFtpClient();
    }
    
    private void establishConnection() {
        
        connection = new Connection(username, password, server, port);
    }
    
    private void createFtpClient() throws IOException {
        
        ftpClient = connection.getFTPClient();
    }
}
