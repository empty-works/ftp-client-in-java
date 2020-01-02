/*
 */
package ftpclientinjava.ui.uploader;

import java.io.File;
import java.io.FileFilter;
import java.util.Collections;
import java.util.Vector;
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
    private TreeHandler treeHandler;
    
    public ChildNodeCreator(File fileRoot, 
            DefaultMutableTreeNode root, 
            TreeHandler treeCreator) {
        
        this.fileRoot = fileRoot;
        this.root = root;
        this.treeHandler = treeCreator;
    }

    @Override
    public Void doInBackground() throws Exception {
        
        addChildren(fileRoot, root);
        return null;
    }
    
    @Override
    protected void done() {
        
        
    }
    
    private void addChildren(File dirRoot, DefaultMutableTreeNode currentTopNode) {

        String currentPath = dirRoot.getPath();
        DefaultMutableTreeNode currentDir = new DefaultMutableTreeNode(currentPath);
        if(currentTopNode != null) {
            
            currentTopNode.add(currentDir);
        }
        
        Vector oldList = new Vector();
        String[] temp = dirRoot.list();
        for(int i = 0; i < temp.length; i++) {
            
            oldList.addElement(temp[i]);
        }
        Collections.sort(oldList, String.CASE_INSENSITIVE_ORDER);
        
        File file;
        
        Vector files = new Vector();
        // Make two passes, one for directories and one for files.
        // Pass for directories.
        for(int i = 0; i < oldList.size(); i++) {
            
            String thisObject = (String) oldList.elementAt(i);
            String newPath;
            if(currentPath.equals(".")) {
                
                newPath = thisObject;
            }
            else {
                
                newPath = currentPath + File.separator + thisObject;
            }
            if((file = new File(newPath)).isDirectory()) {
                
                // Recursion for directory.
                System.out.println("Adding children to directory..." + file);
                addChildren(file, currentDir);
            }
            /*
            else {
                // Add to files vector for later processing.
                System.out.println("Adding file..." + file);
                files.addElement(thisObject);
            }
            */
        }
        
        // Pass for files.
        /*
        for(int fnum = 0; fnum < files.size(); fnum++) {
            
            currentDir.add(new DefaultMutableTreeNode(files.elementAt(fnum)));
        }
        */
        
        /*
        File[] files = fileRoot.listFiles(directoryOnlyFilter);
        
        if (files == null) return;

        for (File file : files) {

            DefaultMutableTreeNode childNode = 
                    new DefaultMutableTreeNode(new FileNode(file));
            
            rootNode.add(childNode);
            //String[] childFiles = file.list();
            //System.out.println("Number of child files: " + childFiles.length + 
            //        " for " + file.toString());
            
            if(file.isDirectory() && childFiles.length > 0) {
                
                File dummyFile = new File("");
                childNode.add(new DefaultMutableTreeNode(new FileNode(dummyFile)));
            }
        }
    */
    }
    
    private void insertNode(File fileRoot, DefaultMutableTreeNode rootNode) {
        
        File[] files = fileRoot.listFiles(directoryOnlyFilter);
        
        for (File file : files) {

            DefaultMutableTreeNode childNode = 
                    new DefaultMutableTreeNode(new FileNode(file));
            
            treeHandler.updateTree(childNode, rootNode, rootNode.getChildCount());
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
        //insertNode(newFileRoot, newRoot);
    }

    @Override
    public void treeWillCollapse(TreeExpansionEvent event) throws ExpandVetoException {
        
        
    }
}
