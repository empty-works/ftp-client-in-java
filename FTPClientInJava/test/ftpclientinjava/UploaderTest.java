/*
 */
package ftpclientinjava;

import ftpclientinjava.beans.TestFtpServerLogin;
import ftpclientinjava.unit_test.FakeFtpServerCreator;
import ftpclientinjava.utilities.FtpClientHandler;
import java.io.File;
import java.io.IOException;
import static org.hamcrest.CoreMatchers.is;
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
    
    private FakeFtpServer fakeFtpServer;
    private FtpClientHandler ftpClient = FtpClientHandler.getInstance();
    
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
        
        ftpClient.setUsername(TestFtpServerLogin.USER);
        ftpClient.setPassword(TestFtpServerLogin.PASSWORD);
        ftpClient.setServer("localhost");
        ftpClient.setPort(fakeFtpServer.getServerControlPort());
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
        File file = new File(getClass().getClassLoader().getResource("uploadTest.txt").toURI());
        String path = TestFtpServerLogin.HOME_DIR + "uploaderTest.txt";
        
        ftpClient.uploadFile(path, file);
        ftpClient.disconnect();
        fakeFtpServer.stop();
        assertThat(fakeFtpServer.getFileSystem().exists(path), is(true));
    }
}
