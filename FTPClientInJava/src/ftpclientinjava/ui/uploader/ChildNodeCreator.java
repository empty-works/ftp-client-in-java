/*
 */
package ftpclientinjava.ui.uploader;

import java.io.File;
import java.io.FileFilter;
import javax.swing.SwingWorker;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author MP
 */
public class ChildNodeCreator extends SwingWorker<Void, Void> {
    
    private DefaultMutableTreeNode root;
    private File fileRoot;
    private TreeCreator treeCreator;
    
    public ChildNodeCreator(File fileRoot, 
            DefaultMutableTreeNode root, 
            TreeCreator treeCreator) {
        
        this.fileRoot = fileRoot;
        this.root = root;
        this.treeCreator = treeCreator;
    }

    @Override
    public Void doInBackground() throws Exception {
        
        createChildren(fileRoot, root);
        return null;
    }
    
    @Override
    protected void done() {
        
        treeCreator.createTree();
    }
    
    private void createChildren(File fileRoot, 
            DefaultMutableTreeNode node) {

        File[] files = fileRoot.listFiles(directoryOnlyFilter);
        
        if (files == null) return;

        for (File file : files) {

            DefaultMutableTreeNode childNode = 
                        new DefaultMutableTreeNode(new FileNode(file));
            
            node.add(childNode);
            if(file.isDirectory()) {
                
                //node.add(childNode);
                createChildren(file, childNode);
            }
        }
    }
    
    FileFilter directoryOnlyFilter = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            
            return pathname.isDirectory();
        }
    };
}
