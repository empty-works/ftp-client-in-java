/*
 */
package ftpclientinjava.ui.uploader;

import java.io.File;
import java.io.FileFilter;
import javax.swing.SwingWorker;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.ExpandVetoException;
import javax.swing.tree.TreePath;

/**
 *
 * @author MP
 */
public class ChildNodeCreator extends SwingWorker<Void, Void> implements 
        TreeWillExpandListener {
    
    private DefaultMutableTreeNode root;
    private File fileRoot;
    private TreeHandler treeCreator;
    
    public ChildNodeCreator(File fileRoot, 
            DefaultMutableTreeNode root, 
            TreeHandler treeCreator) {
        
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
        
        treeCreator.createTree(this);
    }
    
    private void createChildren(File fileRoot, 
            DefaultMutableTreeNode rootNode) {

        File[] files = fileRoot.listFiles(directoryOnlyFilter);
        
        if (files == null) return;

        for (File file : files) {

            DefaultMutableTreeNode childNode = 
                        new DefaultMutableTreeNode(new FileNode(file));
            
            rootNode.add(childNode);
            String[] childFiles = file.list();
            System.out.println("Number of child files: " + childFiles.length + " for " + file.toString());
            
            if(file.isDirectory() && childFiles.length > 0) {
                
                File dummyFile = new File("");
                childNode.add(new DefaultMutableTreeNode(new FileNode(dummyFile)));
                //createChildren(file, childNode);
            }
            
        }
    }
    
    FileFilter directoryOnlyFilter = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            
            return pathname.isDirectory();
        }
    };

    @Override
    public void treeWillExpand(TreeExpansionEvent event) throws ExpandVetoException {
        
        System.out.println("Expanded path: " + event.getPath());
        TreePath path = event.getPath();
        String stringPath = TreePathToStringConverter.getStringFilePath(path);
        File newFileRoot = new File(stringPath);
        System.out.println("newFileRoot: " + newFileRoot);
        DefaultMutableTreeNode newRoot = new DefaultMutableTreeNode(new FileNode(newFileRoot));
        System.out.println("newRoot value: " + newRoot);
        createChildren(newFileRoot, newRoot);
    }

    @Override
    public void treeWillCollapse(TreeExpansionEvent event) throws ExpandVetoException {
        
        
    }
}
