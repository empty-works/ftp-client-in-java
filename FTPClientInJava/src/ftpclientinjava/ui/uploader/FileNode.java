/*
 */
package ftpclientinjava.ui.uploader;

import java.io.File;

/**
 *
 * @author MP
 */
public class FileNode {
    
    private File file;
    
    public FileNode(File file) {
        
        this.file = file;
    }
    
    @Override
    public String toString() {
        
        String name = file.getName();
        if(name.equals("")) {
            
            return file.getAbsolutePath();
        } else {
            
            return name;
        }
    }
}
