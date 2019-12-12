/*
 */
package ftpclientinjava;

import ftpclientinjava.beans.FtpServerLogin;
import ftpclientinjava.unit_test.FakeFtpServerCreator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockftpserver.fake.FakeFtpServer;

/**
 *
 * @author MP
 */
public class FileListerTest {
    
    private FTPClient ftpclient;
    private FakeFtpServer fakeFtpServer;
    
    public FileListerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws IOException {

        fakeFtpServer = FakeFtpServerCreator.getFakeFtpServer();
        fakeFtpServer.start();
        int port = fakeFtpServer.getServerControlPort();
        
        Connection con = new Connection(
                FtpServerLogin.USER, FtpServerLogin.PASSWORD, "localhost", port);
        ftpclient = con.getFTPClient();
    }
    
    @After
    public void tearDown() throws IOException {
        
        
    }

    /**
     * Test of getListFiles method, of class FileLister.
     */
    @Test
    public void testGetListFiles() throws Exception {
        System.out.println("getListFiles");
        String path = FtpServerLogin.HOME_DIR;
        FileLister instance = new FileLister(ftpclient);
        Collection<String> expResult = new ArrayList();
        expResult.add(FtpServerLogin.FILENAME1);
        expResult.add(FtpServerLogin.FILENAME2);
        Collection<String> result = instance.getListFiles(path);
        ftpclient.disconnect();
        fakeFtpServer.stop();
        assertEquals(expResult, result);  
    }
}
