/*
 */
package ftpclientinjava.ui.uploader;

import ftpclientinjava.FTPFrame;
import java.io.File;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MP
 */
public class TreeUi extends javax.swing.JPanel implements TreeHandler, TreeSelectionListener {

    private DefaultMutableTreeNode root;
    private DefaultTreeModel treeModel;
    private JTree tree;
    private FileSystemView fileSystemView;
    private TreeSelectionListener treeSelectionListener;
    public static DefaultMutableTreeNode currentNode = null;
    public static String systemPath = System.getProperty("user.home");

    public TreeUi() {
        initComponents();
    }
    
    public void initAll() {
        
        initRoot(); 
    }
    
    private void initRoot() {
        
        root = new DefaultMutableTreeNode();
        treeModel = new DefaultTreeModel(root);
        fileSystemView = FileSystemView.getFileSystemView();
        initTreeSelectionListener();
        showFileSystemRoots();
        createTree();
    }
    
    private void initTreeSelectionListener() {
        
        treeSelectionListener = new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent tse) {
                
                DefaultMutableTreeNode node = 
                        (DefaultMutableTreeNode) tse.getPath().getLastPathComponent();
                showChildren(node);
                // Show subdirectories and files
                FTPFrame.ufv.listFiles((File)node.getUserObject());
            }
        };
    }
    
    // show the file system roots.
    private void showFileSystemRoots() {
        
        File[] roots = fileSystemView.getRoots();
        for (File fileSystemRoot : roots) {
            DefaultMutableTreeNode node = new DefaultMutableTreeNode(fileSystemRoot);
            root.add( node );
            File[] files = fileSystemView.getFiles(fileSystemRoot, true);
            for (File file : files) {
                if (file.isDirectory()) {
                    node.add(new DefaultMutableTreeNode(file));
                }
            }
        }
    }
    
    private void createTree() {
        
        tree = new JTree(treeModel);
        tree.setRootVisible(false);
        tree.addTreeSelectionListener(treeSelectionListener);
        tree.expandRow(0);
        tree.setCellRenderer(new TreeCellRenderer());
        JScrollPane treeScrollPane = new JScrollPane(tree);
        treeScrollPane.setBorder(null);
        TreeContainer.add(treeScrollPane);
    }
        
    /** Add the files that are contained within the directory of this node.
    Thanks to Hovercraft Full Of Eels for the SwingWorker fix. */
    private void showChildren(final DefaultMutableTreeNode node) {
        tree.setEnabled(false);
        ChildNodeProcessor cnp = new ChildNodeProcessor(node, fileSystemView, tree);
        cnp.execute();
    }
    
    @Override
    public void doneCreatingTree() {
        
        
    }

    @Override
    public void valueChanged(TreeSelectionEvent e) {
        
        currentNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
        System.out.println("Current selected node: " + currentNode);
    }

    @Override
    public void updateTree(DefaultMutableTreeNode child, DefaultMutableTreeNode parent, int index) {
        
        treeModel.insertNodeInto(child, parent, index);
        treeModel.reload();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        TreeContainer = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setToolTipText(null);
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
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        add(TreeContainer, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TreeContainer;
    // End of variables declaration//GEN-END:variables
  
}
