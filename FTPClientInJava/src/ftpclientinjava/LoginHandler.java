/*
 */
package ftpclientinjava;

import ftpclientinjava.beans.UserLoginInput;

/**
 *
 * @author MP
 */
public class LoginHandler {
    
    private UserLoginInput userLogin = null;
    private String server;
    private String username;
    private String password;
    private int port;
    
    public LoginHandler(UserLoginInput userLogin) {
        
        this.userLogin = userLogin;
    }
    
    public void login() {
        
        this.server = userLogin.server;
        this.username = userLogin.username;
        this.password = userLogin.password;
        this.port = userLogin.port;
    }

    /**
     * @return the server
     */
    public String getServer() {
        
        return server;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        
        return password;
    }

    /**
     * @return the port
     */
    public int getPort() {
        
        return port;
    }
}
