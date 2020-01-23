/*
 */
package ftpclientinjava;

import ftpclientinjava.beans.TestFtpServerLogin;
import ftpclientinjava.unit_test.FakeFtpServerCreator;
import ftpclientinjava.utilities.FtpClientHandler;
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
    private FtpClientHandler ftpClient;
    
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
        
        ftpClient.setUsername(TestFtpServerLogin.USER);
        ftpClient.setPassword(TestFtpServerLogin.PASSWORD);
        ftpClient.setServer("localhost");
        ftpClient.setPort(fakeFtpServer.getServerControlPort());
        
        /*
        Connection con = new Connection(
                TestFtpServerLogin.USER, TestFtpServerLogin.PASSWORD, "localhost", port);
        ftpclient = con.getFTPClient();
        */
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
        String source = TestFtpServerLogin.FILE1;
        String destination = "downloaded_test001.txt";
        ftpClient.downloadFile(source, destination);
        ftpClient.disconnect();
        //Downloader instance = new Downloader(ftpclient);
        //instance.downloadFile(source, destination);
        ftpclient.disconnect();
        fakeFtpServer.stop();
        assertThat(new File(destination), anExistingFile());
    }
    
}
