/*
 */
package ftpclientinjava;

import ftpclientinjava.ui.StatusPanel;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;

/**
 *
 * @author MP
 */
public class Connection {
    
    private String username;
    private String password;
    private String server;
    private int port;
    
    private FTPClient ftpClient = new FTPClient();
    
    /***************************************************************************
     * 
     * @param username
     * @param password
     * @param server
     * @param port 
     */
    public Connection(String username, String password, String server, int port) {
        
        this.username = username;
        this.password = password;
        this.server = server;
        this.port = port;
    }
    
    public FTPClient getFTPClient() throws IOException {
        
        ftpClient.connect(server, port);
        int reply = ftpClient.getReplyCode();
        if(!FTPReply.isPositiveCompletion(reply)) {
            ftpClient.disconnect();
            throw new IOException("Exception in connecting to FTP server");
        }
        
        ftpClient.login(username, password);
        return ftpClient;
    }
    
    public FTPClient getFTPClient(StatusPanel statusPanel) throws IOException {
        
        ftpClient.connect(server, port);
        int reply = ftpClient.getReplyCode();
        if(!FTPReply.isPositiveCompletion(reply)) {
            ftpClient.disconnect();
            statusPanel.addText("Cannot connect to server...");
            throw new IOException("Exception in connecting to FTP server");
        }
        
        ftpClient.login(username, password);
        statusPanel.addText("Waiting for welcome string...");
        statusPanel.addText("From server: " + ftpClient.getReplyString());
        statusPanel.addText("Successfully connected to server...");
        return ftpClient;
    }
}
