/*
 * The following code was mostly copied from a StackOverflow post by the user 
 * Hovercraft Full of Eels: 
 * https://stackoverflow.com/questions/11093326/restricting-jtextfield-input-to-integers
 */
package ftpclientinjava.ui;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;

/**
 *
 * @author MP
 */
public class PortIntFilter extends DocumentFilter {
    
    @Override
    public void insertString(FilterBypass fb, int offset, String string, 
            AttributeSet attr) throws BadLocationException {
        
        Document doc = fb.getDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(doc.getText(0, doc.getLength()));
        sb.insert(offset, string);
        
        
    }
}
