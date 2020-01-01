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
        JScrollPane treeScrollPane = new JScrollPane(tree);
        TreeContainer.add(treeScrollPane);
    }
        
    /** Add the files that are contained within the directory of this node.
    Thanks to Hovercraft Full Of Eels for the SwingWorker fix. */
    private void showChildren(final DefaultMutableTreeNode node) {
        tree.setEnabled(false);

        SwingWorker<Void, File> worker = new SwingWorker<Void, File>() {
            @Override
            public Void doInBackground() {
                File file = (File) node.getUserObject();
                if (file.isDirectory()) {
                    File[] files = fileSystemView.getFiles(file, true); //!!
                    if (node.isLeaf()) {
                        for (File child : files) {
                            if (child.isDirectory()) {
                                publish(child);
                            }
                        }
                    }
                }
                return null;
            }

            @Override
            protected void process(List<File> chunks) {
                for (File child : chunks) {
                    node.add(new DefaultMutableTreeNode(child));
                }
            }

            @Override
            protected void done() {
                tree.setEnabled(true);
            }
        };
        worker.execute();
    }

    private void createChildNodes() {
        
        childNodeCreator = new ChildNodeCreator(fileRoot, root, this);
        childNodeCreator.execute();
    }
    
    @Override
    public void createTree(TreeWillExpandListener twel) {
        
        tree = new JTree(treeModel);
        tree.setShowsRootHandles(true);
        tree.setCellRenderer(new MyTreeCellRenderer());
        tree.addTreeWillExpandListener(twel);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.addTreeSelectionListener(this);
        JScrollPane treeScrollPane = new JScrollPane(tree);
        TreeContainer.add(treeScrollPane);
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
    
    private static class MyTreeCellRenderer extends DefaultTreeCellRenderer {
        
        @Override
        public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf, int row, boolean hasFocus) {
            super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

            // decide what icons you want by examining the node
            if (value instanceof DefaultMutableTreeNode) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) value;
                if (node.getUserObject() instanceof String) {
                    // your root node, since you just put a String as a user object                    
                    setIcon(UIManager.getIcon("FileView.directoryIcon"));
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
