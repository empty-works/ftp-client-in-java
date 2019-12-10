/*
 */
package ftpclientinjava;

import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author MP
 */
public class FileLister {
    
    private FTPClient ftpClient;
    
    public FileLister(FTPClient ftpClient) {
        
        this.ftpClient = ftpClient;
    }
}
