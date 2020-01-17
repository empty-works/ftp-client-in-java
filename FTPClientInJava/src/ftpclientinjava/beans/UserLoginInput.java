/*
 */
package ftpclientinjava.beans;

/**
 *
 * @author MP
 */
public class UserLoginInput {
    
    private String server;
    private String username;
    private String password;
    private int port;
    
    public void setServer(String server) {
        this.server = server;
    }
    
    public String getServer() {
        return server;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPort(int port) {
        this.port = port;
    }
    
    public int getPort() {
        return port;
    }
}
