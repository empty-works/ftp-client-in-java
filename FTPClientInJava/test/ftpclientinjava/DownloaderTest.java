/*
 */
package ftpclientinjava;

import ftpclientinjava.beans.FtpServerLogin;
import ftpclientinjava.unit_test.FakeFtpServerCreator;
import java.io.File;
import java.io.IOException;
import org.apache.commons.net.ftp.FTPClient;
import static org.hamcrest.io.FileMatchers.anExistingFile;
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
public class DownloaderTest {
    
    private FTPClient ftpclient;
    private FakeFtpServer fakeFtpServer;
    
    public DownloaderTest() {
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
     * Test of downloadFile method, of class Downloader.
     */
    @Test
    public void testDownloadFile() throws Exception {
        System.out.println("downloadFile");
        String source = "";
        String destination = "";
        Downloader instance = null;
        instance.downloadFile(source, destination);
        assertThat(new File(destination), anExistingFile());
    }
    
}
