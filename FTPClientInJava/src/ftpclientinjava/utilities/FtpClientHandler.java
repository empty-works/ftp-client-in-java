/*
 */
package ftpclientinjava.utilities;

import ftpclientinjava.ui.StatusPanel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

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
        
        connectToServer();
        try {
            
            ftpClient.login(username, password);
            statusPanel.addText("Waiting for welcome string...");
            statusPanel.addText("From server: " + ftpClient.getReplyString());
            statusPanel.addText("Successfully connected to server...");
        } catch (IOException ex) {
            Logger.getLogger(FtpClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void connectToServer() {
        
        try {
            ftpClient.connect(server, port);
            int reply = ftpClient.getReplyCode();
            if(!FTPReply.isPositiveCompletion(reply)) {
                ftpClient.disconnect();
                statusPanel.addText("Cannot connect to server...");
                throw new IOException("Exception in connecting to FTP server");
            }
        } catch (IOException ex) {
            Logger.getLogger(FtpClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void disconnect() {
        
        try {
            ftpClient.disconnect();
        } catch (IOException ex) {
            Logger.getLogger(FtpClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void uploadFile(String path, File file) {
        
        try {
            ftpClient.storeFile(path, new FileInputStream(file));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FtpClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FtpClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
