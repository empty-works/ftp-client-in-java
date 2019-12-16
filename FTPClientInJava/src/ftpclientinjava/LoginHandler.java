/*
 */
package ftpclientinjava;

import ftpclientinjava.beans.UserLoginInput;

/**
 *
 * @author MP
 */
public class LoginHandler {
    
    private UserLoginInput userLogin;
    private String server;
    private String username;
    private String password;
    private int port;
    
    public LoginHandler(UserLoginInput userLogin) {
        
        this.userLogin = userLogin;
    }

    /**
     * @return the server
     */
    public String getServer() {
        
        return server;
    }

    /**
     * @param server the server to set
     */
    public void setServer(String server) {
        
        this.server = server;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        
        this.password = password;
    }

    /**
     * @return the port
     */
    public int getPort() {
        
        return port;
    }

    /**
     * @param port the port to set
     */
    public void setPort(int port) {
        
        this.port = port;
    }
    
    
}
