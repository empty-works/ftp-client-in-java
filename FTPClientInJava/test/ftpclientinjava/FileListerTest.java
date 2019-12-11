/*
 */
package ftpclientinjava;

import ftpclientinjava.beans.FtpServerLogin;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.log4j.BasicConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockftpserver.fake.FakeFtpServer;
import org.mockftpserver.fake.UserAccount;
import org.mockftpserver.fake.filesystem.DirectoryEntry;
import org.mockftpserver.fake.filesystem.FileEntry;
import org.mockftpserver.fake.filesystem.FileSystem;
import org.mockftpserver.fake.filesystem.WindowsFakeFileSystem;

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

        
        
        fakeFtpServer = new FakeFtpServer();
        fakeFtpServer.setServerControlPort(0); // 0 to use a free port number.
        
        FileSystem fileSystem = new WindowsFakeFileSystem();
        fileSystem.add(new DirectoryEntry(FtpServerLogin.HOME_DIR));
        fileSystem.add(new FileEntry(FtpServerLogin.FILE1, FtpServerLogin.CONTENTS1));
        fileSystem.add(new FileEntry(FtpServerLogin.FILE2, FtpServerLogin.CONTENTS2));
        fakeFtpServer.setFileSystem(fileSystem);

        UserAccount userAccount = new UserAccount(
                FtpServerLogin.USER, FtpServerLogin.PASSWORD, FtpServerLogin.HOME_DIR);
        fakeFtpServer.addUserAccount(userAccount);
        
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
