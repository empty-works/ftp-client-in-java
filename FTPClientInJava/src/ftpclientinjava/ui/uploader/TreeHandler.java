/*
 */
package ftpclientinjava.ui.uploader;

import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author MP
 */
public interface TreeHandler {
    
    public void createTree(TreeWillExpandListener twel);
    public void doneCreatingTree();
    public void updateTree(DefaultMutableTreeNode child, DefaultMutableTreeNode parent, int index);
}
