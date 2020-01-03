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
        sb.append(TreeUi.systemPath);
        Object[] nodes = treePath.getPath();
        System.out.println("Converting " + treePath.toString() + "to ...");
        
        if(nodes.length > 1) { // Check if there are more nodes after the system user
            for(int i = 1; i < nodes.length; i++) { // Skip over system user because it is already included the string builder
            
            sb.append(File.separatorChar).append(nodes[i].toString());
            }
        }
        
        System.out.println("..." + sb.toString());
        return sb.toString();
    }
}
