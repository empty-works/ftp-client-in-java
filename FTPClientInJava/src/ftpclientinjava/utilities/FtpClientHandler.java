/*
 */
package ftpclientinjava.utilities;

import ftpclientinjava.ui.StatusPanel;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author MP
 */
public class FtpClientHandler {
    
    private String server;
    private String username;
    private String password;
    private int port;
    private StatusPanel statusPanel;
    private FTPClient ftpClient = new FTPClient();
    
    private static FtpClientHandler login_instance = null;
    
    private FtpClientHandler() {
        
        
    }
    
    public static FtpClientHandler getInstance() {
        
        if(login_instance == null) {
            
            login_instance = new FtpClientHandler();
        }
        
        return login_instance;
    }
    
    public void setServer(String server) {
        this.server = server;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setPort(int port) {
        this.port = port;
    }
    
    public void setStatusPanel(StatusPanel statusPanel) {
        
        this.statusPanel = statusPanel;
    }
    
    public void loginToServer() {
        
        
    }
    
    private void connectToServer() {
        
        
    }
}
