/*
 */
package ftpclientinjava;

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
    
    private static final String USER = "TheAwesome12345";
    private static final String PASSWORD = "12345";
    private static final String HOME_DIR = "/";
    private static final String FILE = "/dir/test001.txt";
    private static final String CONTENTS = "This is just a test. Please work.";
    
    public FileListerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
         
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getListFiles method, of class FileLister.
     */
    @Test
    public void testGetListFiles() throws Exception {
        System.out.println("getListFiles");
        String path = "";
        FileLister instance = null;
        Collection<String> expResult = null;
        Collection<String> result = instance.getListFiles(path);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
