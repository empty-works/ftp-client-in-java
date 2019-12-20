/*
 */
package ftpclientinjava.ui;

import java.io.File;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MP
 */
public class UploaderUi extends javax.swing.JPanel {

    private DefaultMutableTreeNode root;
    private DefaultTreeModel treeModel;
    private JTree tree;

    public UploaderUi() {
        initComponents();
        
        initRoot(); 
        initTree();
   }
    
    private void initRoot() {
        
        File fileRoot = new File("C:/");
        root = new DefaultMutableTreeNode(fileRoot);
        treeModel = new DefaultTreeModel(root);
    }
    
    private void initTree() {
        
        tree = new JTree(treeModel);
        tree.setShowsRootHandles(true);
        JScrollPane treeScrollPane = new JScrollPane(tree);
        this.add(treeScrollPane);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setToolTipText(null);
        setOpaque(false);
        setLayout(new java.awt.GridLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
