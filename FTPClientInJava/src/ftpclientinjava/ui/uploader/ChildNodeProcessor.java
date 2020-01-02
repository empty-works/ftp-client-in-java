/*
 */
package ftpclientinjava.ui.uploader;

import java.io.File;
import java.util.List;
import javax.swing.JTree;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author MP
 */
public class ChildNodeProcessor extends SwingWorker<Void, File>{

    private DefaultMutableTreeNode node;
    private FileSystemView fileSystemView;
    private JTree tree;
    
    public ChildNodeProcessor(final DefaultMutableTreeNode node, 
            FileSystemView fileSystemView, 
            JTree tree) {
        
        this.node = node;
        this.fileSystemView = fileSystemView;
        this.tree = tree;
    }
    
    @Override
    protected Void doInBackground() throws Exception {
        
        File file = (File) node.getUserObject();
        if (file.isDirectory()) {
            File[] files = fileSystemView.getFiles(file, true); //!!
            if (node.isLeaf()) {
                for (File child : files) {
                    if (child.isDirectory()) {
                        publish(child);
                    }
                }
            }
        }
        return null;
    }
    
    @Override
    protected void process(List<File> chunks) {
        for (File child : chunks) {
            node.add(new DefaultMutableTreeNode(child));
        }
    }

    @Override
    protected void done() {
        tree.setEnabled(true);
    }
}
