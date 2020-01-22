/*
 */
package ftpclientinjava.utilities;

/**
 *
 * @author MP
 */
public class FtpClientHandler {
    
    private String server;
    private String username;
    private String password;
    private int port;
    private 
    
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
    
    public void login() {
        
        
    }
    
    private void 
}
