/*
 */
package ftpclientinjava.ui.downloader;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author MP
 */
public class Downloader {
    
    private FTPClient ftpClient;
    
    public Downloader(FTPClient ftpClient) {
        
        this.ftpClient = ftpClient;
    }
    
    public void downloadFile(String source, String destination) throws IOException {
        
        FileOutputStream out = new FileOutputStream(destination);
        ftpClient.retrieveFile(source, out);
    }
}
