/*
 */
package ftpclientinjava.utilities;

import ftpclientinjava.Uploader;
import ftpclientinjava.ui.StatusPanel;
import ftpclientinjava.ui.downloader.Downloader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
        
        // DELETE LOGINHANDLER CLASS
        
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
            
            Uploader instance = new Uploader(ftpClient);
            System.out.println("Uploader instance created...");
            instance.upload(file, path);
            
        } catch (IOException ex) {
            Logger.getLogger(FtpClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void downloadFile(String source, String destination) {
        
        try {
            
            Downloader instance = new Downloader(ftpClient);
            System.out.println("Downloader instance created...");
            instance.downloadFile(source, destination);
            
        } catch (IOException ex) {
            Logger.getLogger(FtpClientHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
