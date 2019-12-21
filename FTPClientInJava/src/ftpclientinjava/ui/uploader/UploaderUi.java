/*
 */
package ftpclientinjava.ui.uploader;

import java.io.File;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MP
 */
public class UploaderUi extends javax.swing.JPanel implements TreeCreator {

    private DefaultMutableTreeNode root;
    private DefaultTreeModel treeModel;
    private JTree tree;
    private File fileRoot;

    public UploaderUi() {
        initComponents();
        
        
    }
    
    public void initAll() {
        
        initRoot(); 
        createChildNodes();
    }
    
    private void initRoot() {
        
        fileRoot = new File("G:/");
        root = new DefaultMutableTreeNode(new FileNode(fileRoot));
        treeModel = new DefaultTreeModel(root);
    }

    private void createChildNodes() {
        
        ChildNodeCreator cnc = new ChildNodeCreator(fileRoot, root, this);
        cnc.execute();
    }
    
    @Override
    public void createTree() {
        
        tree = new JTree(treeModel);
        tree.setShowsRootHandles(true);
        tree.setRootVisible(true);
        JScrollPane treeScrollPane = new JScrollPane(tree);
        this.add(treeScrollPane);
        this.revalidate();
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setToolTipText(null);
        setOpaque(false);
        setLayout(new java.awt.GridLayout(1, 0));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
