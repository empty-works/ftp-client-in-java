/*
 */
package ftpclientinjava;

import java.io.File;
import static org.hamcrest.io.FileMatchers.anExistingFile;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MP
 */
public class DownloaderTest {
    
    public DownloaderTest() {
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
