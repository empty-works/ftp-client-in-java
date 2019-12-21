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
        
        fileRoot = new File(System.getProperty("user.home"));
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
    
    @Override
    public void setPropertyChange() {
        
        
    }
    
    @Override
    public void doneCreatingTree() {
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        ProgressBarContainer = new javax.swing.JPanel();
        TreeContainer = new javax.swing.JPanel();

        setToolTipText(null);
        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        ProgressBarContainer.setToolTipText(null);
        ProgressBarContainer.setOpaque(false);
        ProgressBarContainer.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(ProgressBarContainer, gridBagConstraints);

        TreeContainer.setToolTipText(null);
        TreeContainer.setOpaque(false);
        TreeContainer.setLayout(new java.awt.GridLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        add(TreeContainer, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ProgressBarContainer;
    private javax.swing.JPanel TreeContainer;
    // End of variables declaration//GEN-END:variables
}
