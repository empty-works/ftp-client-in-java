/*
 */
package ftpclientinjava.ui.uploader;

import java.awt.Component;
import java.io.File;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
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
    private ChildNodeCreator childNodeCreator;

    public UploaderUi() {
        initComponents();
    }
    
    public void initAll() {
        
        initRoot(); 
        createChildNodes();
    }
    
    private void initRoot() {
        
        fileRoot = new File(System.getProperty("user.home"));
        root = new DefaultMutableTreeNode(new FileNode(fileRoot));
        treeModel = new DefaultTreeModel(root);
    }

    private void createChildNodes() {
        
        childNodeCreator = new ChildNodeCreator(fileRoot, root, this);
        childNodeCreator.execute();
    }
    
    @Override
    public void createTree() {
        
        tree = new JTree(treeModel);
        tree.setShowsRootHandles(true);
        tree.setCellRenderer(new MyTreeCellRenderer());
        JScrollPane treeScrollPane = new JScrollPane(tree);
        TreeContainer.add(treeScrollPane);
        TreeContainer.revalidate();
        TreeContainer.repaint();
    }
    
    @Override
    public void doneCreatingTree() {
        
        
    }
    
    private static class MyTreeCellRenderer extends DefaultTreeCellRenderer {
        
        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
            super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

            // decide what icons you want by examining the node
            if (value instanceof DefaultMutableTreeNode) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
                if (node.getUserObject() instanceof String) {
                    // your root node, since you just put a String as a user object                    
                    setIcon(UIManager.getIcon("FileView.computerIcon"));
                } else if (node.getUserObject() instanceof FileNode) {
                    // decide based on some property of your Contact obj
                    FileNode file = (FileNode)  node.getUserObject();
                    if (file.isFileDirectory()) {
                        setIcon(UIManager.getIcon("FileView.directoryIcon"));
                    } else {
                        setIcon(UIManager.getIcon("FileView.fileIcon"));
                    }
                }
            }

            return this;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        TreeContainer = new javax.swing.JPanel();

        setToolTipText(null);
        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        TreeContainer.setToolTipText(null);
        TreeContainer.setOpaque(false);
        TreeContainer.setLayout(new java.awt.GridLayout(1, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(TreeContainer, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TreeContainer;
    // End of variables declaration//GEN-END:variables
  
}
