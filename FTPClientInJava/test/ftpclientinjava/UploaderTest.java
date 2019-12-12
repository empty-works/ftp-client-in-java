/*
 */
package ftpclientinjava;

import java.io.File;
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
public class UploaderTest {
    
    public UploaderTest() {
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
     * Test of upload method, of class Uploader.
     */
    @Test
    public void testUpload() throws Exception {
        System.out.println("upload");
        File file = null;
        String path = "";
        Uploader instance = null;
        instance.upload(file, path);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
