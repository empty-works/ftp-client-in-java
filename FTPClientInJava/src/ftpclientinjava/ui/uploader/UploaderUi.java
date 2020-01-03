/*
 */
package ftpclientinjava.ui.uploader;

import java.awt.Component;
import java.io.File;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.event.TreeWillExpandListener;
import javax.swing.filechooser.FileSystemView;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author MP
 */
public class UploaderUi extends javax.swing.JPanel implements TreeHandler, TreeSelectionListener {

    private DefaultMutableTreeNode root;
    private DefaultTreeModel treeModel;
    private JTree tree;
    private File fileRoot;
    private ChildNodeCreator childNodeCreator;
    private FileSystemView fileSystemView;
    private TreeSelectionListener treeSelectionListener;
    public static DefaultMutableTreeNode currentNode = null;
    public static String systemPath = System.getProperty("user.home");

    public UploaderUi() {
        initComponents();
    }
    
    public void initAll() {
        
        initRoot(); 
        //createChildNodes();
    }
    
    private void initRoot() {
        
        //fileRoot = new File(systemPath);
        //System.out.println("System path: " + fileRoot);
        //root = new DefaultMutableTreeNode(new FileNode(fileRoot));
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
