/*
 */
package ftpclientinjava.ui.uploader;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.File;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MP
 */
public class UploaderUi extends javax.swing.JPanel implements TreeCreator, 
        PropertyChangeListener {

    private DefaultMutableTreeNode root;
    private DefaultTreeModel treeModel;
    private JTree tree;
    private File fileRoot;
    private ChildNodeCreator childNodeCreator;
    private boolean isTreeDoneLoading = false;

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
        if(root.getAllowsChildren()) {
            
            root.add(new DefaultMutableTreeNode("folder always"));
        }
        else {
            
            root.add(new DefaultMutableTreeNode("folder never", false));
        }
        treeModel = new DefaultTreeModel(root, true);
    }

    private void createChildNodes() {
        
        childNodeCreator = new ChildNodeCreator(fileRoot, root, this);
        childNodeCreator.addPropertyChangeListener(this);
        childNodeCreator.execute();
    }
    
    @Override
    public void createTree() {
        
        tree = new JTree(treeModel);
        tree.setShowsRootHandles(true);
        JScrollPane treeScrollPane = new JScrollPane(tree);
        TreeContainer.add(treeScrollPane);
        TreeContainer.revalidate();
        TreeContainer.repaint();
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        
        if(!isTreeDoneLoading) {
            
            int progress = childNodeCreator.getProgress();
            System.out.println("Progress: " + progress); 
            TreeLoadProgressBar.setValue(progress);
            TreeLoadProgressBar.repaint();
        }
    }
    
    @Override
    public void doneCreatingTree() {
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        ProgressBarContainer = new javax.swing.JPanel();
        TreeLoadProgressBar = new javax.swing.JProgressBar();
        TreeContainer = new javax.swing.JPanel();

        setToolTipText(null);
        setOpaque(false);
        setLayout(new java.awt.GridBagLayout());

        ProgressBarContainer.setToolTipText(null);
        ProgressBarContainer.setOpaque(false);
        ProgressBarContainer.setLayout(new java.awt.GridBagLayout());

        TreeLoadProgressBar.setToolTipText(null);
        TreeLoadProgressBar.setValue(0);
        TreeLoadProgressBar.setOpaque(false);
        ProgressBarContainer.add(TreeLoadProgressBar, new java.awt.GridBagConstraints());

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
    private javax.swing.JProgressBar TreeLoadProgressBar;
    // End of variables declaration//GEN-END:variables
  
}
