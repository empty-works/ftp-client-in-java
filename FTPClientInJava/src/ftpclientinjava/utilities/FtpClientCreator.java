/*
 */
package ftpclientinjava.utilities;

import ftpclientinjava.Connection;
import ftpclientinjava.ui.StatusPanel;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author MP
 */
public class FtpClientCreator {
    
   public final static FTPClient get(StatusPanel statusPanel) {
       
       FTPClient ftpClient = null;
       
       Connection connection = new Connection(username, password, server, port);
       
       return ftpClient;
   }
}
