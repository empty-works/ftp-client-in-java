/*
 * 
 */
package ftpclientinjava.ui.uploader;

import java.io.File;
import javax.swing.tree.TreePath;

/**
 *
 * @author MP
 */
public class TreePathToStringConverter {
   
    public static String getStringFilePath(TreePath treePath) {
        
        StringBuilder sb = new StringBuilder();
        Object[] nodes = treePath.getPath();
        for(int i = 0; i < nodes.length; i++) {
            
            sb.append(File.separatorChar).append(nodes[i].toString());
        }
        return sb.toString();
    }
}
