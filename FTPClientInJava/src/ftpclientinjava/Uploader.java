/*
 */
package ftpclientinjava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
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
    
    public void upload(File file, String path) throws IOException {
        
        ftpclient.storeFile(path, new FileInputStream(file));
    }
}
