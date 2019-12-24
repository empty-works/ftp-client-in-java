/*
 */
package ftpclientinjava.ui.uploader;

import java.io.File;
import java.util.Random;
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
        
        File[] files = fileRoot.listFiles();
        createChildren(fileRoot, root);
        
        return null;
    }
    
    @Override
    protected void done() {
        
        treeCreator.createTree();
    }
    
    private void createChildren(File fileRoot, 
            DefaultMutableTreeNode node) {

        File[] files = fileRoot.listFiles();
        
        if (files == null) return;

        for (File file : files) {

            DefaultMutableTreeNode childNode = 
                        new DefaultMutableTreeNode(new FileNode(file));
            
            if(file.isDirectory()) {
                
                node.add(childNode);
            }
            
            
            /*
            if (file.isDirectory()) {
                
                createChildren(file, childNode);
            }
            */
        }
    }
    
    private void setProgress() {
        
        // Progress for the ProgressBar
        // Taken from oracle docs example for ProgressBar
        Random random = new Random();
        int progress = 0;
        setProgress(0);
        while(progress < 100) {
            
            // Sleep for up to one second.
            try {
                
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException ignore) {
                
                
            }
            progress += random.nextInt(10);
            setProgress(Math.min(progress, 100));
        }
    }
}
