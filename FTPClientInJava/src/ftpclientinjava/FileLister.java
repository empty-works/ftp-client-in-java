/*
 */
package ftpclientinjava;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;

/**
 *
 * @author MP
 */
public class FileLister {
    
    private FTPClient ftpClient;
    
    public FileLister(FTPClient ftpClient) {
        
        this.ftpClient = ftpClient;
    }
    
    public Collection<String> getListFiles(String path) throws IOException {
        
        FTPFile[] files = ftpClient.listFiles(path);
        return Arrays.stream(files)
                .map(FTPFile::getName)
                .collect(Collectors.toList());
    }
}
