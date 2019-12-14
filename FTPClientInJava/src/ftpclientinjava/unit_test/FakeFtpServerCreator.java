/*
 */
package ftpclientinjava.unit_test;

import ftpclientinjava.beans.TestFtpServerLogin;
import org.apache.log4j.BasicConfigurator;
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
public class FakeFtpServerCreator {
    
    public static FakeFtpServer getFakeFtpServer() {
        
        BasicConfigurator.configure();
        
        FakeFtpServer fakeFtpServer = new FakeFtpServer();
        fakeFtpServer.setServerControlPort(0); // 0 to use a free port number.
        
        FileSystem fileSystem = new WindowsFakeFileSystem();
        fileSystem.add(new DirectoryEntry(TestFtpServerLogin.HOME_DIR));
        fileSystem.add(new FileEntry(TestFtpServerLogin.FILE1, TestFtpServerLogin.CONTENTS1));
        fileSystem.add(new FileEntry(TestFtpServerLogin.FILE2, TestFtpServerLogin.CONTENTS2));
        fakeFtpServer.setFileSystem(fileSystem);

        UserAccount userAccount = new UserAccount(
                TestFtpServerLogin.USER, TestFtpServerLogin.PASSWORD, TestFtpServerLogin.HOME_DIR);
        fakeFtpServer.addUserAccount(userAccount);
        
        return fakeFtpServer;
    }
}
