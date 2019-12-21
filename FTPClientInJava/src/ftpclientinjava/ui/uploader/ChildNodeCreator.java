/*
 */
package ftpclientinjava.ui.uploader;

import java.io.File;
import javax.swing.SwingWorker;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author MP
 */
public class ChildNodeCreator extends SwingWorker<Boolean, Void> {
    
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
    
    /*
    @Override
    public void run() {
        
        createChildren(fileRoot, root);
    }
    */
    
    private void createChildren(File fileRoot, 
            DefaultMutableTreeNode node) {

        File[] files = fileRoot.listFiles();
        if (files == null) return;

        for (File file : files) {
            
            DefaultMutableTreeNode childNode = 
                        new DefaultMutableTreeNode(new FileNode(file));
                node.add(childNode);
            
            if (file.isDirectory()) {
                
                createChildren(file, childNode);
            }
        }
    }

    @Override
    public Boolean doInBackground() throws Exception {
        
        createChildren(fileRoot, root);
        return true;
    }
    
    @Override
    protected void done() {
        
        treeCreator.createTree();
    }
}
