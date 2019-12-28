/*
 */
package ftpclientinjava.ui.uploader;

import javax.swing.event.TreeWillExpandListener;
import javax.swing.tree.MutableTreeNode;

/**
 *
 * @author MP
 */
public interface TreeHandler {
    
    public void createTree(TreeWillExpandListener twel);
    public void doneCreatingTree();
    public void updateTree(MutableTreeNode child, MutableTreeNode parent, int index);
}
