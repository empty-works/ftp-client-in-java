/*
 */
package ftpclientinjava;

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
    
    
}
