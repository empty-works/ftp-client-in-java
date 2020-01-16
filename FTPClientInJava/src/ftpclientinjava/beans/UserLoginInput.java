/*
 */
package ftpclientinjava.beans;

/**
 *
 * @author MP
 */
public class UserLoginInput {
    
    public String server;
    public String username;
    public String password;
    public int port;
    
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
