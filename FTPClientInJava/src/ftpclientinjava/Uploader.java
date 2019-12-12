/*
 */
package ftpclientinjava;

import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author MP
 */
public class Uploader {
    
    private FTPClient ftpclient;
    
    public Uploader(FTPClient ftpclient) {
        
        this.ftpclient = ftpclient;
    }
    
    
}
