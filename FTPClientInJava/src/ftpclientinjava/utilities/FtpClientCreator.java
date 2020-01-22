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
       UserLoginInputSingleton login = UserLoginInputSingleton.getInstance();
       
       Connection connection = new 
        Connection(
                login.getUsername(), 
                login.getPassword(), 
                login.getPassword(), 
                login.getPort());
       
       
       
       return ftpClient;
   }
}
