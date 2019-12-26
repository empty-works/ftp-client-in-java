/*
 */
package ftpclientinjava.ui.uploader;

import javax.swing.event.TreeWillExpandListener;

/**
 *
 * @author MP
 */
public interface TreeCreator {
    
    public void createTree(TreeWillExpandListener twel);
    public void doneCreatingTree();
}
