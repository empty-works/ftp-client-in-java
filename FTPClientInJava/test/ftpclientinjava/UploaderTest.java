/*
 */
package ftpclientinjava;

import ftpclientinjava.beans.FtpServerLogin;
import ftpclientinjava.unit_test.FakeFtpServerCreator;
import java.io.File;
import java.io.IOException;
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
public class UploaderTest {
    
    private FTPClient ftpclient;
    private FakeFtpServer fakeFtpServer;
    
    public UploaderTest() {
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
    public void tearDown() {
    }

    /**
     * Test of upload method, of class Uploader.
     */
    @Test
    public void testUpload() throws Exception {
        System.out.println("upload");
        File file = null;
        String path = "";
        Uploader instance = null;
        instance.upload(file, path);
    }
}
